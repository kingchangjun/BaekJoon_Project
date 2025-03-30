package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;



public class Main4949 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = "";

        while(true){
            s = br.readLine();
            if(s.equals("."))
                break;

            sb.append(sd(s)).append('\n');
        }


        System.out.println(sb);


    }
    public static String sd(String s){
        Stack <Character> stack = new Stack<>();

        for(int i = 0; i<s.length() ; i++)
        {

            char c = s.charAt(i);

            if(c=='(' || c=='[')
                stack.push(c);

            else if(c ==')')
            {
                if(stack.isEmpty() || stack.peek() !='(')
                    return "no";
                else
                    stack.pop();
            }

            else if( c==']')
            {
                if(stack.isEmpty() || stack.peek() != '[')
                    return "no";
                else
                    stack.pop();
            }
        }

        if(stack.isEmpty())
            return "yes";
        else
            return "no";

    }


}
