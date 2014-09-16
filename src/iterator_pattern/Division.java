package iterator_pattern;

public class Division {
	private VicePresident[] vps = new VicePresident[100];
	private int counter = 0;
	
	public void addVP(VicePresident vp)
	{
		vps[counter] = vp;
		counter++;
	}
	
	public DivisionIterator iterator()
	{
		return new DivisionIterator(vps);
	}
	
	public VicePresident[] getVPS()
	{
		return vps;
	}
	
	public void printVPS(VicePresident[] vps)
	{
		for (int i = 0; i < vps.length; i++)
		{
			if (vps[i] != null)
			{
				System.out.println(vps[i].getName() + " " + vps[i].getDivision());				
			}	
		}	
	}
}
