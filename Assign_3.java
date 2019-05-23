import java.lang.Math;

public class Roots {
	
	public static void main(String[]args) { //main method
	
	//2D array
	double [][] root = {{1,2,3}, {4,-4,1}, {1,-5,6}, {0,10,11}};
	
	finding_roots(root);
	
	}
	
	public static void finding_roots(double [][] root) {
		double a,b,c,r1,r2;
		for (int i = 0; i < 4; i++) { 
			
			a = root[i][0];
			b = root[i][1];
			c = root[i][2];
			
			System.out.println("a = " + a + " b = " + b + " c = " + c);
			
		
			//calculating discriminant
			double d = (b * b) - (4 * a * c);
		
			//calculate roots
			r1 = (double)((- b + Math.sqrt(d))/(2*a));
			r2 = (double)((- b - Math.sqrt(d))/(2*a));
		
			//checking if d is positive
			if (a==0) {
				System.out.println("Divide by zero error in calculation of roots!" + "\n");
			}
			else if(d<0) {
				System.out.println("The system has no real roots for the values: a = " + a + ", b = " + b + ", c = " + c + " because discriminant is less than 0\n");
			}
			else if(d==0) {
				System.out.println("There is only one root in the system and that is " + r1 + ", because discriminant is equal to 0\n");
			}
			else {
				System.out.println("The roots are: " + r1 + " and " + r2 + "\n");
			}
		}
	}
}
