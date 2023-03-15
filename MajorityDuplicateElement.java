import java.util.Scanner;
import java.util.Arrays;
public class MajorityDuplicateElement{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter array size:");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter First array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int count;
        int[] arr2=new int[size];
        for(int j=0;j<arr.length;j++){
             count=0;
            for(int k=0;k<arr.length;k++){
                if(arr[j]==arr[k]){
                    count++;
                }
                
            }
        
        }
        
        for(int j=0;j<arr2.length;j++){
            count=arr2[j];
            
        }      
        System.out.print(arr2+" ");
    }
}