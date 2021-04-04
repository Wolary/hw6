package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.xlstest.XLS.containsText;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.getXLS;
import static utils.Files.readXlsxFromPath;

public class XlsTest {

@Test
    void xlsSimple () throws IOException {
        String xlsFilePath = "./src/test/resources/m.xls";
        String expectedData = "Десять тысяч обезьян, в жопу сунули банан";

    XLS sheet = new XLS(getXLS(xlsFilePath));
    assertThat(sheet, containsText(expectedData));
    }

@Test
    void xlsCell() throws IOException {
    String xlsFilePath = "./src/test/resources/m.xls";
    String expectedData = "Десять тысяч обезьян, в жопу сунули банан";

    XLS sheet = new XLS(getXLS(xlsFilePath));
    String actualData = sheet.excel.getSheetAt(0).getRow(1).getCell(1).toString();
    assertThat(actualData, containsString(expectedData));
}

@Test
    void xlsxTest() {
    String xlsFilePath = "./src/test/resources/m.xlsx";
    String expectedData = "Десять тысяч обезьян, в жопу сунули банан";

    String actualData = readXlsxFromPath(xlsFilePath);
    assertThat(actualData, containsString(expectedData));

}


}
