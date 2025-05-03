package org.example;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main_today {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        String[] suff = new String[line.length()];

        for(int i =0 ; i< line.length() ; i++)
        {
            suff[i] = line.substring(i);
        }

       Arrays.sort(suff);
        for(String s : suff)
            System.out.println(s);
  }
}
