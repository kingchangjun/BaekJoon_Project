package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;
import java.util.Arrays;

class Main_today{
    public static void main(String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i<= n ; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] prev = new int[n+1];
        Arrays.fill(prev,-1); // -1로 초기화.

        int maxLen = 0, lastIdx = -1;

        for(int i =  1; i<= n ; i++)
        {
            dp[i] = 1;
            for(int j = 1 ; j<i ; j++)
            {
                if(arr[j] < arr[i] && dp[j] +1 > dp[i])
                {
                    dp[i] = dp[j]+1;
                    prev[i] = j;
                }
            }

            if(dp[i] > maxLen)
            {
                maxLen = dp[i];
                lastIdx = i;
            }
        }
        Stack<Integer> stack = new Stack<>();
        for(int cur = lastIdx ; cur != -1 ; cur = prev[cur])
            stack.push(arr[cur]);

        StringBuilder sb = new StringBuilder();
        sb.append(maxLen).append('\n');

        while(!stack.isEmpty())
            sb.append(stack.pop()).append(' ');
        System.out.println(sb);

    }
}
