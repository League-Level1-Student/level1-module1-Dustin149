import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		Microwave microwave = new Microwave();
		
		String flavor = JOptionPane.showInputDialog("What flavor do you want your popcorns in?");
		int minutes = Integer.parseInt(JOptionPane.showInputDialog("How many minutes of cooking time?"));
		
		Popcorn popcorn = new Popcorn(flavor);
		microwave.setTime(minutes);
		microwave.putInMicrowave(popcorn);
		microwave.startMicrowave();
		popcorn.applyHeat();
		popcorn.eat();
		
	}

}
