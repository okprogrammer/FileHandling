package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileWithScanner {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("studyeasy//team.txt"));
			String line;
			while(sc.hasNext()) {
				line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error while reading the file!");
		}
	}

}
