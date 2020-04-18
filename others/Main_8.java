
// 字符串转换整数
public class Main_8 {
    public int myAtoi (String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int index = 0;
        while (index < n && chars[index] == ' ') {
            index++;
        }
        if (index == n) return 0;
        boolean negative = false-
        if (chars[index] == '+') {
            index++;
        } else if (chars[index] == '-') {
            index++;
            negtive = true
        } else (Character.isDigit(chars[index]) {
            return 0;
        }
        int ans = 0;
        while (index < n && Character.isDigit(chars[idx])) {
            int pos = chars[index] -'0';
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pos > 7))
                return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            ans = ans *10 +pos;
            index++;
        }
        return negative ? -ans: ans;

    }

}
