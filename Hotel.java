package SquareRoot;

import java.util.*;

public class Hotel {
	public static void main(String args[]) {
		System.out.println("Welcome to the Hotel booking system of the U Parkhotel\r\n");
		Scanner s = new Scanner(System.in);
		String decision = "Not X :) ";
		boolean room = false;
		String guestName = "";
		String name = "";
		while (!decision.equals("x")) {
			System.out.println("Enter operation : ");
			String st = s.nextLine();
			String[] decisionAndName = st.split(" ");
			decision = decisionAndName[0];

			if (decision.equals("i")) {
				if (decisionAndName.length > 1) {
					if (room == false) {
						name = decisionAndName[1];
						System.out.println("Welcome " + name);
						guestName = name;
						room = true;
					} else {
						System.out.println("Room is reserved");
					}
				}
			}

			if (decision.equals("o")) {
				if (decisionAndName.length > 1) {
					if (room == true) {
						name = decisionAndName[1];
					} else {
						System.out.println("Room is already empty");
					}
					if (name.equals(guestName)) {
						System.out.println("Goodbye " + name);
						room = false;
					} else {
						System.out.println("No such guest checked in");
					}
				}
			}

			if (decision.equals("r")) {
				if (room == false) {
					System.out.println("Nobody owns this room");
				} else {
					System.out.println(guestName + " owns this room 101");
				}
			}

			if (decision.equals("h")) {

				System.out.println("Commands : ");
				System.out.println("i name ............... check in guest with name");
				System.out.println("o name ............... check out guest with name");
				System.out.println("r name ............... request room of guest");
				System.out.println("h .................... help (this menu)");
				System.out.println("p .................... print state");
				System.out.println("x .................... exit");
			}

			if (decision.equals("p")) {
				if (room == false) {
					System.out.println("Welcome to the Hotel booking system of the U Parkhotel\r\n");
					System.out.println("Hotel is empty");
				} else {
					System.out.println("Welcome to the Hotel booking system of the U Parkhotel\r\n");
					System.out.println(guestName + " owns this room 101");
				}
			}

		}
	}
}
