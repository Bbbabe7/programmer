class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n % x == 1 이 되는 최소 x
        //     1 -> 0
        //     2 -> ... ?
        
        for (int x=2; x<n; x++) {
            if (n%x == 1) {
                return x;
            }
        }
        
        return answer;
    }
}