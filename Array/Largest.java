public class Largest{
    public static int getLargest(int numbers[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
       if(largest<numbers[i]){
        largest=numbers[i];
       }
    }
    return largest;
    }
    public static void main(String[] args) {
        int numbers[]={5,84,55,98,65};
        System.out.println("largest numbers of array is " +getLargest(numbers));
    }
}