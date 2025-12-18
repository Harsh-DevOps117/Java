public class VowelRemoval {
  public static void main(String[] args) {
    String str = "hello world";
    String result = str.replaceAll("[aeiou]", "");
    System.out.println(result);
  }
}
