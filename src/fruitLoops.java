/**
 * Author: Brandon B.
 * Date: 9-15-15
 * Description: THE INCREDIBLE LOOPS AND WHILE LOOPS!
 */

import java.util.Scanner;
public class fruitLoops {

    public static void main(String[] args) {
    	/* while (true) {
    		// This appareantly locks our computers
    		System.out.println("PFEFFER!");
    		System.out.println(Math.sqrt(Math.pow(21, 69) * Math.pow(21, 69) * Math.pow(21, 69)));
    		if ("allah".equals("our lord and savior")) {
    			break;
    		}
    	} */

    	// For loops
    	// Each step through a loop is an interation

    	/* for (initializing expression; control expression; step expression) {
    		CODE!
    	} */

    	int j = 0, sum = 0;
    	for (j = 1; j <= 100; j++) {
    		sum += j;
    		System.out.println(j + " " + sum);
    	}

		// Nested loops
		for (int z = 0; z < 5; z++) {
			System.out.println("Outer Loop"); // 5x
			for (int i = 0; i < 8; i++) {
				System.out.println("Inner Loop"); // 40x
			}
		}

		// Break command (not brake nerd)
		for (int x = 0; x <= 10; x++) {
			if (x > 5) {
				break;
			}
			System.out.println("mag ich JCreator nicht :(");
		}

		// "THE" while loop
		// while(control expression)

		int z = 0;
		while (z <= 99) {
			System.out.println(z + " Hello again!");
			z ++;
		}

		int y = 0;
		Scanner kbReader = new Scanner(System.in);
		while (y != -1) {
			System.out.print("Please enter any positive integer, enter -1 to end program ");
			y = kbReader.nextInt();
			System.out.println("Thank you!");
		}
    }
}
