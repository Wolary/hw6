package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromPath;

public class TxtTest {

    @Test
        void txtTest () throws IOException {
            String txtFilePath = "./src/test/resources/m.txt";
            String expectedData = "Десять тысяч обезьян, в жопу сунули банан";

            String actualData = readTextFromPath(txtFilePath);
            assertThat(actualData, containsString(expectedData));
        }

}
