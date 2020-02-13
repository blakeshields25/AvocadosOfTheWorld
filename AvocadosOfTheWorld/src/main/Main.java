/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */
package main;

import bin.Bin;
import fruit.Avocado;
import fruit.Fruit;

public class Main {

	public static void main(String[] args) 
	{//declare/instantiate a fruit called avocajoe.
		//Fruit Avocajoe = new Fruit(); //cannae do thees, why do we have abstract classsssssssssssssssssssssssssssssssssssssssses
		//declare and instantiate an avocado named avocajoe
		Avocado Avocajoe = new Avocado(10, 12);
		// declare and instantiate a bin object
		Bin AvocadoBin = new Bin(Avocajoe);
//add 50 avocados to the bin.
		for (int i = 0; i < 50; i++) {
			AvocadoBin.addAvocado(new Avocado(Avocajoe));
		}
	}
}
