package com.bjsxt.Mediator;

/**
 * 同事类接口
 * @author admin
 *
 */
public interface Department {


	void selfAction();//做本部门事情
	void outAction();//向总经理发出请求
}
