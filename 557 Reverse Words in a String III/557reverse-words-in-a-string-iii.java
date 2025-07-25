class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i=0;i<words.length;i++){
            StringBuilder reversed = new StringBuilder(words[i]);
            reversed.reverse();
            result.append(reversed);
            if(i<words.length - 1){
                result.append(" ");
            }
        }
        return result.toString();
    }
}