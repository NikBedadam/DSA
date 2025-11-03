class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> newList = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int min = Math.abs(arr[i]-arr[i+1]);
            if(min < minDiff){
                minDiff = min;
            }
        }
        for(int i=0;i<arr.length-1;i++) {
            if(Math.abs(arr[i]-arr[i+1]) == minDiff){
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                newList.add(pair);
            }
        }
        return newList;
    }
}