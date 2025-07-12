// Function overloading using parameters
// public class Overloading1{
//     public static int sum(int c,int d){
//         return c+ d;
//     }
//     public static int sum(int c,int d,int e){
//         return c + d+e ;
//     }
//     public static void main(String[] args) {
//         System.out.println(sum(5,3));
//         System.out.println(sum(5,2,1));
//     }
// }

// Function overloading using data types

public class Overloading1{
    public static int sum(int c,int d){
        return c+ d;
    }
    public static float sum(float c,float d){
        return c + d ;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,3));
        System.out.println(sum(5.5f,2));
    }
}