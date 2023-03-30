//write a java program that checks an array is negative dominant or not.if the array is negative dominant return true otherwise false
import java.util.Scanner;
import java.util.Arrays;
public class NegativeDominant{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter First array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int negCount=0;
        int posCount=0;
        System.out.println("array is:"+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0)
            {
                negCount++;
            }
            else{
                posCount++;
            }
        }
        if(posCount<=negCount){
            System.out.println("its a negative dominant");
        }
        else
        System.out.println("its a positive dominant");
        
    }
}