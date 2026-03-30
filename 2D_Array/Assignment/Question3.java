public class Question3{
    public static void Transpose(int matrix[][]){
        int transpose [][] = new int [matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
            transpose[j][i]=matrix[i][j];
            }
        }
         Printtranspose(transpose);
    }

    public static void Printtranspose(int transpose[][]) {
        for (int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.err.print(transpose[i][j]+" ");
            }
            System.err.println("");
        }
    }

    public static void main(String[] args) {
        int matrix[][] =  { {2,3,7}, {5,6,7} };
        Transpose(matrix);
       
    }
}