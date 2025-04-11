package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main1406 {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Character> left = new ArrayDeque<>();
        Deque<Character> right = new ArrayDeque<>();

        for(char c : br.readLine().toCharArray())
            left.push(c);

        int M = Integer.parseInt(br.readLine());

        for(int i = 0; i < M ; i++)
        {
            String s = br.readLine();

            switch(s.charAt(0))
            {
                case 'L':
                    if(!left.isEmpty())
                        right.push(left.pop());
                    break;
                case 'D':
                    if(!left.isEmpty())
                        left.push(right.pop());
                    break;
                case 'B':
                    if(!left.isEmpty())
                        left.pop();
                    break;
                case 'P':
                        char p = s.charAt(2);
                        left.push(p);
                    break;
            }
        }
        while(!left.isEmpty())
            right.push(left.pop());

        while(!right.isEmpty())
            sb.append(right.pop());

        System.out.println(sb);

    }

}
