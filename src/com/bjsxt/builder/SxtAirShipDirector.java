package com.bjsxt.builder;

public class SxtAirShipDirector implements AirShipDirector {

	private AirShipBuilder builder;
	
	public SxtAirShipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}

	@Override
	public AirShip directAirShip() {
		Engine e = builder.builderEngine();
		OrbitalModule o = builder.builderOrbitalModule();
		EscapeTower et = builder.builderEscapeTower();
		
		//装配飞船对象
		AirShip as = new AirShip();
		as.setEngine(e);
		as.setEscapeTower(et);
		as.setOrbitalModule(o);
		return as;
	}

}
