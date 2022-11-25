import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<String> fieldValues = new ArrayList<>();
    public Field() {
        this.fieldValues = createField();
    }

    /**
     * Show all field values
     */
    public void showField() {
        for (int i = 1; i < fieldValues.size(); i++) {
            if (i % 3 == 0) {
                System.out.print(fieldValues.get(i) + "\n");
            } else {
                System.out.print(fieldValues.get(i));
            }
        }
    }


    /**
     * Clear field in console
     */
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


    /**
     * CHange field value by index
     * @param index index in field
     * @param sign player sign
     */
    public void changeField(int index, String sign) {
        fieldValues.set(index, sign);
    }

    public boolean checkValue(int index) {
        boolean result = false;

        for (int i = 1; i < fieldValues.size(); i++) {
            if (fieldValues.get(i).equals(index)) {
                result = false;
            } else {
                result = true;
            }
        }
        return result;
    }

    public List<String> getFieldValues() {
        return fieldValues;
    }
}
