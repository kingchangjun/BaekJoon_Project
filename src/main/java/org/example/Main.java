package org.example;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

      long five = five_get(n) - five_get(n-m) - five_get(m);
      long two = two_get(n) - two_get(n-m) - two_get(m);
      System.out.println(Math.min(two,five));
    }
    static long five_get(long num)
    {
        int  count= 0;

        while(num >= 5)
        {
            count += num/5;
            num/=5;
        }
        return count;
    }
    static long two_get(long num)
    {
        int count =0;
        while(num >=2)
        {
            count +=num/2;
            num/=2;
        }
        return count;
    }



}