package predicate.demo;

import java.util.function.Predicate;

/**
 * @Description:
 * @Date: Created in 2018/12/6
 * @Author: liangjianyong
 */
public class Validator {

    public static  <T> boolean  checkParam(Predicate<T> predicate,T value){
          return predicate.test(value);
    }



}
