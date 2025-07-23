package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main_today{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        if (a == 1)
            return;

        for(int i = 2 ; i*i <=a ; i++)
        {
            while(a%i ==0){
                System.out.println(i);
                a /= i;
            }
        }

        if(a>1)
        {
            System.out.println(a);
        }

    }
}