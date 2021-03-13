package virtualKey;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
		return file.mkdirs();
	}
	public static void DisplayFiles(){
		File file = new File("Main");
		String string[] = file.list();
		if(string != null)
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
//		Path path = new path("Main");
		Path path = Paths.get("./Main/"+fileName);
		File file = new File("./Main/"+fileName);
		if(!file.exists()) {
			try {
				Files.createDirectories(path.getParent());
				Files.createFile(path);
				if(file.exists()) {
					System.out.println(fileName+" File Successfully Created");
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage()+"   "+e.getCause());
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
			System.out.println(fileName+" File not found in Main Directory");
		}
	}

}
