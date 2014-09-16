package iterator_pattern;

public class VicePresident {
	private String name;
	private String division;
	
	public VicePresident(String name, String division)
	{
		this.setName(name);
		this.setDivision(division);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}
	
	
}
