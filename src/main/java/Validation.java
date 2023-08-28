import org.apache.commons.lang3.StringUtils;

public class Validation {

    public static boolean isValid(String pw) {

        int stringLength = pw.length();
        return stringLength >= 8;
    }

    public static boolean containsNumbers(String pw) {

        return pw.contains("1") || pw.contains("2") || pw.contains("3") || pw.contains("4") || pw.contains("5") || pw.contains("6") || pw.contains("7") || pw.contains("8") || pw.contains("9") || pw.contains("0");
    }


    public static boolean containsUpperLowerCase(String pw) {

        for(int i = 0; i < pw.length(); i++) {
            char c = pw.charAt(i);
            if(Character.isUpperCase(c)) {
                return true;
            }
            if(Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsBadString(String pw) {

       return (StringUtils.containsAny(pw, "123456") || StringUtils.containsAny(pw, "passwort"));
    }

    public static boolean containsSpecialCharacters(String pw) {

        char[] special = {'@', '+','%', '#'};
        for(char i : special) {
           if(StringUtils.containsAny(pw, i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSpecialCharacters2(String pw) {

        String special = "@%+#<>";
        for(char i : pw.toCharArray()) {
            if(special.contains(String.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public static String randomPassword(int length) {

        //c.f. https://xperti.io/blogs/generate-random-string-in-java/

        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        String specialChar = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        String all = lowerCase + upperCase + numbers + specialChar;

        StringBuilder s = new StringBuilder(length);

        for(int i = 0; i < length; i++) {
            int allInt = (int)(all.length() * Math.random());
            s.append(all.charAt(allInt));
        }
        return s.toString();
    }


}
