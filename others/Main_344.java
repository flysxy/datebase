
// 输入：["h","e","l","l","o"]
// 输出：["o","l","l","e","h"]
public Solution {
    public void reveseString(char[] s) {
        if (s == null || s.length < 2) return;
        int p = -1;
        int q = s.length ;
        while (++p < --q) {
            char tmp = s[p];
            s[p] = s[q];
            s[q] = tmp;
        }
        return;
}