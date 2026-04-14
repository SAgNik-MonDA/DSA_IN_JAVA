public class Substring{


    public static String subString(String str , int si , int ei){
        String substr = "";
        for(int i =si;i<ei;i++){
            substr += str.charAt(i);
        }

        return substr;
    } 
    public static void main(String[] args) {
        String str = "Hellow World";
    //    System.err.println(str.substring(0,5));
        System.err.println(subString(str,0,5));
    }
}