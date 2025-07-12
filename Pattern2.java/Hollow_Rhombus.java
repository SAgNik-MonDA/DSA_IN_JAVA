 class Hollow_Rhombus{
    public static void hollow(int n){
        // outer loops
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
        }
        // hollow rectangle
            for(int j=1;j<=n ;j++){
                // cell-(i,j)
                if(i==1||i==n||j==1||j==n){
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
        hollow(5);
    }
 }