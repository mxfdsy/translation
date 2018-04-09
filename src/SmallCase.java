import java.util.ArrayList;

/**
 * 输入三位数逆序输出
 * Created by 没想法的岁月 on 2018/4/9.
 */
public class SmallCase {
    public static void main(String[] args) {
        input("101010");
    }

    private static void input(String  num) {
        char[] chars = num.toCharArray();
        int max = chars.length-1;
        for (int i = chars.length-1; i >=0; i--) {
            if (chars[i]!=48) {
                System.out.print(chars[i]);
            }
        }
    }
}
