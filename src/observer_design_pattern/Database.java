package observer_design_pattern;

import java.util.ArrayList;

public class Database implements Observable {

	private String transaction;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void remove(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observer obs : observers)
		{
			obs.update(transaction);
		}
	}
	
	public void insertInDatabase(String transaction)
	{
		this.transaction = transaction;
		notifyObservers();
		
	}

}
