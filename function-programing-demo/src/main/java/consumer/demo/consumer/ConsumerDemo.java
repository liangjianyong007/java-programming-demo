package consumer.demo.consumer;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.function.Consumer;

/**
 * @Description:
 * @Date: Created in 2018/12/6
 * @Author: liangjianyong
 */
public class ConsumerDemo extends TestCase {

    @Test
    public  void  testSimpleDemo(){
        /**
         * 消息处理可以使用，只有输入没有处理结果输出
         */
        Consumer<String> consumer=(s)->System.out.println(s);
        Consumer<String> consumer1=(s)->System.out.println(s);
        consumer.andThen(consumer1).accept("zhangsan");

    }


}
