public class LinearSerach {

  public static int Target(int []arr,int target){
    int i=0;
    while (i<arr.length && arr[i]!=target) {
      i++;
    }
    return (i==arr.length)?-1:i;
  }

  public static void main(String[] args) {
    int [] arr={1,3,4,2,4,5};
    int index=Target(arr, 5);
    System.out.println((index==-1)?"Not Found":("Target is at index:- "+index));

  }
}
