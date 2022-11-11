package filehandling_programs;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputStreamDemo {
	static void writeFileData() throws Exception {
		
		try {
			FileOutputStream outputFile = new FileOutputStream("C:\\FileHandling\\sample2.txt");  
	        DataOutputStream data = new DataOutputStream(outputFile); 
	        data.writeInt(7645643);
	        data.writeUTF("vikas");
	        data.writeBoolean(true);
	        data.writeDouble(422352.23423425);
	        data.writeFloat(123.223F);
	        data.writeLong(9875345643L);
	        data.writeByte(121);
	        data.writeShort(9431);
	        data.flush();
	        data.close();
	        outputFile.close();
	        System.out.println("Writing Process completed."); 
	        System.out.println();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	static void readFileData() throws Exception {
		FileInputStream fInput = new FileInputStream("D:\\FileHandling\\Tasksample2.txt");
		DataInputStream data = new DataInputStream(fInput);
		System.out.println("Integer data: " + data.readInt());
		System.out.println("String data: " + data.readUTF());
		System.out.println("Boolean data: " + data.readBoolean());
		System.out.println("Double data: " + data.readDouble());
		System.out.println("Float value: " + data.readFloat());
		System.out.println("Long value: " + data.readLong());
		System.out.println("Byte value: " + data.readByte());
		System.out.println("Short Value: " + data.readShort());
		fInput.close();
		data.close();
	}

	public static void main(String[] args) throws Exception {
		writeFileData();
		System.out.println("Content of file: ");
		readFileData();
	}

}
