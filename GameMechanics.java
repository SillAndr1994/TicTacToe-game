
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
            field.showField();
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
                if (countLetters(letters)) {
                    System.out.println("Player " + player.getNumber() + " win!!!!");
                    System.exit(5);
                }
            }
        }
    }

    private boolean countLetters(String letter) {
        long count1 = letter.chars().filter(ch -> ch == 'x').count();
        long count2 = letter.chars().filter(ch -> ch == '0').count();
        boolean result = false;

        if (count1 == 3 || count2 == 3) {
            result = true;
        }
        return result;
    }

    private boolean checkCage(Player player, int index) {
        return field.checkValue(index);
    }

    private void putValue(Player player, int index) {
        field.changeField(index, player.getSign());
    }

}
