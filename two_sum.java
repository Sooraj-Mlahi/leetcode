import java.util.*;

/**
 * TwoSum class finds two numbers in an array that add up to a target value.
 */
public class TwoSum {

    /**
     * Finds two numbers in the given array that add up to the target value.
     * Uses a HashMap for efficient lookup.
     *
     * @param nums   The input array of integers.
     * @param target The target sum.
     * @return An array containing the indices of the two numbers.
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int[] result = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                result[0] = numMap.get(complement);
                result[1] = i;
                break;
            }
            numMap.put(nums[i], i);
        }
        
        return result;
    }

    /**
     * Main method to take user input and demonstrate the TwoSum functionality.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many numbers:");
        int n = in.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        System.out.println("Enter target number:");
        int target = in.nextInt();
        int[] result = obj.twoSum(nums, target);

        System.out.println("Numbers are [" + result[0] + ", " + result[1] + "]");
    }
}
