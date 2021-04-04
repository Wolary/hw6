package tests;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromPath;
import static utils.ZipFiles.unZip;

public class ZipTest {

    @Test
    void xlsSimple() throws IOException, ZipException {
        String zipFilePath = "./src/test/resources/m.zip";
        String unzipFolderPath = "./src/test/resources/unzip";
        String pass = "";
        String unziptxtFilePath = "./src/test/resources/unzip/m.txt";
        String expectedData = "Десять тысяч обезьян, в жопу сунули банан";

        unZip(zipFilePath, unzipFolderPath, pass);

        String actualData = readTextFromPath(unziptxtFilePath);
        assertThat(actualData, containsString(expectedData));
    }


}
