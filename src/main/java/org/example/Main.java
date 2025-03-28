package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    static final int Max = 123456 * 2;
    static boolean[] isPrime = new boolean[Max + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        sieve();

        while(true)
        {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;

            int count = 0;

            for(int i =n+1 ; i<=2 *n ; i++)
            {
                if(isPrime[i]) count++;
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);

    }

    public static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int i =2; i * i <= Max; i++){
            if (isPrime[i]) {
                for(int j = i*i ; j<=Max ; j+=i){
                    isPrime[j] = false;
                }
            }
        }

    }
}