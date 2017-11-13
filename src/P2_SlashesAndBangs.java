/*
  	ISYS 320
  	Name(s): Samantha Rutherford
  	Date: 11/12/2017
*/



/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.

Line Number		| HEADING		| HEADING		| HEADING		| HEADING		| HEADING		|
1 all exclamation points
2. two backslashes | 16 exclamation points / 2 backslashes
3. 4 backslashes | 14 exclamation points | 4 backslashes
4. 6 backslashes | 10 exclamation points | 6 backslashes
5. 8 backslashes | 6 exclamation | 8 backslashes
6. 10 backslashes | 2 exclamation | 10 backslashes

Assuming this is what you meant for this....

*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure





 */

public class P2_SlashesAndBangs {

public static final int SUB_HEIGHT = 20;

	public static void main(String[] args) {


		drawTopLine();
		drawLine2();
		drawLine3();
		drawLine4();
		drawLine5();
		drawBottomLine();
}
	public static void drawTopLine() {
		for(int i = 1; i <= SUB_HEIGHT; i++) {
			System.out.print("!");
		}
		System.out.println(" ");
	}
	public static void drawLine2() {
		for (int b = 1; b <= 2; b++) {
			System.out.print("\\");
		}
		for (int e = 1; e <= 16; e++) {
			System.out.print("!");
		}
		for (int b = 1; b <= 2; b++) {
			System.out.print("\\");
		}
		System.out.println(" ");

	}
	public static void drawLine3() {
		for (int b = 1; b <= 4; b++) {
			System.out.print("\\");
		}
		for (int e = 1; e <= 12; e++) {
			System.out.print("!");
		}
		for (int b = 1; b <= 4; b++) {
			System.out.print("\\");
		}
		System.out.println(" ");
	}
	public static void drawLine4() {
		for (int b = 1; b <= 6; b++) {
			System.out.print("\\");
		}
		for (int e = 1; e <= 8; e++) {
			System.out.print("!");
		}
		for (int b = 1; b <= 6; b++) {
			System.out.print("\\");
		}
		System.out.println(" ");
	}
	public static void drawLine5() {
		for (int b = 1; b <= 8; b++) {
			System.out.print("\\");
		}
		for (int e = 1; e <= 4; e++) {
			System.out.print("!");
		}
		for (int b = 1; b <= 8; b++) {
			System.out.print("\\");
		}
		System.out.println(" ");
	}
	public static void drawBottomLine() {
		for (int b = 1; b <= 9; b++) {
			System.out.print("\\");
		}
		for (int e = 1; e <= 2; e++) {
			System.out.print("!");
		}
		for (int b = 1; b <= 9; b++) {
			System.out.print("\\");
		}
		System.out.println(" ");
	}
}

