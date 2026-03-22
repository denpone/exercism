import java.util.HashMap;
import java.util.Map;

class SqueakyClean {
    static String clean(String identifier) {
        Map<Character ,Character> map = new HashMap<>();
        map.put(' ', '_');
        map.put('4', 'a');
        map.put('3', 'e');
        map.put('1', 'l');
        map.put('0', 'o');
        map.put('7', 't');
        
        StringBuilder result = new StringBuilder();
        boolean toUpperCase = false;

        for (char c : identifier.toCharArray()) {
            if (map.containsKey(c)) {
                result.append(map.get(c));
            } else if (c == '-') {
                toUpperCase = true;
            } else if (Character.isLetterOrDigit(c)) {
                if (toUpperCase) {
                    result.append(Character.toUpperCase(c));
                    toUpperCase = false;
                } else {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
