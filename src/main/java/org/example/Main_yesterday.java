package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main_yesterday{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n ==1)
            return;

        for(int i =2; i*i<=n;i++)
        {
            while(n%i ==0)
            {
                System.out.println(i);
                n/=i;
            }
        }
        if(n>1)
        {
            System.out.println(n);
        }
        br.close();
    }
}