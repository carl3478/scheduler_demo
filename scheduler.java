// This class represents the scheduler that performs the different actions

import java.util.HashMap;
import java.util.HashSet;

public class scheduler {
	
	HashMap<String,person> persons = new HashMap<String,person>();
	HashSet<String> takenEmails = new HashSet<String>();

	public scheduler() {
		
	}
	
	public void addPerson(String name, String email) {
		if (persons.containsKey(name)) {
			System.out.println("A person with this name already exists.");
		} else if (takenEmails.contains(email)) {
			System.out.println("The email " + email + " is taken.");
		} else {
			person p = new person(name, email);
			persons.put(name,p);
			takenEmails.add(email);
			System.out.println(name + " has been added.");
		}

	}
	
	public void addMeeting(int start, String[] names) {
		boolean flag = false;
		for (int i = 0; i < names.length; i++) {
			if (!persons.containsKey(names[i])) {
				System.out.println(names[i] + " doesn't exist.");
				flag = true;
			} else if (persons.get(names[i]).isBusy(start)) {
				System.out.println(names[i] + " is busy at " + start);
				flag = true;
			}
		}
		if (!flag) {
			meeting m = new meeting(start); // ONE meeting object is created and added to all the relevant persons
			for (int i = 0; i < names.length; i++) {
				persons.get(names[i]).getMeetings().add(m);
			}
			System.out.println("The meeting has been created.");
		}
	}
	
	public void showSchedule(String name) {
		if (!persons.containsKey(name)) {
			System.out.println(name + " doesn't exist");
		} else {
			boolean flag = false;
			for (meeting m : persons.get(name).getMeetings()) {
			    System.out.println(name + " has a meeting starting at " + m.getTime());
			    flag = true;
			}
			if (!flag) {
				System.out.println(name + " has no meetings");
			}
		}
	}
	
	public void suggestTime(String[] names) {
		boolean flag = false;
		for (int i = 0; i < names.length; i++) {
			if (!persons.containsKey(names[i])) {
				System.out.println(names[i] + " doesn't exist");
				flag = true;
			}
		}
		if (!flag) {
			boolean timeslots[] = new boolean[100];
			for (int i = 0; i < names.length; i++) { // These two nested for loops go through every meeting for every person, to find an open timeslot
				for (meeting m : persons.get(names[i]).getMeetings()) {
					timeslots[m.getTime()] = true;
				}
			}
			for (int i = 1; i < 100; i++) {
				if (!timeslots[i]) {
					System.out.println("They are all free at " + i);
					return;
				}
			}
		}
	}
}
