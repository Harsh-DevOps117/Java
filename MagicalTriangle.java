//check the sum is a perfect square
//digits have a GCD
//GCD is a prime number

public class MagicalTriangle{

  public static boolean isPerfectSquare(int sum){
    int root = (int)Math.sqrt(sum);
    return root * root == sum;
  }

  public static int gcd(int[] numbers){
    int result = numbers[0];
    for(int i = 1; i < numbers.length; i++){
      result = gcd(result, numbers[i]);
    }
    return result;
  }

  public static int gcd(int a, int b){
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }

  public static boolean isPrime(int number){
    if (number <= 1)
      return false;
    for (int i = 2; i <= Math.sqrt(number); i++){
      if (number % i == 0)
        return false;
    }
    return true;
  }

  public static boolean isMagicalTriangle(int[] arr){
    int sum = 0;
    for(int i : arr){
      sum += i;
    }
    return isPerfectSquare(sum) && isPrime(gcd(arr));
  }

  public static void main(String[] args) {
    int[] arr = {10,22,32};
    if(isMagicalTriangle(arr)){
      System.out.println("Magical Triangle");
    }else{
      System.out.println("Not a Magical Triangle");
    }
  }
}
