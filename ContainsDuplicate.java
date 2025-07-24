
import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set_numbers = new HashSet<>();

        for(int num : nums){
            if(!set_numbers.add(num)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums_array = {1, 2, 3, 4, 4};

        // Checks if an array has duplicated numbers
        System.out.println(containsDuplicate(nums_array));
    }
}