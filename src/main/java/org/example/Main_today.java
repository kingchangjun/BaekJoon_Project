package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main_today{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String octal = br.readLine();

        StringBuilder sb = new StringBuilder();

        sb.append(Integer.toBinaryString(octal.charAt(0) - '0'));
        // toBinaryString = 정수를 2진수 문자열로 변환.

        for(int i = 1; i< octal.length() ; i++)
        {
            int num = octal.charAt(i)-'0'; // 문자 -> 숫자
            String bin = Integer.toBinaryString(num);

            while(bin.length()<3){
                bin = "0" + bin;
              }
        sb.append(bin);

        }

        System.out.println(sb);

    }
}