package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main_yesterday{
    public static void main(String[] args) throws IOException{
     BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));

     int n = Integer.parseInt(br.readLine());
     if(n<0)
     {
         System.out.println("1");
         return;
     }
     int M = 9901;

     //사자가 없는 경우 1 왼 2 오 3
     int [][] dp = new int[n+1][3+1];

         dp[1][1] = 1;
         dp[1][2] = 1;
         dp[1][3] = 1;

     for(int i = 2; i<= n; i++)
     {
         dp[i][1] = ((dp[i-1][1] + dp[i-1][2]) % M + dp[i-1][3]) % M;
         dp[i][2] = (dp[i-1][1] + dp[i-1][3]) % M;
         dp[i][3] = (dp[i-1][1] + dp[i-1][2]) % M;

     }
    int sum = 0;

        sum = ((dp[n][1] + dp[n][2]) % M + dp[n][3]) % M;

    System.out.println(sum);
    }
}