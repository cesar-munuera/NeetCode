import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * 
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * 
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     */

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (mapa.containsKey(diff)){
                return new int[] {mapa.get(diff), i};
            }

            mapa.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] values = {2,7,11,15};
        int[] result = twoSum(values, 9);

        System.out.println(Arrays.toString(result));
    }
    
}
