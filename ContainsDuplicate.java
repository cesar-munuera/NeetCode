
import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {

    /* Given an integer array nums, return true if any value appears at least twice in the array, 
     * and return false if every element is distinct.
     * 
     * Input: nums = [1,2,3,1]
     * Output: true
     * 
     * Input: nums = [1,2,3,4]
     * Output: false
     */

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set_numbers = new HashSet<>();

        for(int num : nums){

            // If .add() operation doesnt  complete, means it already exists
            if(!set_numbers.add(num)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums_array = {1, 2, 3, 4, 4};
        System.out.println(containsDuplicate(nums_array));
    }
}