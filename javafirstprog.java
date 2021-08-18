/*question 1*/
import java.util.*;
public class main{
    public static void main(String args[])
    {
        int n=699;
        System.out.println("sum of digits is "+digitsum(n));
    }
    static int digitsum(int n)
    {
        int sum=0;
        while(n>0 || sum>9)
        {
            if(n==0)
            {
                n=sum;
                sum=0;
            }
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}
/*question 2*/
public class count_obj
{
    static int count=0;
    count_obj()
    {
        count++;
    }
    public static void main(String []args)
    {
        count_obj obj1=new count_obj();
        count_obj obj2=new count_obj();
        count_obj obj3=new count_obj();
        System.out.println("Number of objects: "+count); 
    }
}
