import java.util.*;
public class Input
{
    public static Scanner reader =new Scanner(System.in);
    public static void main(String[]args)
    {
        String name;
        double left,price;
        int pay;
        System.out.println("please enter your name:");
        name=reader.nextLine();
        System.out.println("please enter the price:");
        price=reader.nextDouble();
        System.out.println("please enter the pay:");
        pay=reader.nextInt();
        left=(pay-price);
        System.out.println("*********************************");
        System.out.println("what's left is:"+left);
    }
}