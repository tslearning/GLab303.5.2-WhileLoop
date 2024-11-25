import java.util.Scanner;

public class GLAB_303_While_Loop {

    public void GuessTheNumber() {

        //Example # 1 Generate a random number to be guessed
        int number = (int) (Math.random() * 101);
        System.out.println(); //Enter number to find out
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
        int guess = -1;

        while (guess != number) {
            //Prompt the user to guess the number
            System.out.println("\nEnter your guess: ");
            guess = input.nextInt();
            if (guess == number) {
                System.out.println("Yes, the number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess is too high");
            } else
                System.out.println("Your guess is too low");
            // End of Loop

        }
    }

    public void SubtractionQuizLoop() {
        final int Number_OF_QUESTIONS = 5; //Number of questions
        int correctCount = 0; //count the number of correct answers
        int count = 0; //Count the number of questions
        long startTime = System.currentTimeMillis();
        String output = ""; // output string is initially empty
        Scanner input = new Scanner(System.in);

        while (count < Number_OF_QUESTIONS) {
            //1.Generate two random single-digit integers
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            //2. If number1 < number2, swap number1 with number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;

                //3. Prompt the student to answer "What is number1 - number2?"
                System.out.println("What is " + number1 + " - " + number2 + "? ");
                int answer = input.nextInt();
                //4 Grade the answer and display the result
                if (number1 - number2 == answer) {
                    System.out.println("You are correct!");
                    correctCount++;
                } else {
                    System.out.println("You answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
                    //Increase the count
                    count++;
                    output += "\n" + number1 + "-" + number2 + "=" + answer + ((number1 - number2 == answer) ? " correct" : " wrong");
                }
            }
        }
    }

        public void SentinelValueDemo () {
            Scanner input = new Scanner(System.in);
            //Read an initial data
            System.out.println("Enter an int value (the program exits if the input is 0): ");
            int data = input.nextInt();
            //Keep reading data until the input is 0
            int sum = 0;
            while (data != 0) {
                sum += data;
                //Read the next data
                System.out.println("Enter an int value (the program exits if the input is 0): ");
                data = input.nextInt();
            }
            System.out.println("The sum is " + sum);
        }
    }
