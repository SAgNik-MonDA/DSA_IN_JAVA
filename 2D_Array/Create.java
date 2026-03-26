
import java.util.Scanner;

public class Create{

//  Search
// public static boolean  Search(int matrix[][] , int key){


//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]== key){
//                      System.out.print("found at cell ("+ i +","+ j +")");
//                      return true;
//                 }
              
//             }
//         }
//         System.err.println("Key not found");
//         return false;

// }




    public static void main(String[] args) {
        int matrix[][] = new int [3][5];
        // int n=3;
        // int m=3;
        int n = matrix.length;
        int m = matrix[0].length;


        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]= sc.nextInt();
            }
        }



        // output

    for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.err.println();
        }

    // Search(matrix, 6);

    }
}