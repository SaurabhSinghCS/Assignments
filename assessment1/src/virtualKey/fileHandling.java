package virtualKey;

import java.io.*;
import java.util.*;



public class fileHandling {
	
	public static boolean isFileExist() {
		File file = new File("Main");
			if(file.exists()) {
				return true;
			}
			return false;
	}
	public static boolean createFolder() {
		File file = new File("Main");
		return file.mkdir();
	}
	public static void DisplayFiles(){
		File file = new File("Main");
		String string[] = file.list();
		Arrays.sort(string);
		DisplayClass.PrintFiles(string);
	}
	public static void DeleteAFile(String fileName) {
		File file = new File("Main/"+fileName);
		if(file.exists()) {
			if(file.delete()) {
				System.out.println(fileName+" File Successfully Deleted");
			}
		}
		else {
			System.out.println(fileName+" File does not Exist");
		}
	}
	
	public static void AddFile(String fileName) {
		File file = new File("Main/"+fileName);
		if(!file.exists()) {
			try {
				if(file.createNewFile()) {
					System.out.println(fileName+" File Successfully Created");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println(fileName+" File Already Exist");
		}
	}
	public static void SearchAFile(String fileName) {
		File file = new File("Main/"+fileName);
		if(file.exists()) {
			System.out.println(fileName+" File found in Main Directory");
		}
		else {
			System.out.println(fileName+" File found in Main Directory");
		}
	}

}
