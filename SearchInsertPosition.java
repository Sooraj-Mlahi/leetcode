/*
 * 35. Search Insert Position
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 */

import java.util.Scanner;

public class SearchInsertPosition {
    //This is the important function. 
     public static int searchInsert(int[] nums, int target) {
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target) return i;
                else if (nums[i]>target) return i;
            }
            return nums.length;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of data set: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of data set: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the targeted value: ");
        int target=sc.nextInt();
        System.out.print("The inserted position is : ");
        System.out.println(searchInsert(arr , target));
    }
}
/*
 * Sample input output :
 * Enter the size of data set: 
 * 4
 * Enter the elements of data set:
 * 1 3 5 6
 * Enter the targeted value:
 * 2
 * The inserted position is : 1
 */
