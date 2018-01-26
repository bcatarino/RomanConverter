import java.util.ArrayList;
import java.util.List;

public class RomanConverter {

    public int convertRoman(String expression) {

        if (expression.length() == 0) {
            throw new IllegalArgumentException("At least one symbol is needed");
        }

        List<Integer> integers = convertExpression(expression);

        int total = 0;
        for (int i = 0; i < integers.size(); i++) {
            if (i == integers.size() - 1 || integers.get(i) >= integers.get(i+1)) {
                total += integers.get(i);
            } else {
                total += integers.get(i+1) - integers.get(i);
                i++;
            }
        }

        return total;
    }

    private List<Integer> convertExpression(String expression) {
        List<Integer> values = new ArrayList<>();
        for (char c : expression.toCharArray()) {
            values.add(mapNumber(c));
        }
        return values;
    }

    private Integer mapNumber(char symbol) {
        switch (symbol) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
        }
        throw new IllegalArgumentException("Invalid symbol");
    }
}
