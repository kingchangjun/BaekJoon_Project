package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Main14425{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        HashMap<String, Integer> map = new HashMap<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i< n ;i++)
        {
            map.put(br.readLine(),i);
        }
        int count = 0;

        for(int i =0; i <m ; i++)
        {
           if( map.containsKey(br.readLine()))
           {
               count++;
           }
        }

        System.out.println(count);



    }
}