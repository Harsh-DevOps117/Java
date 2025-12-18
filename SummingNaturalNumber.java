public class SummingNaturalNumber {
  public static void main(String[] args) {
    long UptoSum = 10000L;
    int sum=0;
    while(UptoSum>0) {
      sum+=UptoSum;
      UptoSum--;
    }
    System.out.println(sum);
  }
}
