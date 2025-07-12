
import java.util.Scanner;

/* Q.. In a program ,input 3 numbers : A ,B and C.You have to output the average of three numbers.
*/

// import java.util.*;
// public class Practicequestion{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int A=sc.nextInt();
//         int B=sc.nextInt();
//         int C=sc.nextInt();
//         int avg=(A+B+C)/3;
//         System.out.println("Average is :"+avg);
//     }
// }

/* Q..In a program ,input the side of a square . you have to input the area of the squre.
*/

// public class Practicequestion{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int side = sc.nextInt();
//         int area=side*side;
//         System.out.println("Area is :"+area);
//     }
// }

/* Q..Enter cost of 3 items from the user (using float data type) -a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/

public class Practicequestion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pencil =sc.nextFloat();
        float pen =sc.nextFloat();
        float eraser =sc.nextFloat();

        float total=pencil+pen+eraser;
        System.out.println("Total Bill is : "+total);
        float newTotal=total+(0.18f * total);
        System.out.println("Bill with 18% tax : "+newTotal);

    }
}
