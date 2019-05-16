package com.bjsxt.adapter;
/**
 * 适配器本身(对象组合方式和被适配对象整合)
 * (相当于usb和ps/2的转接器)
 * @author admin
 *
 */
public class Adapter2  implements Target{

	private Adaptee adaptee;
	@Override
	public void handleReq() {
		adaptee.request();
	}
	public Adapter2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}
	public Adapter2() {
		super();
	}
	
	

}
