package Fastener;
import java.io.Serializable;

public abstract class Fastener implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2939030876740844182L;
	private String finish;
	private double unitPrice;
	private int unitSize;

//Constructor for all types of fasteners
 Fastener(String fin, double uPrice, int uSize) throws IllegalFastener{
	setFinish(fin);
	setPrice(uPrice);
	setUnitSize(uSize);
}//End of fastener method

//Setter method for the finish of the fastener, checks that the inputs are correct for any fastener 
public void setFinish(String fin) throws IllegalFastener{
	if (fin.equals("Chrome") || fin.equals("Hot Dipped Galvanized") || fin.equals("Plain") ||
			fin.equals("Yellow Zinc") || fin.equals("Zinc") || fin.equals("Bright") ||
			fin.equals("Black Phosphate") || fin.equals("ACQ 1000 Hour") ||
			fin.equals("Lubricated"))
		finish = fin;
	else 
		throw new IllegalFastener();
}//End of setFinish method

//Setter method for the unitSize of the order, checks that the inputs are correct 
public void setUnitSize(int size) throws IllegalFastener {
	if (size > 0 && size < 5) 
		unitSize = size;
	else if (size >= 5 && size%5 == 0 && size<=10000)
		unitSize = size;
	else
		throw new IllegalFastener();	
}//End of the setUnitSize method

//Setter method for the price of the fastener, checks that the inputs are correct 
public void setPrice(double price) throws IllegalFastener {
	if (price > 0)
		unitPrice = price;
	else
		throw new IllegalFastener();
}//End of setPrice method

//Gets the price of the order 
	public double getOrderCost(int size) {
		return unitPrice*size;		
	}//End of getOrderPrice method

//toString for the fastener includes the finish, unit price, unit size and overll cost
public String toString() {
	String out =  " with a " + finish + " finish "+ unitSize + " in a unit, $" + unitPrice
			+ " per unit. $" +  getOrderCost(unitSize) + " cost for all.";
	return out;
}//End of toString

}//End of class

