package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//백준 10872
public class Main_today {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum=1;
        for(int i = 1 ; i<=n ; i++)
        {
            sum*=i;

        }
        System.out.println(sum);
    }
}