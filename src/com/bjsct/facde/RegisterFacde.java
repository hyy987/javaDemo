package com.bjsct.facde;

public class RegisterFacde {

	public void register() {
		new GongShangJu().name();
		new ZhiJianJu().checkQuality();
		new ShuiWuJu().payTaxes();
		new CBCBank().openAccount();
	}
}
