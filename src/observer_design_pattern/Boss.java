package observer_design_pattern;

public class Boss implements Observer {

	@Override
	public void update(String transaction) {
		System.out.println("There was a transaction, Boss! " + transaction);
	}

}
