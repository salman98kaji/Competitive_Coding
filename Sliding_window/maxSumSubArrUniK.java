package Sliding_window;

import java.util.HashSet;

public class maxSumSubArrUniK {
    public long maximumSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length < k || nums.length == 0) {
            return 0;
        }
        int maxSum = 0;
        int currentWindowSum = 0;
        int n = nums.length;
        HashSet<Integer> windowSet = new HashSet<>();
        int left = 0;
        for (int right = 0; right < n; right++) {
            currentWindowSum += nums[right];

            while (windowSet.contains(nums[right])) {
                windowSet.remove(nums[left]);
                currentWindowSum -= nums[left];
                left++;
            }
            windowSet.add(nums[right]);

            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, currentWindowSum);
                currentWindowSum -= nums[left];
                left++;
            }
        }
        return maxSum;
    }
}
