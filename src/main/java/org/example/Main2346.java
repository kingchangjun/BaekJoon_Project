package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;


public class Main2346{
    static class Balloon{
        int index;
        int move;

        Balloon(int index, int move){
            this.index = index;
            this.move = move;
        }
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        LinkedList<Balloon> queue = new LinkedList<>();

        int n  = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i =1 ; i <= n ; i++)
        {
            //int move = Integer.parseInt(st.nextToken());
            queue.addLast(new Balloon(i,Integer.parseInt(st.nextToken())));
        }

        while(!queue.isEmpty())
        {
            Balloon current = queue.pollFirst();
            sb.append(current.index).append(" ");

            if(queue.isEmpty())
                break;

            int move = current.move;

            if(move > 0){
                for(int i = 0 ; i < (move - 1) % queue.size() ; i++)
                    queue.addLast(queue.pollFirst());
            }
            else
            {
                for(int i = 0 ; i < Math.abs(move) % queue.size(); i++) // 절댓값.
                    queue.addFirst(queue.pollLast());
            }
        }

        System.out.println(sb);

    }
}

