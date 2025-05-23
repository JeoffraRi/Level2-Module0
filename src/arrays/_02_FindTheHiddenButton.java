/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] buttons;
	
	//2 create an int variable called hiddenButton
	int hiddenButton = 0;
	int coolRandom = 0;
	
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String inputPos = JOptionPane.showInputDialog("Enter any positive number (UP TO 375! entering anything \nbigger is at your own risk :O)");	
		int oneCoolNumba = 0;
		oneCoolNumba = Integer.parseInt(inputPos);
	
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		buttons = new JButton [oneCoolNumba];
		//5. Make a for loop to iterate through the JButton array
		for(int i = 0; i<oneCoolNumba; i++) {
			//6. initialize each JButton in the array
			 buttons[i]=new JButton();
			//7. add the ActionListener to each JButton
			 buttons[i].addActionListener(this);
			 buttons[i].setText(String.valueOf(i));
			//8. add each JButton to the panel
			 panel.add(buttons[i]);
	
		
		}
		//9 add the panel to the window
		window.add(panel);
		
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
	    window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "Try to find the hidden button!");
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		Random random = new Random();
		coolRandom = random.nextInt(oneCoolNumba);
		//14. Set the text of the JButton located at hiddenButton to  "ME"
		//buttons[coolRandom].setText("ME!!!!");
		//15. Use Thread.sleep(1000); to pause the program.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//    Surround it with a try/catch - use Eclipse helper for this
		
		//16. Set the text of the JButton located at hiddenButton to be blank.
		//buttons[coolRandom].setText(String);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		System.out.println(buttonClicked.getText());
		String stringButton = (buttonClicked.getText());
		int intButton = 0;
		intButton = Integer.parseInt(stringButton);
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(intButton == coolRandom) {
			JOptionPane.showMessageDialog(null, "YOU WIN!!!! :D");
		}
		
		//18. else tell them to try again
	}
}
