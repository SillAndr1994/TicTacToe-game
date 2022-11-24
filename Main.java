public class Main {
    public static void main(String[] args) {
        Player firstPlayer = new Player(1, "0");
        Player secondPlayer = new Player(2, "x");
        Field gameField = new Field();

        GameMechanics mechanics = new GameMechanics(gameField, firstPlayer, secondPlayer);


    }
}