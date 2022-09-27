import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Gpa{

	public static void main(String[] args){
		
		DecimalFormat formatter = new DecimalFormat("#.00");
		
		//Global variables
		int totalHours = 0;
		int qualityPoints = 0;
		double gpa;
		int totalClasses = 0;
		
		//Check for a proper number of classes
		while (totalClasses == 0){
			String tempClassNumber = JOptionPane.showInputDialog(null, "How" + 
							" many classes are you taking?", "Gpa calculator", 
							JOptionPane.QUESTION_MESSAGE);
							
			//Emergency closure
			if (tempClassNumber == null){
				System.exit(0);
			}else{
				
				//Test if number is an integer and positive
				try{
					totalClasses = Integer.parseInt(tempClassNumber);
					if (totalClasses < 1){
						JOptionPane.showMessageDialog(null, "Please enter a "
						+"valid number",
						"Gpa calculator", JOptionPane.ERROR_MESSAGE);
						totalClasses = 0;
					}
				}catch (Exception e){
					JOptionPane.showMessageDialog(null, "Please enter a valid" +
						" number", "Gpa calculator", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		
		//Run code for each class the user is taking
		int i = 0;
		while (i < totalClasses){
			
			String gradeTemp = (JOptionPane.showInputDialog(null, "What is your"+
						" grade for class " + (i+1) + "?", "Gpa calculator", 
						JOptionPane.QUESTION_MESSAGE)).toUpperCase();
			
			//Check if user entered a valid grade
			while (!gradeTemp.equals("A") && !gradeTemp.equals("B") && 
				   !gradeTemp.equals("C") && !gradeTemp.equals("D") && 
				   !gradeTemp.equals("F") && !gradeTemp.equals("W") && 
				   !gradeTemp.equals("I")){
				
				gradeTemp = (JOptionPane.showInputDialog(null, "Please enter"+
								" a valid grade\nGrades are A, B, C, D, E, F"+
								", W, and I", "Gpa calculator", 
								JOptionPane.QUESTION_MESSAGE)).toUpperCase();
				
				//Emergency closure
				if (gradeTemp == null){
					System.exit(0);
				}
			
			}
			char grade = gradeTemp.charAt(0);
			
			//Make the user enter a valid number of credit hours
			int creditHours = 0;
			while (creditHours == 0){
				String creditsTemp = JOptionPane.showInputDialog(null, "How "+
						"many credit hours is class " + (i+1) + "?", "Gpa "+
						"calculator", JOptionPane.QUESTION_MESSAGE);
				
				// Emergency closure
				if (creditsTemp == null){
					System.exit(0);
				}else{
					
					//Test if number is integer and positive
					try{
						creditHours = Integer.parseInt(creditsTemp);
					}catch (Exception e){
						JOptionPane.showMessageDialog(null, "Please enter a "+
								"valid number", "Gpa calculator", 
								JOptionPane.ERROR_MESSAGE);
					}
					if (creditHours < 1){
						creditHours = 0;
						JOptionPane.showMessageDialog(null, "Please enter a "+
								"valid number", "Gpa calculator", 
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			
			//Make sure the grade is a counted one
			//Then add quality points and credit hours
			if (grade != 'W' && grade != 'I'){
				if (grade == 'F'){
					qualityPoints += 0;
				}else{
					qualityPoints += (creditHours * (
						(int)('F' - grade - 1)));
				}
				totalHours += creditHours;
			}
			i++;
		}
	
	gpa = (double) qualityPoints / totalHours;
	
	JOptionPane.showMessageDialog(null, "Your gpa is a " + 
			formatter.format(gpa), "Gpa caluclator", 
			JOptionPane.INFORMATION_MESSAGE);
	
	}
}
