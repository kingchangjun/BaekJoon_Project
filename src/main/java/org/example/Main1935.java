package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main1935 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            int lower = 0;
            int upper = 0;
            int digit = 0;
            int space = 0;

            for (char c : line.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    lower++;
                } else if (Character.isUpperCase(c)) {
                    upper++;
                } else if (Character.isDigit(c)) {
                    digit++;
                } else if (c == ' ') {
                    space++;
                }
            }

            System.out.println(lower + " " + upper + " " + digit + " " + space);
        }
    }
}