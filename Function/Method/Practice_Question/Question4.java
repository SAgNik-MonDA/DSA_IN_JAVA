
import java.util.Scanner;

public class Question4{
    public static int Sum(int n){
        int num=n;
        int sum=0;
        for(int i=num;i>0;i--){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.err.println("Sum of the digit : " +Sum(n));
    }
}