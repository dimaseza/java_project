package Review_4;

public class Queen extends ChessPieces implements Moveable {

    @Override
    public void capture() {
        System.out.println("Queen captures other piece");
    }

    @Override
    public void move() {
        System.out.println("Queen moves to other square horizontally, vertically, and diagonally");
    }

}
