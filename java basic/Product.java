import java.util.*;

public class Product{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter the value of a :");
        int a=sc.nextInt();
         System.out.print("Enter the value of b :");
        int b=sc.nextInt();
        int product=a*b;
        System.out.print("Product of a & b is :");
        System.out.println(product); 
    }
}