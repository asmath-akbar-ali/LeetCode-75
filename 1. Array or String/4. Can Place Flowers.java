import java.util.Arrays;
class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        for(int i=0;i<arr.length;i=i+2){
            if(arr[i]==0){
                if(i==arr.length-1 || arr[i]==arr[i+1])
                    n--;
                else
                    i++;
            }
        }
    return n<=0;
    }
}
