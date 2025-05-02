package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_yesterday {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        for(int i =0 ; i <s.length(); i++)
        {
            char c = s.charAt(i);

            if(Character.isLowerCase(c))
                sb.append((char)((c - 'a'+13)%26 + 'a'));
            else if(Character.isUpperCase(c))
                sb.append((char)((c - 'A'+13)%26 + 'A'));
            else
                sb.append(c);
        }
        System.out.println(sb);
    }
}