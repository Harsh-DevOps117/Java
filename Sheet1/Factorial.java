package Sheet1;

public class Factorial {
  public static void main(String[] args) {
    int num=5;
    int Factorial=1;
    while(num!=0){
      Factorial*=num;
      num--;
    }
    System.err.println("Factorial is "+ Factorial );
  }
}
