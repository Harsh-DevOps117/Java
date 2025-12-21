public class LinearSearch {
  public static void main(String[] args) {
    int []arr={12,45,234,346,2134,34513,3453,45345,34534,5345,324};
    int target=324;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==target){
        System.out.println(i);
      }
    }
  }
}
