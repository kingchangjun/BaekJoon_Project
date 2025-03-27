package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main10773{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for(int i =0; i<n; i++)
        {
            int input = Integer.parseInt(br.readLine());

            if(input ==0) {
                stack.pop();
            }
            else {
                stack.push(input);
            }
        }

        int c=0;
        int size = stack.size();

        for(int i = 0; i < size; i++)
        {
            System.out.println( i);

            c+=stack.pop();

        }
        System.out.println("c="+c);
    }
}