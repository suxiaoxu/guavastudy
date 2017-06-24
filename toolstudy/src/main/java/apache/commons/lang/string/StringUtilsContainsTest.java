package apache.commons.lang.string;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Created by Administrator on 2017/6/24 0024.
 */
public class StringUtilsContainsTest {

    @Test
    public void containsTest(){
        //是否包含（字符串）
        /*StringUtils.contains(null, *)     = false
        StringUtils.contains(*, null)     = false
        StringUtils.contains("", "")      = true
        StringUtils.contains("abc", "")   = true
        StringUtils.contains("abc", "a")  = true
        StringUtils.contains("abc", "z")  = false*/
        System.out.println(StringUtils.contains("abc","abc"));
        //忽略大小写
        System.out.println(StringUtils.containsIgnoreCase("Abc","abc"));

        //是否包含空格
        System.out.println(StringUtils.containsWhitespace("adasdf"));
        //单个元素是否包含,只要包含数据组中的一个元素 就认为是包含的
        /*StringUtils.containsAny("zzabyycdxx",['z','a']) = true
        StringUtils.containsAny("zzabyycdxx",['b','y']) = true
        StringUtils.containsAny("zzabyycdxx",['z','y']) = true
        StringUtils.containsAny("aba", ['z'])           = false*/
        System.out.println(StringUtils.containsAny("zzabyycdxx","zl"));

        //不包含任意一个
        /*StringUtils.containsNone(null, *)       = true
        StringUtils.containsNone(*, null)       = true
        StringUtils.containsNone("", *)         = true
        StringUtils.containsNone("ab", "")      = true
        StringUtils.containsNone("abab", "xyz") = true
        StringUtils.containsNone("ab1", "xyz")  = true
        StringUtils.containsNone("abz", "xyz")  = false*/
        System.out.println(StringUtils.containsNone("ab1", "xyz"));

        //两个数组中不包含冲突的元素
        System.out.println(StringUtils.containsOnly("asdf","ssasfddd"));

    }
}
