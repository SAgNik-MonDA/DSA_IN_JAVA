// print number from 1 to 10.

// public class Number{
//     public static void main(String[] args) {
//         int num=1;
//         while(num<=10){
//             System.out.println(num);
//             num++;
//         }
//     }
// }

//  print number from 1 to n.

// import java.util.*;
// public class Number{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter range : ");
//         int n=sc.nextInt();
//         int counter=1;
//         while(counter<=n){
//             System.out.print(counter+ " ");
//             counter++;
//         }
//     }
    
// }

// print sum of first n natural numbers.

import java.util.*;
public class Number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter range : ");
        int n=sc.nextInt();
        int counter=1;
        int sum=0;
        while(counter<=n){
            sum=sum+counter;
            counter++;
        }
          System.out.print("sum is : "+sum+ " ");
    }
    
}