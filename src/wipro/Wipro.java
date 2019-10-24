
import java.util.Arrays;

//----------------Language Basics-----------------------------------------------------------------------
 class LanguageBasics1
 {
    public static void main(String[] args)
    {
      String x=args[0];
      String y=args[1];
        System.out.println(x+" Technologies "+y);
    }
    
}
//--------------------------------------------------------------------------------------------------------
class LanguageBasics2
{
    public static void main(String[] args) {
        String x=args[0];
        System.out.println("Welcome "+x);
    }   
    
}

//--------------------------------------------------------------------------------------------------------
class LanguageBasics3
{
    public static void main(String[] args) {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        System.out.println(x+y);
    }   
    
}
 
 
//--------------Flow Control Statements------------------------------------------------------------------------------
class Flow1
{
    public static void main(String[] args) {
        int x=Integer.parseInt(args[0]);
        if(x==0)
        {System.out.println("Zero");}
        if(x<0)
        {System.out.println("Positive");}
        if(x==0)
        {System.out.println("Negative");}        
    }       
}

//------------------------------------------------------------------------------------
class Flow2
{
    public static void main(String[] args) {
        int x=Integer.parseInt(args[0]);
        if(x%2==0)
        {System.out.println("Even");}
        else
            System.out.println("Odd");
    }       
}
//------------------------------------------------------------------------------------
class Flow3
{
    public static void main(String[] args) {
        if(args.length==0)
        {System.out.println("No Values");}
        else
        {
        for(int i=0;i<args.length;i++)
        {if(i==args.length-1)
            System.out.print(args[i]);
        else System.out.print(args[i]+",");
        }
        }
    }       
}
//------------------------------------------------------------------------------------
class Flow4
{
    public static void main(String[] args) {
       char x=args[0].charAt(0);
       char y=args[1].charAt(0);
       char z=x;
       if(x>y) {x=y; y=z;}
        System.out.println(x+","+y);
    }       
}

//------------------------------------------------------------------------------------
class Flow5
{
    public static void main(String[] args) {
       char x=args[0].charAt(0);
      if(x<=48&&x<=57)
      {
          System.out.println("Digit");
      }
      else if((x>=65&&x<=90)||(x>=97&&x<=122))
      {
          System.out.println("Alphabet");
      }
      else System.out.println("Special Character");
    }       
}

//------------------------------------------------------------------------------------
class Flow6
{
    public static void main(String[] args) {
       String x=args[0];
       int age=Integer.parseInt(args[1]);
      if(x.equals("Male"))
      {
          if(age>=1&&age<=58)
             System.out.println("8.4%"); 
          else if(age>=59&&age<=100)
             System.out.println("10.5%");
      } 
      else if(x.equals("Female"))
      {
          if(age>=1&&age<=58)
             System.out.println("8.2%"); 
          else if(age>=59&&age<=100)
             System.out.println("9.2%");
      }
      
    }       
}

//------------------------------------------------------------------------------------
class Flow7
{
    public static void main(String[] args) {
       char x=args[0].charAt(0);
        System.out.print(x+">");
      if(x>=65&&x<=90)
      { x=(char) (x+32);
          System.out.print(x);
      }
      else if(x>=97&&x<=122)
      { x=(char) (x-32);
          System.out.print(x);
      }
     
    }       
}

//------------------------------------------------------------------------------------
class Flow8
{
    public static void main(String[] args) {
       char x=args[0].charAt(0);
       switch(x)
       {
       case 'R':System.out.println("Red");break;
       case 'B':System.out.println("Blue");break;
       case 'G':System.out.println("Green");break;
       case 'O':System.out.println("Orange");break;
       case 'Y':System.out.println("Yellow");break;
       case 'W':System.out.println("White");break;
       default:  System.out.println("Invalid Code");       
       }
     
    }       
}

