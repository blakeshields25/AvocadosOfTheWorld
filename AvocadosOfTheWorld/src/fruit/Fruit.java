/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */

package fruit;
/***
 * An Abstract class upon which we will build fruits
 * @author nicomp
 *
 */
public abstract class Fruit 
{
private int weight;
private float cost;
/***
 * Constructor
 * @param weight of fruit
 * @param cost of fruit
 */
public Fruit(int weight, float cost) {
	setWeight(weight);
	setCost(cost);
}
/***
 * get weight
 * @return return the set weight
 */
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
/***
 * get cost
 * @return return set cost
 */
public float getCost() {
	return cost;
}
public void setCost(float cost) {
	this.cost = cost;
}

public String ToString() {
	return "Weight = " + weight + ", Cost = " + cost;
}

}
