import java.util.*;
public class Ex44
{
    public static Scanner reader= new Scanner(System.in);
    public static void main(String[]args)
    {
        double p1,v1,t1;
        String n1;
        System.out.println("The name of the product:");
        n1=reader.next();
        System.out.println("The prise of the prodect in NSI:");
        p1=reader.nextDouble();
        System.out.println("The value of the euro in that day:");
        v1=reader.nextDouble();
        
        // Price in Euro
        t1 = p1 *  v1;
        
        System.out.println("Price in Euro is " + t1);
    }
}