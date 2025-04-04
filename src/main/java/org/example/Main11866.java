package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class Main11866 {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> queue = new LinkedList<>();


        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i = 1; i<=N ; i++)
        {
            queue.add(i);
        }

        sb.append("<");
        while(!queue.isEmpty())
        {
            for(int i = 0 ; i<K-1 ; i++) {
                queue.addLast(queue.pollFirst());
            }
            sb.append(queue.pollFirst());

            if(!queue.isEmpty())
                sb.append(", ");


        }
        sb.append(">");
        System.out.println(sb);

    }

}
