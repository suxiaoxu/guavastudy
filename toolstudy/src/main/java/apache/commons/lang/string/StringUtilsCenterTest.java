package apache.commons.lang.string;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Created by Administrator on 2017/6/24 0024.
 */
public class StringUtilsCenterTest {

    @Test
    public void stringCenterTest(){
        //center填充
        // StringUtils.center("ab", 4)   = " ab "
        System.out.println(StringUtils.center("ab",5));
        //center填充指定字符
        //StringUtils.center("a", 4, 'y')    = "yayy"
        System.out.println(StringUtils.center("a",5,"y"));
    }
}
