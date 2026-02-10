
import java.util.Scanner;

public class Question2{
    public static boolean even(int n){
        boolean isEven=true;
        if(n%2==0){
            isEven=true;
        }else{
            isEven=false;
        }
        return isEven;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
         int n =sc.nextInt();
         System.out.println(even(n));

    }
}