package unaryOperator.demo;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * @Description:
 * @Date: Created in 2018/12/11
 * @Author: liangjianyong
 */
public class UnaryOperatorDemo extends TestCase {

    @Test
    public  void  testSimpleDemo(){
        List<Integer> list = Arrays.asList(10,20,30,40,50);
        UnaryOperator<Integer> unaryOpt = i->i*i;
        unaryOperatorFun(unaryOpt, list).forEach(x->System.out.println(x));
    }

    private static List<Integer> unaryOperatorFun(UnaryOperator<Integer> unaryOpt, List<Integer> list){
        List<Integer> uniList = new ArrayList<>();
        System.out.println(UnaryOperator.identity().apply(1));
        list.forEach(i->uniList.add(unaryOpt.apply(i)));
        return uniList;
    }

}
