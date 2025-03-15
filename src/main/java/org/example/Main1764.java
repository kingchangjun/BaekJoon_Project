package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main1764 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> map = new HashMap<>();

        for(int i = 0 ; i< n ; i++)
        {
            String Key = br.readLine();
            map.put(Key,Key);
        }

        StringBuilder sb = new StringBuilder();

        int c =0;
        ArrayList<String> list = new ArrayList<>();

        for(int i =0 ; i<m ; i++)
        {
            String s = br.readLine();
            if(map.containsKey(s))
            {
                list.add(s);
                c++;
            }
        }
        list.sort((s1,s2)->s1.compareTo(s2));

        for(String s : list)
        {
            sb.append(s).append('\n');
        }
        System.out.println(c+"\n"+sb);


    }

}
