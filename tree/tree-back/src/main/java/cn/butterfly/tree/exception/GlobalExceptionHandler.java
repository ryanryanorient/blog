package cn.butterfly.tree.exception;

import cn.butterfly.tree.base.BaseResult;
import cn.butterfly.tree.constant.ErrorMsgConstants;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理类
 *
 * @author zjw
 * @date 2021-12-18
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * 自定义 ApiException 异常处理
	 *
	 * @param apiException apiException
	 * @return 异常信息
	 */
	@ExceptionHandler(ApiException.class)
	public BaseResult<Object> apiExceptionHandler(ApiException apiException) {
		return BaseResult.error(apiException.getMessage());
	}

	/**
	 * 统一异常处理
	 *
	 * @return 异常信息
	 */
	@ExceptionHandler(Exception.class)
	public BaseResult<String> exceptionHandler() {
		return BaseResult.error(ErrorMsgConstants.SYSTEM_ERROR);
	}

}
