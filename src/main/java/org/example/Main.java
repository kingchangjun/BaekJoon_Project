package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while(n-- >0){
            long x = Long.parseLong(br.readLine());
            sb.append(nextPrime(x)).append('\n');
        }
       System.out.println(sb);

    }
    public static long nextPrime(long x)
    {
        if(x <=2 ) return 2;
        while(!isPrime(x))
        {
            x++;
        }
        return x;
    }

    public static boolean isPrime(long x){
      //  if(x <= 1) return false;
       // if(x == 2) return true;
        if(x % 2 == 0) return false;

        long sqrtN = (long) Math.sqrt(x);
        for( long i = 3; i <= sqrtN ; i+=2){
            if( x % i == 0) return false;
        }
        return true;
    }
}