/*
Convert array into Zig-Zag fashion
Given an array of distinct elements, rearrange the elements of array in zig-zag fashion in O(n) time. The converted array should be in form a < b > c < d > e < f.
*/
public class ZigZag
{
  
  public static void zigzag(int[] arr){
    for(int i = 0; i < arr.length-2; i++){
      if(i%2 == 0)
      {
        if(arr[i+1] < arr[i])
        {
          int temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;         
        }
        
        if(arr[i+1] < arr[i+2])
        {
          int temp = arr[i+2];
          arr[i+2] = arr[i+1];
          arr[i+1] = temp;         
        }
      }
      else {
        if(arr[i+1] > arr[i])
        {
          int temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;         
        }
        
        if(arr[i+1] > arr[i+2])
        {
          int temp = arr[i+2];
          arr[i+2] = arr[i+1];
          arr[i+1] = temp;         
        }
      }
    }
  }
  
  public static void main(String[] args)
  {
    int[] arr = {4, 3, 7, 8, 6, 2, 1};
    int[] arr2 = {1, 4, 3, 2};  
    zigzag(arr);
    for(int i = 0; i < arr.length; i++){
    	System.out.print(arr[i]);
    }
    zigzag(arr2);
    System.out.println();
    for(int i = 0; i < arr2.length; i++){
    	System.out.print(arr2[i]);
    }
  }
}