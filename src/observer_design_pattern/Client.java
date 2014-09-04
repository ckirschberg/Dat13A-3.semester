package observer_design_pattern;

public class Client implements Observer {

	@Override
	public void update(String transaction) {
		// TODO Auto-generated method stub
		System.out.println("There was a transaction, Client! " + transaction);
	}

}
