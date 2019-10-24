
//---------Encapsulation------------------

import java.util.Scanner;
 class Author
{
private String name,email;
private char gender;
   public void setName(String name)
    {
      this.name=name;
    } 
    public void setEmail(String email)
    {
      this.email=email;
    }
    public void setGender(char gender)
    {
      this.gender=gender;
    } 
     public String getName()
    {
      return name;
    } 
    public String getEmail()
    {
      return email;
    }
    public char getGender()
    {
      return gender;
    }
 }
class Book
{
   private String name;
      private double price;
    private int qtyInStock;
      public void setName(String name)
    {
      this.name=name;
    } 
    public void setPrice(double price)
    {
      this.price=price;
    }
    public void setqtyInStock(int x)
    {
      this.qtyInStock=x;
    }       
    public String getName()
    {
      return name;
    } 
    public double getPrice()
    {
      return price;
    }
    public int getqtyInStock()
    {
      return qtyInStock;
    } 
    
    public static void main(String args[]) 
    {        Scanner sc=new Scanner(System.in);
             Book obj=new Book();
            obj.setName("Sagar");
            obj.setPrice(2324.343);
            obj.setqtyInStock(23);
            Author x=new Author();
            x.setName("Sagar");
            x.setEmail("sagar@gmail.com");
            x.setGender('m');
            System.out.println(obj.getName()+" "+obj.getPrice()+" "+obj.getqtyInStock());  
            System.out.println(x.getName()+" "+x.getEmail()+" "+x.getGender());          
        
    }
    
}

//----------Inheritance third------------------------------------------------
class Person
{
String name,dob;
String get(String s)
{
    System.out.println("In Person Class");
    return name;
}
}
class Teacher extends Person
{
int salary;
String subject;
 int get()
 {System.out.println("In Teacher Class");return salary;
 }
}
class Student extends Person
{
int studentId;
 int get()
 {System.out.println("In Student Class");return studentId;
 }
}
class CollegeStudent extends Student
{
static String collegeName="dsf";
String year; 
}
class Main
{
    public static void main(String[] args) {
        CollegeStudent x=new CollegeStudent();
        x.collegeName="SRMS";
        x.year="first";      
        x.studentId=23;
        x.name="Sagar";
        x.dob="12/01/2019";
        Teacher er=new Teacher();
        er.salary=23232;
        er.subject="Maths";
        System.out.println(er.get());
        System.out.println(x.get());        
    }
    

}

//---Poly---------------------------------------------------
class Fruit
{String name;
String taste;
int size;
void eat(String name,String taste)
{
    this.name=name;
    this.taste=taste;
}
}
class Apple extends Fruit
{
void eat(String name,String taste)
{
    this.name=name;
    this.taste=taste;
}
}
class Orange extends Fruit
{
void eat(String name,String taste)
{
    this.name=name;
    this.taste=taste;
}
}
class Mainn
{
    public static void main(String[] args)
    {Fruit x=new Orange();
    x.eat("Orange","Sour");
        System.out.println(x.name+" "+x.taste);
    Fruit y=new Apple();
    y.eat("Apple","Sweet" );
        System.out.println(y.name+" "+y.taste);       
    }
}
//-----------------------------------------------------------
class Shape
{
void draw()
{System.out.println("Drawing Shape");}
void erase()
{System.out.println("Erasing Shape");}
}
class Circle extends Shape
{void draw()
{System.out.println("Drawing Circle");}
void erase()
{System.out.println("Erasing Circle");}
}
class Triangle extends Shape
{
void draw()
{System.out.println("Drawing Triangle");}
void erase()
{System.out.println("Erasing Triangle");}
}
class Square extends Shape
{
void draw()
{System.out.println("Drawing Square");}
void erase()
{System.out.println("Erasing Square");}
}
class Mainnn
{public static void main(String[] args) {
        
Shape c=new Circle();
c.draw();
c.erase();
Shape t=new Triangle();
t.draw();
t.erase();
Shape s=new Square();
s.draw();
s.erase();

}

}


