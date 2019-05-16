package com.bjsxt.adapter;
/**
 * 适配器本身(类适配器)
 * (相当于usb和ps/2的转接器)
 * @author admin
 *
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void handleReq() {
		super.request();
	}

}
