package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Main_today{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String binary = br.readLine();

        int len = binary.length();
        int n = (3- len%3) %3; // 0 개수 구하기.

        for(int i =0 ; i< n ; i++)
        {
            sb.append("0"); // n 만큼 0 붙이기.
        }
        sb.append(binary); // 앞에 0 붙이고 합치기.

        String n_len = sb.toString(); // 진짜 string으로 바꿔주기. sb는 가짜 string임.
        sb.setLength(0); // sb 초기화. 한번 더 쓸라고

        for(int i =0; i< n_len.length() ; i+=3)
        {
            String three = n_len.substring(i,i+3); // i ~ i+3까지 자르기
            int x = Integer.parseInt(three,2); //앞에 three 는 2진수니깐 10진수로 바꿔줘라는 뜻.
            sb.append(x);
        }
        System.out.println(sb);


    }
}