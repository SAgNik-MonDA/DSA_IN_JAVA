public class Bubble{
    public static void bubbleSort(int arr[]){
        for (int turns=0;turns<arr.length-1;turns++){
            for(int j=0;j<arr.length-1-turns;j++){
                if(arr[j]<arr[j+1]){
                   int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.err.println("");
    }

    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr);
        PrintArr(arr);

    }
}





// For sorted array time complexity = O(n)

// public class Bubble{
//     public static void bubbleSort(int arr[]){
//         boolean swapped;
//         for(int turns=0;turns<arr.length-1;turns++){
//             swapped=false;
//             for(int j=0;j<arr.length-1-turns;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j+1];
//                     arr[j+1]=arr[j];
//                     arr[j]=temp;
//                     swapped=true;
//                 }
//             }
//             if (!swapped) {
//             break;
//         }
//         }
//     }

//     public static void PrintArray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println("");
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5};
//         bubbleSort(arr);
//         PrintArray(arr);
//     }
// }
 