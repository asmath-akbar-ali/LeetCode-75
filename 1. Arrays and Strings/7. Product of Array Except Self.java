// Example 1:
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

// Example 2:
// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count=0,res=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                count++;
        }
        if(count==0){
            for(int i=0;i<nums.length;i++)
                res*=nums[i];
            for(int i=0;i<nums.length;i++)
                nums[i]=res/nums[i];
        }
        else if(count==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0)
                    res*=nums[i];
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0)
                    nums[i]=0;
                else
                    nums[i]=res;
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                nums[i]=0;
            }
        }
        return nums;
    }
}
