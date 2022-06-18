import javax.swing.*;
import java.awt.*;

public abstract class Question {
	
	//constructor
	Question(String question) {
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0, 1));
		this.question.add(new JLabel("    "+question+"    ", JLabel.CENTER));
	} //end of constructor
	
	/*class variables*/
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	/*instance variables*/
	QuestionDialog question;
	String correctAnswer;
	
	void initQuestionDialog() {
		question.setModal(true);
		question.pack();
		question.setLocationRelativeTo(null);
	} //end of initQuestionDialog()	

	String ask() {
		question.setVisible(true);
		return question.answer;
	} //end of ask() 
	
	
	/*check() instance method*/
    public void check() {
		
		nQuestions ++; //Increments every time a question is asked
		
		String answer = ask();
		if (answer.equals(correctAnswer)) { //answer is correct
			
			nCorrect++; //Increments for every correct answer
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		
		else { //answer is incorrect
		JOptionPane.showMessageDialog(null, ("Incorrect. The correct answer is: " + correctAnswer));
		}
		
	} //end of check()
   
    
    /*showResults() class method*/
    static void showResults() {
    	JOptionPane.showMessageDialog(null, (nCorrect + " correct out of " + nQuestions + " questions"));
    } // end of showResults()

} // end of class
