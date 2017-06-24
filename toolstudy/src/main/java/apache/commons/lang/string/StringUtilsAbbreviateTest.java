package apache.commons.lang.string;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * 字符串缩写设置
 * Created by Administrator on 2017/6/24 0024.
 */
public class StringUtilsAbbreviateTest {

    /**
     * 字符串缩写设置
     */
    @Test
    public void stringAbbreviate(){
        String str = "This is my Test";
        //后省略
        //public static String abbreviate(String str ，int maxWidth)
        //字符串缩写截取 This is my Test  === This is...
        //String 输入字符串内容
        //maxWidth 输出的总长度
        //默认会有...省略
        System.out.println(StringUtils.abbreviate(str,10));

        //前省略 + 后省略
        //public static String abbreviate(String str ,int offset,int maxWidth)
        //offset 起始省略的位置
        //maxWidth 输出的总长度
        //字符串缩写截取 This is my Test  === ...s my...
        System.out.println(StringUtils.abbreviate(str,6,11));

        //后省略
        //public static String abbreviate(String str,String abbrevMarker,int maxWidth)
        //自定义后省略符号
        //abbreMarker 为省略符号
        //maxWidth 输出总宽度
        //字符串缩写截取 This is my Test  === This is ...
        System.out.println(StringUtils.abbreviate(str,"...",11));
    }


}
