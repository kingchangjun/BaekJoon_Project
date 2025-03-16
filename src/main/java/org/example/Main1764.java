package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // A와 B 집합을 HashSet으로 선언
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        // 집합 A 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        // 집합 B 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        // A - B 개수 계산
        HashSet<Integer> diffA = new HashSet<>(setA);
        diffA.removeAll(setB); // A에서 B에 있는 요소 제거

        // B - A 개수 계산
        HashSet<Integer> diffB = new HashSet<>(setB);
        diffB.removeAll(setA); // B에서 A에 있는 요소 제거

        // 대칭 차집합 크기 출력
        System.out.println(diffA.size() + diffB.size());
    }
}
