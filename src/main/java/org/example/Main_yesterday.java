package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Main_yesterday{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long[][] dp = new long[k+1][n+1];

        for(int i =0 ; i<=k ; i++)
        {
            dp[i][0] = 1;
        }

        for(int K= 1; K<=k ; K++)
        {
            for(int N =1 ; N<=n ; N++)
            {
                dp[K][N] = dp[K-1][N] + dp[K][N-1];
            }
        }

        System.out.println(dp[k][n]);
    }

}