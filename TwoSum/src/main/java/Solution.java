import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int [] twoSum(int [] nums, int target) {
        // Map to store the numbers we have already seen. <integer, integer> -> key:value -> num:index
        Map<Integer, Integer> map = new HashMap<>();

        //
        for(int i = 0; i < nums.length; i++) {
            // Establish the complement we are looking for (target - currentNum)
            int complement = target - nums[i];

            // If we have seen the complement and its in our map -> return the current index (i) and the index in the map (the value)
            if(map.containsKey(complement)) {
                return new int [] {i, map.get(complement)};
            }
            // If the complement does not exist, we add the current number to the map for later (number, index)
            map.put(nums[i], i);
        }

        // Return an empty array if there is no complement
        return new int [] {};
    }
}
