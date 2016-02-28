// Stacy Auger, Michael Benson
// Section 10
// Lab 9

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab9 extends JApplet implements ActionListener {

    // property variables
    private JLabel msg = new JLabel("Enter an accuracy");
    private JTextField input = new JTextField(10);
    private JLabel result = new JLabel("Result");
    private JLabel answer = new JLabel(""+Math.E);

    public void init() {

	Container window = getContentPane();
	window.setLayout(new GridLayout(2,2));

	// set up the screen
	window.add(msg);
	window.add(input);
	window.add(result);
	window.add(answer);

	// attach the Listener
	input.addActionListener(this);

        } // end of init method

    public void actionPerformed (ActionEvent event) {

	double accuracy = Double.parseDouble(input.getText());
	double denom = 1;
	double oldValue = 0.0;
	double newValue = 1.0;
	double counter = 0;

	while (Math.abs(oldValue-newValue) >= accuracy) {
	    oldValue = newValue;
	    counter++;
	    denom= denom*counter;	
	    newValue = oldValue + 1/denom;
	    } // end of while loop

	result.setText(newValue + "");
	
	} // end of actionperformed method
    
    } // end of lab9 class

