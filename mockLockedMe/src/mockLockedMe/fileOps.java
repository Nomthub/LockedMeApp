package mockLockedMe;
import java.util.*;
import java.io.File;
import java.io.IOException;

public class fileOps {
	static void addFolder(String nme) throws IOException {		//Function to add a directory
		File fileObj = new File("C:\\LockedMeWorkspace\\" + nme);
		
		//if(kind.equals("Folder")) {
			if(fileObj.exists())
				System.out.println("Folder already exists");
			else
			{
				fileObj.mkdir();
				System.out.println("Folder Created");
			}
	}
		
	static void addFile(String nme) throws IOException {		//Function to add a file
		//else if(kind.equals("File")) {
			File fileObj = new File("C:\\LockedMeWorkspace\\" + nme);
			if(fileObj.exists()) {
				System.out.println("File already existed");
			}
			else
			{
				fileObj.createNewFile();
				System.out.println("File Created");
			}
	}
	
	static String delFile(String nme) {			//Function to delete file or folder
		File fileObj = new File("C:\\LockedMeWorkspace\\" + nme);
		
		if(fileObj.exists())
		{
			fileObj.delete();
			System.out.println("File is Deleted");
			return "File is Deleted";
		}
		else
		{
			System.out.println("File not Found");
			return "File not Found";
		}
	}
	
	static String searchFile(String nme) {			//Function to search for a file or folder
		File fileObj = new File("C:\\LockedMeWorkspace\\" + nme);
		
		if(fileObj.exists()) {
			System.out.println("File is here: " + nme);
			return "Folder exist";
		}
		else
		{
			System.out.println("File not Found");
			return "File not Found";
		}
	}
	
	static void viewFile() {		//Function to view files and folders in ascending order
		File fileObj = new File("C:\\LockedMeWorkspace");
		String filenames[] = fileObj.list();
		
		for(String fname :filenames)
		{
			//System.out.println(fname);
			/*File temp = new File("C:\\LockedMeWorkspace\\" + fname);
			
			if(temp.isFile()) {
				//String finames[] = temp.list();
				System.out.println("Files in Workspace\n" + temp);
			}
			if(temp.isDirectory()) {
				//String folnames[] = temp.list();
				System.out.println("Folders in Workspace\n" + temp);
			}*/
		
		System.out.println(fname);
		}
		System.out.print("\n");
		if (filenames.length == 0) {
			System.out.println("Workspace is empty\n");
		}
	}
	
}
