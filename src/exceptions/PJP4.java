
class MathOperatiofn
{public static void main(String[] args) {
    try{
       
        int sum=0,avg=0;
        for(int i=0;i<args.length;i++)
        {
            sum=sum+Integer.parseInt(args[i]);
        }
        System.out.println("sum= "+sum);
        System.out.println("average= "+sum/args.length);
        
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
    
}
