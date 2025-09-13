package ImportUtils;

import javafx.scene.text.Font;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FontLoader {

    InputStream f1;
    Font font;


    /**
     * Imports fonts that are inside the {@code src} folder
     * @param path The pathname of the font to be imported
     * @param size The size of the font
     * @return The font that is imported
     */
    public Font loadFont(String path, double size) {

        f1 = this.getClass().getResourceAsStream(path);

        font = Font.loadFont(f1, size);

        return font;
    }

    /**
     * Imports fonts that are outside the {@code src} folder
     * @param path The pathname of the font to be imported
     * @param size The size of the font
     * @return The font that is imported
     */
    public Font loadExternalFont(String path, double size){

        try {
            f1 = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        font = Font.loadFont(f1, size);

        return font;
    }
}
