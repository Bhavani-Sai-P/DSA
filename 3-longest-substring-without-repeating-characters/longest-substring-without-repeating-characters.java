class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int count = 0;
        int left = 0;
        int maxCount = 0;
        Set<Character> set = new HashSet<>();
        for(int right=0; right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
                count--;
            }
            set.add(s.charAt(right));
            count++;
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}