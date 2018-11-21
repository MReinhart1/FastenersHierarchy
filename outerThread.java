package Fastener;

import java.io.Serializable;

public abstract class outerThread extends Fastener implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4118562657956383053L;
	private String thread;
	private String material;
	private double length;
	
	//OuterThreaded fasteners constructor
	outerThread(double len, String thred, String mat,  String fin, double uPrice, int uSize) throws IllegalFastener{
		super (fin, uPrice, uSize);
		setThread(thred);
		setMaterial(mat);
		setLength(len);
		checkFinish(fin);
	}//End of outerThread method
	
	//checks the finish of the outerThreaded fasteners to see if they are legal
	public void checkFinish(String finish)throws IllegalFastener {
		if (material == "Brass" || material == "Stainless Steel") {
			if (finish != "Plain")
				throw new IllegalFastener();
		}
		if (material == "Steel") {
			if (finish != "Chrome" && finish != "Yellow Zinc" && finish != "Zinc" && finish != "plain" &&
					finish != "Hot Dipped Galvanized" && finish != "Bright" && finish != "Black Phosphate"
					&& finish != "ACQ 1000 Hour" && finish != "Lubricated")
				throw new IllegalFastener();
		}//End of outer if statement
	}//End of checkFinish method

	//Setter method to set the length of the outer threaded fasteners, makes sure it is a legal input
	public void setLength(double len)throws IllegalFastener {
		if (len >= .5 && len <= 6 && len%.25 == 0.0 || len >= 6 && len <= 11 && len%.5 == 0.0 || len >= 11 && len <= 20 && len%1 == 0.0 )
			length = len;
		else
			throw new IllegalFastener();
	}//End of setLength
	
	//Setter method to set the thread of the outer threaded fasteners, makes sure it is a legal input
	public void setThread(String thread) throws IllegalFastener {
		String diameter = "#8-13 #8-15 #8-32 #10-13 #10-24 #10-32 " + 
				"1/4-20 5/16-18 3/8-16 7/16-14 1/2-13 5/8-11 3/4-10";
		if (diameter.indexOf(thread) != -1)
				this.thread = thread;
		else
			throw new IllegalFastener();
	}//End of set thread method

	//Setter method to set the material of the outer threaded fasteners, makes sure it is a legal input
	public void setMaterial(String mat) throws IllegalFastener{
		if (mat.equals("Brass")|| mat.equals("Stainless Steel") || mat.equals("Steel"))
			material = mat;
		else
			throw new IllegalFastener();
	}//End of setMaterial class

	//toString for the OuterThreaded class that adds in the thread, material and length 
	public String toString() {
	String out =  thread + " thread " + material + " material " + length + " length "+ super.toString();
	return out;
	}//End of the toString

}//End of class
