
public class Registrar {

	private boolean override = false;
	
	void setOverride(boolean value) 
	{
		override = value;
	}
	
	boolean canRegister(int credits, double gpa)
	{
	
		if(gpa<2.0 && !override)
			return false;
		else if(gpa >=3.0)
			return credits <= 20;
		else 
			return credits < 16;
	}
}
