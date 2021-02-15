package Review_4;

public class Pawn extends ChessPieces implements Moveable, Promotable {

    @Override
    public void capture() {
        System.out.println("Pawn capture other piece");
    }

    @Override
    public void move() {
        System.out.println("Pawn moves to other square in straight forward");
    }

    @Override
    public void promote() {
        System.out.println("Pawn promotes to be other piece");
    }
    
}
