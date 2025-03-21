package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Main2485{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] Tree = new int[n];

        for(int i =0 ; i< n ; i++)
        {
           Tree[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;

        for(int i =0; i < n-1 ; i++)
        {
            int d = Tree[i+1] - Tree[i]; // 가로수 간격 계산
            count = gcd(d,count);
        }
        System.out.println((Tree[n-1] - Tree[0])/count+1-(Tree.length));


    }
    public static int gcd(int a, int b){
        while( b!= 0)
        {
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }

}