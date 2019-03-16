package com.rickycbenitez.javaEndofFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.Scanner;

public class JavaEndoffile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String inputs = String.valueOf(input.hasNextLine());

        while (input.nextLine() != null) {

            System.out.println(inputs);

        }

    }
}
