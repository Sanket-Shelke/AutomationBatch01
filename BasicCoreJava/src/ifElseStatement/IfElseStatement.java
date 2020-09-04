package ifElseStatement;

public class IfElseStatement {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		boolean value = a > b;
		if (value) {
			System.out.println("A is greater then B");
		} else {
			System.out.println("B is greater then A");
		}
		
		
		//Scenario 2 - num1=20 AND num2=20, in this scenario if we use > operator then else part will get executed, hence we have to handle the condition
		
		int num1 = 20;
		int num2 = 20;
		
	if (num1>num2)
	{
		System.out.println("Num1 si greater than num2");
	}
	else if(num1==num2){
		System.out.println("Num2 is equals to num1");
	}
	else{
		System.out.println("num check");
	}
		
	}

}
