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
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<=n ; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1 ; i<= n; i++)
        {
            dp[i] = 1;
            for(int j = 1; j<i; j++)
            {
                if(arr[i] > arr[j] && dp[j]+1 > dp[i] )
                    dp[i] = dp[j] +1;
            }
        }
        int max = -1;
        for(int i = 1; i<=n; i++)
            max = dp[i] > max ? dp[i] : max;
        System.out.println(max);


    }
}