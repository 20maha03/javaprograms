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
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]==min){
                secondMin=min;
            }
            else if(array[i]<min){
                secondMin=min;
                min=array[i];
            }
            else if(array[i]<secondMin){
                secondMin=array[i];
            }
        }
        System.out.println("second min is:"+secondMin);
    }
}