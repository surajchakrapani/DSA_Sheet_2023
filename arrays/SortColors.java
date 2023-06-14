package arrays;

import java.util.Arrays;

import static arrays.SortColors.swap;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
    }

    //1st way -> sort using merge sort Time : O(nlogn) and space:O(N)

    //2nd way -> take 3 variables count0,count1,count2
    //           2 loops:In first loop increment the value counts
    //           In 2nd loop assign 0 from 0->count1 , 1 from count2->count3,2 from count3->


    public static void sortColors(int[] nums) {

        int low =0;
        int mid =0;
        int high = nums.length -1;

        while(mid<=high){
            if(nums[mid] ==0){
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
        }

        System.out.println(Arrays.toString(nums));


    }

     public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
     }
}
