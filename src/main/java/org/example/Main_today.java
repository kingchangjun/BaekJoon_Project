package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Main_today{
    static int n;
    static int k;
    static int[][] dp;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        dp = new int[k+1][n+1]; //n을 k개의 수로 만드는 방법의 수

        for(int i = 0;i<=k ; i++)
        {
            dp[i][0] = 1; //0을 k개의 수로 만드는 방법의 수는 항상 1
        }
        for(int i = 1; i<=k; i++)
        {

            for(int j = 1; j<=n; j++)
            {
                dp[i][j] = dp[i-1][j] + dp[i][j-1] % 1000000000;
            }
        }
        System.out.println(dp[k][n]);

    }
}