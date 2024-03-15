// This class represents a meeting

public class meeting {
	
	private int start;
	// I didn't add the person objects as attributes here since they weren't needed for any functionality
	
	public meeting(int s) {
		start = s;
	}
	
	public int getTime() {
		return start;
	}
}