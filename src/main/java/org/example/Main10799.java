package org.example;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Stack;

public class Main10799{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();


        String s = br.readLine();
        int sum = 0;
        for(int i = 0; i<s.length(); i++)
        {
           char c = s.charAt(i);
           if( c=='(')
              stack.push(c);
           else {
               stack.pop();

               if(s.charAt(i-1)=='(')
                   sum+=stack.size();
               else
                   sum+=1;
           }
        }
        System.out.println(sum);
    }


}