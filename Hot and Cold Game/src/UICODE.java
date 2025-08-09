import java.util.*;
public class UICODE {
    static int MAX_TRIES;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the NUMBER_GUESSING GAME!\nThe basic rules of the game are as follows:");
        System.out.println("[1.A Random Number from 1 to 100 is generated and your task is to guess it.\n2.'Hot' will be displayed when your guess is around 10 numbers from the Random Number.\n3.'Cold' will be displayed when the number guessed is far off the random number.\n4.Your score is calculated based on how quickly you can guess the number.\n5.Your get a maximum of 10 tries!]");
        System.out.println("HAPPY PLAYING!!");
        int ch;
        do {
            System.out.println("PRESS : 1 for easy, 2 for medium and 3 for hard!");
            int choice = sc.nextInt();
            GameCode obj = new GameCode();
            int num, COUNTER = 0;
            switch (choice) {

                case 1:
                    System.out.println("Since you chose the easy level, you will have to guess the number between 10 tries.");
                    MAX_TRIES = 10;
                    do {
                        COUNTER++;
                        if (COUNTER == MAX_TRIES)
                            break;
                        System.out.print("Enter the Number:");
                        num = sc.nextInt();
                    } while (obj.Check(num) == false);
                    if(COUNTER==MAX_TRIES)
                    {
                        System.out.println("Sorry! You couldn't guess the number :(\nTHE NUMBER WAS:"+obj.rand+"\nDon't give up, Try Again!");
                        break;
                    }
                    System.out.println("YOUR SCORE:" + COUNTER);
                    COUNTER = 0;
                    break;
                case 2:
                    System.out.println("Since you chose the medium level, you will have to guess the number between 5 tries.");
                    MAX_TRIES = 5;
                    do {
                        COUNTER++;
                        if (COUNTER == MAX_TRIES)
                            break;
                        System.out.print("Enter the Number:");
                        num = sc.nextInt();
                    } while (obj.Check(num) == false);
                    if(COUNTER==MAX_TRIES)
                    {
                        System.out.println("Sorry! You couldn't guess the number :(\nTHE NUMBER WAS:"+obj.rand+"\nDon't give up, Try Again!");                        break;
                    }
                    System.out.println("YOUR SCORE:" + COUNTER);
                    COUNTER = 0;
                    break;
                case 3:
                    System.out.println("Since you chose the hard level, you will have to guess the number between 1-500 in 10 tries.");
                    int num1;
                    MAX_TRIES = 10;
                    GameCode obj1 = new GameCode(1, 500);
                    do {
                        COUNTER++;
                        if (COUNTER == MAX_TRIES)
                            break;
                        System.out.print("Enter the Number:");
                        num1 = sc.nextInt();
                    } while (obj1.Check(num1) == false);
                    if(COUNTER==MAX_TRIES)
                    {
                        System.out.println("Sorry! You couldn't guess the number :(\nTHE NUMBER WAS:"+obj.rand+"\nDon't give up, Try Again!");                        break;
                    }
                    System.out.println("YOUR SCORE:" + COUNTER);
                    COUNTER = 0;
                    break;
                default:
                    System.out.println("Enter a valid choice!");
            }
            System.out.println("DO YOU WANT TO START AGAIN? \n1. for yes\n2. for nope");
            ch = sc.nextInt();
        } while (ch != 2);

    }
}

