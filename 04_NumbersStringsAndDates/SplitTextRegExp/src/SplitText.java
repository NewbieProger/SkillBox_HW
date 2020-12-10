import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SplitText {
    public static void main(String[] args) throws IOException, URISyntaxException {
        SplitText qwe = new SplitText();
        String text = qwe.getText("InputText", " ");


        String replacedText = text.replaceAll("[.,/#!$%^&*;:{}=_`~()\\-\\d]", "")
                .replaceAll("\\s{2}", " ")
                .replace("-", " ")
                .replaceAll("\\s", "\r\n");

        String[] strings = replacedText.split(" ");
        for (String someThing : strings) {
            System.out.println(someThing);
        }
    }

    private String getText(String file, String delimiter) throws IOException, URISyntaxException {

        URL resource = this.getClass().getResource(file);

        return String.join(delimiter, Files.readAllLines(Paths.get(resource.toURI())));

    }

}