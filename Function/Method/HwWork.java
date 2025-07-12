// Question 1 :Write a Java method to compute the average of three numbers...

import java.util.*;

// class HwWork{
//     public static double average(double x, double y,double z){
//         return(x+y+z)/3;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter first number");
//         double x=sc.nextDouble();
//         System.out.println("Enter second number");
//         double y=sc.nextDouble();
//         System.out.println("Enter third number");
//         double z=sc.nextDouble();
//         System.out.println("The average value is "+average(x,y,z));
//     }
// }

// Question 2: Write a method named is Even that accepts an int argument .The method should return true if the argument is even ,or false otherwise.Also write a program to test your method.

// class HwWork{
//     public static boolean isEven(int num){
//         if(num%2==0){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter a number");
//         int num=sc.nextInt();
//         if(isEven(num)){
//             System.out.println("Number is even");
//         }
//         else{
//             System.out.println("Number is odd");
//         }

//     }
// }

// Question 3: Write a Java program to check if a numberis a palindrome in Java ? (121 is a palindrome , 321 is not).

// class HwWork{
//     public static boolean isPallindrome(int number){
//         int pallindrome=number;
//         int reverse=0;
//         while(pallindrome!=0){
//            int rem=pallindrome%10;
//             reverse=reverse*10+rem;
//             pallindrome=pallindrome/10;
//         }
//         if(pallindrome==reverse){
//             return true;
//         }
//         else{
//             return false;
//         }
//     } 
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter a number");
//     int number=sc.nextInt();
//     if(isPallindrome(number)){
//         System.out.println("Number : "+number+" is a pallindrome");
//     }
//     else{
//         System.out.println("Number : "+number+" is not a pallindrome");
//     }
// }
// }

// Question 5 :Write a Java method to compute the sum of the digits in an integer.

class HwWork{
    public static int Sum(int n){
        int Sum=0;
        while(n>0){
           int lastdigit=n%10;
            Sum+=lastdigit;
            n/=10;
        }
        return Sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Sum(n));
    }
}