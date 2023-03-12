import java.util.Scanner;
public class CopyArrayElement{
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
        int array2[]=new int[size];
        int i=0;
        for(int j=0;j<array2.length;j++){
            
               array2[i++]=array[j];
            
        }
        for(i=0;i<array2.length;i++){
            System.out.println();
            System.out.println(array2[i]+" ");
        }
    }
}