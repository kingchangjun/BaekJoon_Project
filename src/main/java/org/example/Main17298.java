package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main17298 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] answer = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Stack<Integer> stack = new Stack<>();
        for(int i =0 ; i<n ; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }


       for(int i =0 ; i<n ; i++)
        {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i])
            {
                answer[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

       while(!stack.isEmpty())
           answer[stack.pop()] = -1;

       StringBuilder sb = new StringBuilder();
       for(int num : answer)
           sb.append(num).append(" ");

       System.out.println(sb);
        }
}
