import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sequence {

    private boolean arrayContains(int [] array, int number){
        for(int i = 0; i < array.length; i++){
            if(array[i] == number){
                return true;
            }
        }
        return false;
    }

    public int findLongestSequence(int [] arr){
        int longestStreak = 0;

        for(int num : arr){
            int currentNum = num;
            int currentStreak = 1;

            while(arrayContains(arr, currentNum + 1)){
                currentNum += 1;
                currentStreak += 1;
            }
            longestStreak = Math.max(longestStreak, currentStreak);
        }
        return longestStreak;
    }

    public int sortedLongestSequence(int [] nums){
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int longestStreak = 1;
        int currentStreak = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                if (nums[i] == nums[i - 1] + 1){
                    currentStreak += 1;
                } else {
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }
        return Math.max(longestStreak, currentStreak);
    }

    public int hashFindLongestSequence(int [] nums){
        // New Hash set for fast lookups O(1)
        Set <Integer> num_set = new HashSet<Integer>();

        // Store all the numbers from the array into the hash set
        for(int num : nums){
            num_set.add(num);
        }

        int longestStreak = 0;

        for(int num : nums) {
            // If the number set does NOT contain the current num - 1 (one less) then we know it's the start of the sequence
            if(!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Now just check for the next number in the sequence
                while(num_set.contains(currentNum + 1)){
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
