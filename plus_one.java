class Solution {
    public int[] plusOne(int[] digits) {
        int[] res = new int[digits.length];
        int lastDigit = digits[digits.length - 1];
        if(lastDigit < 9) {
            res = digits;
            res[digits.length - 1] = lastDigit + 1;
        } else {
            boolean isNine = false;
            for (int i = digits.length - 1; i >= 0; i--) {
                if(!isNine && digits[i] == 9) {
                    res[i] = 0;
                } else {
                    if(isNine == false) {
                        isNine = true;
                        res[i] = digits[i] + 1;
                    } else {
                        res[i] = digits[i];
                    }
                }
            }
            if(isNine == false) {
                res = new int[digits.length + 1];
                Arrays.fill(res, 0);
                res[0] = 1;
            }
        }
        return res;
    }
}
