public class StringReversal {
  public static void main(String[] args) {
    var str = "hello";
    str.split("");
    String rev = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      rev = rev + str.charAt(i);
    }
    System.out.println(rev);

  }
}
