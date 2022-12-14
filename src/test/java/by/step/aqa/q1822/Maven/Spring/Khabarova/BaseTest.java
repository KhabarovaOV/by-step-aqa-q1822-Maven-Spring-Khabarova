package by.step.aqa.q1822.Maven.Spring.Khabarova;

import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BaseTest {
    @Autowired
    @Qualifier("propertiesReader")
    FileManager fileManager;

    @BeforeAll
    public void readProperties() {
        fileManager.readPropertiesFile();
    }
}
