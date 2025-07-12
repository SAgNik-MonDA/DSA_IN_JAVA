 class Hollow{
    public static void hollow(int totrows,int totcols){
        // outer loops
        for(int i=1;i<=totrows;i++){
            // inner-columns
            for(int j=1;j<=totcols;j++){
                // cell-(i,j)
                if(i==1||i==totrows||j==1||j==totcols){
                    // boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        hollow(4,5);
    }
 }