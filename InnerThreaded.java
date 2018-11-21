package Fastener;
import java.io.Serializable;

public abstract class InnerThreaded extends Fastener implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1526024734043698104L;
	private String material;
	private String thread;

	//Constructor for all inner threaded fasteners
	InnerThreaded (String threads, String mat, String fin, double uPrice, int uSize) throws IllegalFastener{
	    super(fin, uPrice, uSize);
		setMaterial(mat);
		setThread(threads);
		checkFinish(fin);
	}//End of constructor 

	//checks the finish for all inner threaded fasteners based on the material
	public void checkFinish(String finish)throws IllegalFastener {
		if (material.equals("Brass") || material.equals("Stainless Steel") && finish != "Plain") 
				throw new IllegalFastener();
		if (material == "Steel") {
			if (finish != "Chrome" && finish != "Yellow Zinc" && finish != "Zinc" && finish != "Plain" &&
					finish != "Hot Dipped Galvanised" && finish != "Bright")
				throw new IllegalFastener();
		}//End of outer if statement
	}//End of checkFinish method

	//Setter method for the material of the inner threaded fasteners,
	//checks that the inputs are correct 
	public void setMaterial(String mat) throws IllegalFastener{
		if (mat.equals("Brass")|| mat.equals("Stainless Steel") || mat.equals("Steel"))
			material = mat;
		else
			throw new IllegalFastener();
	}//End of setMaterial class

	//Setter method for the thread of the inner threaded fasteners, checks that the inputs are correct 
	public void setThread(String thread) throws IllegalFastener {
		String diameter = "#8-13 #8-15 #8-32 #10-13 #10-24 #10-32 " + 
				"1/4-20 5/16-18 3/8-16 7/16-14 1/2-13 5/8-11 3/4-10";
		if (diameter.indexOf(thread) != -1)
				this.thread = thread;
		else
			throw new IllegalFastener();
	}//End of set thread method

//toString to add in the thread and material of the inner threaded fasteners
	public String toString() {
		String out = thread + " thread size " + material + " material " + super.toString();
		return out;	
	}//End of toString
}//End of the InnerThreaded method
