package h2;

public class H2_main {

public static void main(String[] args) {
	int Jahr = 2025;
	boolean schalt = false;
	if (Jahr % 4 ==0 && Jahr % 100 !=0) {
		schalt = true;
	} else if (Jahr % 100 ==0 && Jahr % 400==0) {
		schalt = true;
	}
	
	//System.out.println("Das Jahr " +Jahr + " ist ein schaltjahr: " + schalt);
}

}
