package function.demo;

import java.io.Serializable;

public class BaseResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否成功
     */
    private boolean success = false;
    /**
     * 错误信息
     */
    private String errorMessage;
    /**
     * 返回码
     */
    private Long code;
    /**
     * SCM3.0新规范错误码
     */
    private String newCode;
    /**
     * 字符型错误码
     */
    private String errorCode ;
    /**
     * 是否重试
     */
    private boolean isRetry = false;

    private T model;

    public boolean isSuccess() {
        return success;
    }

    public boolean isFail() {
        return !success;
    }



    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getNewCode() {
		return newCode;
	}

	public void setNewCode(String newCode) {
		this.newCode = newCode;
	}

	public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public boolean isRetry() {
        return isRetry;
    }

    public void setRetry(boolean isRetry) {
        this.isRetry = isRetry;
    }

    public BaseResult() {

    }

    public BaseResult(BaseResult<?> result) {
        this.setSuccess(result.isSuccess());
        this.setCode(result.getCode());
        this.setErrorCode(result.getErrorCode());
        this.setErrorMessage(result.getErrorMessage());
        this.setRetry(result.isRetry());
    }

    public BaseResult<T> fail(T model, Long code, String errorCode, String errorMessage, boolean isRetry) {
        this.setSuccess(false);
        this.setCode(code);
        this.setErrorCode(errorCode);
        this.setErrorMessage(errorMessage);
        this.setRetry(isRetry);
        this.setModel(model);
        return this;
    }



    @Override
    public String toString() {
        return "ScmBaseResult{" +
                "success=" + success +
                ", errorMessage='" + errorMessage + '\'' +
                ", newCode=" + newCode +
                ", code=" + code +
                ", errorCode='" + errorCode + '\'' +
                ", isRetry=" + isRetry +
                ", model=" + model +
                '}';
    }
}
