package ss.week2.hotel;

import java.util.*;

class TWLamp22 {
	private String State;

	public TWLamp22() {
		/** 
		 * Constructor for the class TWLamp22
		 */
	}

	public int SwitchState(String s2) {
		if (s2.equals("OFF")) {
			return 0;
		} else {
			return 1;
		}
		/**Checks whether the Switch is on or off  
		 * @requires-Lamp to be created
		 */
	}

	public String Next(String s1) {
		if (s1 == "OFF") {
			this.State = "LOW";
			return this.State;
		} else if (s1 == "LOW") {
			this.State = "MEDIUM";
			return this.State;
		} else if (s1 == "MEDIUM") {
			this.State = "HIGH";
			return this.State;
		} else {
			this.State = "OFF";
			return this.State;
		}
	}
	/**
	 * @requires-SwitchState to be created 
	 * @param State
	 */
	void setLamp(String State) {
		switch (State) {
		case ("OFF"):
			this.State = "OFF";
			System.out.println(this.State);
			break;
		case ("LOW"):
			this.State = "LOW";
			System.out.println(this.State);
			break;
		case ("MEDIUM"):
			this.State = "MEDIUM";
			System.out.println(this.State);
			break;
		case ("HIGH"):
			this.State = "HIGH";
			System.out.println(this.State);
			break;
		case ("NEXT"):
			String x = Next(this.State);
			this.State = x;
			System.out.println(this.State);
			break;
		case ("STATE"):
			if (SwitchState(this.State) == 1) {
				System.out.println("Switch is OFF");
			} else {
				System.out.println("Switch is ON");
			}
			break;
		default:
			System.out.println("ERROR");
		}
	}
	/**
	 * 
	 * @return the current state of the lamp
	 */
	public String getState() {
		return this.State;
	}
	
	/**
	 * 
	 * @invariant-Displays help menu
	 */
	
	void Help() {
		String helpMenu = (" OFF: Set the lamp to OFF (default value)\r\n" + " LOW: Set the lamp to LOW\r\n"
				+ " MEDIUM: Set the lamp to MEDIUM\r\n" + " HIGH: Set the lamp to HIGH\r\n"
				+ " STATE: Print the current setting of the lamp\r\n"
				+ " NEXT: Change to the next setting, observing the order OFF ! LOW ! MEDIUM ! HIGH !\r\n" + "OFF\r\n"
				+ " HELP: Show a help menu, explaining how the user should interact with the program\r\n"
				+ " EXIT: Quit the program");
		System.out.println(helpMenu);
	}
	/**
	 * @invariant-Resets lamp to OFF
	 * @requires-Lamp to be created
	 */
	public void reset() {
		State = "OFF";
	}

}

public class ThreeWayLamp {

	public static void main(String[] args) {
		TWLamp22 lamp = setup();
		lamp.Help();
		Scanner s = new Scanner(System.in);
		boolean check = true;
		while (true) {
			System.out.println("Enter command");
			String st = s.nextLine();
			if (!st.equals("EXIT")) {
				lamp.setLamp(st);

			} else {
				check = false;
			}
		}
	}

	public static TWLamp22 setup() {
		return new TWLamp22();
	}

}
