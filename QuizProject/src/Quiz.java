
public class Quiz {

	public static void main(String[] args) {
		
		Question question1 = new MultipleChoiceQuestion(
			"What is a Tiger Barb?",
			"a feline with vertical black and orange stripes.",
			"a feline with long mane and a great roar.",
			"a small, freshwater fish.",  // correct answer
			"a large, saltwater fish.",
			"whatever you want it to be.",
			"c"			
		);
		
		question1.check();  // checking the 1st question
		
		Question question2 = new MultipleChoiceQuestion(
			"What is the square root of 9?",
			"9.",
			"81.",
			"4.5.",
			"3.",  // correct answer
			"27.",
			"d"			
		);
			
		question2.check();  // checking the 2nd question
		
		Question question3 = new MultipleChoiceQuestion(
			"What is the capital of Venezuela?",
			"Caracas.",  // correct answer
			"Valencia.",
			"Maracay.",
			"Paris.",  
			"Barcelona.",
			"a"			
		);
				
		question3.check();  // checking the 3rd question
		
		Question question4 = new MultipleChoiceQuestion(
			"What is a triangle?",
			"a shape with 4 sides.",  
			"a curved line.",
			"a medieval weapon.",
			"a place in Venezuela.",  
			"a shape with 3 sides.",  // correct answer
			"e"			
		);
				
		question4.check();  // checking the 4th question
		
		Question question5 = new MultipleChoiceQuestion(
			"What is the formula for water?",
			"H2O2.",  
			"HO.",
			"OH.",
			"H2O.",  // correct answer
			"CaOH.",  
			"d"			
		);
				
		question5.check();  // checking the 5th question
		
		Question question = new TrueFalseQuestion(
			"World War 2 ended in the year 1918.",
			"No" //FALSE
		);
		
		question.check();  // checking the true or false question
		
		Question tfquestion2 = new TrueFalseQuestion(
			"A Gila monster is a venomous lizard.",
			"y" //TRUE
		);
		
		tfquestion2.check();  // checking the true or false question
		
		Question tfquestion3 = new TrueFalseQuestion(
			"Jurassic Park is a movie about dinosaurs.",
			"True" //TRUE
		);
		
		tfquestion3.check();  // checking the true or false question
		
		Question tfquestion4 = new TrueFalseQuestion(
			"Star Wars is a movie about a shark.",
			"n" //FALSE
		);
		
		tfquestion4.check();  // checking the true or false question
		
		Question tfquestion5 = new TrueFalseQuestion(
			"The Everglades is the world's biggest desert.",
			"No" //FALSE
		);
		
		tfquestion5.check();  // checking the true or false question
		
		/*Score obtained*/
		Question.showResults();
		
	} //end of main()
} //end of class
