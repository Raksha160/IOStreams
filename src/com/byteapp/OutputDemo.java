package com.byteapp;
import java.io.*;

public class OutputDemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fs=new FileOutputStream("myfile.txt");
			String str="Hello welcome!";
			byte[] bt=str.getBytes();
			fs.write(bt);
			fs.flush();
			fs.close();
			
		}
		catch(IOException ex)
		{
			System.out.print("IO error"+ex);
		}

	}

}
