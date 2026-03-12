class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        char[] jwls = jewels.toCharArray();
        char[] stns = stones.toCharArray();

        for(int i=0;i<jwls.length;i++){
            set.add(jwls[i]);
        }
        int count = 0;
        for(int i=0;i<stns.length;i++){
            if(set.contains(stns[i])){
                count++;
            }
        }
        return count;
    }
}