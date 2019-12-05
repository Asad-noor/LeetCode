class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int longest = 0;
        int pos = 0;
        for(int i = 0; i < s.length(); i++) {
            if(list.contains(s.charAt(i))) {
                pos = list.indexOf(s.charAt(i));
                if(list.size() > longest) {
                    longest = list.size();
                }
                list.subList(0, pos + 1).clear();
                list.add(s.charAt(i));
            } else {
                list.add(s.charAt(i));
            }
        }
        if(list.size() > longest) {
            longest = list.size();
        }
        return longest;
    }
}
