/*
  	ISYS 320
  	Name(s):
  	Date: 




public class P1_OutputLoopResult {

	public static void main(String[] args) {
		printSumOfSquaresTo5();
	}
	
	public static void printSumOfSquaresTo5() {
		for( int i = 1; i <= 5; i++ ) {
			int finalResult = 0;
			finalResult = finalResult + i * i;
		}
		
		System.out.println( "Final result is: " + finalResult );
	}
	System.out.println should be inside of the brackets for for loop because final Results is on declared within the for loop.

}
*/
/*
  	ISYS 320
  	Name(s): Samantha Rutherford
  	Date: 11/12/2017
*/



public class P1_OutputLoopResult {

	public static void main(String[] args) {
		printSumOfSquaresTo5();
	}

	public static void printSumOfSquaresTo5() {

		for( int i = 1; i <= 5; i++ ) {
			int finalResult = 0;
			finalResult = finalResult + i * i;
			System.out.println( "Final result is: " + finalResult);
		}

	}

}

