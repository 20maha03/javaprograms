//Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.Sample array: [1,2,4,5,6].Target value: 6.
import java.util.Scanner;
import java.util.Arrays;
public class ElementsEqualToTheirSum{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter array size");
        int size=input.nextInt();
        int[] array=new int[size];
        System.out.print("enter array elements");
        for(int i=0;i<array.length;i++){
            array[i]=input.nextInt();
        }
        System.out.println("array elements are:"+Arrays.toString(array));
        System.out.println(" enter target element");
        int target=input.nextInt();
        for(int j=0;j<array.length;j++){
            for(int i=0;i<array.length;i++){
                if(array[i]+array[j]==target)
                System.out.println("Adding elements is:"+array[i]+","+array[j]);
                break;
            }
        }




    }
}