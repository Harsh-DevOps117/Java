public class PrimeInrage {

  public static Boolean isPrime(int number){
    boolean Isprime=true;
    if(number<=1){
      return false;
    }else{
      for(int i=2;i<=number/2;i++){
        if(number%i==0){
          return false;
        }
      }
    }
    return Isprime;
  }

  public static void main(String[] args) {
    int[] arr ={1,500};
    for(int i=arr[0];i<arr[1];i++){
      if(isPrime(i)){
        System.out.println(i+" : is Prime Number");
      }
    }
  }
}
