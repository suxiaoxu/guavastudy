package apache.commons.lang.string;

import org.junit.Test;

/**
 * Created by Administrator on 2017/6/24 0024.
 */
public class StringUtilsGetIndexTest {

    @Test
    public void getIndexTest(){
        //获取字符串中的所有数字
        /*StringUtils.getDigits("1123~45") = "12345"
        StringUtils.getDigits("(541) 754-3010") = "5417543010"*/

        //获取字符串首次出现的位置
        /*StringUtils.indexOf("aabaabaa", "a")  = 0
        StringUtils.indexOf("aabaabaa", "b")  = 2
        StringUtils.indexOf("aabaabaa", "ab") = 1*/

        //获取字符串首次出现的位置，起始点
        /*StringUtils.indexOf("aabaabaa", "b", 9)  = -1
        StringUtils.indexOf("aabaabaa", "b", -1) = 2
        StringUtils.indexOf("aabaabaa", "", 2)   = 2*/

        //从后到前
        /*StringUtils.lastIndexOf("aabaabaa", "b", 8)  = 5
        StringUtils.lastIndexOf("aabaabaa", "ab", 8) = 4*/

        //获取指定第几次出现的位置（从前到后）
        //public static int ordinalIndexOf(CharSequence str,CharSequence searchStr,int ordinal)
        /*StringUtils.ordinalIndexOf("aabaabaa", "b", 2)  = 5*/

        //获取指定第几次出现的位置（从后到前）
        /*StringUtils.lastOrdinalIndexOf("aabaabaa", "ab", 1) = 4
        StringUtils.lastOrdinalIndexOf("aabaabaa", "ab", 2) = 1*/

        //最后一个出现的位置
        /*StringUtils.lastIndexOf("aabaabaa", 'a') = 7
        StringUtils.lastIndexOf("aabaabaa", 'b') = 5*/


    }
}
