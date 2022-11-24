import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GameMechanics {
    private Field field;
    private Player firstPlayer;
    private Player secondPlayer;

    public GameMechanics(Field field, Player firstPlayer, Player secondPlayer) {
        this.field = field;
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void startGame() {
        System.out.println("TicTacToe game");
        System.out.println("Start...");
        System.out.println();

        while (true) {
            field.showField();
            makeAMove(firstPlayer);
            makeAMove(secondPlayer);
        }

    }

    private void makeAMove(Player player) {
        System.out.print("Player " + player.getNumber() + " choose a cage and put " + player.getSign() + ": ");
        int cageValue = new Scanner(System.in).nextInt();

        if (checkCage(player, cageValue)) {
            putValue(player, cageValue);
            checkWin(player);
        }

    }

    private void checkWin(Player player) {
        List<String> values = field.getFieldValues();

        String letters = "";

        for (int i = 1; i < values.size(); i++) {

            letters += values.get(i);

            if (i % 3 == 0) {
                if (letters.length() - letters.replace(".", "").length() == 3) {
                    System.out.println("Player: " + player.getNumber() + " win");
                }
            }
        }
    }

    private boolean checkCage(Player player, int index) {
        return field.checkValue(index);
    }

    private void putValue(Player player, int index) {
        field.changeField(index, player.getSign());
    }

    public static void main(String[] args) {
        GameMechanics gameMechanics = new GameMechanics(new Field(), new Player(1, "x"), new Player(2, "0"));
        gameMechanics.startGame();
    }

}
