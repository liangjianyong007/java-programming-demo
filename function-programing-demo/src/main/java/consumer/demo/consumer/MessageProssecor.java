package consumer.demo.consumer;

/**
 * @Description:
 * @Date: Created in 2018/12/11
 * @Author: liangjianyong
 */
public class MessageProssecor {

    public  void dealMessage(MessageConsumer messageConsumer,MessageObj messageObj){
        messageConsumer.consumerMessage(messageObj);
    }



}
