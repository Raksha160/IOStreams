package com.byteapp;
import java.io.*;

public class BufferExample {

	public static void main(String[] args) {
		String developerInfo = "Developer Name:Rosh Bug No:B000123\nBud Description:error";
		try (BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("data.txt"))) {
            output.write(developerInfo.getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }

        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream("data.txt"))) {
            byte[] buffer = new byte[1000];
            int bytesRead;
            StringBuilder content = new StringBuilder();

            while ((bytesRead = input.read(buffer)) != -1) {
                content.append(new String(buffer, 0, bytesRead));
            }

            System.out.println("File content:");
            System.out.println(content.toString());
        } catch (IOException e) {
            System.out.println(e);
        }

	}

}
