
// Question 1

import java.util.Scanner;

public class Avg{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        int c = sc.nextInt();
        System.out.print("Average of a , b & c : ");
        int avg = (a+b+c)/3;
        System.out.println(avg);
    }
}