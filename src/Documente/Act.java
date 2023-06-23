package Documente;

public class Act {
	
	private static int ID;
	private int numarIdentificare = 0;
	
	public Act(int ID) {
		this.ID = ID;
		numarIdentificare+=1 ;
	}

	public static int getID() {
		return ID;
	}
	
}
