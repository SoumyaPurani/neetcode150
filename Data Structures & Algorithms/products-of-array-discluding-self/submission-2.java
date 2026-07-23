public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        Arrays.fill(res,1);

        int leftTracker = 1;
        int rightTracker = 1;

        for (int i = 0; i < n; i++){
            res[i] *= leftTracker;
            leftTracker *= nums[i];

            int rightIndex = n - 1 - i;
            res[rightIndex] *= rightTracker;
            rightTracker *= nums[rightIndex];
        }
        return res;
    }
}