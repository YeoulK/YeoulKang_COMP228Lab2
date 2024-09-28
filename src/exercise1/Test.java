package exercise1;

import javax.swing.JOptionPane;
import java.util.Random;

public class Test {

    private int correctAnswers = 0;
    private int incorrectAnswers = 0;

    public void simulateQuestion(int questionNumber) {
        String question = "";
        String[] options = new String[4];

    switch(questionNumber){
        case 0:
            question ="What symbol is used to begin the body of a class declaration in Java?";
            options = new String[]{ "(" ,"{", "[","<" };
            break;

        case 1:
            question ="What is the starting point of every Java application?";
            options = new String[]{"public static void main(String[] args)", "public class exercise1.Main", "System.out.println", "import java.util.Scanner"};
            break;

        case 2:
            question ="How many public classes are allowed per source file in Java?";
            options = new String[]{"1", "2", "0","No limit"};
            break;

        case 3:
            question ="What is the purpose of the import statement in Java?";
            options = new String[]{"To define a class", "To give the compiler the location of a class or package", "To categorize classes", "To execute a method"};
            break;

        case 4:
            question ="Where should the package statement be located if a class is defined inside a package?";
            options = new String[]{"After the import statements", "After the class declaration", "Before the import statements and class declaration", "At the end of the source file"};
            break;
    }
    int answer = JOptionPane.showOptionDialog(null, question, "Question " + questionNumber,
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

    checkAnswer(questionNumber, answer);

}
    public void checkAnswer(int questionNumber, int answer){
        int correctAnswer = 0;
        switch (questionNumber) {
            case 0:
                correctAnswer = 1;
                break;
            case 1:
                correctAnswer = 0;
                break;
            case 2:
                correctAnswer = 0;
                break;
            case 3:
                correctAnswer = 1;
                break;
            case 4:
                correctAnswer = 2;
                break;
        }

        if (answer == correctAnswer) {
            generateMessage(true);
            correctAnswers++;
        } else {
            generateMessage(false);
            incorrectAnswers++;
        }
    }

    public void generateMessage(boolean isCorrect) {
        Random randomObject = new Random();

        String message;
        switch (randomObject.nextInt(4)) {
            case 0:
                message = isCorrect ? "Excellent!" : "No, try again.";
                break;
            case 1:
                message = isCorrect ? "Good job!" : "Wrong, try once more.";
                break;
            case 2:
                message = isCorrect ? "Keep up the good work!" : "Don't give up!";
                break;
            case 3:
                message = isCorrect ? "You're doing well." : "No. Keep trying..";
                break;
            default:
                message = "";
                break;
        }

        JOptionPane.showMessageDialog(null, message);
    }



    public void inputAnswer() {
        for (int i = 0; i < 5; i++) {
            simulateQuestion(i);
        }


        JOptionPane.showMessageDialog(null, "Correct answers: " + correctAnswers +
                "\nIncorrect answers: " + incorrectAnswers +
                "\nPercentage of correct answers: " + ((correctAnswers * 100) / 5) + " % ");

    }
}



