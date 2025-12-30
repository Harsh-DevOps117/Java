import java.util.Arrays;

public class Mod {
  public static int[] BubbleSort(int[] arr) {
    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr.length-i-1;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    return arr;
  }
  public static void main(String[] args) {
    int []arr={34,56,23,2,123};
    System.out.println(Arrays.toString(BubbleSort(arr)));
  }
}
