package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 2609
public class Main_yesterday {
    public static void main(String[] args)throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b= Integer.parseInt(st.nextToken());
        System.out.println(aa(a,b));
        System.out.println(bb(a,b));

    }

    public static int aa(int a, int b)
    {
        if(b!=0) return aa(b,a%b);
        return a;
    }
    public static int bb(int a, int b)
    {
        return a*b/aa(a,b);

    }
}