package filehandling_programs;

import java.io.FileOutputStream;

public class WriteTextFile {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\FileHandling\\sample1.txt");
			String text = "hello everyone";
			byte[] fileData = text.getBytes();
			fout.write(fileData);
			System.out.println("File written successfully");
			fout.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
