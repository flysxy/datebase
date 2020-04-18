import org.graalvm.compiler.nodes.calc.RightShiftNode;

// 输入：["h","e","l","l","o"]
// 输出：["o","l","l","e","h"]
public class Main_344 {
    public void reverseString(char[] s) {
        if (s == null || s.length < 2) return;
        int left = -1;
        int right = s.length;
        while (++left < --right) {
            char c = s[left];
            s[left] = s[right];
            s[ringt] = c;
        }
        return;
    }

}
