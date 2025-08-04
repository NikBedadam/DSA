class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            int x = nums[i];
            int y = nums[i+1];
            arr[i] = y;
            arr[i+1] = x;
        }
        return arr;
    }
}