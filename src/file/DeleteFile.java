package file;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File file = new File("studyeasy//team.txt");
		if (file.delete()) {
			System.out.println("Deletion is successful!");
		} else {
			System.out.println("Error while deleting!");
		}
	}

}
