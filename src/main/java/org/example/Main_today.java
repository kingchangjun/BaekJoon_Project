package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Main_today{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n ; i++)
        {
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int d = Math.abs(arr[0]-s);
        for(int i = 1; i < n ; i++)
        {
            d= gcd(d,Math.abs(arr[i] - s));
        }

        System.out.println(d);

    }
    public static int gcd(int a, int b)
    {
        while(b!=0)
        {
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }

}
