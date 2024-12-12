class TicTacToe
{
private final int SIZE=3;
//private members of class TicTacToe
private char currentPlayer;
private char[][] board=new char[SIZE][SIZE];

//default constructor
public TicTacToe()
{
//set starting player to 'X'
//set remaining to empty
for(int i=0;i<SIZE;i++)
for(int j=0;j<SIZE;j++)
board[i][j]='*';

//set starting player X
//board[0][0]='X';
//Next , set currentPlayer to 'O'
currentPlayer='X';

}
//To print board status
public void print()
{
System.out.println("TIC-TAC-TOE BOARD");
System.out.println();
for(int i=0;i<SIZE;i++)
{
for(int j=0;j<SIZE;j++)
System.out.printf("%-4c",board[i][j]);

System.out.println();
}
}
//Returns the currentPlayer board to play
public char getCurrentPlayer()
{
return currentPlayer;
}
//The method isDone that returns true
//if the any of the possible validations are true
public boolean isDone()
{
//horizontal checking for x -win
if(board[0][0]=='X' &&board[0][1]=='X' &&board[0][2]=='X' )
return true;
else if(board[1][0]=='X' &&board[1][1]=='X' &&board[1][2]=='X' )
return true;
else if(board[2][0]=='X' &&board[2][1]=='X' &&board[2][2]=='X' )
return true;
//vertical checking for x -win
else if(board[0][0]=='X' &&board[1][0]=='X' &&board[2][0]=='X' )
return true;
else if(board[0][1]=='X' &&board[1][1]=='X' &&board[2][1]=='X' )
return true;
else if(board[0][2]=='X' &&board[1][2]=='X' &&board[2][2]=='X' )
return true;

//Diagonal checking for x -win
else if(board[0][0]=='X' &&board[1][1]=='X' &&board[2][2]=='X' )
return true;
else if(board[2][0]=='X' &&board[1][1]=='X' &&board[0][2]=='X' )
return true;

//horizontal checking for O -win
if(board[0][0]=='O' &&board[0][1]=='O' &&board[0][2]=='O' )
return true;
else if(board[1][0]=='O' &&board[1][1]=='O' &&board[1][2]=='O' )
return true;
else if(board[2][0]=='O' &&board[2][1]=='O' &&board[2][2]=='O' )
return true;
//vertical checking for O -win
else if(board[0][0]=='O' &&board[1][0]=='O' &&board[2][0]=='O' )
return true;
else if(board[0][1]=='O' &&board[1][1]=='O' &&board[2][1]=='O' )
return true;
else if(board[0][2]=='O' &&board[1][2]=='O' &&board[2][2]=='O' )
return true;

//Diagonal checking for O -win
else if(board[0][0]=='O' &&board[1][1]=='O' &&board[2][2]=='O' )
return true;
else if(board[2][0]=='O' &&board[1][1]=='O' &&board[0][2]=='O' )
return true;
else
//otherwise no x or O not win
return false;
}
//Returns the winner of the game
public char getWinner() {
return 0;
}
//The metod isValidMove that accepts the row and column
//and returns true of board position is empty '-'(Empty value)
//otherwiser returns false

public boolean isValidMove(int row,int col)
{
return board[row][col]=='*';
}
//Method that makeMove that accepts the row and colum
//number and checks the validmove and set the currentPlayer
//move .If move is invalid then print a message "invalid move"

public void makeMove(int row,int col)
{
if(isValidMove(row,col))
{
board[row][col]=getCurrentPlayer();
//change the currentPlayer to X
if(currentPlayer=='X')
currentPlayer='O';
else
currentPlayer='X';
}
else
System.out.println("Invalid move");

}

}



