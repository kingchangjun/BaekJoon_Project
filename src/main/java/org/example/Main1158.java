package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main1158 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] answer = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                answer[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        // 아직 남아있는 인덱스들은 오큰수가 없음
        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for(int num : answer) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}