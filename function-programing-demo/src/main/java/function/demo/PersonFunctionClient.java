package function.demo;

/**
 * @Description:
 * @Date: Created in 2018/12/7
 * @Author: liangjianyong
 */
public class PersonFunctionClient extends FunctionBaseClient<Person> {
    PersonFunctionService personFunctionService = new PersonFunctionService();

    public BaseResult<Person> insert(Person person) {
        return super.doUpdate(person, model -> personFunctionService.insert(model));
    }

    public BaseResult<Person> insert2(Person person) {
        return super.doUpdate(person, model -> { return personFunctionService.insert(model);});
    }


}