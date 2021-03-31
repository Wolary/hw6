package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.pdftest.PDF.containsText;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getPdf;

public class PDFTest {

    @Test
        void pdfTest () throws IOException {
            String pdfFilePath = "./src/test/resources/m.pdf";
            String expectedData = "Десять тысяч обезьян, в жопу сунули банан";

        PDF pdf = new PDF(getPdf(pdfFilePath));
        assertThat(pdf, containsText(expectedData));
        }

}
