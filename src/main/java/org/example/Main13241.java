package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//최소 공배수 구하기
public class Main13241 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long d = gcd(a,b);

        System.out.println(a*b/d);



    }

    public static long gcd(long a, long b){
        while(b != 0){
            long r = a%b;

            a = b;
            b = r;
        }
        return a;
    }
}
