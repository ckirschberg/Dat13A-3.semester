package observer_design_pattern;

public class Test {

	public static void main(String[] args)
	{
		Database db = new Database();
		Client c1 = new Client();
		Client c2 = new Client();
		Boss b1 = new Boss();
		
		db.register(c1);
		db.register(c2);
		db.register(b1);
		
		db.insertInDatabase("Ali siger: Hold nu kæft, er du neger!?!?");
		
		
	}
}
