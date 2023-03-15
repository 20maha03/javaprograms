import java.util.Scanner;
import java.util.Arrays;
public class MinSecminMaxSecmax{
    public static void main(String args[]){
        int i,j;
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter array elements:");
        for(i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int k=0;k<arr.length;k++){
            if(arr[k]<min){
                min=arr[k];
            }
            else if(arr[k]>max){
                max=arr[k];
            }
        }
        System.out.println("max is:"+max);
        System.out.println("min is:"+min);
        int c=FindSecondMin(arr);
        arr[0]=max;
        arr[1]=min;
        arr[2]=c;
        
            System.out.println(arr);
        

    }
    public static int FindSecondMin(int[] arr){
     int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){
                secondMin=min;
            }
            else if(arr[i]<min){
                secondMin=min;
                min=arr[i];
            }
            else if(arr[i]<secondMin){
                secondMin=arr[i];
            }
        }
        return secondMin;
    }

}