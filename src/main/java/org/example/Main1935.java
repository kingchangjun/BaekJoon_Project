package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main1935{

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Double>stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());;

        Double[] arr = new Double[n];
        String s = br.readLine();

        for(int i =0; i<arr.length ; i++)
            arr[i] = Double.parseDouble(br.readLine());

        for(int i = 0 ; i< s.length(); i++)
        {
            char c = s.charAt(i);
            if(c>='A' && c<='Z')
            {
                stack.push(arr[c-'A']);
            }
            else{
                double a = stack.pop();
                double b = stack.pop();
                stack.push(ppp(b,a,c));
            }

        }
        System.out.printf("%.2f\n",stack.pop());
    }
    public static double ppp(double x, double y, char c)
    {
        switch(c)
        {
            case '+': return x+y;
            case '-': return x-y;
            case '*': return x*y;
            case '/': return x/y;
        }
        return 0;


    }
}