
/**
 * The goal is to get 3 in a row.
 * 
 * @author Emilio Valladares 
 * @version 1/19/2020
 */
public class TicTacToe {
    
    public static void main(String[] args) {
        char[][] gameBoard = 
        {{' ', '|', ' ', '|', ' '}, 
         {'-', '+', '-', '+', '-'}, 
         {' ', '|', ' ', '|', ' '}, 
         {'-', '+', '-', '+', '-'}, 
         {' ', '|', ' ', '|', ' '}};
         
        printGameBoard(gameBoard);
    }
    
    public static void printGameBoard(char[][] gameBoard) {
        for(char[] row : gameBoard) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
