// public class Max_Subarray{
// public static void maxSubarraySum(int numbers[]){
//    int currSum=0;
//    int maxSum=Integer.MIN_VALUE;
//     for(int i=0;i<numbers.length;i++){
//         int start=i;
//         for(int j=i;j<numbers.length;j++){
//             int end=j;
//             currSum=0;
//             for(int k=start;k<=end;k++){
//                    currSum+=numbers[k];
                    
//             }
//             // System.out.println(currSum);
//             if(maxSum<currSum){
//                 maxSum=currSum;
//             }
            
//         }
       
//     }
//     System.out.println("Max sum = "+maxSum);
// }


//     public static void main(String[] args) {
//         int numbers[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
//         maxSubarraySum(numbers);
//     }
// }



// 2nd option (using prefix process)


// public class Max_Subarray{
// public static void maxSubarraySum(int numbers[]){
//    int currSum=0;
//    int maxSum=Integer.MIN_VALUE;
//    int prefix[]=new int[numbers.length];
//    prefix[0]=numbers[0];

//    calculate prefix array

// for(int i=1;i<prefix.length;i++){
//     prefix[i]=prefix[i-1]+numbers[i];
// }

//     for(int i=0;i<numbers.length;i++){
//         int start=i;
//         for(int j=i;j<numbers.length;j++){
//             int end=j;
//             currSum=0;
//             currSum=start==0 ? prefix[end]:prefix[end]-prefix[start-1];
            
//             if(maxSum<currSum){
//                 maxSum=currSum;
//             }
            
//         }
       
//     }
//     System.out.println("Max sum = "+maxSum);
// }


//     public static void main(String[] args) {
//         int numbers[]={-2,1,-3,4,-1,2,1,-5,4};
//         maxSubarraySum(numbers);
//     }
// }

// 3rd option  (leetcode problem)

// public class Max_Subarray{
//     public static int kadanes(int numbers[]){
//         int ms=numbers[0];
//         int cs=0;

//     for(int i=0;i<numbers.length;i++){
//         cs=cs+numbers[i];
//         if(cs>ms){
//             ms=cs;
//         }
//         if(cs<0){
//             cs=0;
//         }
//     // ms=Math.max(cs,ms);
//     }
//     return ms;
//     }
//     public static void main(String[] args) {
//         int numbers[]={-2,-3,4,-1,-2,1,5,-3};
//             System.out.println("our max subarray sum is: "+kadanes(numbers));

        
//     }
// }





// public class Max_Subarray{
//     public static int kadanes(int numbers[]){
//         int ms=Integer.MIN_VALUE;
//         int cs=0;

//     for(int i=0;i<numbers.length;i++){
//         cs=cs+numbers[i];
//         if(cs<0){
//             cs=0;
//         }
//     ms=Math.max(cs,ms);
//     }
//     return ms;
//     }
//     public static void main(String[] args) {
//         int numbers[]={-2,-3,4,-1,-2,1,5,-3};
//             System.out.println("our max subarray sum is: "+kadanes(numbers));

        
//     }
// }
