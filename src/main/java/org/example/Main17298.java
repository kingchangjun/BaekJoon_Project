package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main17298 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i =0 ; i<n ; i++)
        {
            int s = Integer.parseInt(st.nextToken());
            stack.push(s);
        }
        while(!stack.isEmpty()) {
            for (int j = 1; j <= stack.size(); j++) {
                if (stack.getFirst() < stack.get(j)) {
                    stack.removeFirst();
                    sb.append(stack.get(j)).append(" ");
                } else
                    sb.append("-1").append(" ");
            }
        }
        System.out.println(sb);




        }
}
