class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int p = 0;
        int q = s.length() - 1;
        while (p < q) {
            if ((chars[p] >= '0' && chars[p] <= '9') || (chars[p] >= 'a' && chars[p] <= 'z')){
                if ((chars[q] >= '0' && chars[q] <= '9') || (chars[q] >= 'a' && chars[q] <= 'z')) {
                    if (chars[p] != chars[q]) return false;
                    else {
                        p++;
                        q--;
                    }

                } else {
                    q--;
                }

            }
            else {
                p++;
            }
        }
        return true;

    }
}

