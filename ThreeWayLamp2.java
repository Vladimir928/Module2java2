package ss.week2.hotel;

import ss.utils.TextIO;

class TWlamp22 {
	private String State;

	// private ThreeWayLamp current;
	TWlamp22() {
		// return the TWLamp2 object
	}

	int testOFF(String s2)// @invariant-Checks if lamp is off.@requires-Lamp has to be created//
	{
		if (s2 == "OFF") {
			return 1;
		} else
			return 0;

	}

	String testSEQUENCE(String s1) {/*
									 * @invariant-Checks if sequence is properly implemented.
									 * 
									 * @requires-lamp has to be created.
									 * 
									 * @precondition-previous state of lamp has to be checked
									 */
		if (s1 == "OFF")
			return "LOW";
		else if (s1 == "LOW")
			return "MEDIUM";
		else if (s1 == "MEDIUM")
			return "HIGH";
		else
			return "OFF";
	}

	void runtest(String State)// @invariant-Method to check the cases-testOFF and
								// testSEQUENCE.@requires-Methods-testOFF and testSEQUENCE
	{

		switch (State) {
		case "OFF":
			this.State = "OFF";
			System.out.println(this.State);
			break;
		case "LOW":
			this.State = "LOW";
			System.out.println(this.State);
			break;
		case "MEDIUM":
			this.State = "MEDIUM";
			System.out.println(this.State);
			break;
		case "HIGH":
			this.State = "HIGH";
			System.out.println(this.State);
			break;
		case "STATE":
			if (testOFF(this.State) == 1)
				System.out.println("SWITCH IS OFF");
			else {
				System.out.println("SWITCH IS ON");
			}
			break;
		case "NEXT":
			String x = (testSEQUENCE(this.State));
			this.State = x;
			System.out.println(this.State);
			break;
		default:
			System.out.println("ERROR!");
		}

	}

	void display()// @invariant-Displays help menu
	{
		String str1 = "OFF: Set the lamp to OFF (default value) " + "LOW: Set the lamp to LOW  "
				+ "MEDIUM: Set the lamp to MEDIUM" + "HIGH: Set the lamp to HIGH "
				+ "STATE: Print the current setting of the lamp  "
				+ "NEXT: Change to the next setting, observing the order OFF to LOW to MEDIUM to HIGH to OFF"
				+ "EXIT: Quit the program ";

		System.out.println(str1);
	}
}

public class ThreeWayLamp {
	public static void main(String[] args) {
		TWlamp22 lamp = setup();
		lamp.display();

		boolean check = true;
		while (check) {
			System.out.println("ENTER COMMAND");
			String s = TextIO.getlnString();
			if (!s.equals("EXIT")) {
				lamp.runtest(s);
			} else {
				check = false;
			}
		}

	}

	public static TWlamp22 setup() {
		return new TWlamp22();
	}
}
