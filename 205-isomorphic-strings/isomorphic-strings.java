class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        HashMap<Character,Character> map1 = new HashMap<>();
        for(int i=0;i<=s.length()-1;i++){
            char char1 = s.charAt(i);
            char char2 = t.charAt(i);
            if(map.containsKey(char1) && !map.get(char1).equals(char2)){
                return false;
            }
            if(map1.containsKey(char2) && !map1.get(char2).equals(char1)){
                return false;
            }
            map.put(char1,char2);
            map1.put(char2,char1);
        }
        return true;
    }
}