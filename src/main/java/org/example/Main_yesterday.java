package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Main_yesterday{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n<=0){
            System.out.println(0);
            return;
        }
        int[] dp= new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        dp[0] = Integer.parseInt(st.nextToken());
        dp[1] = Integer.parseInt(st.nextToken());
        dp[2] = Integer.parseInt(st.nextToken());
        for(int i =0; i<n-1; i++)
        {
            st = new StringTokenizer(br.readLine()," ");
            int r = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int[] cr = new int[3];
            cr[0] = r + Math.min(dp[1],dp[2]);
            cr[1] = g + Math.min(dp[0],dp[2]);
            cr[2] = b + Math.min(dp[1],dp[0]);

            dp=cr;
        }
        int sum = Math.min(dp[0],Math.min(dp[1],dp[2]));
        System.out.println(sum);

    }
}