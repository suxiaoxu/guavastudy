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

        //后面和前面的作比较(后面不同的地方输出)
       /* StringUtils.difference(null, null) = null
        StringUtils.difference("", "") = ""
        StringUtils.difference("", "abc") = "abc"
        StringUtils.difference("abc", "") = ""
        StringUtils.difference("abc", "abc") = ""
        StringUtils.difference("abc", "ab") = ""
        StringUtils.difference("ab", "abxyz") = "xyz"
        StringUtils.difference("abcde", "abxyz") = "xyz"
        StringUtils.difference("abcde", "xyz") = "xyz"*/
        System.out.println(StringUtils.difference("as dg","as dfff"));

        //字符后面比较
        // StringUtils.endsWith("abcdef", "def") = true
        System.out.println( StringUtils.endsWith("abcdef", "def"));

        //字符串前面比较
        // StringUtils.startsWith("abcdef", "abc") = true
        System.out.println( StringUtils.startsWith("abcdef", "abc") );

        //比较开始的头部是否相等(和后面的数组比较)
        /*StringUtils.startsWithAny("abcxyz", new String[] {""}) = true
        StringUtils.startsWithAny("abcxyz", new String[] {"abc"}) = true
        StringUtils.startsWithAny("abcxyz", new String[] {null, "xyz", "abc"}) = true*/

        //查找两个字符串中相同的元素
        /*StringUtils.getCommonPrefix(new String[] {"ab", "abxyz"}) = "ab"
        StringUtils.getCommonPrefix(new String[] {"abcde", "abxyz"}) = "ab"*/



    }
}
