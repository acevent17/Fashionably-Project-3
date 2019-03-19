/*
 * Info: Current Version: 1.2.0-35
 * 
 * Created separate classes to clean up code and better organize / distribute work amongst group members.
 * Make note of the package names and imports.
 * Please add changes, issues, and resolved issues in comments per class.
 * 
 * Importing a package syntax:
 * package <package name>;
 * 
 * Importing a class to class:
 * import <package name>.<class>;
 */

/*
 * Class dedicated to be Main Functionality of the Search Engine
 * 
 * 
 * Changes are displayed below:
 * --Created class specifically for Main functionality
 * 
 * 
 * Current Issues are displayed below:
 * --When Search Engine Initializes, files need to be checked and compared to last modified date of file
 * --ID for added file paths need to be added
 * 
 * 
 * 
 * 
 * Resolved Issues:
 * --Table imports file path into data field
 * --Table saves last import path when closing
 */

package fashionably.main;

// Importing classes from framework package
import fashionably.framework.SearchItFramework;

public class FashionablySearchIt {
	public static void main(String args[]) {

		// Handles Framework of Maintenance Page
		SearchItFramework.createSearchEngine();

		// Creates Index File if not found
		CreateIndexFile create = new CreateIndexFile();
		create.openIndexFile();

		// Reads from Index File
		ReadFile read = new ReadFile();
		read.openFile();
		read.readFile();
		read.closeFile();

		/*
		 * -This hook will be used in the future to store the last, most updated
		 * table information into persistent storage. -right now it only uses
		 * the printed message to show capability
		 */
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				System.out
						.println("Shut Down Hook Test Message! - at this moment the indexed file should be saved!");
			}
		});

	}
}
