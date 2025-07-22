class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int currentSum = 0;
        for(int i=0;i<nums.length;i++){
            currentSum += nums[i];
        }
        int totalSum = (n*(n+1))/2 ;
        return totalSum - currentSum;
    }
}