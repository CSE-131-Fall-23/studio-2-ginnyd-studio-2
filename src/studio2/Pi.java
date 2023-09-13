package studio2;

import java.util.Scanner;

public class Pi {

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter times: ");
  int times = in.nextInt();
  int inC = 0;
        for(int i=0;i<=times;i++)
      
        {
         double x = Math.random();
            double y = Math.random();
         if(x*x+y*y<=1) 
         {
          inC++;
         }
        }
        System.out.println("Pi equals to: "+(double)inC*4/times);
        
 }

}