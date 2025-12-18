public class ReplacingTheString {
  public static void main(String[] args) {
    String Str="Hello World";
    String result=new StringBuilder(Str).reverse().toString();
    System.out.println(result);
  }
}
