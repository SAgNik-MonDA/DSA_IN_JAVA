public class Insertion_Sort{

public static void Insertion(int arr[]){
    for(int i=1;i<arr.length;i++){
        int curr=arr[i];
        int prev=i-1;
      while(prev>=0 && arr[prev]<curr ){
        arr[prev+1]=arr[prev];
        prev--;
      }
      arr[prev+1]=curr;
    }

}
public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
        System.err.println("");
    }




    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        Insertion(arr);
        printArray(arr);
    }
}