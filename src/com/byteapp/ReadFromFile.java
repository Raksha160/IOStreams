package com.byteapp;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
            FileReader reader = new FileReader("filewriter.txt");

            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
