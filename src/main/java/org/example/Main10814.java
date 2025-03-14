package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main10814 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        //int age;

        String[][] s = new String[n][2];

        for(int i = 0 ; i < n ; i++)
        {
            st = new StringTokenizer(br.readLine()," ");

            //age = Integer.parseInt(st.nextToken());
            s[i][0] = st.nextToken();
            s[i][1] = st.nextToken();

        }

        Arrays.sort(s, (s1,s2)->
            Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]) );

        StringBuilder sb =  new StringBuilder();

        for(int i = 0 ; i<n ; i++)
        {
            sb.append(s[i][0] + " " + s[i][1]).append('\n');
        }
        System.out.println(sb);





    }
}
