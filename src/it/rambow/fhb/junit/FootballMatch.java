package it.rambow.fhb.junit;

public class FootballMatch implements Match {
	private long playtime = 110 * 60000; //90 minuten + 15minuten HZP + 5 Min Verletzungspause in Millisekunden
	private long start;
	private long end;
	
	public FootballMatch(long startTime, long endTime) throws Exception {
		if((endTime - startTime) == playtime) {
			this.start = startTime;
			this.end = endTime;
		} else {
			throw new Exception("wrong playtime");
		}
	}

	public long getEnd() {
		return this.end;
	}

	public long getStart() {
		return this.start;
	}
}
