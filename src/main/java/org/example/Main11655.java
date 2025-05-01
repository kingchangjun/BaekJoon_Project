package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < line.length() ; i++)
        {
            char c = line.charAt(i);

            if(Character.isLowerCase(c))
            {
                sb.append((char)((c - 'a' + 13) % 26 + 'a'));

            }
            else if(Character.isUpperCase(c)) {
                sb.append((char) ((c - 'A' + 13) % 26 + 'A'));
            }
            else
                sb.append(c);
        }
        System.out.println(sb);



    }
}
