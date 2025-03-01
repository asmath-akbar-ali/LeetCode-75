// Example 1:
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

// Example 2:
// Input: height = [1,1]
// Output: 1

class Solution {
    public int maxArea(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int max=0;
        do{
            int min=Math.min(arr[left],arr[right]);
            int area=min*(right-left);
            if(area>max)
                max=area;
            if(Math.min(arr[left],arr[right])!=arr[left])
                right--;
            else
                left++;
        }while(left<right);
        
        return max;
    }
}
