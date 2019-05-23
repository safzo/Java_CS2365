//Grant Hall and Safwan Hasan(me)
//R11547156(my R number)
//G18
//Q3

import java.util.Random;
import javax.swing.JOptionPane;
class menu {
	int  arr[] = new int[10];
	void makeArray() {
		Random rand = new Random();
		int i = 1;
		do  {
			//calls a random in between 1 - 50
			int randnum = rand.nextInt(50)+1;
			//multiplies by i+1 to make value divisible by arr index+1
			arr[i-1] = randnum*(i+1);
			i++;
		}	while(i<=10);
	}
	void displayString() {
		JOptionPane pane = new JOptionPane();
		int i=0;
		String str = new String();
		do {
			str += arr[i] + " ";
			i++;
		}while (i<10);
		pane.showMessageDialog(null, str);
	}
	void displayStringEvenOdd() {
		JOptionPane pane = new JOptionPane();
		int i = 0;
		int[] arrTemp = new int[10];
		for (i=0;i<10;i++) {
			arrTemp[i] = arr[i];
		}
		i=0;
		String strEven = new String();
		String strOdd = new String();
		do {
			if (arrTemp[i]%2 == 0) {
				//arr[i] is even
				strEven += arrTemp[i] + " ";
			}
			else {
				//arr[i] is odd
				strOdd += arrTemp[i] + " ";
			}
			i++;
		} while (i<10);
		//add even then odd
		strEven += strOdd;
		pane.showMessageDialog(null, strEven);
	}
	//http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
	public static int[] doInsertionSort(int[] input){
        
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
	void secondLargestLast() {
		//in order to get the second largest number to the second to last position I sorted the whole array and swapped the last two
		JOptionPane pane = new JOptionPane();
		String str = new String();
		//sort list
		int temp;
		int i=0;
		int [] arrTemp = new int[10];
		for (i=0;i<10;i++) {
			arrTemp[i] = arr[i];
		}
		i=0;
		arrTemp = doInsertionSort(arrTemp);
		//swap second to last with last
		temp = arrTemp[9];
		arrTemp [9] = arrTemp[8];
		arrTemp[8] = temp;
		do {
			str += arrTemp[i] + " ";
			i++;
		}while (i<10);
		pane.showMessageDialog(null, str);
	}
	void run() {
		String[] menuList = {"Generate Array","Display as string","Sort evens first","Put second largest last","Exit"};
		JOptionPane pane = new JOptionPane();
		boolean exit = true;
		do {
			int iChoice = JOptionPane.showOptionDialog(null, "Question 3, Group 18, Grant Hall and Safwan Hasan",
	                "Click a button",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuList, menuList[0]);
			switch(iChoice) {
			case 0:
				makeArray();
				break;
			case 1:
				displayString();
				break;
			case 2:
				displayStringEvenOdd();
				break;
			case 3:
				secondLargestLast();
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