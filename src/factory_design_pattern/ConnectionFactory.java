package factory_design_pattern;

public class ConnectionFactory {

	private String type;
	
	public ConnectionFactory(String type)
	{
		this.type = type;
	}
	
	public Connection createConnection()
	{
		//
		if (type.equals("Oracle"))
		{
			return new OracleConnection();
		}
		else {
			return new MySqlConnection();
		}
	}
}










