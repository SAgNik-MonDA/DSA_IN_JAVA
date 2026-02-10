import java.util.*;
public class Question3 {
    public static boolean  palindrom(int n){
       int pal = n;
       int rev=0;
       while(pal!=0){
        int rem =pal%10;
        rev = rev*10+rem;
        pal = pal/10; 
       }
       if(n == rev){
        return true;
       }
       return false;
    }
    public static void main(String[] args) {
        System.out.println("Please Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(palindrom(num)) {
            System.out.println("Number : "+num+" is a palindrome");
    }
    else{
        System.out.println("Number : "+num +" is a not palindrome");
    }
    }
}