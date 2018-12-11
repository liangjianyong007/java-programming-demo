package consumer.demo.consumer;

/**
 * @Description:
 * @Date: Created in 2018/12/11
 * @Author: liangjianyong
 */
@FunctionalInterface
public interface MessageConsumer<T extends MessageObj> {

    void consumerMessage(T t);


}
