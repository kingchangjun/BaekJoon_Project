package org.example;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_today {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        String A = st.nextToken();
        String B = st.nextToken();
        String C = st.nextToken();
        String D = st.nextToken();

        String x = A+B;
        String y = C+D;

        long first = Long.parseLong(x);
        long second = Long.parseLong(y);

        System.out.println(first+second);

    }
}
