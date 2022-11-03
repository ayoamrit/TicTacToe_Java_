public class GameBoard {


    //game board
    char[][] board = {{' ',' ',' '},
                    {' ',' ',' '},
                    {' ',' ',' '}};


    //printing game board
    public void displayBoard(char[][] gameBoard){
        System.out.println(gameBoard[0][0]+"|"+gameBoard[0][1]+"|"+gameBoard[0][2]+"\n" +
                "-+-+-\n" +
                gameBoard[1][0]+"|"+gameBoard[1][1]+"|"+gameBoard[1][2]+"\n"+
                "-+-+-\n"+
                gameBoard[2][0]+"|"+gameBoard[2][1]+"|"+gameBoard[2][2]);
    }


    //adding 'X' or 'O' to the board array
    public boolean addSymbols(char[][] gameBoard, int position, String user){

        //using boolean to check if the position in the array is empty or not.
        boolean isEmpty = false;

        //symbols 'X' or 'O'
        char symbol;
        if(user.equals("computer")){
            symbol = 'O';
        }
        else{
            symbol = 'X';
        }


        //using switch statement to checking and adding symbol to the array
        switch(position){

            //position 1
            case 1:

                //checking whether array is empty or not
                //if array is empty
                if(gameBoard[0][0] == ' ') {

                    //adding symbol to the position
                    gameBoard[0][0] = symbol;

                    //changing variable to true
                    isEmpty = true;
                }

                //breaking the statement
                break;

            case 2:
                if(gameBoard[0][1] == ' ') {
                    gameBoard[0][1] = symbol;

                    isEmpty = true;

                }
                break;

            case 3:
                if(gameBoard[0][2] == ' ') {
                    gameBoard[0][2] = symbol;

                    isEmpty = true;

                }
                break;

            case 4:
                if(gameBoard[1][0] == ' ') {
                    gameBoard[1][0] = symbol;

                    isEmpty = true;
                }
                break;

            case 5:
                if(gameBoard[1][1] == ' ') {
                    gameBoard[1][1] = symbol;

                    isEmpty = true;
                }
                break;

            case 6:
                if(gameBoard[1][2] == ' ') {
                    gameBoard[1][2] = symbol;

                    isEmpty = true;
                }
                break;

            case 7:
                if(gameBoard[2][0] == ' ') {
                    gameBoard[2][0] = symbol;

                    isEmpty = true;
                }
                break;

            case 8:
                if(gameBoard[2][1] == ' ') {
                    gameBoard[2][1] = symbol;

                    isEmpty = true;
                }
                break;

            case 9:
                if(gameBoard[2][2] == ' ') {
                    gameBoard[2][2] = symbol;

                    isEmpty = true;
                }
                break;
        }

        //returning boolean 'isEmpty'
        return isEmpty;

    }

    //checking whether anyone is winner or not
    public boolean checkWinner(char[][] gameboard, char symbol){

        //defining variable
        boolean winner;

        //win conditions
        //rows
        if(gameboard[0][0] == symbol && gameboard[0][1] == symbol && gameboard[0][2] == symbol ||
                gameboard[1][0] == symbol && gameboard[1][1] == symbol && gameboard[1][2] == symbol ||
                gameboard[2][0] == symbol && gameboard[2][1] == symbol && gameboard[2][2] == symbol ||

                //columns
                gameboard[0][0] == symbol && gameboard[1][0] == symbol && gameboard[2][0] == symbol ||
                gameboard[0][1] == symbol && gameboard[1][1] == symbol && gameboard[2][1] == symbol ||
                gameboard[0][2] == symbol && gameboard[1][2] == symbol && gameboard[2][2] == symbol ||

                //diagonals
                gameboard[0][0] == symbol && gameboard[1][1] == symbol && gameboard[2][2] == symbol ||
                gameboard[0][2] == symbol && gameboard[1][1] == symbol && gameboard[2][0] == symbol)
        {

            //if any of the above conditions is true then variable 'winner' is true
            winner = true;
        }
        else{

            //if none of the above conditions is true then variable 'winner' is false
            winner = false;
        }

        //returning boolean 'winner'
        return winner;
    }


    //checking whether ant slots on gameboard is empty or not
    public boolean checkVoid(char[][] gameboard){

        //defining variable
        boolean isVoid = false;

        //checking whether board is empty or not
        for(int x =0;x<gameboard.length;x++){
            for(int y=0;y<gameboard[x].length;y++){

                //'isVoid' is true for any empty slot in gameboard array
                if(gameboard[x][y]==' '){
                    isVoid = true;
                    break;
                }
            }
        }

        //returning boolean 'isVoid'
        return isVoid;
    }
}
