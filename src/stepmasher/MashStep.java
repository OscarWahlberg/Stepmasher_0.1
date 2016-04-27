package stepmasher;


public class MashStep {

	private int goalTemp;	// in degrees centigrade. Must be 1-105 *c. The desired temperature for this step.
	private int reachTemp;	// in degrees centigrade. Must be 1-105 *c. The temperature at which the program decides that the goalTemp is reached and the timer starts ticking.
	private int duration; 	// in minutes. Must be 0-60.The duration of this step. How long the desired temperature (goalTemp) is supposed to be kept.
	
	public MashStep(){
		super();
	}
	
	public MashStep( int goalTemp, int reachTemp, int duration) {
		super();
		setGoalTemp(goalTemp);
		setReachTemp(reachTemp);
		setDuration(duration);
	}
	
	public void printStep(){
		String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.
		System.out.print("[ goalTemp: " + goalTemp + "*C. reachTemp: " + reachTemp + "*C. duration: " + duration + "min ]" + newLine);
	}
	
	
	public int getGoalTemp() {
		return goalTemp;
	}
	
	public void setGoalTemp(int goalTemp) {
		if (goalTemp >= 0 && goalTemp < 106) {
			this.goalTemp = goalTemp;
		}
		else {
			System.out.println(goalTemp + " is not a valid goalTemp. goalTemp = 0. goalTemp must be 0-105 *c");
			this.goalTemp = 0;
		}
	}
	
	
	public int getReachTemp() {
		return reachTemp;
	}
	
	public void setReachTemp(int reachTemp) {
		if (reachTemp >= 0 && reachTemp < 106) {
			this.reachTemp = reachTemp;			
		}
		else {
			System.out.println(reachTemp + " is not a valid reachTemp. reachTemp = 0. rachTemp must be 0-105 *c");
			this.reachTemp = 0;
		}
	}
	
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		if (duration >= 0 && duration < 61) {
			this.duration = duration;
		}
		else {
			System.out.println(duration + " is not a valid durtion. duration = 0. duration must be 0-60");
			this.duration = 0;
		}
	}

	
}
