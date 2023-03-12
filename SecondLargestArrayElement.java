import java.util.Scanner;
public class SecondLargestArrayElement{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter size");
        int size=input.nextInt();
        System.out.println("enter array element");
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int max=arr[0];
        int secondLargest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondLargest=max;
                max=arr[i];
            }
            else if(arr[i]>secondLargest&&arr[i]!=max){
                secondLargest=arr[i];
            }
        }
        System.out.println("second largest element is:"+secondLargest);
    }
}