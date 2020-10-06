import java.util.*;
import java.io.*;
import java.util.Arrays; 
public class Solutin
{
  public static void main(String[] args) 
  {
    int count = 0;
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int k = 1; k <= t; ++k)
    {
      int n = in.nextInt();
      int b = in.nextInt();
      int price[] = new int[n];
      for(int i = 0; i<n;i++)
      {
        price[i] = in.nextInt();
      }
      //20 40 90 90
      Arrays.sort(price);
      //System.out.println(); 
  
      for(int i = 0; b>=0;i++)
      {
        count++;
        b = b - price[i]; 
      } 
      System.out.println("Case #" + k + ":"+count); 
    }
  }
}