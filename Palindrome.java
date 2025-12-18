public class Palindrome {
  public static void main(String[] args) {
    String str="level";
    String result=str.equals(new StringBuilder(str).reverse().toString())?"Yes":"No";
    System.out.println(result);
  }
}
