import java.util.Scanner;
class LinearSearch 
{  
public static int search(int arr[], int r) 
{ 
    int n = arr.length; 
    for(int i = 0; i < n; i++) 
    { 
        if(arr[i] == r) 
            return i; 
    } 
    return -1; 
} 
  
public static void main(String args[]) 
{ 
    Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }
      
    int result = search(arr, r); 
    if(result == -1) 
        System.out.print("Element is not present in array"); 
    else
        System.out.print("Element is present at index " + result); 
} 
}