// This class represents a person

import java.util.ArrayList;
import java.util.List;

public class person {
	
	private String name;
	private String email;
	private ArrayList<meeting> meetings = new ArrayList<meeting>(); // These are the meetings that the person has
	
	public person(String n, String e) {
		name = n;
		email = e;
	}
	
	public List<meeting> getMeetings () {
		return meetings;
	}
	
	public boolean isBusy(int time) {
		for (meeting m : meetings) {
			if (m.getTime() == time) {
				return true;
			}
		}
		return false;
	}
}
