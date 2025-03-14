package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main6 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        String[] s = new String[n];
        for(int i =0 ; i< n ; i++)
        {
            s[i] = br.readLine();
        }

        Arrays.sort(s, new Comparator<String>() {
            public int compare(String s1, String s2){
                if(s1.length() == s2.length())
                    return s1.compareTo(s2);
                else
                    return s1.length() - s2.length();
            }
        });

        sb.append(s[0]).append('\n');

        for(int i =1; i< n ; i++)
        {
            if(!s[i].equals(s[i-1]))
                sb.append(s[i]).append('\n');
        }

        System.out.println(sb);
    }
}
