// Example 1:
// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
  
// Example 2:
// Input: nums = [5], k = 1
// Output: 5.00000

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max_avg=0,sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max_avg=sum/k;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            max_avg=Math.max(max_avg,sum/k);
        }
        return max_avg;
    }
}
