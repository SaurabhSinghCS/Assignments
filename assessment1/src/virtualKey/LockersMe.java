package virtualKey;

import java.util.IllegalFormatConversionException;
import java.util.Scanner;


public class LockersMe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DisplayClass.welcomeMessage("Saurabh Singh");
		String fir = sc.next();
		if(fir.charAt(0) == 'S' || fir.charAt(0) == 's') {
		if(fileHandling.isFileExist()) {
			if (fileHandling.createFolder()) {
				System.out.println();
			}
		}
		System.out.println("You Are currently working one Main directory for all operations");
		System.out.println("Please Make sure you enter \"correct name of file or options\". \nSome options are");
		boolean flag = true,flag2 = false;
		while(flag) {
			DisplayClass.MainOptions();
			try {
				System.out.print("Enter option number:- ");
				String s = sc.next();
				int case1 = Integer.parseInt(s);
				switch(case1){
				case 1: fileHandling.DisplayFiles();
				break;
				case 2: flag2 = true;
				break;
				case 3: flag = false;
				break;
				default: System.out.println("Please Enter the Valid Number");
				break;
				}
				
				System.out.println("\n");
				
				while(flag2) {
					DisplayClass.OtherOptions();
					try {
						System.out.print("Enter option number:- ");
						String s1 = sc.next();
						int case2 = Integer.parseInt(s1);
						switch(case2) {
						case 1: System.out.println("Enter File name without space");
							String fileName = sc.next();
							fileHandling.AddFile(fileName);
							break;
						case 2: System.out.println("Enter File name without space");
							String fileName1 = sc.next();
							fileHandling.DeleteAFile(fileName1);
							break;
						case 3: System.out.println("Enter File name without space");
							String fileName2 = sc.next();
							fileHandling.SearchAFile(fileName2);
							break;
						case 4: flag2 = false;
							break;
						default: System.out.println("Please Enter the valid number");
						}
						System.out.println("\n");
					} catch (IllegalFormatConversionException e) {
						System.out.println("Please Make Sure you Enter Number for Options");
					}
				}
				
				
				
			} catch (IllegalFormatConversionException e) {
				System.out.println("Please Make Sure you Enter Number for Options");
			}
			
		}
		System.out.println("Thanks for Using LockedMe.com");
		
		}
		sc.close();

	}

}
