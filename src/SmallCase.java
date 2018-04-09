import java.util.ArrayList;
import java.util.Calendar;

/**
 * 输入三位数逆序输出,若逆序后的为0010100 则输出结果为10100
 * Created by 没想法的岁月 on 2018/4/9.
 * @author 没想法的岁月
 *
 */
public class SmallCase {
    public static void main(String[] args) {
        input("1010000","0");
    }

    /**
     *
     * @param str 值用户输入的要倒序的数字信息
     * @param num 根据输入的字符为依据来判断数据倒序后，然这数字显示在第一位
     */
    private static void input(String  str,String num) {

        char[] charsNum = num.toCharArray();
        char c = charsNum[0];

        char[] chars = str.toCharArray();
        int size =chars.length-1;
        for (int i = size; i >=0; i--) {
            if ( chars[size]!= c) {
                System.out.print(chars[i]);
            }
            else {
                size--;
            }
        }
    }
}
