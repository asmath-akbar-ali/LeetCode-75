class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int num) {
        int max=Integer.MIN_VALUE;
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
            arr[i]+=num;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}
