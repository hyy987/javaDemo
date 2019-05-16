package com.bjsxt.builder;

public class SxtAirShipBuilder implements AirShipBuilder{

	@Override
	public Engine builderEngine() {
		System.out.println("构建发动机");
		return new Engine("牛逼牌发动机");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("构建轨道舱");
		return new OrbitalModule("牛批轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("构造逃逸塔");
		return new EscapeTower("牛批逃逸");
	}//StringBuilder,DomBuilder,SaxBuilder

}
