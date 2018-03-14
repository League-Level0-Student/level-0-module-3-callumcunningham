package loops;

import javax.swing.JOptionPane;

public class Pi_DAY {
		public static void main(String[] args) {
			
			String pi = "3.14159265358979323";
			
			for(int j =0;j<4;j++) {
				
				  System.out.print(pi.charAt(j));
				
			}
			String cool = JOptionPane.showInputDialog("What is the next digit of Pi?");
			
			String awsome = Character.toString(pi.charAt(4));
			
			if (cool.equals(awsome));
			
			
	}
  }

