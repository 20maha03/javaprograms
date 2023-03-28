import java.util.Scanner;
import java.util.Arrays;
public class swapFirstElementAndLastElement{
    public static void main(String arga[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter array size");
        int size=input.nextInt();
        System.out.println("enter array elements");
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=input.nextInt();
        }
        System.out.println("array is:"+Arrays.toString(array));      
        int temp=array[0];
        array[0]=array[size-1];
        array[size-1]=temp;
        System.out.println("array is:"+Arrays.toString(array));      

    }
}