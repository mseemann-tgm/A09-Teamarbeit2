package Seemann;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
* Der Controller
* 
* @author Paul Mazzolini
* @version 2016-10-26
*/
public class Controller implements ActionListener{
	/**
	 * Attribute
	 */
	private Model m; //Das Model
	private View v;
	
	/**
	 * Konstruktor
	 */
	public Controller(){
		this.m = new Model();
		this.v = new View(this.m, this);
		this.v.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Wenn restart Button gedr�ckt wurde
		if(this.v.istDasRestart(e.getSource()) == true){
			this.v.setVisible(false);
			this.v = new View(this.m, this);
			this.v.start();
		}
		
		//Wenn exit Button gedr�ckt wurde
		if(this.v.istDasExit(e.getSource()) == true){
			System.exit(0);
		}
		
		//Von Reichmann
		if(this.v.istDasButton(e.getSource()) == true){
			JButton test = (JButton) e.getSource();
			System.out.println(test.getText());
		}
	}
}