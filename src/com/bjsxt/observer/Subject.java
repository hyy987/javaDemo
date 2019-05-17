package com.bjsxt.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	protected List<Observer> list = new ArrayList<>();
	
	public void register(Observer observer) {
		list.add(observer);
	}
	
	public void removeObserver(Observer obs) {
		list.remove(obs);
	}
	
	public void notifyAllBoderver() {
		for (Observer observer : list) {
			observer.update(this);
		}
	}
}
