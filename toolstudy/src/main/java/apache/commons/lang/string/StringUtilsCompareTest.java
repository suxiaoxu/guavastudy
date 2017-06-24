package apache.commons.lang.string;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Created by Administrator on 2017/6/24 0024.
 */
public class StringUtilsCompareTest {

    @Test
    public void compareTest(){

        //字符串大小比较
        /*StringUtils.compare(null, null)   = 0
        StringUtils.compare(null , "a")   < 0
        StringUtils.compare("a", null)    > 0
        StringUtils.compare("abc", "abc") = 0
        StringUtils.compare("a", "b")     < 0
        StringUtils.compare("b", "a")     > 0
        StringUtils.compare("a", "B")     > 0
        StringUtils.compare("ab", "abc")  < 0*/
        System.out.println(StringUtils.compare("abd","defs"));

        /*StringUtils.compareIgnoreCase(null, null)   = 0
        StringUtils.compareIgnoreCase(null , "a")   < 0
        StringUtils.compareIgnoreCase("a", null)    > 0
        StringUtils.compareIgnoreCase("abc", "abc") = 0
        StringUtils.compareIgnoreCase("abc", "ABC") = 0
        StringUtils.compareIgnoreCase("a", "b")     < 0
        StringUtils.compareIgnoreCase("b", "a")     > 0
        StringUtils.compareIgnoreCase("a", "B")     < 0
        StringUtils.compareIgnoreCase("A", "b")     < 0
        StringUtils.compareIgnoreCase("ab", "ABC")  < 0*/
        System.out.println(StringUtils.compareIgnoreCase("abc","Abc"));


        /*StringUtils.equalsAny(null, (CharSequence[]) null) = false
        StringUtils.equalsAny(null, null, null)    = true
        StringUtils.equalsAny(null, "abc", "def")  = false
        StringUtils.equalsAny("abc", null, "def")  = false
        StringUtils.equalsAny("abc", "abc", "def") = true
        StringUtils.equalsAny("abc", "ABC", "DEF") = false*/
        System.out.println(StringUtils.equalsAny("abc","Abc"));

        //忽略大小写
        System.out.println(StringUtils.equalsAnyIgnoreCase("abc","Abc"));


    }
}
