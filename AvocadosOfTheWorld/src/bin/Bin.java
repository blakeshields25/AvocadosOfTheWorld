package bin;

import java.util.ArrayList;

import fruit.Avocado;

/***
 * the thing at meijer that holds produce for sale
 * @author shieldbe
 *
 */
public class Bin 
{
private Avocado avocado;

//constructor that accepts as a parameter an avocado
public Bin(Avocado avocado) {
	this.avocado = avocado; //stores the value of the parameter in the object property.
	//this copies the reference/address of the parameter, not the object.
	this.avocado = new Avocado(avocado); //this invokes copy constructor and makes new copy of object
//now instantiate the arraylist of avocados and put it in avocados
	avocados = new ArrayList<Avocado>();
}
//put the avocado in the arraylist. use copy constructor, good luck on ur homework broether.
public void addAvocado(Avocado avocado) {
	avocados.add(new Avocado(avocado));
}
//arraylist for they avocados
private ArrayList<Avocado> avocados;

public String toString() {
	return avocado.ToString();
}

}
