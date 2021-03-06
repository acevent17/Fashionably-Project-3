/*
 * Class dedicated to About Frame Functionality of the Search Engine
 * 
 * 
 * Changes are displayed below:
 * --N/A
 * 
 * 
 * Current Issues are displayed below:
 * --N/A
 * 
 * 
 * Resolved Issues:
 * --TBA
 * 
 */

/*
 * Imports used in relation to class name and functionality respectively
 */
package fashionably.main;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SearchItAbout {

	public static void createSubAbout() {
		// Frame
		JFrame aboutSubFrame = new JFrame();

		// Label
		JLabel headerLabel = new JLabel("Fashionably Late");
		JLabel versionLabel = new JLabel("Version 1.2.0");
		JLabel byLabel = new JLabel("By:");
		JLabel pqLabel = new JLabel("Peter Quach");
		JLabel mtLabel = new JLabel("Michael Tarallo");
		JLabel jvLabel = new JLabel("Joshua Ventura");
		JLabel acLabel = new JLabel("Andres Cardenas");
		JLabel classLabel = new JLabel("Mr. Pollock Java II COP-2805C");

		// Sub About Frame
		aboutSubFrame.setVisible(true);
		aboutSubFrame.setSize(400, 250);
		aboutSubFrame.setTitle("About Page");
		aboutSubFrame.setLocationRelativeTo(null);

		// Labels
		headerLabel.setBounds(20, 5, 450, 50);
		headerLabel.setFont(new Font("Serif", Font.BOLD, 20));

		versionLabel.setBounds(300, 165, 450, 50);
		versionLabel.setFont(new Font("Serif", Font.PLAIN, 15));

		byLabel.setBounds(20, 35, 450, 50);
		byLabel.setFont(new Font("Serif", Font.BOLD, 16));

		pqLabel.setBounds(20, 55, 450, 50);
		pqLabel.setFont(new Font("Serif", Font.PLAIN, 16));

		mtLabel.setBounds(20, 75, 450, 50);
		mtLabel.setFont(new Font("Serif", Font.PLAIN, 16));

		jvLabel.setBounds(20, 95, 450, 50);
		jvLabel.setFont(new Font("Serif", Font.PLAIN, 16));

		acLabel.setBounds(20, 115, 450, 50);
		acLabel.setFont(new Font("Serif", Font.PLAIN, 16));

		classLabel.setBounds(20, 145, 450, 50);
		classLabel.setFont(new Font("Serif", Font.PLAIN, 12));

		// Elements added to About frame
		aboutSubFrame.add(headerLabel);
		aboutSubFrame.add(byLabel);
		aboutSubFrame.add(pqLabel);
		aboutSubFrame.add(mtLabel);
		aboutSubFrame.add(jvLabel);
		aboutSubFrame.add(acLabel);
		aboutSubFrame.add(classLabel);
		aboutSubFrame.add(versionLabel);

		// Centers About Frame
		aboutSubFrame.setLayout(null);
	}
}
