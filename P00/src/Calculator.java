
public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiple(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
	
	public boolean testDivideWith0Denominator(int a, int b) {
		if (b == 0) {
			return false;
		} else {
			return true;
		}
		
	}
}
