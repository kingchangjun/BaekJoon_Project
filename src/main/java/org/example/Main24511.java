package org.example;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;


public class Main24511{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); // 자료구조 개수
        int[] type = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i =0 ; i < n ; i++)
        {
            type[i] = Integer.parseInt(st.nextToken());
        }

        LinkedList<Integer> queue = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for(int i =0; i < n ; i++)
        {
            int value = Integer.parseInt(st.nextToken());
            if(type[i] == 0)
                queue.addLast(value);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0 ; i < m ; i ++)
        {
            int value = Integer.parseInt(st.nextToken());
            queue.addFirst(value);
            sb.append(queue.pollLast()).append(" ");
        }

        System.out.println(sb);

    }
}