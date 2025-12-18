public class PrimeNumber {
  public static void main(String[] args) {
    int num=5;
    if(num<=1){
      System.out.println("Not a Prime Number");
    }else{
      boolean isPrime=true;
      int loop=num/2;
      while (loop!=1) {
        if(num%(num/2)==0){
          isPrime=false;
          break;
        }
       loop--;
      }
      if(isPrime){
        System.out.println("Prime Number");
      }else{
        System.out.println("Not a Prime Number");
    }
    }
  }
}
