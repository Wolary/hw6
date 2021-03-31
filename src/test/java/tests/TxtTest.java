package tests;

import static utils.Files.readTextFromPath;

public class TxtTest {

        void txtTest () {
            String txtFilePath = "./src/test/resources/m.txt";
            String expectedData = "Десять тысяч обезьян, в жопу сунули банан";

            String actualData = readTextFromPath(txtFilePath);

            assertThat

        }

}
