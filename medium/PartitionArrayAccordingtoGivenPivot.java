class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int m=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                ans[m]=nums[i];
                m++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                ans[m]=nums[i];
                m++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                ans[m]=nums[i];
                m++;
            }
        }
        return ans;
        //first approach was this 
        //issues are it creates multiple arrays and interations to convert 
        //greater time and space complexity
        // int count=0;
        // ArrayList<Integer> smaller = new ArrayList<>();
        // ArrayList<Integer> larger = new ArrayList<>();

        // for(int ele:nums){
        //     if(ele<pivot){
        //         smaller.add(ele);
        //     }
        //     else if(ele>pivot){
        //         larger.add(ele);
        //     }
        //     else{
        //         count++;
        //     }
        // }
        // ArrayList<Integer> result = new ArrayList<>();
        // result.addAll(smaller);
        // for (int i = 0; i < count; i++) {
        //     result.add(pivot);
        // }
        // result.addAll(larger);

        // int[] resultArray = result.stream().mapToInt(i -> i).toArray();
        // return resultArray;
    }
}