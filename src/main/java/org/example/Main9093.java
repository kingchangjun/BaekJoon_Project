package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main9093{

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;


        int n = Integer.parseInt(br.readLine());

        while(n-->0)
        {
            st = new StringTokenizer(br.readLine()," ");

            while(st.hasMoreTokens())
            {
                String s = st.nextToken();
                sb.append(new StringBuilder(s).reverse()).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }

}