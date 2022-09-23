import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Gpa{

	public static void main(String[] args){
		
		DecimalFormat formatter = new DecimalFormat("#.00");
		
		int totalHours = 0;
		int qualityPoints = 0;
		double gpa;
		int totalClasses = 0;
		
		while (totalClasses == 0){
			String tempClassNumber = JOptionPane.showInputDialog(null, "How" + 
							" many classes are you taking?", "Gpa calculator", 
							JOptionPane.QUESTION_MESSAGE);
			if (tempClassNumber == null){
				System.exit(0);
			}else{
				try{
					totalClasses = Integer.parseInt(tempClassNumber);
				}catch (Exception e){
					JOptionPane.showMessageDialog(null, "Please enter a valid" +
						" number", "Gpa calculator", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		
		
		int i = 0;
		while (i < totalClasses){
			
			String gradeTemp = (JOptionPane.showInputDialog(null, "What is your"+
						" grade for class " + (i+1) + "?", "Gpa calculator", 
						JOptionPane.QUESTION_MESSAGE)).toUpperCase();
						
			while (!gradeTemp.equals("A") && !gradeTemp.equals("B") && 
				   !gradeTemp.equals("C") && !gradeTemp.equals("D") && 
				   !gradeTemp.equals("F") && !gradeTemp.equals("W") && 
				   !gradeTemp.equals("I")){
				
				gradeTemp = (JOptionPane.showInputDialog(null, "Please enter"+
								" a valid grade\nGrades are A, B, C, D, E, F"+
								", W, and I", "Gpa calculator", 
								JOptionPane.QUESTION_MESSAGE)).toUpperCase();
				
				if (gradeTemp == null){
					System.exit(0);
				}
			
			}
			char grade = gradeTemp.charAt(0);
			
			int creditHours = 0;
			while (creditHours == 0){
				String creditsTemp = JOptionPane.showInputDialog(null, "How "+
						"many credit hours is class " + (i+1) + "?", "Gpa "+
						"calculator", JOptionPane.QUESTION_MESSAGE);
				if (creditsTemp == null){
					System.exit(0);
				}else{
					try{
						creditHours = Integer.parseInt(creditsTemp);
					}catch (Exception e){
						JOptionPane.showMessageDialog(null, "Please enter a "+
								"valid number", "Gpa calculator", 
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}

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
