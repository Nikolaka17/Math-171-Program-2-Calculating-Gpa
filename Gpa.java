import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Gpa{

	public static void main(String[] args){
		
		DecimalFormat formatter = new DecimalFormat("#.00");
		
		int totalHours;
		int qualityPoints;
		double gpa;
		
		int totalClasses = Integer.parseInt(JOptionPane.showInputDialog(null, "How many classes are you taking?", "Gpa calculator", JOptionPane.QUESTION_MESSAGE));
		
		int i = 0;
		while (i < totalClasses){
			
			String gradeTemp = (JOptionPane.showInputDialog(null, "What is your grade for class " + (i+1) + "?", "Gpa calculator", JOptionPane.QUESTION_MESSAGE)).toUpperCase();
			while (!(gradeTemp == "A" || gradeTemp == "B" || gradeTemp == "C" || gradeTemp == "D" || gradeTemp == "F" || gradetemp == "W" || gradeTemp == "I")){
			
				gradeTemp = (JOptionPane.showInputDialog(null, "Please enter a valid grade, grades are A, B, C, D, E, F, W, or I", "Gpa calculator", JOptionPane.QUESTION_MESSAGE)).toUpperCase();
			
			}

			int creditsTemp = Integer.parseInt(JOptionPane.showInputDialog(null, "How many credit hours is class " + (i+1) + "?", "Gpa calculator", JOptionPane.QUESTION_MESSAGE));

			if (gradeTemp != "W" && gradeTemp != "I"){
				
				if (gradeTemp == "F"){
					
					qualityPoints += 0;
				
				}else{
				
					qualityPoints += (creditsTemp * ((int)('F' - gradetemp.charAt(0) - 1)));
				
				}
				
				totalHours += creditHours;
			}

			i++;
		}
	
	gpa = qualityPoints / totalHours;
	
	JOptionPane.showMessageDialog(null, "You're gpa is a " + formatter.format(gpa), "Gpa caluclator", JOptionPane.INFORMATION_MESSAGE);
	
	}
}
