class Floyds_Triangle{
    public static void pyramid(int n){
        int counter=1;
        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println("");
            
        }
    }
    public static void main(String[] args) {
        pyramid(5);
    }
}