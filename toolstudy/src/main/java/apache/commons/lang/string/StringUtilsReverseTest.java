package apache.commons.lang.string;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Created by Administrator on 2017/6/25 0025.
 */
public class StringUtilsReverseTest {

    @Test
    public void reverseTest(){
        //字符串反转
        //public static String reverse(String str)
        // StringUtils.reverse("bat") = "tab"

        //字符串反转，更具分割符
        //public static String reverseDelimited(String str,char separatorChar)
        // StringUtils.reverseDelimited("ab.bc.cd", ".") = "cd.bc.ab"
        System.out.println(StringUtils.reverseDelimited("ab.bc.cd", '.'));

        //字符串移位
        //public static String rotate(String str,int shift)
        // StringUtils.rotate("abcdefg", 9)   = "fgabcde"


    }
}
