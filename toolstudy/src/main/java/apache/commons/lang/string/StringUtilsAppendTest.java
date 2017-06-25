package apache.commons.lang.string;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Created by Administrator on 2017/6/24 0024.
 */
public class StringUtilsAppendTest {

    String test = "TodayIsRightDay";
    @Test
    public void stringAppend(){

        //是否有重复进行验证
        //向后添加
        //StringUtils.appendIfMissing("abc", "xyz") = "abcxyz"
        //StringUtils.appendIfMissing("abcxyz", "xyz") = "abcxyz"
        System.out.println(StringUtils.appendIfMissing(test,"begin"));
        // StringUtils.appendIfMissingIgnoreCase("abc", "xyz") = "abcxyz"
        // 忽略大小写
        System.out.println(StringUtils.appendIfMissingIgnoreCase(test,"begin"));

        //向前添加
        //StringUtils.prependIfMissing("abc", "xyz") = "xyzabc"
        //StringUtils.prependIfMissing("xyzabc", "xyz") = "xyzabc"
        System.out.println(StringUtils.prependIfMissing(test,"begin"));
        //忽略大小写
        System.out.print(StringUtils.prependIfMissingIgnoreCase(test,"begin"));

        //左右添加
        //public static String leftPad(String str,int size)
        /*StringUtils.leftPad("bat", 5)  = "  bat"
        StringUtils.leftPad("bat", 1)  = "bat"*/

        //public static String leftPad(String str,int size, char padChar)
        //StringUtils.leftPad("bat", 5, 'z')  = "zzbat"


    }
}
