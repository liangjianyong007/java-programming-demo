package function.demo;

/**
 * @Description:
 * @Date: Created in 2018/12/7
 * @Author: liangjianyong
 */
public class PersonFunctionService {

    public BaseResult<Person> insert(Person person){
        System.out.println("insert succ");
        BaseResult<Person> scmBaseResult=new BaseResult<Person>();
        scmBaseResult.setSuccess(true);
        return scmBaseResult;
    }


}
