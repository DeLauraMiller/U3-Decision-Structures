import javax.swing.*;
import java.util.Random;


public class QuizGame {
    static int userAnswer, correctAnswer;
    static String displayProblem = "";

    public static void main(String[] args) {

        int choice = input ("Choose Addition(1), Subtraction(2), Multiplication(3), Division(4)");

        createProblem(choice);
        getUserAnswer();
        checkAnswer();

    }
    public static void checkAnswer(){
        if(userAnswer == correctAnswer){
            JOptionPane.showMessageDialog(null,"You are correct!");
        }else{
            JOptionPane.showMessageDialog(null, "Incorrect, please try again.");
        }
    }

    public static void getUserAnswer() {
        userAnswer = input(displayProblem);

    }

    public static void createProblem(int choice) {
        if(choice >= 1){;
            if(choice<5){
                if(choice ==1){
                    add();
                }
                if (choice == 2){
                    sub();
                }
                if(choice == 3){
                    mult();
                }
                if(choice==4){
                    div();
                }
            }else {System.out.println("Wrong input, restart program, try again");
                System.exit(0);
            }

        }else{
            System.out.println("Wrong input, restart program, try again");
            System.exit(0);
        }
    }

    public static void add(){
        int num1 = random();
        int num2 = random();

        correctAnswer = num1 + num2;
        displayProblem = num1 + " + " + num2;
    }

    public static void sub(){
        int num1 = random();
        int num2 = random();

        correctAnswer = num1 - num2;
        displayProblem = num1 + " - " + num2;
    }

    public static void mult(){
        int num1 = random();
        int num2 = random();

        correctAnswer = num1 * num2;
        displayProblem = num1 + " X " + num2;
    }

    public static void div(){
        int num1 = random();
        int num2 = random();

        correctAnswer = (num1 / num2);
        displayProblem = num1 + " / " + num2;
    }
    //HELPER METHOD
    public static int random() {
        Random random = new Random();
        return random.nextInt(20)+1;
    }

    public static int input(String message){
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }

}

