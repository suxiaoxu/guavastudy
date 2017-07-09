package apache.commons.lang;

import org.junit.Test;

import java.util.Date;

/**
 * Created by xiaoxu.sxx on 2017/7/4.
 */
public class DateUtils {

    @Test
    public void dateUtils(){
        System.out.println(org.apache.commons.lang3.time.DateUtils.addHours(new Date(),-12));
    }
}
