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
        for (int i = 1; i < field.size(); i++) {
            if (i % 3 == 0) {
                System.out.print(field.get(i) + "\n");
            } else {
                System.out.print(field.get(i));
            }
        }
    }

    public void clearField() {
        System.out.print("\033[H\033[J");
    }

    private List<String> createField() {
        List<String> field = new ArrayList<>();

        field.add("-----------\n");
        int counter = 1;

         for (int i = 1; i < 10; i++) {
            String element = String.format("|%d|", i);
            field.add(element);

        }


        return field;
    }


    public static void main(String[] args) throws InterruptedException {
        Field field1 = new Field();

        field1.showField();

    }
}
