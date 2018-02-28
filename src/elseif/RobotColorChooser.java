//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		
		Robot rob = new Robot();
		
		rob.hide();
		
		rob.setSpeed(100);
		
		//3. Ask the user what color they would like the robot to draw
		
		String pear = JOptionPane.showInputDialog("Pick a color\n"
				+ "Red, Blue, or Green");
		
		//5. Use an if/else statement to set the pen color that the user requested
		
		if( pear.equalsIgnoreCase("green")) {
			
			rob.setPenColor(0,255,0);
		}
		
		else if( pear.equalsIgnoreCase("red")) {
			
			rob.setPenColor(255,0,0);
		}
		
		else if( pear.equalsIgnoreCase("blue")) {
			
			rob.setPenColor(0,0,255);
		}
		
		else
			
			rob.setRandomPenColor();
			
			

        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		
		for(int i  =  0;i < 5; i++) {
		
		rob.penDown();
		
		rob.turn(144);
		
		rob.move(50);


	}
}
}