package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main17413{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String s = br.readLine();

        boolean isTag = false;
        for(char c : s.toCharArray())
        {
            if(c =='<')
            {
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                isTag = true;
                sb.append(c);
            }
            else if(c=='>')
            {
                isTag = false;
                sb.append(c);
            }
            else if(isTag)
            {
                sb.append(c);
            }
            else
            {
                if (c==' ')
                {
                    while(!stack.isEmpty())
                    {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                }
                else stack.push(c);
            }

        }
        while(!stack.isEmpty())
            sb.append(stack.pop());

        System.out.println(sb);

    }

}