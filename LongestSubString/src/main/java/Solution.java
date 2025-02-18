import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int lengthOfLongestSubString(String s){
        // Map to store already seen characters
        Map <Character, Integer> seenChars = new HashMap<>();

        // Set our pointers for the window
        int left = 0;
        int right = 0;

        // Keep track of the longest substring found
        int maxLength = 0;

        // While our right side of the window is less than the length of the string
        while(right < s.length()) {
            char charAtRight = s.charAt(right);

            // add the char and freq to the hash: (character, frequency)
            // We add 1 because we have now seen the character at least once
            seenChars.put(charAtRight, seenChars.getOrDefault(charAtRight, 0) + 1);

            // While the frequency of the character is greater than 1 (means there are duplicates in our window) so we need to shrink the window
            while(seenChars.get(charAtRight) > 1){
                // Set the left side char
                char charAtLeft = s.charAt(left);

                // Now we need to reduce the frequency back down to one to remove dupes from the window
                seenChars.put(charAtLeft, seenChars.get(charAtLeft) - 1);

                // Shrink the window by moving left 1 step
                left++;
            }

            // calculte the max length of the window (either a previos substring length or the current size of the window)
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }

}
