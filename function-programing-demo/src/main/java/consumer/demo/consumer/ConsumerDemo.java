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

    @Test
    public  void  testSelfDefinedDemo(){
        //消息处理器
        MessageProssecor messageProssecor=new MessageProssecor();
        //直接写处理过程（消息具体处理）
        MessageConsumer<MessageObjA> messageConsumer=(model)->{System.out.println(model.getType());};
        MessageObjA messageObjA=new MessageObjA();
        messageObjA.setType(1);
        messageProssecor.dealMessage(messageConsumer,messageObjA);

       ///方法赋值（消息具体处理）
        RetreatPlanFinishedMessageHandler retreatPlanFinishedMessageHandler=new RetreatPlanFinishedMessageHandler();
        MessageConsumer<MessageObjA> messageConsumer1=retreatPlanFinishedMessageHandler::handle;
        MessageObjA messageObjA1=new MessageObjA();
        messageObjA1.setType(2);
        messageProssecor.dealMessage(messageConsumer1,messageObjA1);
    }

}
