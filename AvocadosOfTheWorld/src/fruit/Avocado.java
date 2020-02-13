/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */
package fruit;
/***
 * Model an Avocado at Meijer in the Produce Department
 * @author nicomp
 *
 */
public class Avocado extends Fruit 
{
//copy constructor, which takes as a parameter an object of the same type
	public Avocado(Avocado avocado) {
		super(avocado.getWeight(), avocado.getCost());
		//copy the properties from parameter to object.
		// in this case there aint no avocado properties.
	}
	
	public Avocado(int weight, float cost) {
		//super means the base class.
		super(weight, cost); //pass weight and class to base class constructor.
	}
	

}
