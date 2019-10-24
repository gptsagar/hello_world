
import java.util.Scanner;

public class PJP2 {
    public static void main(String[] args) {
        
      try{
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int []a=new int[x];
    for(int i=0;i<x;i++) a[i]=sc.nextInt();
          System.out.println("Enter the index of the array element you want to access:");
    int n=sc.nextInt();    
        System.out.println("The array element at index "+n+"="+a[n]);
          System.out.println("The array element successfully accessed");
        
 }
    catch(Exception e)
    {       
        System.out.println(e);
    }

}
}
