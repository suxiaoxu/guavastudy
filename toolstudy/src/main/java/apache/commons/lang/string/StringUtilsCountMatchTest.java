package apache.commons.lang.string;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Created by Administrator on 2017/6/24 0024.
 */
public class StringUtilsCountMatchTest {

    @Test
    public void countMatch(){
        //元素或者字符串 ，在原始字符串中出现的次数
       /* StringUtils.countMatches(null, *)       = 0
        StringUtils.countMatches("", *)         = 0
        StringUtils.countMatches("abba", null)  = 0
        StringUtils.countMatches("abba", "")    = 0
        StringUtils.countMatches("abba", "a")   = 2
        StringUtils.countMatches("abba", "ab")  = 1
        StringUtils.countMatches("abba", "xxx") = 0*/
        System.out.println(StringUtils.countMatches("asdddd","ddd"));
    }
}
