package org.example;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 2609
public class Main_today {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = gcd(a,b);

        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));


  }
  public static int gcd(int a , int b )
  {
      if (b == 0) return a;
      return gcd(b,a%b);
  }
  public static int lcm(int a, int b)
  {
      int GCD = gcd(a,b);
      return a*b / GCD;
  }

}
