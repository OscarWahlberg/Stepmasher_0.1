package stepmasher;

public class MashingProgram {
	
	String name;
	String description;
	MashParameters mashParameters;
	MashStep[] mashSteps = new MashStep[5];
	
	//for (int i = 0; i < 5; i++) {
	//	mashSteps[i] = new MashStep();
	//}
	
	private static MashingProgram instance = new MashingProgram();
	
	private MashingProgram(){	}
	
	public static MashingProgram getInstance (){
		return instance;
	}
	
	///Only use when loading from file.
	public static void setInstance(MashingProgram mashingProgram)
	{
		instance = mashingProgram;
	}
	

	public void printMashingProgram(){
		
		String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.
		
		System.out.println(newLine + "Name: " + name + newLine + "Description: " + description);
		
		mashParameters.printParameters();
		
		for (int i = 0; i < 5 ; i++) {
			System.out.print("Step " + i + ": ");
			mashSteps[i].printStep();
		}
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

	public MashParameters getMashParameters() {
		return mashParameters;
	}

	public void setMashParameters(MashParameters mashParameters) {
		this.mashParameters = mashParameters;
	}
	

	public MashStep[] getMashSteps() {
		return mashSteps;
	}

	public void setMashSteps(MashStep[] mashSteps) {
		this.mashSteps = mashSteps;
	}
	
	
}
