public class Validation {

    public static boolean isValid(String pw) {

        int stringLength = pw.length();
        if(stringLength == 8) {
            return true;
        }
        return false;
    }
}
