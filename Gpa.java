import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Gpa{

	public static void main(String[] args){
		
		DecimalFormat formatter = new DecimalFormat("#.00");
		
		int totalClasses = Integer.parseInt(JOptionPane.showInputDialog(null, "How many classes are you taking?", "Gpa calculator", JOptionPane.QUESTION_MESSAGE));
		
		char[] grades;
		int[] creditHours;
		
		int i = 0;
		while (i < totalClasses){
			
			String gradeTemp = (JOptionPane.showInputDialog(null, "What is your grade for class " + (i+1) + "?", "Gpa calculator", JOptionPane.QUESTION_MESSAGE)).toUpperCase();

			i++;
		}
		
	}
}
