package predicate.demo;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.function.Predicate;

/**
 * @Description:
 * @Date: Created in 2018/12/6
 * @Author: liangjianyong
 */

public class PredicateDemo  extends TestCase {

    @Test
    public  void  testSimpleDemo(){

        Predicate<Boolean>  predicate=(t)->{
             if(t){
              return true;
         }
          return false;
        };
        //直接处理
        Predicate<Boolean>  predicate11=(t)->t&t;

      System.out.println(predicate.test(true));

        Predicate<String> predicate1 = s->s.contains("a");
        Predicate<String> predicate2 = s->s.contains("b");
        Predicate<String> predicate3 = predicate1.and(predicate2);
        System.out.println(predicate3.test("a"));
        System.out.println(predicate3.test("abc"));

        Predicate<String> predicate4 = predicate1.or(predicate2);
        System.out.println(predicate4.test("a"));

    }



    @Test
    public  void  testSelfDefineDemo(){
        Predicate<String> predicate1 = s->s.contains("a");
        Boolean flag=Validator.checkParam(predicate1,"a");
        System.out.println(flag);

    }







}
