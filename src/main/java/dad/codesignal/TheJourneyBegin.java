package dad.codesignal;

public class TheJourneyBegin {
	
	public int add(int param1, int param2) {
		return param1 + param2;
	}
	
	public int centuryFromYear(int year) {
		int century = 0;
		
		if(year <= 0)
			century =  -1;
		else if (year <= 100)
			century = 1;
		return century;
	}
}
