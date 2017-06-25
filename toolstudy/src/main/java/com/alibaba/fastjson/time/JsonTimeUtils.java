package com.alibaba.fastjson.time;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/25 0025.
 */
public class JsonTimeUtils {
    @Test
    public void test(){
        //Date 转化成时间字符串

        System.out.println(JSON.toJSONStringWithDateFormat(new Date(), "yyyy-MM-dd HH:mm:ss.SSS"));

        /*使用ISO-8601日期格式

        JSON.toJSONString(obj, SerializerFeature.UseISO8601DateFormat);
        全局修改日期格式

        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd";
        JSON.toJSONString(obj, SerializerFeature.WriteDateUseDateFormat);
        反序列化能够自动识别如下日期格式：

        ISO-8601日期格式
        yyyy-MM-dd
        yyyy-MM-dd HH:mm:ss
        yyyy-MM-dd HH:mm:ss.SSS
        毫秒数字
        毫秒数字字符串
        .NET JSON日期格式
        new Date(198293238)*/
    }
}
