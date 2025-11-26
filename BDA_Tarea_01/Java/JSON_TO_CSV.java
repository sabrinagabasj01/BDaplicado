
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSON_TO_CSV {
    public static void main(String[] args) throws Exception { /
 
    License licenseToConvertJSON = new License();
    licenseToConvertJSON.setLicense("Aspose.Cells.lic");

    String content = new String(Files.readAllBytes(Paths.get("/home/iabd00/Descargas/kz.json")));

    Workbook workbook = new Workbook();

    Cells cells = workbook.getWorksheets().get(0).getCells();
    JsonLayoutOptions options = new JsonLayoutOptions();
    options.setConvertNumericOrDate(true);
    options.setArrayAsTable(true);
    options.setIgnoreArrayTitle(true);
    options.setIgnoreObjectTitle(true);
    JsonUtility.importData(content, cells, 0, 0, options);

    workbook.save("java.csv");
    }
}