public class Ceiling {

  public static int findCeiling(int[] arr,int target){
    int left=0;
    int right=arr.length-1;
    while (left<=right) {
      var mid=left+(right-left)/2;
      if(arr[mid]==target){
        return mid;
      }else if(arr[mid]<target){
        left=mid+1;
      }else{
        right=mid-1;
      }

    }
    return left;
  }


  public static void main(String[] args) {
    int[] arr = { 1, 2, 5, 6, 9, 10 };
    int index=findCeiling(arr, 7);
    System.out.println(arr[index]);
  }
}
