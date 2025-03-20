package org.example;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1735 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int numerator_1 = Integer.parseInt(st.nextToken()); // 분자
        int denominator_1 = Integer.parseInt(st.nextToken()); //분모

        st  = new StringTokenizer(br.readLine()," ");
        int numerator_2 = Integer.parseInt(st.nextToken());
        int denominator_2 = Integer.parseInt(st.nextToken());


        numerator_1 = numerator_1 * denominator_2;
        numerator_2 = numerator_2 * denominator_1;

        int a = denominator_2*denominator_1;
        int b = numerator_2 + numerator_1;

        int d = gcd(a,b);
            a = a/d;
            b = b/d;

            System.out.println(b + " " + a);

    }
    public static int gcd(int a, int b){
        while(b != 0)
        {
            int r = a%b;

            a = b;
            b = r;
        }
        return a;

    }
}
