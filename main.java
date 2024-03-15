// This class implements a console UI

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		scheduler s = new scheduler();
		Scanner sc = new Scanner(System.in);
		
		int selection = 0;
		do {
			System.out.println("\nSelect an option:");
			System.out.println("1 - Add a person.");
			System.out.println("2 - Add a meeting.");
			System.out.println("3 - Show the schedule of a person.");
			System.out.println("4 - Suggest time for a meeting.");
			System.out.println("5 - Exit.");
			selection = sc.nextInt();
			sc.nextLine();
			switch (selection) {
			case 1:
				System.out.println("Insert the name of the person.");
				String name = sc.next();
				sc.nextLine();
				System.out.println("Insert the email of the person.");
				String email = sc.next();
				sc.nextLine();
				s.addPerson(name, email);
				break;
			case 2:
				System.out.println("Insert the start time of the meeting. (int between 0 and 100)");
				int start = sc.nextInt();
				sc.nextLine();
				System.out.println("Insert one name or multiple names seperated by spaces.");
				String members[] = sc.nextLine().split(" ",0);
				s.addMeeting(start, members);
				break;
			case 3:
				System.out.println("Insert the name of ONE person to show the schedule for.");
				String name2 = sc.next();
				sc.nextLine();
				s.showSchedule(name2);
				break;
			case 4:
				System.out.println("Insert one name or multiple names seperated by spaces.");
				String members2[] = sc.nextLine().split(" ",0);
				s.suggestTime(members2);
				break;
			default:
				break;
			}

		}
		while (selection != 5);
		sc.close();
		System.out.println("Program ended.");
	}
}