//------------------------------------------------------------------------------------
class Flow9
{
    public static void main(String[] args) {
        if(args.length==0) 
        {System.out.println("Please enter the month in numbers");
        return;
        }
        int x=Integer.parseInt(args[0]);
        
        switch(x)
       {
       case 1:System.out.println("January");break;
       case 2:System.out.println("February");break;
       case 3:System.out.println("March");break;
       case 4:System.out.println("April");break;
       case 5:System.out.println("May");break;
       case 6:System.out.println("June");break;
        case 7:System.out.println("July");break;
       case 8:System.out.println("August");break;
       case 9:System.out.println("September");break;
       case 10:System.out.println("October");break;
       case 11:System.out.println("November");break;
       case 12:System.out.println("December");break;
       default:  System.out.println("Invalid month");       
       }       
     
    }       
}

//------------------------------------------------------------------------------------
class Flow10
{
    public static void main(String[] args) 
  {
      for(int i=1;i<=10;i++) System.out.print(i+" ");
}
    
}

//------------------------------------------------------------------------------------
class Flow11
{
    public static void main(String[] args) 
  {
      for(int i=23;i<=57;i++) 
      { if(i%2==0)
          System.out.println(i);
      }
}
    
}

//------------------------------------------------------------------------------------
class Flow12
{
    public static void main(String[] args) 
  {  int x=Integer.parseInt(args[0]);
      for(int i=2;i*i<=x;i++) 
      { if(x%i==0)
      { System.out.println("Not a Prime");
          return;
      }
      }
      System.out.println("Prime");
}
    
}

//------------------------------------------------------------------------------------
class Flow13
{
    public static void main(String[] args) 
  {  
w: for(int j=10;j<=99;j++) 
      {for(int i=2;i*i<=j;i++) 
      { if(j%i==0)
        { continue w;
        }
      }
          System.out.println(j);
      }
  }
    
}

//------------------------------------------------------------------------------------
class Flow14
{
    public static void main(String[] args) 
  {  
      if(args.length==0) {System.out.println("Please enter an integer number");return;}
        int w=Integer.parseInt(args[0]);
if(w==0||w==1)
{
    System.out.println(w+" is neither prime nor composite");
    return;
}
for(int i=2;i*i<=w;i++) 
      { if(w%i==0)
        { System.out.println(w+" is not a prime number");
        return;
        }
      }
          System.out.println(w+" a prime number");
      }
}
//------------------------------------------------------------------------------------
class Flow15
{
    public static void main(String[] args) {
        int x=Integer.parseInt(args[0]);
        int sum=0;
      while(x>0)
      {
      int d=x%10;
      sum+=d;
      x=x/10;
      }
        System.out.println(sum);
    }
}
//---------------------------------------------------------------
class Flow16
{
    public static void main(String[] args) 
  {  
      int w=Integer.parseInt(args[0]);
        for(int i=1;i<=w;i++)
       {
       for(int j=0;j<i;j++)
       {
           System.out.print("* ");
       }
           System.out.println("");       
       }
      
  }
  }
//-----------------------------------------------
class Flow17
{
    public static void main(String[] args) {
        int x=Integer.parseInt(args[0]);
        int rev=0;
      while(x>0)
      {
      int d=x%10;
      rev=rev*10+d;
      x=x/10;
      }
        System.out.println(rev);
    }
}

//---------------------------------------------------
class Flow18
{
    public static void main(String[] args) {
        int x=Integer.parseInt(args[0]);
        int n=x;
        int rev=0;
      while(x>0)
      {
      int d=x%10;
      rev=rev*10+d;
      x=x/10;
      }
      if(rev==n)System.out.println(n+" "+"is"+" "+"a"+" "+"palindrome");
      else System.out.println(n+" "+"is"+" "+"not"+" "+"a"+" "+"palindrome");
    }
}

//------------------------------------------------------------------------------------
class Flow19
{
    public static void main(String[] args) 
  {  int w=0;
      for(int i=1;i<200;i++)
      {
      if(i%2==0&&i%3==0&&i%5==0)
      {System.out.println(i);
      w++;
      }
      if(w==5) break;
      
      }
  }
}

//--------------------------------------Arrays------------------------------------------
class array1
{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
        sum+=a[i];
        }
        System.out.println(sum);
        System.out.println(sum/a.length);
    }
}

