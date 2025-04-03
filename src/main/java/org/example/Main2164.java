package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main2164{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(br.readLine());

        for(int i =1 ; i<=x; i++)
        {
            queue.add(i);
        }
        while(queue.size()!=1)
        {
            queue.poll();
            queue.add(queue.pollFirst());

        }
        System.out.println(sb.append(queue.poll()));
    }
}