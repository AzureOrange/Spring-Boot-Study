package com.study.http;

import com.study.common.ApiStatus;
import com.study.common.MyException;
import com.study.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 功能描述：异常测试
 *
 * @author orange
 */
@RestController
public class ExceptionController {

	 
	/**
	 * 功能描述：模拟全局异常
	 * @return
	 */
	@RequestMapping(value = "/api/v1/test_ext", method = RequestMethod.GET)
	public Object index() {
		int i= 1/0;
		return new User(11, "sfsfds", "1000000", new Date());
	}

	
	/**
	 * 功能描述：模拟自定义异常
	 *
	 * @return
	 */
	@RequestMapping(value = "/api/v1/myException", method = RequestMethod.GET)
	public Object myException(){
		
		throw new MyException(ApiStatus.ModelA_Exception.code(),ApiStatus.ModelA_Exception.message());
		
	}
	
}
