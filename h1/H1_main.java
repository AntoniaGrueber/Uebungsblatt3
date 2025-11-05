package h1;

public class H1_main {

public static void main(String[] args) {
	double guthaben =-100;
	double monEingang = 200;
	int rating = -2;
	boolean warnhinweis = false;
	boolean negativ = false;
	if (guthaben<0) {
		negativ = true;
		if (monEingang >= guthaben) {
			rating = rating +1;
		}else  {//if (monEingang < guthaben)
			rating = rating -1;
			if (rating<0) {
				warnhinweis = true;
			}
		}
 }else if(guthaben>0) {
		rating = rating + 3;
	}else //if (guthaben == 0)
	{
		rating = rating + 2;
	}
	//System.out.println("Warnhinweis: "+ warnhinweis + " negativ: "+ negativ + " rating: " + rating);
}
}