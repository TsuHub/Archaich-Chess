package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public class ChessPiece extends Piece
{
    public Color color;

    public ChessPiece(Position position, Board board, Color color){
        super(position, board);
        this.color = color;
    }

    public Color getColor(){
        return color;
    }
}
