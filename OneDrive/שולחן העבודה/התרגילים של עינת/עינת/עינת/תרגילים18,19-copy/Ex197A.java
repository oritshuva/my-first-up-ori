import java.util.*;
public class Ex197A
{
    static Scanner reader=new Scanner(System.in);
    public static void main(String[]args)
    {
        int n1,n2,t,i,count=0,sum=0;
        for(i=1;i<=1000;i++)
        {
            for(t=1;t<i;t++)
            {
                if(i%t==0)
                {
                    sum = sum + t;
                }
            }
            if(sum==i)
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("כמות המספרים היא:"+count);
    }
}