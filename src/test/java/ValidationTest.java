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

}