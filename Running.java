import java.util.Scanner;

public class Running {
	
	public static void main(String args[]) {		
		Munkres Mk = new Munkres();
		System.out.println("Enter the number of rows");
		Scanner in = new Scanner(System.in);
		Mk.nrow = in.nextInt(); System.out.println("rows = " + Mk.nrow);
		System.out.println("Enter the number of columns");
		Mk.ncol = in.nextInt(); System.out.println("cols = " + Mk.ncol);
		Mk.C = new int[Mk.nrow][Mk.ncol];
		Mk.path_row_0 = 0; Mk.path_col_0=0; Mk.path_count= Mk.nrow;
		Mk.M = new int[Mk.nrow][Mk.ncol];
		Mk.path = new int[Mk.path_count][Mk.path_count];
		Mk.RowCover = new int[Mk.nrow];
		Mk.ColCover = new int[Mk.ncol];
		Mk.ReadInCostMatrix();		
		Mk.ShowCostMatrix();
		try {
		    Thread.sleep(5000);
		} catch (InterruptedException ie) {
		    Thread.currentThread().interrupt();
		}
		Mk.MunkresAlgo();
		System.out.println("Cost Matrix after computation");
		Mk.ShowCostMatrix();
		Mk.ShowMaskMatrix();
	}

}
