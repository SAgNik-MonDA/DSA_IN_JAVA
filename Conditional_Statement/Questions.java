//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();
//         if(x>0){
//             System.out.println("x is grater than 0 :  positive");
//         }
//         else{
//             System.out.println("x is less than 0 : negative");
//         }
//     }
// }

// Question 2 : Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.


// public class Questions{
//     public static void main(String[] args) {
//         double temp=103.5;
//         if(temp>100){

//             System.out.println("You have a fever");
//         }
//         else{
//             System.out.println("You don't have a fever");
//         }
//     }
// }

// Question 3 :Write a Java program to input week number(1-7)and print day of week name using switch case.


// public class Questions{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         System.out.println("enter week number(1-7): ");
//         int week=sc.nextInt();
//         switch(week){
//             case 1:
//                 System.out.println("Monday");
//                 break;
//                 case 2:
//                 System.out.println("Tuesday");
//                 break;
//                 case 3:
//                 System.out.println("Wednesday");
//                 break;
//                 case 4:
//                 System.out.println("Thursday");
//                 break;
//                 case 5:
//                 System.out.println("Friday");
//                 break;
//                 case 6:
//                 System.out.println("Saturday");
//                 break;
//                 case 7:
//                 System.out.println("Sunday");
//                 break;
//                 default:System.out.println("invalid input");
//         }
//     }
// }

// Question 5:Write a Java program that takes a year from the user and print whether that year is a leap year or not.
import java.util.*;
public class Questions{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter year");
         int year =sc.nextInt();
         boolean x=(year%4)==0;
         boolean y=(year%100) !=0;
         boolean z=((year%100==0)&&(year%400==0));
         if(x&&(y||z)){
            System.out.println(year+" is a leap year");
         }
         else{
            System.out.println(year+" is not a leap year");
         }
    }
}