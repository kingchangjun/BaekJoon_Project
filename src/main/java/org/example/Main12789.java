package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.Stack;


public class Main12789 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        st = new StringTokenizer(br.readLine()," ");

        for(int  i = 0 ; i<n; i++)
        {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        int x= 1;

        while(!queue.isEmpty() || !stack.isEmpty()){

            if(!queue.isEmpty() && queue.peek() == x)
            {
                queue.poll();
                x++;
            }
            else if(!stack.isEmpty() && stack.peek() == x)
            {
                stack.pop();
                x++;
            }
            else if(!queue.isEmpty()){
                stack.push(queue.poll());
            }
            else{
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
    }
}