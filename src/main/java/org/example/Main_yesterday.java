package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main_yesterday{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String a = br.readLine();

        int count = (3-a.length() %3)%3;
        for(int i = 0 ; i< count; i++)
        {
            sb.append("0");
        }
        sb.append(a);
        String b = sb.toString();
        sb.setLength(0);

        for(int i =0 ; i<b.length() ; i+=3)
        {
            String c = b.substring(i,i+3);
           sb.append(Integer.parseInt(c,2));

        }
        System.out.println(sb);

    }

}