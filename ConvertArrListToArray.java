import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class ConvertArrListToArray{
    public static void main(String[] args){
       ArrayList<String> list=new ArrayList<String>();
       list.add("python");
       list.add("maha");
       list.add("php");
       list.add("tpgit");
       String[] arr2=new String[list.size()];
       list.toArray(arr2);
       for(String string:arr2){
        System.out.println(string);
       }

    }
}