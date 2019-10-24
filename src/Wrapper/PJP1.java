import java.util.Scanner;
public class PJP1
{ 

public static void main(String[] args)
{
    try{
    Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int x=Integer.parseInt(s);
        System.out.println(x*x);
        System.out.println("The work has been done successfully");
        
 }
    catch(Exception e)
    {       
        System.out.println("Entered input is not a valid format for an integer");
    }

}
    
}
