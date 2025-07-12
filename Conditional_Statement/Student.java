import java.util.*;
public class Student{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String Rc=(num>=33)? "pass":"fail";
        System.out.println(Rc);
    }
}