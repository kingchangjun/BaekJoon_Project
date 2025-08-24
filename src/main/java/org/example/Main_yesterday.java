package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.Stack;
import java.util.Arrays;

class Main_yesterday{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        int[] arr = new int[n+1];
        int[] prev = new int[n+1];

        Arrays.fill(prev,-1);
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i<=n ; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int maxL = 0;
        int lastIdx = -1;

        for(int i = 1; i<=n ; i++)
        {
            dp[i]=1;
            for(int j = 1; j<=i ; j++)
            {
                if(arr[j] < arr[i] && dp[i] < dp[j]+1)
                {
                    dp[i] = dp[j] +1;
                    prev[i] = j;
                }
            }

            if(dp[i] > maxL)
            {
                maxL = dp[i];
                lastIdx = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(maxL+"\n");

        Stack <Integer> stack = new Stack<>();
        for(int c = lastIdx ; c != -1; c=prev[c])
        {
            stack.push(arr[c]);
        }
        while(!stack.isEmpty())
            sb.append(stack.pop()+" ");

        System.out.println(sb);





    }

}