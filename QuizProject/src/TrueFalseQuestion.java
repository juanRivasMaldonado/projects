import javax.swing.*;

public class TrueFalseQuestion extends Question {
	
	void addButton(JPanel buttons, String label) {
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	} //end of addButton()
	
	/*Constructor*/
	public TrueFalseQuestion (String question, String answer) {
		super(question);		
		JPanel buttons = new JPanel();
		addButton(buttons, "TRUE");
		addButton(buttons, "FALSE");
		this.question.add(buttons);
		initQuestionDialog();
		
		/*Allowing the parameter "answer" to be any String that is considered valid by ask()*/
		
		answer = answer.toUpperCase();
		
		if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) {
    	        // The answer is false
    	    answer = "FALSE"; 
        }
    
        if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y")  || answer.equals("YES")) {
    	        // The answer is true
    	    answer = "TRUE";
        }
		
        /*"answer" is now either "TRUE" or "FALSE", so "correctAnswer" is initialized to
         * only TRUE or FALSE*/
		correctAnswer = answer; 
	} // end of constructor
	
} // end of class
