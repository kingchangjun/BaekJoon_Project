package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.AllPermission;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class Main28279 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        LinkedList<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n ; i++)
        {
            st = new StringTokenizer(br.readLine()," ");

            int x =Integer.parseInt(st.nextToken());
            int y;
            int z;
            switch(x)
            {
                case 1:
                    y = Integer.parseInt(st.nextToken());
                    queue.addFirst(y);
                    break;
                case 2:
                    y = Integer.parseInt(st.nextToken());
                    queue.addLast(y);
                    break;
                case 3:
                    if(queue.isEmpty())
                        sb.append("-1").append('\n');
                    else
                        sb.append(queue.pollFirst()).append('\n');

                    break;
                case 4:
                    if(queue.isEmpty())
                        sb.append("-1").append('\n');
                    else
                        sb.append(queue.pollLast()).append('\n');

                    break;
                case 5:
                    sb.append(queue.size()).append('\n');
                    break;
                case 6:
                    if(queue.isEmpty())
                        sb.append("1").append('\n');
                    else
                        sb.append("0").append('\n');
                    break;
                case 7:
                    if(queue.isEmpty())
                        sb.append("-1").append('\n');
                    else
                        sb.append(queue.peekFirst()).append('\n');

                    break;
                case 8:
                    if(queue.isEmpty())
                        sb.append("-1").append('\n');
                    else
                        sb.append(queue.peekLast()).append('\n');

                    break;

            }
        }
        System.out.println(sb);
    }
}