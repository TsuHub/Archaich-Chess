package boardgame;

public class Piece
{
    protected Position position;
    private Board board;

    public Piece(Board board){
        this.board = board;
        // position = null;     // Esta linha é desnecessária, já que por padrão o Java já define position como null.
    }

    protected Board getBoard(){
        return board;
    }
}
