package integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import stuff.LittleTestClass;
import stuff.WebContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebContext.class)
public class GoogleTest {
    @Autowired
    protected WebDriver driver;

    @Test
    public void visitGoogle() {
        driver.get("https://www.google.se/");

        new LittleTestClass().justTesting();
    }
}
