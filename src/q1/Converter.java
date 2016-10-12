package q1;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Converter {

    private List<String> ESPATTERN = Arrays.asList("s", "sh", "ch", "o", "x");
    private List<String> VESPATTERN = Arrays.asList("f", "fe");
    private List<String> IESPATTERN = Arrays.asList("a", "i", "u", "e", "o");

    public String toPluralForm(String targetStr) {
        boolean matchedES = ESPATTERN.stream().anyMatch(s -> targetStr.endsWith(s));
        if (matchedES) {
            StringBuilder esBuilder = new StringBuilder();
            esBuilder.append(targetStr);
            esBuilder.append("es");
            return esBuilder.toString();
        }

        boolean matchedVES = VESPATTERN.stream().anyMatch(s -> targetStr.endsWith(s));
        if (matchedVES) {
            StringBuilder esBuilder = new StringBuilder();
            String excludeLastChar = targetStr.substring(0, targetStr.length() - 1);
            esBuilder.append(excludeLastChar);
            esBuilder.append("ves");
            return esBuilder.toString();
        }

        boolean matchedIES = IESPATTERN.stream().noneMatch(s -> Pattern.matches(".*" + s + "y$", targetStr));
        if (matchedIES) {
            StringBuilder esBuilder = new StringBuilder();
            String excludedLastChar = targetStr.substring(0, targetStr.length() - 1);
            esBuilder.append(excludedLastChar);
            esBuilder.append("ies");
            return esBuilder.toString();
        }

        StringBuilder eBuilder = new StringBuilder();
        eBuilder.append(targetStr);
        eBuilder.append("s");
        return eBuilder.toString();
    }
}
