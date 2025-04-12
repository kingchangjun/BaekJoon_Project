package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class Main12{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        LinkedList<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        while(n-- > 0){

            st = new StringTokenizer(br.readLine()," ");
            String s = st.nextToken();
            switch(s){
                case "push" :
                    int x = Integer.parseInt(st.nextToken());
                    queue.add(x);
                    break;

                case "pop" :
                    if(queue.isEmpty())
                        sb.append("-1").append("\n");
                    else
                        sb.append(queue.pop()).append("\n");
                    break;

                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;

                case "empty":
                    if(queue.isEmpty())
                        sb.append("1").append("\n");
                    else
                        sb.append("0").append("\n");
                    break;

                case "front" :
                    if(queue.isEmpty())
                        sb.append("-1").append("\n");
                    else
                        sb.append(queue.peekFirst()).append("\n");
                    break;
                case "back" :
                    if(queue.isEmpty())
                        sb.append("-1").append("\n");
                    else
                        sb.append(queue.peekLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}