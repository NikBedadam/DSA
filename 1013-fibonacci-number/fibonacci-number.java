class Solution {
    public int fib(int n) {
        int first = 0;
        int second = 1;
        int third = 0;
        if(n==1)return 1;
        if(n==2)return 1;
        for(int i=1;i<n;i++){
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }
}