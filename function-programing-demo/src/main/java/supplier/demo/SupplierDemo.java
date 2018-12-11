package supplier.demo;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.function.Supplier;

/**
 * @Description:
 * @Date: Created in 2018/12/11
 * @Author: liangjianyong
 */
public class SupplierDemo extends TestCase {

    @Test
    public  void  testSimpleDemo(){
        //supplier就是一个工厂，生产对象、数据等
        Supplier<String> supplier=()->{ return "aaa";};
        System.out.println(supplier.get());

    }





}
