package Review_4;

public class Knight extends ChessPieces implements Moveable, Jumpable {

    @Override
    public void capture() {
        System.out.println("Knight captures other piece");
    }

    @Override
    public void move() {
        System.out.println("Knight moves to other square in L shape");
    }

    @Override
    public void jump() {
        System.out.println("Knight jumps accross the squares");
    }
    
}
