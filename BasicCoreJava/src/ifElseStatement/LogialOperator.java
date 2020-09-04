package ifElseStatement;

public class LogialOperator {
	
	public static void main(String args []){
	
		//Operators - AND (both condition) , OR - Either first or second condition
		int Month = 2;
		int Days = 29;
		if(Month == 3 && Days == 29){
			System.out.println("Leap year");
		}else{
			System.out.println("Not Leap year");
		}
		
		int tenth = 65; 
		int twelfth = 68;
		int degree =  58;
		
		// && operator will be used whenever both condition should be true
		if (tenth >= 60 && twelfth >= 60 && degree >= 58 )
		{
			System.out.println("You are qualified");
		}else{
			System.out.println("You are not qualified");
		}
		
		// **************OR operator*************** One condition should be true
		
		int JEEMarks = 50;
		int CETMarks = 80;
		
		if (JEEMarks >= 50 || CETMarks >= 80)
		{
			System.out.println("You are qualified");
		}else{
			System.out.println("You are not qualified");
		}
		
	}
}
