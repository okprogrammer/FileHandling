package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {
	public static void main(String[] args) {
		/*
		File file = new File("C:\\Users\\OMKUMAR\\Downloads\\smartpipe-testData\\new\\easy.txt");
		file.createNewFile();
		System.out.println("File created");
		*/
		// create multiple folder
		/*
		File directory = new File("Inception\\studyeasy\\author\\om");
		directory.mkdirs();
		System.out.println("Directory created.");
		File file = new File("Inception\\\\studyeasy\\\\author\\\\om\\test.txt");
		file.createNewFile();
		System.out.println("File created inside the folders");
		*/
		File file = new File("studyeasy");
		file.mkdir();
		file = new File("studyeasy//team.txt");
		try {
			file.createNewFile();
			System.out.println("File created");
		} catch (IOException e) {
			System.out.println("error occured, while creating the file");
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
			bw.write("Om");
			bw.newLine();
			bw.write("Vandana");
			bw.newLine();
			bw.write("Chhaya");
			bw.newLine();
			bw.write("Praful");
			bw.newLine();
			bw.write("Atul");
			bw.newLine();
			bw.write("Arpan");
			bw.newLine();
			bw.write("Love");
			System.out.println("Writing onto the file completed");
			bw.close();
		} catch (IOException e) {
			System.out.println("Exception occured while writing onto the file!");
		}
		// read the file
		try {
			BufferedReader br = new BufferedReader(new FileReader("studyeasy//team.txt"));
			String line;
			System.out.println("**********************************");
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (IOException e) {
			System.out.println("IOException");
		} 
		
		
		
	}
}
