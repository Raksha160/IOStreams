package com.byteapp;
import java.io.*;

public class BugInfoRecorde {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter developer name: ");
            String developerName = br.readLine();

            System.out.print("Enter bug number: ");
            String bugNumber = br.readLine();

            System.out.print("Enter bug description: ");
            String bugDescription = br.readLine();

            
            FileWriter fileWriter = new FileWriter("buginfo.dat");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

          
            bufferedWriter.write("Developer Name: " + developerName);
            bufferedWriter.newLine();
            bufferedWriter.write("Bug Number: " + bugNumber);
            bufferedWriter.newLine();
            bufferedWriter.write("Bug Description: " + bugDescription);

            
            bufferedWriter.close();

            System.out.println("Bug information saved to buginfo.dat");

        } catch (IOException e) {
            
        }


	}

}
