package serlization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	
	public static void main(String[] args) {
		Vehicle bike = new Vehicle("bike", 9444);
		Vehicle car = new Vehicle("Car", 4268);
		
		try(FileOutputStream fos = new FileOutputStream("studyeasy\\vehicles.bat")) {
			try(ObjectOutputStream obj = new ObjectOutputStream(fos)){
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("Object is written onto the file");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
