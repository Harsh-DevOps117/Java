import java.util.Scanner;

public class TableGeneration {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int Number=input.nextInt();
    int Upto=1;
    while (Upto<=10){
      System.out.println(Number+" X "+Upto+" = "+Number*Upto);
      Upto++;
    }
    input.close();
  }
}
