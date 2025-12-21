import java.util.ArrayList;
import java.util.Arrays;

public class FindMissingNumbers {
  public static void main(String[] args) {

    ArrayList<Integer> arr1 =
        new ArrayList<>(Arrays.asList(2, 3, 7, 6, 8, 1));
    ArrayList<Integer> missing = new ArrayList<>();

    arr1.sort(null);


    for (int i = 0; i < arr1.size() - 1; i++) {
      int current = arr1.get(i);
      int next = arr1.get(i + 1);

      for (int num = current + 1; num < next; num++) {
        missing.add(num);
      }
    }

    System.out.println("Missing: " + missing);
    arr1.addAll(0, missing);
    arr1.sort(null);
    System.out.println("Sorted: " + arr1);
  }
}
