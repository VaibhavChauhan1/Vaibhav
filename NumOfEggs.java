package numofeggs;

public class NumOfEggs {
	
	private int totaleggs,gross,dozen,remaining;

	public NumOfEggs(int n) {
		this.totaleggs=n;
		
		gross=totaleggs/144;
		int grossrem=totaleggs%144;
		
		dozen=grossrem/12;
		int dozenrem=grossrem%12;
		
		remaining=dozenrem;
	}

	public int getGross() {
		return gross;
	}

	public int getDozen() {
		return dozen;
	}


	public int getRemaining() {
		return remaining;
	}

	
}
