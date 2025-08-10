package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main_today{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        int[] price = new int[n+1];
        st = new StringTokenizer(br.readLine());

        for(int i = 1; i<=n; i++)
        {
            price[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = 0;
        for(int i = 1; i<=n ; i++)
        {
            dp[i] = price[i]*n;
        }

        for(int i = 1 ; i<=n ;i++)
        {
            for(int j = 1 ; j<=i ; j++)
            {
                dp[i] = Math.min(dp[i], price[j] + dp[i-j]);
            }
        }
        System.out.println(dp[n]);


    }
}