package FileClass;

import java.io.File;

public class ListFilesExample {
	
	public static void main(String[] args) {
		File directory = new File("E:\\sts-4.24.0.RELEASE\\javaproject");
		
		if(directory.isDirectory()) {
			
			String[] content = directory.list();
			
			if(content !=null && content.length > 0 ) {
				System.out.println("File and directories in specified directory is");
				for(String name : content) {
					System.out.println(name);	
				}
			}
			 else 
			 {
	                System.out.println("The directory is empty or an error occurred.");
	         }
		}
		else {
            System.out.println("The specified path is not a directory.");
        }
	}

}
