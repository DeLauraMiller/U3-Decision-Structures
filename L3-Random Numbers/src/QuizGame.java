import javax.swing.*;
import java.util.Random;


public class QuizGame {
    static double userAnswer, correctAnswer;
    static String displayProblem = "";

    JPanel panel;
    JButton createProblem, checkAnswer;
    JLabel showProblem, resultLabel;
    JTextField answerInput;
    JRadioButton addition, subtraction, multiplication, division;
    ButtonGroup radios = new ButtonGroup();



    public static void main(String[] args) {

        new QuizGame();
        /*int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose Addition(1), Subtraction(2), Multiplication(3), Division(4)")) ;

        createProblem(choice);
        getUserAnswer();
        checkAnswer();*/
    }

    public QuizGame(){

        JFrame frame = new JFrame(" Quiz Game");
        frame.setSize(300,450);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setLocationRelativeTo(null);


        panel = new JPanel();
        addition = new JRadioButton(("Addition"));
        subtraction = new JRadioButton("Subtraction");
        multiplication = new JRadioButton("Multiplication");
        division = new JRadioButton("Division");


        createProblem = new JButton("Make a Problem!");
        showProblem = new JLabel(" PLACE HOLDER");
        answerInput = new JTextField(10);
        checkAnswer = new JButton("CHECK ANSWER");
        resultLabel = new JLabel(" Answer RESULTS");

        addition.setBounds(20,25,200,25);
        subtraction.setBounds(20,50,200,25);
        multiplication.setBounds(20,75,200,25);
        division.setBounds(20,100,200,25);

        radios.add(addition);
        radios.add(subtraction);
        radios.add(multiplication);
        radios.add(division);

        panel.setLayout(null);
        panel.add(addition);
        panel.add(subtraction);
        panel.add(multiplication);
        panel.add(division);

        frame.add(panel);
        frame.setVisible(true);

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

        correctAnswer = Math.round(correctAnswer* 100.0)/100.0;

        displayProblem = num1 + " / " + num2;
    }
    //HELPER METHOD
    public static int random() {
        Random random = new Random();
        return random.nextInt(20)+1;
    }

    public static double input(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }

}

