// Question 1:Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct....

public class Question{
    public static boolean question1(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,5,6,4,7,1};
        System.out.println(question1(nums));
    }
}