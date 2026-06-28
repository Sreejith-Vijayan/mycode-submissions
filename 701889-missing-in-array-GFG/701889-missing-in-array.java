class Solution {
    int missingNum(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr) {
            set.add(num);
        }
        int ans = -1;
        for(int i = 1 ; i<=arr.length + 1 ; i++) {
            if( !set.contains(i)) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna