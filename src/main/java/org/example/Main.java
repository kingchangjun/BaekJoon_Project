package org.example;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    static final int max = 1000000;
    static boolean[] isPrime = new boolean[max+1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ip();
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            sb.append(np(Integer.parseInt(br.readLine()))).append('\n');
        }
        System.out.println(sb);
    }

    public static void ip(){
            Arrays.fill(isPrime,true);
            isPrime[0] = isPrime[1] =false;


            for(int i =2; i*i <=max; i++)
            {
                if(isPrime[i])
                {
                    for(int j =i*i ; j<=max ; j+=i)
                    {
                        isPrime[j] = false;
                    }
                }
            }
    }

    public static int np(int x) {
        int count = 0;

        for (int i = 2; i <= x / 2; i++) {
            if (isPrime[i] && isPrime[x-i])
                count++;
        }
        return count;
    }
}