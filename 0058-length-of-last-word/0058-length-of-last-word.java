//t -> O(n)
//s -> O(1)

class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() < 1) return 0; 
        String[] arr = s.split(" ");
        int count = arr.length;
        int maxCount = arr[count - 1].length();   
        return maxCount;
    }
}