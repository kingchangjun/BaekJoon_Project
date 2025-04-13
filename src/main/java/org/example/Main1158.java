package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main1158 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> queue = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for(int i =1; i<=n;i++)
        {
            queue.add(i);
        }
        sb.append("<");

       int count=0;
        while(!queue.isEmpty())
        {
            count = (count + k -1) % queue.size();
            sb.append(queue.remove(count));

                if(!queue.isEmpty())
                    sb.append(", ");
            }
        sb.append(">");
        System.out.println(sb);



    }
}
