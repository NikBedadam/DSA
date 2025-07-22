class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] newArray = new int[Math.min(nums1.length , nums2.length)];
        int index = 0;
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0 ; j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    boolean alreadyExists = false;
                    for(int k = 0 ;k<index;k++){
                        if(newArray[k] == nums1[i]){
                            alreadyExists = true;
                            break;
                        }
                    }
                    if(!alreadyExists){
                        newArray[index] = nums1[i];
                        index++;
                    }
                    break;
                }
            }
        }
        int[] result = new int[index];
        for(int i = 0 ; i < index;i++){
            result[i] = newArray[i];
        }
        return result;
    }
}