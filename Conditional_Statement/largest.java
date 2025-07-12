public class largest{
    public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // int num=sc.nextInt();
    int A=1,B=3,C=6;
    if((A>=B)&&(A>=C)){
        System.out.println("largest is A");
    }
    else if(B>=C){
        System.out.println("largest is B");
    }
    else{
        System.err.println("largest is C");
    }
    }
}