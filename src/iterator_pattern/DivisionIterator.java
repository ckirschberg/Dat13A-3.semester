package iterator_pattern;
import java.util.Iterator;


public class DivisionIterator implements Iterator {
	private VicePresident[] vps;
	private int i = 0;
	
	public DivisionIterator(VicePresident[] vps)
	{
		this.vps = vps;
	}
	
	@Override
	public boolean hasNext() {
		if(vps.length >= i && vps[i] != null)
		{			
			return true;			
		}	
		else
		{			
			return false;
		}	
	}

	@Override
	public VicePresident next() {		
		return vps[i++];
	}
	
	public void remove(int deletion)
	{
		if(vps[deletion] != null)
		{
			
		}	
	}

}
