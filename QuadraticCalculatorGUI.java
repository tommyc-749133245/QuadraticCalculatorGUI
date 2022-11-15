// Get the JOptionPane class
import javax.swing.JOptionPane;
public class QuadraticCalculatorGUI 
{

	public static void main(String[] args) 
	{
		//ask user to input value of a
		 String valueAStr = JOptionPane.showInputDialog("Please enter the value of a: ");
		 
		// Obtain String valueAstr from input dialog and convert into double ValueA
		 double ValueA = Double.parseDouble(valueAStr);

		//ask user to input value of b
		 String valueBStr = JOptionPane.showInputDialog("Please enter the value of b: ");
		 
		// Obtain String valueBstr from input dialog and convert into double ValueB
		 double ValueB = Double.parseDouble(valueBStr);
		 
		//ask user to input value of c
		 String valueCStr = JOptionPane.showInputDialog("Please enter the value of c: ");
		 
		// Obtain String valueCstr from input dialog and convert into double Value C
		 double ValueC = Double.parseDouble(valueCStr);
		 
			double temp =Math.sqrt(ValueB * ValueB - 4 * ValueA * ValueC);
			
			//calculate the root1
			double root1 = (- ValueB + temp ) / ( 2 * ValueA );
			
			//calculate the root 2
			double root2 = (- ValueB - temp ) / ( 2 * ValueA );
			
			//checking if there are roots or not
			if(temp>0)
			{
				
				 String strTwoRoot = "The two solutions are: " + "\n"
				 
				//display the result of root1
				 + " x1 = "+ root1 + "\n"
				 
				 //display the result of root2
				 + " x2 = " + root2;
				 
				 JOptionPane.showMessageDialog(null, strTwoRoot);
			}
			
			//In cases of one root
			else if(temp==0)
			{
				 String strOneRoot = "The equation has one root: " +( - ValueB / 2 * ValueA );
				 
				//display the result
				 JOptionPane.showMessageDialog(null, strOneRoot);
			}
			
			//In case of no real root
			else
			{
				 String strNoRoot = "The equation has no real root";
				 
				//display the result
				 JOptionPane.showMessageDialog(null, strNoRoot);

			}
	}

}
