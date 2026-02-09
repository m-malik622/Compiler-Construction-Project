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

    private static boolean isOctDigit(char c) {
        if (c >= '0' && c <= '7') {
            return true;
        }
        return false;
    }

    private static boolean isHexDigit(char c) {
        boolean isZeroTo = (c >= '0' && c <= '9');
        boolean isLowerTo = (c >= 'a' && c <= 'f');
        boolean isUpperTo = (c >= 'A' && c <= 'F');

        if (isZeroTo | isLowerTo | isUpperTo) {
            return true;
        }
        return false;
    }

    private static int getOctEnd(String escapeString, int startDigit) {
        int digiCount = 0;
        for (int i = startDigit; i < escapeString.length(); i++) {
            char curChar = escapeString.charAt(i);
            if (!isOctDigit(curChar)) {
                return i;
            }
            digiCount++;
            if (digiCount >= 3)
                return i + 1;
        }
        return escapeString.length();
    }

    private static int getHexEnd(String escapeString, int startDigit) {
        for (int i = startDigit; i < escapeString.length(); i++) {
            char curChar = escapeString.charAt(i);
            if (!isHexDigit(curChar)) {
                return i;
            }
        }
        return escapeString.length();
    }

    private static char getNormEscape(char escapeType) {
        if (escapeType == 'n') {
            return '\n';
        } else if (escapeType == 't') {
            return '\t';
        } else if (escapeType == 'r') {
            return '\r';
        } else if (escapeType == '"') {
            return '\"';
        } else if (escapeType == '\\') {
            return '\\';
        } else if (escapeType == 'b') {
            return '\b';
        } else if (escapeType == 'f') {
            return '\f';
        } else if (escapeType == 'v') {
            return (char) 0x0B;
        } else if (escapeType == 'a') {
            return (char) 0x07;
        } else if (escapeType == '?') {
            return '?';
        } else if (escapeType == '\'') {
            return '\'';
        } else {
            return escapeType;
        }
    }

    public static char hexToChar(String hexSub) {
        int intForm = Integer.parseInt(hexSub, 16);
        char charForm = (char) intForm;
        return charForm;
    }

    public static char octToChar(String octSub) {
        int intForm = Integer.parseInt(octSub, 8);
        char charForm = (char) intForm;
        return charForm;
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
            // handle hex
            if (escapeType == 'x') {
                // is hex
                int hexEnd = getHexEnd(sb.toString(), (lastIndex + 1));

                // Check to make sure digits were found after escape
                if (!isHexDigit(sb.charAt(lastIndex + 1))) {
                    throw new IllegalArgumentException("Parser Error: Invalid hex escape followed by no hex digits.");
                }

                String hexSub = sb.toString().substring((lastIndex + 1), hexEnd);
                char charForm = hexToChar(hexSub);
                // set new lastIndex
                sb.delete(lastIndex + 1, hexEnd);
                sb.setCharAt(lastIndex, charForm);
            } else if (isOctDigit(escapeType)) {
                // is oct
                int octEnd = getOctEnd(sb.toString(), lastIndex);
                String octSub = sb.toString().substring(lastIndex, octEnd);
                char charForm = octToChar(octSub);
                sb.delete(lastIndex + 1, octEnd);
                sb.setCharAt(lastIndex, charForm);
            } else {
                // Handle normal escapes
                sb.setCharAt(lastIndex, getNormEscape(escapeType));// Else normal escape
            }
            lastIndex++;// Increment to next index to avoid infinite loop
        }
        return sb.toString();
    }
}