class array2
{
    public static void main(String[] args) {
        int a[]={2,1,4,3,5};
        Arrays.sort(a);
        System.out.println(a[0]);
        System.out.println(a[a.length-1]);
        
    }
}

class array3
{
    public static void main(String[] args) {
        int search=Integer.parseInt(args[0]);
        int a[]= {1,4,34,56,7};
       for(int i=0;i<a.length;i++)
       {
       if(a[i]==search)
       {
           System.out.println(i);return;
       }
       }
        System.out.println(-1);
        
    }
}

class array4
{
    public static void main(String[] args) {
        int a[]={97,66,89,74,66};
        for(int i=0;i<a.length;i++)
        {
            System.out.print((char)a[i]);
        }
    }
}

class array5
{
    public static void main(String[] args) {
        int a[]={2,1,44,3,5,56,45,33,46};
        Arrays.sort(a);
        System.out.println(a[0]+" "+a[1]);
        System.out.println(a[a.length-2]+" "+a[a.length-1]);
        
    }
}

class array6
{
    public static void main(String[] args) {
        int a[]={2,1,44,3,5,56,45,33,46};
        int temp;
       for (int i = 0; i < a.length; i++) 
        {
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
       for(int i=0;i<a.length;i++)
       {
           System.out.print(a[i]+" ");
       }
    }
}
class Arrays10
{public static void main(String[] args) {
    if(args.length<9) {System.out.println("Please enter 9 integer numbers");return;}
        int a[][]=new int[3][3];
        int w=0;
        for(int i=0;i<3;i++)
        {
        for(int j=0;j<3;j++)
        {
         a[i][j]=Integer.parseInt(args[w++]);
        }        
        }     
           System.out.println("The given array is : ");
        for(int i=0;i<3;i++)
        {
        for(int j=0;j<3;j++)
        {
            System.out.print(a[i][j]+" ");
        }     System.out.println("");   
        }
        int max=Integer.parseInt(args[0]);
        for(int i=1;i<args.length;i++)
        {
          if(Integer.parseInt(args[i])>max)
           max=Integer.parseInt(args[i]);
        }
            System.out.println("The biggest number in the given array is "+max);
    }
}
//-----------------------------------------------------------------------------------
class Arrays9
{public static void main(String[] args) {
    if(args.length<4) {System.out.println("Please enter 4 integer numbers");return;}
        int a[][]=new int[2][2];
        int w=0;
            System.out.println("The given array is : ");
        for(int i=0;i<2;i++)
        {
        for(int j=0;j<2;j++)
        {
         a[i][j]=Integer.parseInt(args[w++]);
        }        
        }        
        for(int i=0;i<2;i++)
        {
        for(int j=0;j<2;j++)
        {
            System.out.print(a[i][j]+" ");
        }     System.out.println("");   
        }
         w=3;
          for(int i=0;i<2;i++)
        {
        for(int j=0;j<2;j++)
        {
           a[i][j]=Integer.parseInt(args[w--]);
        }     
        }   
            System.out.println("The reverse of the array is :");
         for(int i=0;i<2;i++)
        {
        for(int j=0;j<2;j++)
        {
            System.out.print(a[i][j]+" ");
        }     System.out.println("");   
        }
    }
}

//---------------------------------------------------------------------------------
class Arrays8 {
    public static void main(String args[]) {
        int sum=0,er=0;boolean s=false;
       for(int i=0;i<args.length;i++)
       {
       if(Integer.parseInt(args[i])==6)
       { s=true;
         er=sum;
       }
       if(s==true&&Integer.parseInt(args[i])==7)
       {
         sum=er;continue;
       }
       sum=sum+Integer.parseInt(args[i]);       
       }
        System.out.println(sum);
    }    
}
//----------------------------------------------------------------
class Arrays7
{
    public static void main(String[] args) 
    {
       r: for(int i=0;i<args.length;i++)
        {
          for(int j=0;j<i;j++)
          {
          if(Integer.parseInt(args[i])==Integer.parseInt(args[j]))
              {
                continue r;
              }
          }
            System.out.print(args[i]+" ");
        
        }
    }

}
