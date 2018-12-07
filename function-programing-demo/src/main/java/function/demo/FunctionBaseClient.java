package function.demo;

import java.util.function.Function;

/**
 * @Description:
 * @Date: Created in 2018/12/7
 * @Author: liangjianyong
 */
public abstract  class FunctionBaseClient<T> {


    protected <V extends T, R> BaseResult<R> doUpdate(V bizModel, Function<T, BaseResult<R>> function) {
        T object = fromBizModel(bizModel);
        return function.apply(object);
    }


    private <V extends T> T fromBizModel(V bizModel){
        return bizModel;
    }

}
