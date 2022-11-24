import java.util.Random;

public class Player {
    private String sign;
    private int number;

    public Player(int number, String sign) {
        this.number = number;
        this.sign = sign.toLowerCase();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Show information about player
     */
    public void playerInformation() {
        System.out.println("Player: " + number);
        System.out.println("Puts: " + sign);
    }
}
