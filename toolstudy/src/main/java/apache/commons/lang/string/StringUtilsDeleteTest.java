package apache.commons.lang.string;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Created by Administrator on 2017/6/24 0024.
 */
public class StringUtilsDeleteTest {

    @Test
    public void deleteTest(){
        //删除字符串中的空格
        /*StringUtils.deleteWhitespace(null)         = null
        StringUtils.deleteWhitespace("")           = ""
        StringUtils.deleteWhitespace("abc")        = "abc"
        StringUtils.deleteWhitespace("   ab  c  ") = "abc"*/
        System.out.println(StringUtils.deleteWhitespace("asdf asdf as"));

        //删除字符串开头
        /*StringUtils.removeStart("www.domain.com", "www.")   = "domain.com"
        StringUtils.removeStart("domain.com", "www.")       = "domain.com"*/
        System.out.println(StringUtils.removeStart("www.baidu.com","www"));
        //忽略大小写
        //StringUtils.removeStartIgnoreCase("www.domain.com", "WWW.")   = "domain.com"

        //删除后部
        /*tringUtils.removeEnd(null, *)      = null
        StringUtils.removeEnd("", *)        = ""
        StringUtils.removeEnd(*, null)      = *
        StringUtils.removeEnd("www.domain.com", ".com.")  = "www.domain.com"
        StringUtils.removeEnd("www.domain.com", ".com")   = "www.domain"
        StringUtils.removeEnd("www.domain.com", "domain") = "www.domain.com"*/
        System.out.println(StringUtils.removeEnd("www.baidu.com",".com"));

        //单纯删除
        /*StringUtils.remove(null, *)        = null
        StringUtils.remove("", *)          = ""
        StringUtils.remove(*, null)        = *
        StringUtils.remove(*, "")          = *
        StringUtils.remove("queued", "ue") = "qd"
        StringUtils.remove("queued", "zz") = "queued"*/
        System.out.println(StringUtils.remove("bawww.abidu.com","a"));

        //删除所有，主要是运用正则表达式
       /* StringUtils.removeAll(null, *)      = null
        StringUtils.removeAll("any", null)  = "any"
        StringUtils.removeAll("any", "")    = "any"
        StringUtils.removeAll("any", ".*")  = ""
        StringUtils.removeAll("any", ".+")  = ""
        StringUtils.removeAll("abc", ".?")  = ""
        StringUtils.removeAll("A<__>\n<__>B", "<.*>")      = "A\nB"
        StringUtils.removeAll("A<__>\n<__>B", "(?s)<.*>")  = "AB"
        StringUtils.removeAll("ABCabc123abc", "[a-z]")     = "ABC123"*/

       //删除第一个
        //StringUtils.removeFirst(null, *)      = null
        /*StringUtils.removeFirst("any", null)  = "any"
        StringUtils.removeFirst("any", "")    = "any"
        StringUtils.removeFirst("any", ".*")  = ""
        StringUtils.removeFirst("any", ".+")  = ""
        StringUtils.removeFirst("abc", ".?")  = "bc"
        StringUtils.removeFirst("A<__>\n<__>B", "<.*>")      = "A\n<__>B"
        StringUtils.removeFirst("A<__>\n<__>B", "(?s)<.*>")  = "AB"
        StringUtils.removeFirst("ABCabc123", "[a-z]")          = "ABCbc123"
        StringUtils.removeFirst("ABCabc123abc", "[a-z]+")      = "ABC123abc"*/

    }
}
