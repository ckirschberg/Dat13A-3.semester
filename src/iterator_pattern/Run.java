package iterator_pattern;

public class Run {
	public static void main(String[] args) {
		Division division = new Division();
		VicePresident vp1 = new VicePresident("Hans", "Ingenør");
		VicePresident vp2 = new VicePresident("Alan", "Marketing");
		VicePresident vp3 = new VicePresident("Hestefar", "Stalden");
		VicePresident vp4 = new VicePresident("Hestefar", "Stalden");
		VicePresident vp5 = new VicePresident("Hestefar", "Stalden");
		VicePresident vp6 = new VicePresident("Hestefar", "Stalden");
		VicePresident vp7 = new VicePresident("Hestefar", "Stalden");
		division.addVP(vp1);
		division.addVP(vp2);
		division.addVP(vp3);
		division.addVP(vp4);
		division.addVP(vp5);
		division.addVP(vp6);
		division.addVP(vp7);	
		DivisionIterator di = division.iterator();
		while(di.hasNext())
		{
			VicePresident newVP = di.next();
			System.out.println(newVP.getDivision() + " " + newVP.getName());
		}	
	}
}
