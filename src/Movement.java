import java.util.Scanner;
import java.util.Random;

//child class Movement extending GameBoard class
public class Movement extends GameBoard{

    //using scanner to get input
    Scanner scanner = new Scanner(System.in);

    //defining constructor
    Movement(){
        //displaying board
        displayBoard(board);

        //using while loop to user methods repeatedly
        while(true) {

            //prompting user to enter their move
            promptPlayerMovement();

            //displaying board
            displayBoard(board);

            //checking win conditions
            if(checkWinner(board, 'X')){
                System.out.println("Player Won The Game");
                break;
            }

            //checking if the board is full or not
            if(!checkVoid(board)){
                System.out.println("Game Tied");
                break;
            }

            //prompting computer to take a move
            promptComputerMove();

            //displaying board
            displayBoard(board);

            //checking win conditions for computer
            if(checkWinner(board, 'O')){
                System.out.println("Computer Won The Game");
                break;
            }

            //checking if the board is full or not
            if(!checkVoid(board)){
                System.out.println("Game Tied");
                break;
            }
        }
    }

    //prompting the user to enter a valid move
    public void promptPlayerMovement(){


        //using while loop to prompt user to enter input again in case of invalid input.
        while(true) {
            System.out.println("Enter Your Next Move: ");

            //try and catch statement to check if input is integer or not
            try {
                int playerMove = scanner.nextInt();

                //any input that is more than 9 or less than 1 is invalid
                if (playerMove > 9 || playerMove < 1) {
                    System.out.println("Please Enter A Valid Move");

                } else { //if move is valid

                    //checking if the position is empty or not and adding player symbol to the position
                    if(addSymbols(board,playerMove,"player")){
                        break;
                    }

                    else{  //user will get a chance to enter input again is the user required position is not empty
                        System.out.println("Position Is Already Taken");
                    }
                }

                //catching exceptions
            } catch (Exception e) {
                System.out.println("Please Enter Integer Only.");
            }
        }
    }

    //prompting computer to take a move
    public void promptComputerMove(){

        //object of Random class
        Random rand = new Random();

        while(true) {

            //generating random number between 1 and 10
            int randomNumber = rand.nextInt(1, 10);

            //checking if the position required by computer is empty or not
            if (addSymbols(board, randomNumber, "computer")) {

                System.out.println("Computer Choose: "+randomNumber+" Position");
                break;
            }

            //if position is not empty to loop will continue
            else{
                continue;
            }
        }
    }
}
