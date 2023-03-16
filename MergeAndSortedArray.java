import java.util.Scanner;
import java.util.Arrays;
public class MergeAndSortedArray{
    public static void main(String args[]){
        int i,j;
        int n=3;
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter array elements:");
        for(i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("array is:"+Arrays.toString(arr));
        int[] arr2=new int[n];
        System.out.println("enter array elements:");

        for(i=0;i<n;i++){
            arr2[i]=input.nextInt();
        }
        System.out.println("array is:"+Arrays.toString(arr2));
        Seperate(arr,size,arr2,n);
        System.out.println("array is:"+Arrays.toString(arr));
        System.out.println("array is:"+Arrays.toString(arr2));

    }
    public static void Seperate(int arr[],int size,int arr2[],int n){
        for(int i=0;i<size;i++){
            if(arr[i]>arr2[0]){
                int temp=arr[i];
                arr[i]=arr2[0];
                arr2[0]=temp;
                int firstarr=arr2[0];
                int k;
                for(k=1;k<n && arr[k]<firstarr;k++){
                    arr2[k-1]=arr2[k];
                }
                arr2[k-1]=firstarr;
            }
        }
    }
}