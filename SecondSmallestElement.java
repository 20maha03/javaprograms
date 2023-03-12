import java.util.Scanner;
public class SecondSmallestElement{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter size");
        int size=input.nextInt();
        System.out.println("enter array element");
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=input.nextInt();
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        int min=array[0];
        int secondMin=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                secondMin=min;
                min=array[i];
            }
            else if(array[i]<secondMin &&array[i]!=min){
                secondMin=array[i];
            }
        }
        System.out.println("second min is:"+secondMin);
    }
}