package org.example;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;


public class Main10815 {
    static int[] arr1;
    static int n,m;
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        arr1 = new int[n];

        st = new StringTokenizer(br.readLine()," ");

        for(int i =0; i <n; i++)
        {

            arr1[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr1);

        m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine()," ");

        for(int i = 0 ; i <m ; i++)
        {
            int num = Integer.parseInt(st.nextToken());
            System.out.print(BinarySeach(num)+ " ");
        }

    }


    public static int BinarySeach(int num){
        int left = 0;
        int right = n-1;

        while(left <= right)
        {
            int middle_index = (left + right)/2;
            int middleValue = arr1[middle_index];

            if(num > middleValue)
                left = middle_index+1;
            else if(num < middleValue)
                right = middle_index-1;
            else
                return 1;
        }
        return 0;
    }
}
