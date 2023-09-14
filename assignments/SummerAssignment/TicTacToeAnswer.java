/********************
 * Tic Tac Toe v1.2
 * PvP
 * @author marcos
 * Depends on IBIO
 * 08.2023
 *******************/
 
public class TicTacToeAnswer
{
    private static int size = 3;

	public static void resetBoard(char[][] board)
    {	for (int r = 0; r < size; r++)
        {	for (int c = 0; c < size; c++)
            {	board[r][c] = ' ';
            }
        }
    }
    
    public static boolean isCellAvailable(char[][] board, int row, int col)
    {
		return board[row][col] == ' ';
	}
    
    public static boolean isFullBoard(char[][] board)
    {	for (int r = 0; r < size; r++)
        {	for (int c = 0; c < size; c++)
			{	if(board[r][c] == ' ')
				{	return false;
				}
			}
		}
		return true;
	}
	
	public static void line()
	{	for (int i = 0; i <= size * 4; i++)
			System.out.print("-");
		System.out.println();
	}

    public static void printBoard(char[][] board)
    {	line();
        for (int r = 0; r < size; r++)
        {	System.out.print("| ");
            for (int c = 0; c < size; c++)
            {	System.out.print(board[r][c] + " | ");
            }
            System.out.println();
            line();
        }
    }

    public static boolean isWinRow(char[][] board, char player, int row)
    {
        boolean result = true;
		for (int c = 0; c < size; c++)
		{	if (board[row][c] != player)
			{	result = false;
				break;
			}
		}
		if(result) // ... == true)
		{	return true;
		}
        return false;
    }
    
    public static boolean isWinCol(char[][] board, char player, int col)
    {
        boolean result = true;
		for (int r = 0; r < size; r++)
		{	if (board[r][col] != player)
			{	result = false;
				break;
			}
		}
		if(result == true)
		{	return true;
		}
        return false;
    }

    public static boolean isWinDiag1(char[][] board, char player)
    {
        for (int d = 0; d < size; d++)
        {	if (board[d][d] != player)
            {	return false;
            }
        }
        return true;
    }

    public static boolean isWinDiag2(char[][] board, char player)
    {
        for (int d = size - 1; d >= 0; d--)
        {	if(board[size-1-d][d] != player)
            {	return false;
            }
        }
        return true;
    }

    public static boolean isWin(char[][] board, char player, int row, int col)
    {	// optional display of winning condition checks
        System.out.println("-:" + isWinRow(board, player, row)
                + " |:" + isWinCol(board, player, col)
                + " \\:" + isWinDiag1(board, player)
                + " /:" + isWinDiag2(board, player));
        // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        return isWinRow(board, player, row)
                || isWinCol(board, player, col)
                || isWinDiag1(board, player)
                || isWinDiag2(board, player);
    }

    public static void displayResult(char[][] board, int row, int col)
    {
        if (isWin(board, 'O', row, col))
        {	System.out.println("O wins");
        } else if (isWin(board, 'X', row, col))
        {	System.out.println("X wins");
        } else
        {	System.out.println("It's a tie");
        }
    }

    public static void check(char[][] board, int row, int col)
    {	printBoard(board);
        displayResult(board, row, col);
    }
    
    public static int inputRow(char player)
    {	int row;
		do
		{	row = IBIO.inputInt("ROW for Player " + player + " = ");
			if(row < 1 || row > size)
				System.out.print("Error - please enter a valid and empty row for ");
		} while(row < 1 || row > size);
		return row;
	}
	
	public static int inputColumn(char player)
    {	int col;
		do
		{	col = IBIO.inputInt("COLUMN for Player " + player + " = ");
			if(col < 1 || col > size)
				System.out.print("Error - please enter a valid and empty ");
		} while(col < 1 || col > size);
		return col;
	}
    
    public static void main(String[] args)
    {	int rowO, colO, rowX, colX;
		boolean win = false;
		size = IBIO.inputInt ("Enter the size of the board: ");
		if (size < 3) {
			size = 3; //if input is less than 3, board size will be 3
		}
		char[][] board = new char[size][size];
		resetBoard(board);
		while( !isFullBoard(board) || win)
		{
			do
			{	rowO = inputRow('O') - 1;
				colO = inputColumn('O') - 1;
			} while( !isCellAvailable(board, rowO, colO) );
			board[rowO][colO] = 'O';
			printBoard(board);
			if(isWin( board, 'O', rowO, colO) )
			{	System.out.println("O won!");
				win = true;
				break;
			}
			
			do
			{	rowX = inputRow('X') - 1;
				colX = inputColumn('X') - 1;
			} while( !isCellAvailable(board, rowX, colX) );
			board[rowX][colX] = 'X';
			printBoard(board);
			if(isWin( board, 'X', rowX, colX) )
			{	System.out.println("X won!");
				win = true;
				break;
			}
		}
		if( !win )
			System.out.println("It's a TIE!");
		System.out.println("Thanks for playing!");
		
    } // end main()


} // end class
