
import java.util.Scanner;
public class PJP9 
{public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
    int x=sc.nextInt();
    int y=sc.nextInt();
       System.out.println(x/y);
        }
        catch(Exception e){System.out.println("DivideByZeroException caught");}
        finally{System.out.println("Inside finally block");}
    }
    
}

//*-----Mini project-3 abstraction----------------------------------------------------------
abstract class Account
{
    double amount;
    double interestRate;
abstract double calculateInterest();  
}
class FDAccount extends Account
{
double interestRate;
double amount;
int noOfDays;
int ageOfACHolder;
FDAccount(double amount,int noOfDays,int ageOfACHolder)
{
this.amount=amount;
this.noOfDays=noOfDays;
this.ageOfACHolder=ageOfACHolder;
}
    double calculateInterest()
    {
       if(amount<10000000)
       { if(noOfDays<=14)
         {if( ageOfACHolder<60)
             return 4.50;
            else return 5.00;
         }
       if(noOfDays<=29)
         {if( ageOfACHolder<60)
             return 4.75;
            else return 5.25;
         }
       if(noOfDays<=45)
         {if( ageOfACHolder<60)
             return 5.50;
            else return 6.00;
         }
       if(noOfDays<=60)
         {if( ageOfACHolder<60)
             return 7.0;
            else return 7.5;
         }
       if(noOfDays<=184)
         {if( ageOfACHolder<60)
             return 7.50;
            else return 8.00;
         }
      else
         {if( ageOfACHolder<60)
             return 8.00;
            else return 8.50;
         }    
    }
       else
       {if(noOfDays<=14)
         {
             return 6.50;
           
         }
       if(noOfDays<=29)
         { return 6.75;
         }
       if(noOfDays<=45)
         { return 6.75;
         }
       if(noOfDays<=60)
         {return 8.0;
         }
       if(noOfDays<=184)
         { return 8.50;
         }
      else
         { return 10.0;
         }    
       
       }
}
}
class SBAccount extends Account
{
double interestRate;
double amount;
SBAccount(double amount)
{this.amount=amount;
}
      double calculateInterest()
    {
       return 4;
    }
}
 class RDAccount extends Account
{
double interestRate;
double amount;
int noOfMonths;
double monthlyAmount;
int age;
RDAccount(double amount,int age,int noOfMonths)
{
this.amount=amount;
this.noOfMonths=noOfMonths;
this.monthlyAmount=monthlyAmount;
this.age=age;
}
   double calculateInterest()
    {
       if(noOfMonths==6)
       {
          if(age<60) return 7.50; else return 8;
       }
       if(noOfMonths==9)
       {
          if(age<60) return 7.75; else return 8.25;
       }
       if(noOfMonths==12)
       {
          if(age<60) return 8.0; else return 8.50;
       }
       if(noOfMonths==15)
       {
          if(age<60) return 8.25; else return 8.75;
       }
       if(noOfMonths==18)
       {
          if(age<60) return 8.50; else return 9;
       }
       else 
       {
          if(age<60) return 8.75; else return 9.25;
       }
    }
 }
class NegativeValueException extends RuntimeException
{
  double n;
    public NegativeValueException(double n) {
        this.n = n;
    }
    public String toString()
    {return "Invalid number of days. Please enter non-negative values.";}
}
class MainQ
{
    static  void check(double n) throws NegativeArraySizeException
    {  
    if(n<0) throw new NegativeValueException(n);    
    }
    public static void main(String[] args) 
{  
    Scanner sc=new Scanner(System.in);
    try{
while(true){
    System.out.println("MAIN MENU\n---------------------");
    System.out.println("1.Interest Calculator - SB\n 2.Interest Calculator - FD\n3.Interest Calculator - RD\n 4.Exit");
    System.out.println("Enter your option (1-4) :");
    int n=sc.nextInt();
    Account x;
    if(n==1)
    {  
        System.out.println("Enter the average amount in your account :");
        double amt=sc.nextDouble(); check(amt);        
         x=new SBAccount(amt);
        System.out.println("Interest gained: "+(amt*x.calculateInterest())/100);
    }
    else if(n==2)
    {  
        System.out.println("Enter the FD Amount: ");
        double amount=sc.nextDouble();check(amount);
        System.out.println("Enter the number of days");
        int days=sc.nextInt();check(days);
        System.out.println("Enter your age:");
        int age=sc.nextInt();check(age);
        x=new FDAccount(amount,days,age);
        System.out.println("Interest gained: "+(amount*x.calculateInterest())/100);
        
    }
    else if(n==3)
    {System.out.println("Enter the RD Amount: ");
        double amount=sc.nextDouble();check(amount);
        System.out.println("Enter the number of months");
        int month=sc.nextInt();check(month);
        System.out.println("Enter your age:");
        int age=sc.nextInt();check(age);
        x=new RDAccount(amount,age,month);
        System.out.println("Interest gained: "+(amount*x.calculateInterest())/100);
    }
    else if(n==4)
    {
        System.out.println("Exiting..!!");break;
    }
    else{System.out.println("Invalid choice..!!");}
}
}
 catch(Exception e) {System.out.println(e);}
}
}
    


