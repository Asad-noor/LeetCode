class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        if(s.length() > 0 && s.charAt(0) != '0') {
            s = removeZeros(s);
        }
        StringBuilder sb = new StringBuilder(s);
        s = sb.reverse().toString();
        if(s.charAt(s.length() - 1) == '-') {
            s = s.substring(0, s.length() - 1);
            s = "-" + s;
        }
        try { 
            x = Integer.parseInt(s); 
        } catch (NumberFormatException nfe) {  
            nfe.printStackTrace();
            return 0;
        }
        return x;
    }
    
    private String removeZeros(String s) {
        int k = s.length();
        int i = 0;
        for(i  = k - 1; i >= 0; i--) {
            if(s.charAt(i) == '0') {
                continue;
            }
            break;
        }
        s = s.substring(0, i + 1);
        return s;
    }
}
