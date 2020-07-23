mport java.util.*;
class ArraySort{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for(int g=0;g<n;g++)
        {
            arr[g] = obj.nextInt();
        }
        Arrays.sort(arr);
        for(int g=0;g<n;g++)
        {
            System.out.print(arr[g]+" ");
        }
    }
}