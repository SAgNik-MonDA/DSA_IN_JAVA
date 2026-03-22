// import java.util.Arrays;
// public class Inbuilt_Sort{
//     public static void main(String[] args) {
//         int array[]={5,4,1,3,2};
//         Arrays.sort(array);
//         for(int i=0;i<=array.length-1;i++){
//             System.out.print(array[i]+" ");
//         }
//     }
// }




// 2nd option

// import java.util.Arrays;
// public class Inbuilt_Sort{
//     public static void main(String[] args) {
//         int array[]={5,4,1,3,2};
//         Arrays.sort(array,0,3);
//         for(int i=0;i<=array.length-1;i++){
//             System.out.print(array[i]+" ");
//         }
//     }
// }


// Desending

// import java.util.Arrays;
// import java.util.Collections;
// public class Inbuilt_Sort{
//     public static void main(String[] args) {
//         Integer array[]={5,4,1,3,2};
//         Arrays.sort(array,Collections.reverseOrder());
//         for(int i=0;i<=array.length-1;i++){
//             System.out.print(array[i]+" ");
//         }
//     }
// }



// 2nd Option


import java.util.Arrays;
import java.util.Collections;
public class Inbuilt_Sort{
    public static void main(String[] args) {
        Integer array[]={5,4,1,3,2};
        Arrays.sort(array,0,5,Collections.reverseOrder());
        for(int i=0;i<=array.length-1;i++){
            System.out.print(array[i]+" ");
        }
    }
}