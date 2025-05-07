package org.example;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


//백준 6588
public class Main_today {
    static final int Max = 50000*2;
    static boolean[] isPrime = new boolean[Max+1];

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ic();


        while(true)
        {
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            boolean found = false;

            for(int a = 2; a<=n/2 ; a++){
                int b = n-a;
                if(!isPrime[a] && !isPrime[b]){
                    System.out.println(n + " = " + a + " + " + b);
                    found= true;
                    break;
                }
            }
            if(!found)
                System.out.println("Goldbach's conjecture is wrong.");
        }

    }
    public static void ic()
    {
        isPrime[0] = isPrime[1] = true;

        for(int i = 2 ; i*i <=Max; i++)
        {
            if(!isPrime[i]){
                for(int j = i*i ; j<=Max ; j+=i) {
                    isPrime[j] = true;
                }
            }
        }
    }
}
