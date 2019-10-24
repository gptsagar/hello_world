class InvalidAgeException  extends RuntimeException
{
   int age;
    public InvalidAgeException(int age) 
    {this.age=age;
    }
public String toString()
{
return "Invalid age "+age;
}
}
public class PJP8 
{public static void check(int a) throws InvalidAgeException 
{
      if (!(a>=18&&a<60)) throw new InvalidAgeException(a);   
    System.out.println("Age is valid");      
         
 }

public static void main(String[] args) {
        try{
            String name=args[0];        
        int age=Integer.parseInt(args[1]);
           check(age);
        }
        catch(Exception e){System.out.println(e);}
    }
    
}
