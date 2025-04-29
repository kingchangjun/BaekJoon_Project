package org.example;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main17299{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int [n];
        int[] index = new int[n];
        int[] count = new int[1000001];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0 ; i < n ; i++)
        {
            arr[i] =Integer.parseInt(st.nextToken());
            count[arr[i]]++;
        }

        for(int i = 0 ; i < n ; i++)
        {
            while(!stack.isEmpty() && count[arr[stack.peek()]] < count[arr[i]])
            {
                index[stack.pop()] = arr[i];

            }
            stack.push(i);
        }

        while(!stack.isEmpty())
            index[stack.pop()] = -1;

        StringBuilder sb = new StringBuilder();
        for(int x : index)
            sb.append(x).append(" ");

        System.out.println(sb);



    }
}