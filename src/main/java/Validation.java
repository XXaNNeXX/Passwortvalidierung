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
}
