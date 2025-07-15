package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main_today{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n == 0 ){
            System.out.println("0");
            return;
        }
        StringBuilder sb = new StringBuilder();

        while(n != 0)
        {
            int re = n%-2;

            if(re <0)
            {
                re +=2;
                n = n/-2 +1;
            }
            else {
                n = n / -2;
            }
            sb.append(re);
        }
        System.out.println(sb.reverse());
    }
}