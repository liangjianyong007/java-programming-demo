package consumer.demo.consumer;

/**
 * @Description:
 * @Date: Created in 2018/12/11
 * @Author: liangjianyong
 */
public class RetreatPlanFinishedMessageHandler {

    public  void  handle(MessageObjA messageObjA){
        System.out.println(messageObjA.getType());
    }


}
