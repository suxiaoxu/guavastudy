package apache.commons.lang.string;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Created by Administrator on 2017/6/24 0024.
 */
public class StringUtilsChompTest {

    @Test
    public void chomp(){
        //去掉行尾部的换行  "\n", "\r", or "\r\n".
        // StringUtils.chomp("abc\r\n\r\n") = "abc\r\n"
        //  StringUtils.chomp("abc\n\r")     = "abc\n"
        System.out.println(StringUtils.chomp("asdfb\n"));

        //去掉最后一个字符
        // StringUtils.chop("abc\nabc")    = "abc\nab"
        System.out.println(StringUtils.chop("adb"));



    }
}
