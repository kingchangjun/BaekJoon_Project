package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main10809 {
    public static void main(String[] args)throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] counting = new int[26] ;

        for(int i = 0 ; i < counting.length ; i++)
            counting[i] = -1;

        String s = br.readLine();

        for(int i =0 ;  i< s.length() ; i++)
        {
            char c = s.charAt(i);
            if(counting[c-'a'] == -1)
                counting[c-'a'] = i;
        }
        for(int num : counting)
            System.out.print(num+" ");


    }
}