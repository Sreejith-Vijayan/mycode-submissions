class Solution {
    public int longestConsecutive(int[] nums) {
        //HashSet is the approach
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }

        int longest = 0;
        for(int num : set) {
            if( !set.contains(num - 1)) {       //start of a sequence
                int len =  1;
                while(set.contains(num + len)) {
                    len++;
                }
                longest = Math.max(longest , len);
            }
        }
        return longest;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna