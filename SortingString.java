import java.util.Scanner;
import java.util.Arrays;
public class SortingString{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("enter your elements:");
        int[] array=new int[5];
        for(int i=0;i<5;i++){
           array[i]=input.nextInt();
        }
        System.out.println("original numeric array:");
        for(int i=0;i<5;i++){
           System.out.println(array[i]);
        }
        Arrays.sort(array);
        System.out.println("Sorted numeric array:");
        for(int i=0;i<5;i++){
           System.out.println(array[i]);
        }

        
    }
}