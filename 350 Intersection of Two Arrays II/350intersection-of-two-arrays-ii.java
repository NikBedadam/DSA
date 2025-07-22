class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] newArray = new int[Math.min(nums1.length,nums2.length)];
        boolean[] visited = new boolean[nums2.length];
        int index = 0 ; 
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j] && !visited[j]){
                    newArray[index++] = nums1[i];
                    visited[j] = true;
                    break;
                }
            }
        }
        int[] result = new int[index];
        for(int i=0;i<index;i++){
            result[i] = newArray[i];
        }
        return result;
    }
}