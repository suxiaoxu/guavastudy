package apache.commons.lang.string;

import org.junit.Test;

/**
 * Created by Administrator on 2017/6/25 0025.
 */
public class StringUtilsReplaceTest {

    @Test
    public void replaceTest(){
        //以一个字符串替代另外一个字符串
        //public static String replace(String text, String searchString, String replacement)
        // StringUtils.replace("aba", "a", "z")   = "zbz"

        //一个字符串代替另外一个，代替第几个
        //public static String replace(String text,String searchString,String replacement,int max)
        // StringUtils.replace("abaa", "a", "z", 2)   = "zbza"

        //一个字符串数据，代替另外一个字符串数组
        //public static String replaceEach(String text,String[] searchList,String[] replacementList)
        //  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"})  = "dcte"

        //public static String replaceFirst(String text, String regex, String replacement)
        /*StringUtils.replaceFirst("abc", "", "ZZ")  = "ZZabc"
        StringUtils.replaceFirst("<__>\n<__>", "<.*>", "z")      = "z\n<__>"
        StringUtils.replaceFirst("<__>\n<__>", "(?s)<.*>", "z")  = "z"
        StringUtils.replaceFirst("ABCabc123", "[a-z]", "_")          = "ABC_bc123"
        StringUtils.replaceFirst("ABCabc123abc", "[^A-Z0-9]+", "_")  = "ABC_123abc"
        StringUtils.replaceFirst("ABCabc123abc", "[^A-Z0-9]+", "")   = "ABC123abc"*/


    }
}
