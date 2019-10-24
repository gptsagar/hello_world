
import java.util.Scanner;
public class PJP5 
{ static void division(int a,int b) throws ArithmeticException
{
    System.out.println(a/b);

}
public static void main(String[] args)
{  Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    try
    {division(x, y);  
    }
    catch(Exception e)
    {System.out.println(e);
    }
 }
    
}
