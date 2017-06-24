package apache.commons.lang.string;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Created by Administrator on 2017/6/24 0024.
 */
public class StringUtilsCapitalizeTest {

    @Test
    public void capitalizeTest(){
        //大小写转化（首字母）
        // StringUtils.capitalize("cat") = "Cat"
        System.out.println(StringUtils.capitalize("cat"));
        //小写转化大写（首字母）
        // StringUtils.uncapitalize("Cat") = "cat"
        System.out.println(StringUtils.uncapitalize("Cat"));
    }

    @Test
    public void swapCase(){
        //整个字符串大小写转化
        //StringUtils.swapCase("The dog has a BONE") = "tHE DOG HAS A bone"
        System.out.println(StringUtils.swapCase("This is my book"));
    }

    @Test
    public void stringCase(){
        //全部转化成小写
        // StringUtils.lowerCase("aBc") = "abc"
        System.out.println(StringUtils.lowerCase("This is My Book"));

        //全部转化为大写
        //StringUtils.upperCase("aBc") = "ABC"
        System.out.println(StringUtils.upperCase("This is my Book"));

    }

    @Test
    public void isUpLowerCase(){
        /*StringUtils.isAllUpperCase(null)   = false
        StringUtils.isAllUpperCase("")     = false
        StringUtils.isAllUpperCase("  ")   = false
        StringUtils.isAllUpperCase("ABC")  = true
        StringUtils.isAllUpperCase("aBC")  = false*/
        //字符串中是否全部大写
        System.out.println(StringUtils.isAllUpperCase("AC"));
        //字符串中是否全部是小写
        System.out.println(StringUtils.isAllLowerCase("AC"));

        /*StringUtils.isMixedCase(null)    = false
        StringUtils.isMixedCase("")      = false
        StringUtils.isMixedCase("ABC")   = false
        StringUtils.isMixedCase("abc")   = false
        StringUtils.isMixedCase("aBc")   = true
        StringUtils.isMixedCase("A c")   = true
        StringUtils.isMixedCase("A1c")   = true*/
        //字符串中是否是大小写混合
        System.out.println(StringUtils.isMixedCase("Ac"));

    }
}
