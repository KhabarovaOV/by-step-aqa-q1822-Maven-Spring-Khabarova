package by.step.aqa.q1822.Maven.Spring.Khabarova;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TryTest {

    @Test
    public void verifyUrl() {
        String url = System.getProperty("base-url");
        Assertions.assertEquals("http:\\\\google.com", url);
    }

    @Test
    public void verifyUsername () {
        String username = System.getProperty("user-name");
        Assertions.assertNotEquals("admin", username);
    }
}
