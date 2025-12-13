package Sheet1;

import java.util.Scanner;

public class Prime {
 public static void main(String[] args) {
  Scanner Input=new Scanner(System.in);
  System.out.print("Enter the Number ==> ");
  int n=Input.nextInt();
  int divider=(n-1)/2;
  int count=0;
  if (n<=1) {
    System.out.print("This Is a Not PRIME Number");
  }else{
    while (divider>=1) {
      if(n%divider==0){
        count++;
      }
      divider--;
    }
    if(count>1){
      System.out.println(n+ " iS NOT PRIME");
    }else{
      System.out.println(n+" is PRIME");
    }
  }
  Input.close();
 }
}
