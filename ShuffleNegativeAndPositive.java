//Write a Java program that checks whether an array of integers alternates between positive and negative values.

//Sample Data:
//{1, -2, 5, -4, 3, -6} -> true
//{1, 2 ,5, 4, 3, 6} -> false


import java.util.Scanner;
import java.util.Arrays;
public class ShuffleNegativeAndPositive{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.println("enter array size");
int size=input.nextInt();
System.out.println("enter array element");
int[] array=new int[size];
for(int i=0;i<array.length;i++){
    array[i]=input.nextInt();
}
System.out.println("array is"+Arrays.toString(array));
for(int i=0;i<array.length-1;i++){
   if( ((array[i]>=0 && array[i+1]<0) || (array[i]<0 && array[i+1]>=0))){
     System.out.println("true");
     break;
   } 
   else{
     System.out.println("false");
     break;
   }

       
}
}
}