package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main10808 {
    public static void main(String[] args)throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] counting = new int[26];

        String s = br.readLine();

        for(int i = 0 ; i<s.length() ; i++)
        {
            char c = s.charAt(i);
            counting[c-'a']++;
        }
        for(int num:counting)
            System.out.print(num+" ");

    }
}