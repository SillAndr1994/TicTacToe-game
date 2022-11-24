import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<String> field = new ArrayList<>();
    public Field() {
        this.field = createField();
    }

    public void showField() {
        for (String s : field) {
            System.out.print(s);
        }
    }

    public void clearField() {
        System.out.print("\033[H\033[J");
    }

    private List<String> createField() {
        List<String> field = new ArrayList<>();

        field.add("-----------\n");

        for (int i = 0; i < 3; i++) {
            for (int i1 = 0; i1 < 3; i1++) {
                field.add("|.| ");
            }
            field.add("\n");
        }

        field.add("-----------");

        return field;
    }


    public static void main(String[] args) throws InterruptedException {
        Field field1 = new Field();

        field1.showField();

    }
}
