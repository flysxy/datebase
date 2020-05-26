
// 编写一个函数来查找字符串数组中的最长公共前缀。

// 如果不存在公共前缀，返回空字符串 ""。

// 示例 1:

// 输入: ["flower","flow","flight"]
// 输出: "fl"
// to be double confim
// public class Main_14 {
//     public static void main(String[] args) {
//         String s = "hello";
//         System.out.println(s.substring(0, 1));
//     }
//      public String longCommonPrefix(String[] s) {
//         if (s.length == 0) return "";
//         String ans = s[0];
//         for (int i = 1; i < s.length; i++) {
//             int j = 0;
//             for (;j < ans.length() && j < s[i].length(); j++) {
//                 if (ans.charAt(j)!= s[i].charAt(j)) {
//                     break;
//                 }
//             }
//             ans = ans.substring(0, j);
//             if (ans.equals("")) {
//                 return ans;
//             }
//         }
//         return ans;
//     }

// }

// // note: 这个题找的是最长公共前缀， 前缀， 前缀. for more details, please checking demo function
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String s = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (;j < s.length() && j < strs[i].length(); j++) {
                if (s.charAt(j) != strs[i].charAt(j))
                    break;
            }
            s = s.substring(0, j);
            if (s.equals(""))
                return s;
        }
        return s;
    }
}
