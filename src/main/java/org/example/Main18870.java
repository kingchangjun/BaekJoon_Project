package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.io.OutputStreamWriter;

public class Main18870{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] sortedArr = new int[n];

        //HashMap<Integer, Integer>map = new HashMap<>();
        Map<Integer, Integer>map = new HashMap<>();

        st = new StringTokenizer(br.readLine()," ");
        for(int i =0 ; i<n ; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
            sortedArr[i] = arr[i];// 원본 저장
        }

        Arrays.sort(sortedArr);

        int rank = 0;
        for(int num : sortedArr)
        {
            if(!map.containsKey(num))
            {
                map.put(num, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i<n; i++)
        {
            sb.append(map.get(arr[i])).append(" ");
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}