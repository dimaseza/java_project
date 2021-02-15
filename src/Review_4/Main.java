package Review_4;

public class Main {
    public static void main(String[] args) {
        Queen queen = new Queen();
        Knight knight = new Knight();
        Pawn pawn = new Pawn();
        Player player = new Player();
        
        queen.capture();
        queen.capture();
        queen.move();
        
        knight.capture();
        knight.move();
        knight.jump();
        
        pawn.capture();
        pawn.move();
        pawn.promote();
        
        player.move();
    }
}
