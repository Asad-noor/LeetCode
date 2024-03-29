class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) return false;
                char ch2 = stack.pop();
                if((ch2 == '(' && ch == ')') || (ch2 == '{' && ch == '}') || (ch2 == '[' && ch == ']')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if(!stack.isEmpty()) return false;
        //System.out.println(stack);
        return true;
    }
}
