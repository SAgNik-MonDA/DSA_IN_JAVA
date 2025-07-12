
   
//     public static boolean prime(int n){
//         if(n==2){
//             return true;
//         }
//         //  boolean prime =true;
//         for(int i=2;i<=n-1;i++){
//             if(n%i==0){
//                 // prime = false;
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//        boolean result=prime(12);
//         if(result==false){
//             System.out.println("number is not prime");
//         }
//         else{
//             System.out.println("number is prime");
//         }
//     }
// }


// optimized code

public class Prime{
   
    public static boolean prime(int n){
        if(n==2){
            return true;
        }
        //  boolean prime =true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                // prime = false;
                return false;
            }
        }
        return true;
    }
    public static void InRange(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
        System.err.println("");
    }
    public static void main(String[] args) {
       InRange(20);
    }
}