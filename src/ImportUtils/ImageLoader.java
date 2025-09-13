package ImportUtils;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ImageLoader {

    InputStream f1;
    Image image;

    /**
     * Loads images that are inside the {@code src} folder
     * @param path The pathname of the image to be imported
     * @return The image that is imported
     */
    public Image loadImage(String path){

        f1 = this.getClass().getResourceAsStream(path);

        assert f1 != null;
        image = new Image(f1);

        return image;
    }

    /**
     * Imports images that are outside the {@code src} folder
     * @param path - The pathname of the image to be imported
     * @return The image that is imported
     */
    public Image loadExternalImage(String path){

        try {
            f1 = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        image = new Image(f1);

        return image;
    }
}
