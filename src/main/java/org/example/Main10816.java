package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main10816 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for(int i = 0; i< n; i++)
        {
            st = new StringTokenizer(br.readLine());

            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][0] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (e1, e2 )-> {

            if(e1[0] == e2[0])
            {
                return e1[1]-e2[1];
            }
            else
            {
                return e1[0]-e2[0];
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int i =0; i<n; i++)
        {
            sb.append(arr[i][1] + " " + arr[i][0]).append('\n');
        }
        System.out.println(sb);
    }
}
