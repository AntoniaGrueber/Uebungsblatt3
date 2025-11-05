package h3;

public class H3_main {

public static void main(String[] args) {
	int max =19;
	int fix =9;
	int wartend = 3;
	boolean istVoll = false;
	
	int freiePlaetze=1;
	
	if (max<=fix) {
		istVoll= true ;
		freiePlaetze = 0;
	} else {
		istVoll= false;
		freiePlaetze= max - fix;
	} while (freiePlaetze >0 && wartend >0) {
		wartend = wartend -1;
		fix = fix +1;
		freiePlaetze = freiePlaetze -1;
	}
	System.out.println(" Von maximal " + max + " Plätzen, sind " + fix + " vergeben. Auf der Warteliste stehen " + wartend + ". Der Kurs istVoll ist " + istVoll );
}

}
