import java.util.Scanner;
class BinarySearch { 
    int binarySearch(int arr[], int m, int s, int k) 
    { 
        if (s >= m) { 
            int mid = m + (s - m) / 2; 
   
            if (arr[mid] == k) 
                return mid; 
   
            if (arr[mid] > k) 
                return binarySearch(arr, l, mid - 1, k); 

            return binarySearch(arr, mid + 1, s, m); 
        } 
        return -1; 
    } 
  
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for(int j=0;j<n;j++)
        {
            arr[j] = obj.nextInt();
        } 
        int result = ob.binarySearch(arr, 0, n - 1, k); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
}