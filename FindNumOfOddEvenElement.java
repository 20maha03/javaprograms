import java.util.Scanner;
import java.util.Arrays;
public class FindNumOfOddEvenElement{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter First array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int count=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2==0){
                count++;
            }
        }
        System.out.println("number of even elements is:"+count);
        System.out.println("number of odd elements is:"+(arr.length-count));
    }
}