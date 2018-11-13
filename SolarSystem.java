/**
 * 
 */

/**
 * @author Tony Gill
 * 100282663
 *
 */

import java.util.*;

public class SolarSystem {
 private String planetName;	
 private int planetNum;
 private double distanceAU; 
 /**
  *  AU represents astronomical units
  *  0 AU is the Sun and 1 AU is the distance from the Sun to the Earth
  *  Any number less than one means a closer distance to the Sun than Earth
  *  Any number greater than one means a further distance than Sun to Earth
  */
 private String color;
 
 /**
  * The size is a comparison relative to Earth as the base 
  * The size difference is represented as a percentage 
  * Earth itself is exactly one or 100% of it's own size
  * 100% is used to avoid confusion
  */
 private String sizeRelativeEarth;
 
 public SolarSystem(String planetName, int planetNum, double distanceAU, String color, String sizeRelativeEarth) {
 
	 super();
	 this.planetName = planetName;
	 this.planetNum = planetNum;
	 this.distanceAU = distanceAU;
	 this.color = color;
	 this.sizeRelativeEarth = sizeRelativeEarth;
	 
	 
 }
	 
public String toString() {
	/**
	 *  The planet name and all relevant information is represented 
	 *  The relevant information was used to properly identify the planet beyond the scope of a simple name
	 */
	return " " + planetName + " \n\tPlanet Number: " + planetNum + "\tDistance: " +  distanceAU + "\tColor: " +  color +  "\tSize: " + sizeRelativeEarth;
}
	 
	 
	public static void main(String[] args) {
List<SolarSystem> planetList = new ArrayList<SolarSystem>();

SolarSystem Mercury = new SolarSystem("\nMercury", 1, 0.4, "Grey", "38% size of Earth" );
SolarSystem Venus = new SolarSystem("\nVenus", 2, 0.7, "Yellow", "95% size of Earth");
SolarSystem Earth = new SolarSystem("\nEarth", 3, 1.0, "Blue", "100% Earth size" );
SolarSystem Mars = new SolarSystem("\nMars", 4, 1.5, "Red", "53% size of Earth" );
SolarSystem Jupiter = new SolarSystem("\nJupiter", 5, 5.2, "Orange and White", "1,120% size of Earth" );
SolarSystem Saturn = new SolarSystem("\nSaturn", 6, 9.6, "Pale Gold", "945% size of Earth" );
SolarSystem Uranus = new SolarSystem("\nUranus", 7, 19.2, "Blue", "400% size of Earth");  

// The required add and add with index ( , ) methods // 

planetList.add(Mercury);
planetList.add(1, Venus);
planetList.add(Earth);
planetList.add(Mars);
planetList.add(Jupiter);
planetList.add(Saturn);
planetList.add(6, Uranus);


System.out.println("The size of the planet list is: " + planetList.size());
System.out.println("\nThe List of Planets with one missing planet: " + planetList);

//Linked list created from existing custom class objects and existing ArrayList//

LinkedList<SolarSystem> allPlanets = new LinkedList<SolarSystem>(planetList);

SolarSystem Neptune = new SolarSystem("\nNeptune ", 8, 30.0, "Blue", "388% size of Earth" );

//The required addLast method //

allPlanets.addLast(Neptune);

// The required lab getLast method used with the final planet of the solar system//

System.out.println("\nThe last and missing planet of the solar system is:" + allPlanets.getLast());

// The indexOf required method utilized with Mars as the index of reference //

int indexOfPlanet = allPlanets.indexOf(Mars);
System.out.println("\nThe index or location of Mars is: " + indexOfPlanet);

/**
 * The required sublist methods are divided into 2 parts
 * The ArrayList version of the sublist method represents terrestrial land based planets in the solar system
 * The LinkedList version creates a sublist of the outer large scale gas based jovian planets
 */

ArrayList<SolarSystem> terrestialPlanets = new ArrayList<SolarSystem>(planetList.subList(0, 4));
System.out.println("\nThe inner terrestial planets are: " + terrestialPlanets);

LinkedList<SolarSystem> jovianPlanets = new LinkedList<SolarSystem>(allPlanets.subList(4, 8));
System.out.println("\nThe outer jovian planets are:" + jovianPlanets);

	}

}
