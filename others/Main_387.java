
// 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

// 案例:

// s = "leetcode"
// 返回 0.

// s = "loveleetcode",
// 返回 2.
public class Main_387 {
    public int firstUniquChar(String s){
        int[] letter = new int[26];
        for(char c: s.toCharArray()) {
            letter[c-'a']++;
        }
        for (int i = 0; i <s.length(); i++) {
            if (letter[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }

}
