class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i != j){
                    if(arr[i] == arr[j] * 2 || arr[i] * 2 == arr[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}