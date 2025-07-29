class Solution {
    public boolean canAliceWin(int[] nums) {
        int oneSum = 0;
        int twoSum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 10){
                oneSum += nums[i];
            } else{
                twoSum += nums[i];
            }
        }
        if(oneSum == twoSum){
            return false;
        } else{
            return true;
        }
    }
}