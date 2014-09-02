package strategy_design_pattern;

public abstract class Vehicle {
	private IGoAlgorithm iGo;
	
	public Vehicle(IGoAlgorithm igo)
	{
		iGo = igo;
	}
	
	public void setAlgo(IGoAlgorithm igo)
	{
		iGo = igo;
	}
	
	public String go()
	{
		return iGo.go();
	}
}
