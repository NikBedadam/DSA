class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newArray = new int[m+n];
        for(int i = 0;i<m;i++){
            newArray[i] = nums1[i];
        }
        for(int j = 0;j<n;j++){
            newArray[m+j] = nums2[j];
        }
        Arrays.sort(newArray);

        for(int i=0;i<m+n;i++){
            nums1[i] = newArray[i];
        }
    }
}