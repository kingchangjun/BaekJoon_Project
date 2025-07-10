package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n; i++)
        {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int[] arr = new int [m];


            for(int j = 0 ; j < m ; j++)
            {
                arr[j] = Integer.parseInt(st.nextToken());

            }

            long sum = 0;

            for(int j = 0; j < m-1 ; j ++)
            {
                for(int l = j + 1; l<m ; l++ )
                {
                    sum+=gcd(arr[j],arr[l]);
                }

            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
    public static int gcd(int a, int b)
    {
        while(b!=0)
        {
            int r = a%b;

            a = b;
            b = r;
        }
        return a;
    }
}
