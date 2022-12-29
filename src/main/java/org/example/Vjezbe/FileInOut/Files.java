package org.example.Vjezbe.FileInOut;

import java.io.*;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("listeOut.txt")))
        ) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.print(line);
                System.out.println();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
