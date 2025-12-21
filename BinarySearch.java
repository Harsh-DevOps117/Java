import java.util.ArrayList;

public class BinarySearch {
  public static void main(String[] args) {
    int []arrList={1,12,34,123,3456,567,67};
    ArrayList<Integer> arr= new ArrayList<Integer>();
    for (int integer : arrList) {
      arr.add(integer);
    }
    arr.sort(null);
    int target=567;
    int index=BinarySearch12(arrList,target);
    System.out.println(index);
  }

  public static int BinarySearch12(int [] arr, int target) {
    int left=0;
    int right=arr.length-1;
    while (left<=right) {
      int mid = (left + right) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }


}
