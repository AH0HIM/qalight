package play.chess;

import java.util.ArrayList;

public class ChessGame {
    public void chessGameRun(){
        ArrayList<Chess> listFigure = new ArrayList<>();
        listFigure.add(new King());
        listFigure.add(new King());
        listFigure.add(new Queen());
        listFigure.add(new Queen());
        listFigure.add(new Knight());
        listFigure.add(new Knight());

        for (Chess item: listFigure) {
            item.moveChess();
        }
    }
}
