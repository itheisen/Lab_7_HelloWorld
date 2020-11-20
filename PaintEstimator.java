import java.util.Scanner;
import java.lang.Math;

public class PaintEstimator {
	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      double wallHeight;
	      double wallWidth;
	      double wallArea;
	      
	      System.out.println("Enter wall height (feet):");
	      wallHeight = scnr.nextDouble();
	      System.out.println("Enter wall width (feet):");
	      wallWidth = scnr.nextDouble();
	      
	      wallArea = wallHeight * wallWidth;                           
	      System.out.println("Wall area: " + wallArea +  " square feet");
	      
	      double galPaint = wallArea / 350.0;
	      System.out.println("Paint needed: " + galPaint + " gallons");
	      System.out.println("Cans needed: " + Math.round(galPaint) + " can(s)");

	}

}
