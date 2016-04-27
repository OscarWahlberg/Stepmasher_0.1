package stepmasher;

public class MashParameters {

	private int proportional;	// P in PI-algorithm. Must be 0-10.
	private int integral;		// I in PI-algorithm. Must be 0-10.
	private int memory;			// the lookback-time for the integral I parameter in minutes. Must be 1-10.
	private int maxOutput;		// A concatination of the output power in % of max = the highest allowed output power. Must be 0-100.
	private int pwmPeriod;		// The PWM-period for the output power in seconds. Must be 1-10
	
	public MashParameters(){
		super();
	}
	
	public MashParameters(int proportional, int integral, int memory, int maxOutput, int pwmPeriod) {
		super();
		setProportional(proportional);
		setIntegral(integral);
		setMemory(memory);
		setMaxOutput(maxOutput);
		setPwmPeriod(pwmPeriod);
	}

	public void printParameters(){
		System.out.println("Parameters [proportional: " + proportional + ". integral: " + integral + ". memory: " + memory + "min. maxOutput: " + maxOutput + "%. pwmPeriod: " + pwmPeriod + "s. ]");
	}
	
	public int getProportional() {
		return proportional;
	}
	
	public void setProportional(int proportional) {		// P in PI-algorithm. Must be 0-10.
		if (proportional >= 0 && proportional <= 10){
			this.proportional = proportional;
		}
		else {
			System.out.println(proportional + " is not a valid proportional. proportional = 0. proportional must be 0-10.");
			this.proportional = 0;
		}
	}
	
	
	public int getIntegral() {
		return integral;
	}
	
	public void setIntegral(int integral) {				// I in PI-algorithm. Must be 0-10.
		if (integral >= 0 && integral <= 10){
			this.integral = integral;
		}
		else {
			System.out.println(integral + " is not a valid integral. integral = 0. integral must be 0-10.");
			this.integral = 0;
		}
	}
	
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {					// the lookback-time for the integral I parameter in minutes. Must be 1-10.
		
		if (memory > 0 && memory <= 10){
			this.memory = memory;
		}
		else {
			System.out.println(memory + " is not a valid memory. memory = 0. memory must be 1-10.");
			this.memory = 1;
		}
	}
	
	
	public int getMaxOutput() {
		return maxOutput;
	}
	
	public void setMaxOutput(int maxOutput) {			// A concatination of the output power in % of max = the highest allowed output power. Must be 0-100.

		if (maxOutput >= 0 && maxOutput <= 100){
			this.maxOutput = maxOutput;
		}
		else {
			System.out.println(maxOutput + " is not a valid maxOutput. maxOutput = 100. maxOutput must be 0-100");
			this.maxOutput = 100;
		}
	}
	
	
	public int getPwmPeriod() {
		return pwmPeriod;
	}
	
	public void setPwmPeriod(int pwmPeriod) {			// The PWM-period for the output power in seconds. Must be 1-10

		if (pwmPeriod >= 1 && pwmPeriod <= 10 ){
			this.pwmPeriod = pwmPeriod;
		}
		else {
			System.out.println(pwmPeriod + " is not a valid pwmPeriod. pwmPeriod = 1. pwmPeriod must be 1-10");
			this.pwmPeriod = 1;
		}
	}

	
}
