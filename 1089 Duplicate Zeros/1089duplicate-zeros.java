class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int possibleDups = 0;
        
        for(int i=0;i+possibleDups < n;i++){
            if(arr[i] == 0){
                if(i + possibleDups == n-1){
                    arr[n-1] = 0;
                    n -= 1;
                    break;
                }
                possibleDups++;
            }
        }
        int last = n - 1 - possibleDups;
        for(int i=last;i>=0;i--){
            if(arr[i] == 0){
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else{
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}