package com.byteapp;
import java.io.*;

public class BugInfoReader {

	public static void main(String[] args) {
		try {
            FileReader fileReader = new FileReader("buginfo.dat");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException e) {
           
        }


	}

}
