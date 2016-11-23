package Seemann;

import java.util.ArrayList;

/**
* Das Model, enth�lt die Gesch�ftslogik der GUI
* 
* @author Hasenberger, Mazzolini, Reichmann, Seemann
* @version 2016-11-17
*/
public class Model{
	/**
	 * Attribute
	 */
	private int startZeit;
	private int endZeit;
	
	/**
	 * Konstruktor
	 */
	public Model(){
		
	}
	
	/**
	 * Methoden
	 */
	/**
	 * Diese Methode pr�ft, ob alle Lichter aus sind und das Spielende erreicht ist.
	 * @param anzdunkel ist die Anzahl an dunklen Lichtern
	 * @return <code>true</code> wenn das Spielende erreicht wurde
	 * 		   <code>false</code> andernfalls
	 */
	public boolean spielende(int anzahldunkel){
		 if(anzahldunkel == 25){
			 return true;
		 } else {
			 return false;
		 }
	 }
	/**
	 * Die Methode aendern �berpr�ft das value des geklickten Feldes und return dann die zu �ndernden Felder.
	 * @param nummer
	 * @return ArrayList <Integer> Die zu �ndernen Farben
	 */

	public ArrayList <Integer> aendern (int nummer){

		ArrayList <Integer> rueckgabe = new ArrayList <Integer>(); 
		//Hauptfeld mitte
		if(nummer >=6 && nummer <=8 || nummer >=11 && nummer <=13 || nummer >=16 && nummer <=18){
			rueckgabe.add(nummer -5);
			rueckgabe.add(nummer +5);
			rueckgabe.add(nummer -1);
			rueckgabe.add(nummer +1);
			rueckgabe.add(nummer);
		}
		//Linker Rand
		if(nummer == 5|| nummer == 10 || nummer == 15){
			rueckgabe.add(nummer -5);
			rueckgabe.add(nummer +5);
			rueckgabe.add(nummer +1);
			rueckgabe.add(nummer);
		}
		//Oberer Rand
		if(nummer >= 1 && nummer <= 3){
			rueckgabe.add(nummer +5);
			rueckgabe.add(nummer -1);
			rueckgabe.add(nummer +1);
			rueckgabe.add(nummer);
		}
		//Rechter Rand
		if(nummer == 9|| nummer == 14 || nummer == 19){
			rueckgabe.add(nummer -5);
			rueckgabe.add(nummer +5);
			rueckgabe.add(nummer -1);
			rueckgabe.add(nummer);
		}
		//Unterer Rand
		if(nummer >= 21 && nummer <= 23){
			rueckgabe.add(nummer -5);
			rueckgabe.add(nummer -1);
			rueckgabe.add(nummer +1);
			rueckgabe.add(nummer);
		}
		//Ecke links oben
		if(nummer == 0){
			rueckgabe.add(nummer +5);
			rueckgabe.add(nummer +1);
			rueckgabe.add(nummer);
		}
		//Ecke rechts oben 
		if(nummer == 4){
			rueckgabe.add(nummer +5);
			rueckgabe.add(nummer -1);
			rueckgabe.add(nummer);
		}
		//Ecke rechts unten 
		if(nummer == 24){
			rueckgabe.add(nummer -5);
			rueckgabe.add(nummer -1);
			rueckgabe.add(nummer);
		}
		//Ecke links unten
		if(nummer == 20){
			rueckgabe.add(nummer -5);
			rueckgabe.add(nummer +1);
			rueckgabe.add(nummer);
		}
		return rueckgabe;
	}
	
	/**
	 * Berechnet eine Zufallszahl zwischen 1 und 24
	 * 
	 * @return int zufallszahl zwischen 1 und 24
	 */
	public int getZufallszahl(){
		int OG = 24; //Obergrenze
		int UG = 3; //Untergrenze
		int zz = (int)(Math.random()*(OG-UG)+UG);
		return zz;
	}
	
	public void setStartZeit(){
		this.startZeit = (int)(System.currentTimeMillis());
	}
	public int getSpieldauer(){
		this.endZeit = (int)(System.currentTimeMillis());
		return (int)((this.endZeit-this.startZeit))/1000;
	}
}