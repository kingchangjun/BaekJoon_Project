package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main_yesterday{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int MAX = 1000000;
        int[] dp =  new int[MAX+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i =4 ; i<=MAX;i++)
        {
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % 1000000009;
        }

        StringBuilder sb = new StringBuilder();
        for(int i =1 ;i <=n; i++)
        {
            int x = Integer.parseInt(br.readLine());
            sb.append(dp[x]).append("\n");
        }
        System.out.println(sb);
    }
}