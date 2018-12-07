package function.demo;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.function.Function;

/**
 * @Description:
 * @Date: Created in 2018/12/6
 * @Author: liangjianyong
 */
public class FunctionDemo extends TestCase{

    @Test
    public  void  testSimpleDemo(){

        Function<String,Boolean> function=(in)->{
             if("a".equals(in)){
                 return true;
             }
             return false;
        };
        System.out.println(function.apply("a"));
    }


    @Test
    public  void  testSelfDefinedDemo(){

        PersonFunctionClient personFunctionClient=new PersonFunctionClient();
        Person person=new Person();
        person.setAge(1);
        person.setName("liangjya");
        BaseResult<Person> result=personFunctionClient.insert(person);
        System.out.println(result.isSuccess());
    }



}
