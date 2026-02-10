
import java.util.Scanner;

public class Question1{

    public static int Average(int a,int b,int c) {
        int sum = a+b+c;
        int avg=sum/3;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a =sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b =sc.nextInt();
        System.out.println("Enter the value of  c: ");
        int c =sc.nextInt();
        int Average = Average(a, b, c);
        System.err.println("Average of three number : "+Average);
    }
}