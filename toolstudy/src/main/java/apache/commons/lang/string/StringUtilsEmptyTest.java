package apache.commons.lang.string;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Created by Administrator on 2017/6/24 0024.
 */
public class StringUtilsEmptyTest {

    @Test
    public void empty(){

        //判断是否为空，空的话为那个字符串
        //CharSequence is whitespace, empty ("") or null, the value of defaultStr.
        /*StringUtils.defaultIfBlank(null, "NULL")  = "NULL"
        StringUtils.defaultIfBlank("", "NULL")    = "NULL"
        StringUtils.defaultIfBlank(" ", "NULL")   = "NULL"
        StringUtils.defaultIfBlank("bat", "NULL") = "bat"
        StringUtils.defaultIfBlank("", null)      = null*/

        System.out.println(StringUtils.defaultIfBlank("bat", "Theacher"));

        //CharSequence is empty or null, the value of defaultSt
        /*StringUtils.defaultIfEmpty(null, "NULL")  = "NULL"
        StringUtils.defaultIfEmpty("", "NULL")    = "NULL"
        StringUtils.defaultIfEmpty(" ", "NULL")   = " "
        StringUtils.defaultIfEmpty("bat", "NULL") = "bat"
        StringUtils.defaultIfEmpty("", null)      = null*/
        System.out.println(StringUtils.defaultIfEmpty("bat","null"));

        /*StringUtils.defaultString(null, "NULL")  = "NULL"
        StringUtils.defaultString("", "NULL")    = ""
        StringUtils.defaultString("bat", "NULL") = "bat"*/

        //去除字符串中的空格（前后空格）
        // StringUtils.strip(" ab c ") = "ab c"



    }
}
