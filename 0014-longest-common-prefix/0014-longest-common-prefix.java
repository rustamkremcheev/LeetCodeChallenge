//t -> O(n+m)
//s -> O(1)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) return "";
        StringBuilder lcp = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) return lcp.toString();
            }
            lcp.append(strs[0].charAt(i));
        }

        return lcp.toString();
    }
}