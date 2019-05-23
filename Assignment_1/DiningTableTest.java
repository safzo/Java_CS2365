//Grant Hall and Safwan Hasan(me)
//R11547156(my R number)
//G18
//Q0

import java.util.Scanner;
import javax.swing.JOptionPane;
public class DiningTableTest {
	static public void test(){
		JOptionPane pane = new JOptionPane();
	    Scanner sc = new Scanner(System.in);
	    DiningTable table = new DiningTable();
	    String str = new String();
	    table.DiningTable();
	    String[] menuList = {"1. Display","2. Cost","3. Perimeter","4. Area","5. Exit"};
	    boolean exit = true;
		do {
			int iChoice = JOptionPane.showOptionDialog(null, "Question 1, Group 18, Grant Hall and Safwan Hasan",
	                "Click a button",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuList, menuList[0]);
			switch(iChoice) {
			case 0:
				float fWeight = table.getWeight();
		        float fLength = table.getLength();
		        float fWidth = table.getWidth();
		        str = "Weight:"+fWeight+"\nLength:"+fLength+"\nWidth: "+ fWidth;
		        pane.showMessageDialog(null, str);
				break;
			case 1:
				float fCost = table.getCost();
		        str = "Cost of table: "+fCost+"\n";
		        pane.showMessageDialog(null, str);
				break;
			case 2:
				float fPerimeter = table.calcPerimeter();
				str = "Perimeter of table: "+fPerimeter+"\n";
		        pane.showMessageDialog(null, str);
				break;
			case 3:
				float fArea = table.calcArea();
				str = "Area of table: "+fArea+"\n";
		        pane.showMessageDialog(null, str);
				break;
			case 4:
				exit = false;
				break;
			default:
				pane.showMessageDialog(null, "Error, invalid menu input");
				break;
			}
			
			
		} while (exit);
	}

}