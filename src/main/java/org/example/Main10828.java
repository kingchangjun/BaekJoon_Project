package org.example;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main10828{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n ; i++)
        {
            st = new StringTokenizer(br.readLine()," ");
            String s = st.nextToken();

            switch(s){
                case "push" :
                    int x = Integer.parseInt(st.nextToken());
                    stack.add(x);
                    break;
                case "pop":
                    if(stack.isEmpty())
                        sb.append("-1").append('\n');
                    else
                      sb.append(stack.pop()).append('\n');
                    break;
                case "size":
                       sb.append(stack.size()).append('\n');
                    break;
                case "empty":
                    if(stack.isEmpty())
                        sb.append("1").append('\n');
                    else
                        sb.append("0").append('\n');
                    break;
                case "top":
                    if(stack.isEmpty())
                        sb.append("-1").append('\n');
                    else
                        sb.append(stack.peek()).append('\n');
                    break;
            }
        }
        //System.out.println("Sd"+stack.size());
        System.out.println(sb);
    }
}