//-----------------OOPS Mini Project-------------------------------
//------------------Video Rental Inventory System------------------
class Video
{
String videoName;
boolean checkout;
int rating;
Video(String name)
{ this.videoName=name;
}
String getName()
{return this.videoName;
}
void doCheckout()
{
    this.checkout=true;
}
void doReturn()
{
    System.out.println("Video "+this.getName()+" returned successfully.");
}
void receiveRating(int rating)
{
this.rating=rating;
}
int getRating()
{
return this.rating;
}
boolean getCheckout()
{
return this.checkout;
}
}
class VideoStore
{static int p=0;
  String d="                              ";
static Video[] store=new Video[1000];
void addVideo(String name)
{
    store[p++]=new Video(name);
}
void doCheckout(String name)
{
 Video x=get(name);
 if(x==null) {System.out.println("Invalid name....!!");return;}
  x.doCheckout();
  System.out.println("Video "+name+" checked out successfully.");
}
Video get(String name)
{  
     Video q=null;
      for(int i=0;i<100;i++)
           {   q=store[i];
           if(q==null) break;
               if(q.getName().equals(name))
               {break;
               }
           }
return q ;
}
void doReturn(String name)
{
 Video x=get(name);
  if(x==null) {System.out.println("Invalid name...!!");return;}
 x.doReturn();
}
void receiveRating(String name,int rating)
{
 Video x=get(name);
   if(x==null) {System.out.println("Invalid name...!!");return;}
 x.receiveRating(rating);
 System.out.println("Rating "+rating+" has been mapped to the Video "+name);
}
void listInventory()
{    VideoStore x=new VideoStore();
        for(int i=0;i<1000;i++)
           {  Video q=store[i];
           if(q==null) break;
               System.out.print(q.getName()+d.substring(0,23-q.getName().length()));
                       System.out.print(q.getCheckout()+d.substring(0,23));
                       if(q.getCheckout()==true)System.out.print(" ");
                       System.out.println(q.getRating());               
           }
 
}
}
class VideoLauncher
{
    public static void main(String[] args) {
      q: while(true)
      {
        System.out.println("MAIN MENU\n=========");
        System.out.println("1.Add Videos :\n2.Check Out Video :\n3.Return Video :\n4.Receive Rating :\n5.List Inventory :\n6.Exit :");
        System.out.println("Enter your choice (1-6) :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        if(n==1)
        {
            System.out.println("Enter the name of the video you want to add:");
            String name=sc.nextLine().trim();
            if(name.trim().length()==0){System.out.println("Invalid name..!!");continue q;}
            VideoStore x=new VideoStore();
            if(x.get(name)!=null){System.out.println("Video Name already exists..!!!");continue q;}
            x.addVideo(name);            
            System.out.println("Video "+name+" added successfully.");
        }
        else if(n==2)
        {System.out.println("Enter the name of the video you want to checkout:");
        String name=sc.nextLine();name=name.trim();
         VideoStore x=new VideoStore();
         x.doCheckout(name);            
        }
        else if(n==3)
        {System.out.println("Enter the name of the video you want to return:");
        String name=sc.nextLine();name=name.trim();
         VideoStore x=new VideoStore();
         x.doReturn(name);
        }
        else if(n==4)
        {System.out.println("Enter the name of the video you want to Rate: ");
        String name=sc.nextLine();name=name.trim();
            System.out.println("Enter the rating for this video: ");
            int m=sc.nextInt();sc.nextLine();
         VideoStore x=new VideoStore();
         x.receiveRating(name,m);             
        }
        else if(n==5)
        {VideoStore x=new VideoStore();
        System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Video Name      |      Checkout Status      |      Rating");
              x.listInventory();
        System.out.println("-------------------------------------------------------------------------------");
        }
        else if(n==6)
        {System.out.println("Exiting...!!Thanks for using the application.");
        break;
        }
        else System.out.println("Invalid Input..!!");
        }
    }

}
//--------------Abstraction---------------------------------------------------------------
//ques 1.
abstract class GeneralBank
{ abstract float getSavingsInterestRate();
  abstract float getFixedDepositInterestRate();
}
class ICICIBank extends GeneralBank
{
    float getSavingsInterestRate()
    {
       return 4;
    }
    float getFixedDepositInterestRate() 
    {
    return 8.5f;  
    }

}
class KotMBank extends GeneralBank
{
    float getSavingsInterestRate()
    {
       return 6;
    }
    float getFixedDepositInterestRate() 
    {
    return 9f;  
    }

}
class Maiin
{
    public static void main(String[] args)
    {
        ICICIBank i=new ICICIBank();
        System.out.println(i.getSavingsInterestRate());
        System.out.println(i.getFixedDepositInterestRate());
        
        KotMBank k=new KotMBank();
        System.out.println(k.getSavingsInterestRate());
        System.out.println(k.getFixedDepositInterestRate());
        
        GeneralBank g=new KotMBank();
        System.out.println(g.getSavingsInterestRate());
        System.out.println(g.getFixedDepositInterestRate());
        
        GeneralBank p=new ICICIBank();
        System.out.println(p.getSavingsInterestRate());
        System.out.println(p.getFixedDepositInterestRate());
    }

}

//----------------------------------------------------------------
abstract class Compartment
{
abstract String notice();

}
class FirstClass extends Compartment
{
    String notice()
    {
       return "In FirstClass Compartment";
    }
}
class Ladies extends Compartment
{
    String notice() 
    {
       return "In Ladies Compartment";
    }
}
class General extends Compartment
{
   String notice()
   {
       return "In General Compartment";
    }
}
class Luggage extends Compartment
{
    String notice() 
    {
        return "In Luggage Compartment";
    }
}
class TestCompartment
{
    public static void main(String[] args) {
        Compartment x[]=new Compartment[10];
        
    }
}