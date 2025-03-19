package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main1764{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        st= new StringTokenizer(br.readLine());
        for(int i =0 ; i<n ; i++)
        {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st= new StringTokenizer(br.readLine());
        for(int i =0 ; i<m ; i++)
        {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> diffA = new HashSet<>(setA);
        HashSet<Integer> diffB = new HashSet<>(setB);

        diffA.removeAll(setB); // A - B
        diffB.removeAll(setA); // B - A


        System.out.println(diffA.size() + diffB.size()); // 결과 출력


    }
}