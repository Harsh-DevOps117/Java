import java.util.Arrays;

public class FindSmallestLetter {
  public static char findSmallestLetter(char target, char[] chars) {
    char smallest = Character.MAX_VALUE;
    for (char c : chars) {
      if (c > target && c < smallest) {
        smallest = c;
      }
    }
    return smallest;
  }

  public static void main(String[] args) {
    char target = 'c';
    char[] chars = {'a', 'b', 'd', 'e'};
    char smallest = findSmallestLetter(target, chars);
    System.out.println(smallest);
  }
}
