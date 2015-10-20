
public class CalculatorController {
	
	public static void main(String[]args) { 
		float nOne, nTwo;
		Calculator JurgensCalculator = new Calculator(); 
		
		
		nOne = Float.parseFloat(args[0]); 
		nTwo = Float.parseFloat(args[1]);
		
		JurgensCalculator.setNumOne(nOne);
		JurgensCalculator.setNumTwo(nTwo);
		
		System.out.println("adding" + JurgensCalculator.add()); 
				}
	

}
