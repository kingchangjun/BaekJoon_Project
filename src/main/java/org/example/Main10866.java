package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayDeque;
public class Main10866 {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        while(n-- >0)
        {
            st= new StringTokenizer(br.readLine()," ");
            String s = st.nextToken();
            int x;
            switch(s){
                case"push_front":
                    x = Integer.parseInt(st.nextToken());
                    deque.addFirst(x);
                    break;

                case"push_back":
                    x = Integer.parseInt(st.nextToken());
                    deque.addLast(x);
                    break;

                case"pop_front":
                    if(deque.isEmpty())
                        sb.append("-1").append("\n");
                    else
                        sb.append(deque.pollFirst()).append("\n");
                    break;

                case"pop_back":
                    if(deque.isEmpty())
                        sb.append("-1").append("\n");
                    else
                        sb.append(deque.pollLast()).append("\n");
                    break;

                case"size":
                    sb.append(deque.size()).append("\n");
                    break;

                case"empty":
                    if(deque.isEmpty())
                        sb.append("1").append("\n");
                    else
                        sb.append("0").append("\n");
                    break;

                case"front":
                    if(deque.isEmpty())
                        sb.append("-1").append("\n");
                    else
                        sb.append(deque.peekFirst()).append("\n");
                    break;

                case"back":
                    if(deque.isEmpty())
                        sb.append("-1").append("\n");
                    else
                        sb.append(deque.peekLast()).append("\n");
                    break;
            }
        }

        System.out.println(sb);

    }

}