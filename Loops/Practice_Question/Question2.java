
import java.util.Scanner;


public class Question2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddSum=0;
        int evenSum=0;
        int choice;

        do { 
            System.out.println("Enter the number : ");
             int num = sc.nextInt();
            if(num%2==0){
                evenSum+=num;
            }else{
                oddSum+=num;
            }
            System.out.println("Do you want to continue ? Press 1 for yes or 0 for no");
            choice = sc.nextInt();
        } while (choice==1);

        System.out.println("Sum of even number is : " +evenSum);
        System.out.println("Sum of odd number is : " +oddSum);
    }
}