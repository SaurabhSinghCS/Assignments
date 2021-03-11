package virtualKey;

public class DisplayClass {
	public static void welcomeMessage(String a) {
		System.out.println("Welcome to LockedMe.com \nDeveloped by "+a+" \nPress \"S\" to continue");
	}
	
	public static void MainOptions() {
		String string = "Press \"1\" , \"2\" or \"3\" for\n"
				+ "1 to Display File name \n2 to Display Other Options\n"
				+ "3 to Exit";
		
		System.out.println(string);
	}
	
	public static void OtherOptions() {
		String string = "Press \"1\" , \"2\", \"3\" or \"4\" for\n"
				+ "1 to Add a File \n2 to Delete a File\n"
				+ "3 to Search a File \n4 to Go to Main Menu";
		
		System.out.println(string);
	}
	
	public static void PrintFiles(String[] string) {
		if(string == null) {
			System.out.println("No File is present in Main Directory");
		}
		else {
			System.out.println("Files in Main Directory are:-");
			for(String s : string) {
				System.out.println(s);
			}
		}
		
	}
	
	

}
