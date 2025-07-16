package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Main_today{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[m];
        for(int i =0 ; i < m; i++)
        {
            arr[i]= Integer.parseInt(st.nextToken());
        }

        int de = 0;
        for(int i =0 ; i<m; i++)
        {
           de = de * a +arr[i];
        }
        StringBuilder sb = new StringBuilder();

        while(de>0)
        {
            sb.append(de %b).append(" ");
            de /=b;
        }
        System.out.println(sb.reverse().toString().trim());



    }
}