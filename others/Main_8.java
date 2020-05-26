// 字符串转换整数
class Solution {
    public int myAtoi(String str) {
        char[] chars = str.toCharArray();
        int  n = chars.length;
        int index = 0;
        while (index < n && chars[index] == ' ') {
            index++;
        }
        if (index == n) return 0;
        boolean negtive = false;
        if (chars[index] == '-') {
            negtive = true;
            index++;
        } else if (chars[index] == '+') {
            index++;
        } else if (!Character.isDigit(chars[index])) {
            return 0;
        }
        int ans = 0;
        while (index < n && Character.isDigit(chars[index])) {
            int pos = chars[index] -'0';
            if (ans > (Integer.MAX_VALUE - pos) / 10)
                return negtive? Integer.MIN_VALUE: Integer.MAX_VALUE;
            ans = ans*10 + pos;
            index++;
        }
        return negtive? -ans: ans;
    }
}