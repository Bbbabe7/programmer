class Solution {
    public String solution(String s) {
        
        String[] str_array = s.split(" ");
        int len = str_array.length;
        
        int[] int_array = new int[len];
        
        for (int i=0; i<len; i++) {
            int_array[i] = Integer.parseInt(str_array[i]);
        }
        
        int maxNum = int_array[0];
        int minNum = int_array[0];
        
        for (int i=1; i<len; i++) {
            if (int_array[i] > maxNum) {
                maxNum = int_array[i];
            }
            if (int_array[i] < minNum) {
                minNum = int_array[i];
            }
        }
        
        String answer = minNum + " " + maxNum;
        return answer;
    }
}