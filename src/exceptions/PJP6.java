
import java.util.Scanner;

class rangeException extends RuntimeException  
{ int marks;
    public rangeException(int mark) 
    {marks=mark;
    }
public String toString()
{
return "Invalid Marks "+marks;
}
}
public class PJP6 
{ public static void check(int a) throws rangeException 
{
      if (a<0||a>100) throw new rangeException(a);         
//System.out.println("No error in prog. no exception caught");
         
 }
public static void main(String[] args)
   {try{Scanner sc=new Scanner(System.in);
       System.out.println("Enter name of 1st student");
      String name1=sc.nextLine();
       System.out.println("Enter marks in 3 subjects :");
       int a=sc.nextInt();
       check(a);
       int b=sc.nextInt(); check(b);int c=sc.nextInt(); check(c);
       System.out.println("Aversge marks of 1st student= "+(a+b+c)/3);
   System.out.println("Enter name of 2st student");
     sc.nextLine(); String name2=sc.nextLine();
       System.out.println("Enter marks in 3 subjects :");
       int x=sc.nextInt(); check(x);int y=sc.nextInt(); check(y);int z=sc.nextInt(); check(z);
       System.out.println("Aversge marks of 2nd student= "+(x+y+z)/3);
   }
   catch(Exception e)
   {System.out.println(e);
   }
        
    }
    
}
