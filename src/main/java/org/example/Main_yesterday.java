package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//백준 6588
public class Main_yesterday {
    static final int Max = 1000000;
    static boolean[] isnotPrime = new boolean[Max+1];

    public static void main(String[] args)throws IOException {
     BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
     ic();

     while(true)
     {
         int n = Integer.parseInt(br.readLine());
         if(n==0) break;
         boolean hub = false;
         for(int a = 2 ; a<=n/2; a++)
         {
             int b = n-a;
             if(!isnotPrime[a] && !isnotPrime[b])
             {
                 System.out.println(n+" = "+a+" + "+b);
                 hub = true;
                 break;
             }
         }
         if(!hub)
             System.out.println("Goldbach's conjecture is wrong.");

     }

    }
    public static void ic()
    {
        isnotPrime[0] = isnotPrime[1] = true;

        for(int i = 2; i*i<=Max ; i++)
        {
            if(!isnotPrime[i])
            {
                for(int j = i*i ; j<=Max ; j+=i)
                {
                    isnotPrime[j] = true;
                }
            }
        }
    }
}