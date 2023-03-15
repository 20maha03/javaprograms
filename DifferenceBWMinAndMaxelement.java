import java.util.Scanner;
import java.util.Arrays;
public class DifferenceBWMinAndMaxelement{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter First array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
               max =arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min is:"+min+" "+"max is:"+max);
        int diff=max-min;
        System.out.println("difference of maximum and minimum element is:"+diff);
    }
}