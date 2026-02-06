package Parse;

public class StringHelper {
    // Helper function to find the next escape and return its index
    private static int findEscape(int lastIndex, String myString) {
        for (int i = lastIndex; i < myString.length(); i++) {
            if (myString.charAt(i) == '\\') {
                return i;
            }
        }
        return -1;// Failed to find a back slash
    }

    public static String convertEsc(String text) {
        StringBuilder sb = new StringBuilder(text);
        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = findEscape(lastIndex, sb.toString());
            if (lastIndex == -1) {
                break;
            }
            // remove exisitng backslash
            sb.deleteCharAt(lastIndex);
            if (lastIndex >= sb.length()) {
                break;// avoid case where \ is at end of string causign a crash.
            }
            // escape char after / is now at the correct index to remove and swap with real
            // escape
            char escapeType = sb.charAt(lastIndex);
            if (escapeType == 'n') {
                sb.setCharAt(lastIndex, '\n');
            } else if (escapeType == 't') {
                sb.setCharAt(lastIndex, '\t');
            } else if (escapeType == 'r') {
                sb.setCharAt(lastIndex, '\r');
            } else if (escapeType == '"') {
                sb.setCharAt(lastIndex, '\"');
            } else if (escapeType == '\\') {
                sb.setCharAt(lastIndex, '\\');
            } else if (escapeType == 'b') {
                sb.setCharAt(lastIndex, '\b');
            } else if (escapeType == 'f') {
                sb.setCharAt(lastIndex, '\f');
            } else if (escapeType == 'v') {
                sb.setCharAt(lastIndex, (char) 0x0B);
            } else if (escapeType == 'a') {
                sb.setCharAt(lastIndex, (char) 0x07);
            } else if (escapeType == '?') {
                sb.setCharAt(lastIndex, '?');
            } else if (escapeType == '\'') {
                sb.setCharAt(lastIndex, '\'');
            }
            lastIndex++;// Increment to next index to avoid infinite loop
        }
        return sb.toString();
    }
}