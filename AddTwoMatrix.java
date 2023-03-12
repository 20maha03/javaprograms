import java.util.Scanner;
public class AddTwoMatrix{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter first row of matrix");
        int m=input.nextInt();
        System.out.println("enter first coloum of matrix");
        int n=input.nextInt();
        int arr[][]=new int[m][n];
        int arr2[][]=new int[m][n];
        int sum[][]=new int[m][n];
        System.out.println("enter first matrix element");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("enter second matrix element");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        System.out.println();
        System.out.println();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               System.out.print(sum[i][j]+"\t");
               System.out.println();
            }
        }
    }
}