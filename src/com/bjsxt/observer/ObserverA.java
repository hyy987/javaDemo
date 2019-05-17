package com.bjsxt.observer;


public class ObserverA implements Observer{

	private int myState;
	@Override
	public void update(Subject subject) {
		this.myState=((ConcreteSubject)subject).getState();
	}
	public int getMyState() {
		return myState;
	}
	public void setMyState(int myState) {
		this.myState = myState;
	}

	
}
