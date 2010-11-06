package it.rambow.fhb.junit;

public class Countdown {
	private Environmental env;
	
	public void setEnvironment(Environmental current_env) {
		this.env = current_env;
	}

	public boolean isMatchtime(Match match) {
		return ( (isMatchStarted(match) ) && (isMatchNotEnded(match)) );
	}
	  
	public boolean isMatchStarted(Match match) {
	  return (this.env.getTime() >= match.getStart());
	}
	
	public boolean isMatchNotEnded(Match match) {
	  return (this.env.getTime() <= match.getEnd());
	}
}