public class Search_in_sorted_matrix{

public static boolean StairCaseSearch(int matrix[][],int key){
    // 1st process

    // int row=matrix.length-1;
    // int col=0;


    // while(row<matrix.length && col>=0){
    //     if(matrix[row][col]==key){
    //         System.out.print("found key at ("+ row + "," + col + ")");
    //         return true;
    //     }
    //     else if(key<matrix[row][col]){
    //         row--;
    //     }
    //     else{
    //         col++;
    //     }
    // }

    // 2nd process

     int row=0;
    int col=matrix[0].length-1;


    while(row<matrix.length && col>=0){
        if(matrix[row][col]==key){
            System.out.print("found key at ("+ row + "," + col + ")");
            return true;
        }
        else if(key<matrix[row][col]){
          col--;
        }
        else{
            row++;
        }
    }
    System.out.println("Key not found !!!");
    return false;
}
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 33;

        StairCaseSearch(matrix, key);
    }
}