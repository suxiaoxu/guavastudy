package apache.commons.lang.classutils;

import org.apache.commons.lang3.ClassPathUtils;
import org.junit.Test;

/**
 * Created by xiaoxu.sxx on 2017/6/28.
 */
public class ClassUtilsTest {

    @Test
    public void classPathUtilsTest(){
        System.out.println(ClassPathUtils.toFullyQualifiedName(ClassUtilsTest.class,"ClassUtilsTest"));
        System.out.println(ClassPathUtils.toFullyQualifiedPath(ClassUtilsTest.class, "ClassUtilsTest"));
    }

    @Test
    public void classUtilsTest(){

    }
}
