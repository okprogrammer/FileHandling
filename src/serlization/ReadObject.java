package serlization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
	
	public static void main(String[] args) {
		try(FileInputStream FIO = new FileInputStream("studyeasy\\vehicles.bat")){
			try(ObjectInputStream obj = new ObjectInputStream(FIO)){
				Vehicle v1 = (Vehicle)obj.readObject();
				Vehicle v2 = (Vehicle)obj.readObject();
				System.out.println("Object v1: "+v1);
				System.out.println("Object v2: "+v2
						);
			} catch (ClassNotFoundException e) {
				System.out.println("Class Not Found!");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
