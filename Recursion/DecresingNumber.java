public class DecresingNumber{
    public static void Dec_Num(int n){
        if(n==1){
            System.err.print(n+ " ");
            return ;
        }
        //  Dec_Num(n-1); // increasing
        System.err.print(n + " ");
        Dec_Num(n-1); // decresing
    }
    public static void main(String[] args) {
        int n=10;
        Dec_Num(n);
        
    }
}