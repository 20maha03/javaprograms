//Write a Java program to find the length of the longest consecutive elements sequence from a given unsorted array of integers.
//Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
import java.util.Scanner;
import java.util.Arrays;
public class ConsecutiveArray{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter array size");
        int size=input.nextInt();
        int[] array=new int[size];
        System.out.println("enter array elements");
        for(int i=0;i<array.length;i++){
            array[i]=input.nextInt();
        }
        Arrays.sort(array);
        System.out.println("array elements are:"+Arrays.toString(array));
        int length=0;
        int j=0;
        int[] consArray=new int[array.length];
        for(int i=0;i<array.length-1;i++){
            if(array[i]+1==array[i+1]){
                consArray[j++]=array[i];
                length++;
            }
            else if(array[i]+1!=array[i+1]){
                consArray[j++]=array[i];
                length=length+1;
                break;
            }
        }
        System.out.println("consecutive array Element length is:"+length);
    
}
}

        
    