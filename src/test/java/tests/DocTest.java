package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromPath;

public class DocTest {

    @Test
        void docTest () throws IOException {
            String docFilePath = "./src/test/resources/m.doc";
            String expectedData = "Десять тысяч обезьян, в жопу сунули банан";

            String actualData = readTextFromPath(docFilePath);
            assertThat(actualData, containsString(expectedData));
        }

}
