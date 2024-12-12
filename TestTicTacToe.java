import java.util.Scanner;
public class TestTicTacToe
{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
//create two integer variables
int xPos;
int yPos;
//declare and set a boolea value gameOver to fale
boolean gameOver=false;
char currentPlayer;
char winner;
//Make a tictactoe object
TicTacToe game=new TicTacToe();

//run the game as long as the game is over
do
{
//print board status
game.print();
//call the method getCurrentPlayer to get current player
currentPlayer=game.getCurrentPlayer();
System.out.println("Current Player : ");
System.out.println(game.getCurrentPlayer());


//do not accept values otherthan 1 or 2 or 3 for the xPos and yPos
//and prompts until user enters a valid values
do
{
System.out.println("Enter row & column positions of player ");
System.out.println(currentPlayer);
//prompt for x and y positions of the board locations
System.out.println("Enter row number :");
xPos=scanner.nextInt();
System.out.println("Enter column number :");
yPos=scanner.nextInt();

if((xPos<0 || xPos>3)||(yPos<0 ||yPos>3))
System.out.println
("Enter a valid move(1 or 2 or 3)");

}while((xPos<0 || xPos>3)||(yPos<0 ||yPos>3));


//calling makeMove
game.makeMove(xPos-1,yPos-1);
game.print();
//calling isDone method to check if the current player won the game
if(game.isDone())
{
winner=currentPlayer;
System.out.println(winner+" player won the game");
//set gameOver true
gameOver=true;
}

}while(!gameOver);//stop the game if the game is over
}
}


