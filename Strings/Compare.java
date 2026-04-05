public class Compare{

    public static void main(String[] args) {
     String s1="sagnik"; 
      String s2="sagnik";  
       String s3=new String("sagnik");  

    //    if(s1 == s2){
    //     System.err.println("Strings are equal");

    //    }else{
    //          System.out.println("Strings are not equal");
    //    }

    //    if(s1 == s3){
    //     System.out.println("Strings are  equal");
    //    }       
    // else{
    //     System.out.println("Strings are not equal");
    // }

    if(s1.equals(s3)){
         System.out.println("Strings are  equal");
    }else{
        System.out.println("Strings are not equal");
    }
    }
}