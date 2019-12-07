class Solution {
    public int romanToInt(String s) {    
        int result = 0;
        int sz = s.length();
        int prev = getValue(s.charAt(0));
        for(int i = 0; i < sz; i++) {
            int cur  = getValue(s.charAt(i));
            if(prev < cur) {
                result -= prev;
                result += cur - prev;
            } else {
                result += cur;
            }
            prev = cur;
        }
        return result;
    }
    
    private int getValue(char digit) {
       switch(digit) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
