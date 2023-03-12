import java.util.Scanner;
public class InsertArrayElements{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter size");
        int size=input.nextInt();
        System.out.println("enter array elements");
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=input.nextInt();
        }
        for(int j=0;j<array.length;j++){
            System.out.print(array[j]+" ");
        }
        System.out.println("enter new element");
        int newElement=input.nextInt();
        System.out.println("enter new array index");
        int newIndex=input.nextInt();
        array[newIndex]=newElement;
        for(int i=0;i<array.length;i++){
          System.out.println(array[i]+" ");
        }
    } 
}