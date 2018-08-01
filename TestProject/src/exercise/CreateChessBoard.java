package exercise;

public class CreateChessBoard {

    public static void chessBoard()
    {
        String[][] chessBoard = new String[8][8];

        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                chessBoard[i][j]="WW|";
            }
        }

        for(int i=0;i<8;i+=2)
        {
            for(int j=1;j<8;j+=2)
            {
                chessBoard[i][j]=chessBoard[i][j].replaceAll("WW\\|","BB|");
            }
        }

        for(int i=1;i<8;i+=2)
        {
            for(int j=0;j<8;j+=2)
            {
                chessBoard[i][j]=chessBoard[i][j].replaceAll("WW\\|","BB|");
            }
        }

        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                System.out.print(chessBoard[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        System.out.println("My Chess Board");
        chessBoard();
    }

}
