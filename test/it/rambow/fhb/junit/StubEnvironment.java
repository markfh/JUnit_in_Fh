package it.rambow.fhb.junit;

public class StubEnvironment implements Environmental {
	private long curr_time;
	
	public void setCurrTime(long time) {
		this.curr_time = time;
	}
	
	public long getTime() {
		return this.curr_time;
	}

}
