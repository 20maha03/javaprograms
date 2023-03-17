//write a java program to move all the 0's to the end of the array.maintain the relative order of the other array elements
import java.util.Scanner;
import java.util.Arrays;
public class AllZerosEndOfTheArray{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter array size");
        int size=input.nextInt();
        int[] arr=new int[size];
        System.out.println("enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("array elements are:"+Arrays.toString(arr));
        int[] result=new int[size];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                result[count]=arr[i];
                count++;
            }
        }
     //   System.out.println("count is:"+count);
        while(count<arr.length){
            result[count]=0;
            count++;
        }
         for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
         }
        

            


    }
}