import java.util.*;
public class Items{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the price of Pencile : ");
        float Pencile = sc.nextFloat();
        System.out.print("Enter the price of Pen : ");
        float pen = sc.nextFloat();
        System.out.print("Enter the price of eraser : ");
        float eraser = sc.nextFloat();

        float Total = Pencile+pen+eraser;

        System.out.println("Total Bill is : "+Total);


        float newTotal = Total+(0.18f+Total);
        System.out.println("Bill with 18% tax : " +newTotal);
    }
}