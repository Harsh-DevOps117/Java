package Sheet1;

import java.util.Scanner;

public class LeapYR {
  public static void main(String[] args) {
    Scanner IntYear=new Scanner(System.in);
    int Year=IntYear.nextInt();
    if (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
      System.out.println(Year + " is a leap year.");
    } else {
      System.out.println(Year + " is not a leap year.");
    }
    IntYear.close();
  }
}
