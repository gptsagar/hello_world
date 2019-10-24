class InvalidCountryException  extends RuntimeException
{
   String country;
    public InvalidCountryException(String country) 
    {this.country=country;
    }
public String toString()
{
return "User Outside India cannot be registered ";
}
}
 class UserRegistration
{
     static void registerUser(String username,String userCountry)  throws InvalidCountryException
     {
      if (!userCountry.equals("India")) 
          throw new InvalidCountryException(userCountry);
         System.out.println("User registration done successfully");
     }
     public static void main(String[] args) {
         try{
          registerUser("Mickey","US");
         }catch(Exception e) {System.out.println(e);}
         try{
         registerUser("Mini","India");
         }
         catch(Exception e) {System.out.println(e);}
     }
    
}
