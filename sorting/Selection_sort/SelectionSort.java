import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       System.out.print("Enter the size of Array: ");
       int size=in.nextInt();
       int n=size;

       int[] arr=new int[n];
       System.out.println("Enter elements in Array: ");
       for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
       }
       
       for(int i=0;i<n-1;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min]){
                min=j;
            }

        }
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
    }


       System.out.println(Arrays.toString(arr));
       
    }
   
}
