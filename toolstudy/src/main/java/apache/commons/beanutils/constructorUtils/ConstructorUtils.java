package apache.commons.beanutils.constructorUtils;

import apache.commons.beanutils.constants.BeanCreate;
import apache.commons.beanutils.model.Address;
import org.apache.commons.beanutils.MethodUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.apache.commons.beanutils.MethodUtils.*;

/**
 *  进行了三次测试，最后的结果如下：

 10次测验	第一次	第二次	第三次	平均值	每次平均值
 BeanUtil.copyProperties	54	57	50	53.66667	5.366666667
 PropertyUtils.copyProperties	4	4	4	4	0.4
 org.springframework.beans.BeanUtils.copyProperties	12	10	11	11	1.1
 BeanCopier.create	0	0	0	0	0


 10000次测验	第一次	第二次	第三次	平均值	每次平均值
 BeanUtil.copyProperties	241	222	226	229.6667	0.022966667
 PropertyUtils.copyProperties	92	90	92	91.33333	0.009133333
 org.springframework.beans.BeanUtils.copyProperties	29	30	32	30.33333	0.003033333
 BeanCopier.create	1	1	1	1	0.1


 10000次反转测验	第一次	第二次	第三次	平均值	每次平均值
 BeanUtil.copyProperties	178	174	178	176.6667	0.017666667
 PropertyUtils.copyProperties	91	87	89	89	0.0089
 org.springframework.beans.BeanUtils.copyProperties	21	21	21	21	0.0021
 BeanCopier.create	0	1	1	0.666667	6.66667E-05
 * Created by xiaoxu.sxx on 2017/6/28.
 */
public class ConstructorUtils {

    @Test
    public void testConstructorUtils(){
        try {
            Address address = BeanCreate.getAddress1();
            MethodUtils.invokeMethod(address,"setName","2343");
            System.out.println(address.getName());
            //System.out.println(ToStringBuilder.reflectionToString(address));

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
