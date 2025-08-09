package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

//9095
class Main_yestderday{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i< n ; i++)
        {
            int x = Integer.parseInt(br.readLine());
            int[] dp = new int[ Math.max(4,x+1) ];

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            for(int j = 4; j<=x;j++)
            {
                dp[j] = dp[j-1]+dp[j-2]+dp[j-3];
            }

            sb.append(dp[x]).append("\n");
        }
        System.out.println(sb);

    }
}