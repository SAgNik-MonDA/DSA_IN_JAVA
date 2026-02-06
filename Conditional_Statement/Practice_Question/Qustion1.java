import java.util.*;
public class Qustion1{
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the Value of a : ");
    int a = sc.nextInt();

    if(a>0){
        System.out.println("Positive");
    }else{
        System.out.println("Negative");
    }
}
}