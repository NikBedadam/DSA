class Solution {
    public boolean isPalindrome(String s) {
        String original = s.toLowerCase().replaceAll("[^a-z0-9]","");
        String reversed = reverse(original);
        if(!reversed.equals(original)){
            return false;
        }
        return true;
    }
    public String reverse(String str){
        char[] strArr = str.toCharArray();
        int left = 0;
        int right = strArr.length-1;
        while(left<right){
            char temp = strArr[left];
            strArr[left]=strArr[right];
            strArr[right]=temp;
            left++;
            right--;
        }
        return new String(strArr);
    }
}