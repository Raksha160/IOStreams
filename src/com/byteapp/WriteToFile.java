package com.byteapp;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		String data = " Employee Name : Peter Sam Joes\n" + " Department : Sales \n" + " Designation : Manager \n" + " Salary :35000 ";

        try {
            FileWriter writer = new FileWriter("filewriter.txt");
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }

	}

}
