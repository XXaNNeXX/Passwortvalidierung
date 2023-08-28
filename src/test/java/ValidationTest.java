import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidationTest {

    @Test
    void passwordLength_isTrue() {

        String pw = "password";
        boolean actual = Validation.isValid(pw);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void password_containsNumbers_isTrue() {
        String pw = "123456";
        boolean actual = Validation.containsNumbers(pw);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void password_containsUpperLowerCase_IsTrue() {
        String pw = "Password";
        boolean actual = Validation.containsUpperLowerCase(pw);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void password_containsBadString_isTrue() {
        String pw = "passwort";
        boolean actual = Validation.containsBadString(pw);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void password_containsSpecialCharacters_isTrue() {
        String pw = "password#";
        boolean actual = Validation.containsSpecialCharacters(pw);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void password_containsSpecialCharacters_isFalse() {
        String pw = "password";
        boolean actual = Validation.containsSpecialCharacters(pw);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void password_containsSpecialCharacters_isTrue2() {
        String pw = "password#";
        boolean actual = Validation.containsSpecialCharacters2(pw);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void password_containsSpecialCharacters_isFalse2() {
        String pw = "password#";
        boolean actual = Validation.containsSpecialCharacters2(pw);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

}
