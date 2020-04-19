
// 编写一个函数来查找字符串数组中的最长公共前缀。

// 如果不存在公共前缀，返回空字符串 ""。

// 示例 1:

// 输入: ["flower","flow","flight"]
// 输出: "fl"
// to be double confim
public class Main_14 {
     public String longCommonPrefix(String[] s) {
        if (s.length == 0) return "";
        String ans = s[0];
        for (int i = 1; i < s.length; i++) {
            int j = 0;
            for (;j < ans.length() && j < s[i].length(); j++) {
                if (ans.charAt(j)!= s[i].charAt(j)) {
                    break;
                }
            }
            ans = ans.substring(0, j);
            if (ans.equals("")) {
                return ans;
            }
        }
        return ans;
    }

}
