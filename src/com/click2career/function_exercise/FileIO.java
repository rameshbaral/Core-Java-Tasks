/*
39.Write the simple java function that reads data from one file and writes the data to
another file.
 */
package com.click2career.function_exercise;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
    //reads the content of one file
    public static void readWriteFile(String readLocation, String writeLocation) throws IOException {
        FileReader fileRead = null;
        FileWriter fileWrite = null;
        try{
            File readFile = new File(readLocation);
            fileRead = new FileReader(readFile);
            Scanner scanner = new Scanner(fileRead);

            File writeFile = new File(writeLocation);
            fileWrite = new FileWriter(writeFile);
            fileWrite.write(scanner.nextLine());
            System.out.println("Task successful");
        }catch (IOException e){
            System.out.println("File writing failed");
        }finally {
            fileRead.close();
            fileWrite.close();
        }
    }

    public static void main(String[] args) {
        String readFrom = "C:\\Click2Career\\src\\com\\click2career\\function_exercise\\files\\Ramesh.txt";
        String writeTo = "C:\\Click2Career\\src\\com\\click2career\\function_exercise\\files\\copy.txt";

        try {
            readWriteFile(readFrom,writeTo);
        }
        catch (IOException e){
            System.out.println("File writing failed");
        }

    }
}
