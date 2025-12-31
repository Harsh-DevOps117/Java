public class BianSearch {

  public static int BinarySerach(int []arr,int target){
    int left=0;
    int right=arr.length-1;
    while (left<=right) {
      int mid=left+((right-left)/2);
      if(arr[mid]==target){
        return mid;
      }else if (arr[mid]>left) {
        left=mid+1;
      }else{
        right=mid-1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int index=BinarySerach(arr, 4);
    if(index==-1){
      System.out.println("Target Absent");
    }
    System.out.println("Target is At: "+ index);
  }
}
