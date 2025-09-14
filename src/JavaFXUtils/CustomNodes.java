package JavaFXUtils;

import ImportUtils.ImageLoader;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

import java.util.Objects;

public class CustomNodes {

    ImageLoader imageLoader = new ImageLoader();

    /**
    * The {@code params} for the action to be initiated
    */
    @FunctionalInterface
    public interface ActionEvent{
        void run();
    }

    /**
    *
    * @param txt The text to be displayed on the button
    * @param font The font style of the text
    * @param event The action to be executed when clicking the button
    * @param styleClass Optional custom styling using css
    * @return The button
    */
    public Button newButton(String txt, Font font, String styleClass, ActionEvent event){
        Button button = new Button(txt);
        button.setFont(font);
        button.setOnAction(_ -> event.run());
        if(styleClass != null) button.getStyleClass().add(styleClass);
        return button;
    }

    /**
    *
    * @param txt The text to be displayed on the button
    * @param width The width of the button
    * @param height The height of the button
    * @param font The font style of the text
    * @param event The action to be executed when clicking the button
    * @param styleClass Optional custom styling using css
    * @param lockSize The option whether to lock the size of the button to its width and height
    * @return The button
    */
    public Button newButton(String txt, double width, double height, Font font, String styleClass, boolean lockSize,  ActionEvent event){
        Button button = new Button(txt);
        button.setFont(font);
        button.setPrefWidth(width);
        button.setPrefHeight(height);
        if(lockSize){
            button.setMaxWidth(width);
            button.setMaxHeight(height);
        }
        button.setOnAction(_ -> event.run());
        if(styleClass != null) button.getStyleClass().add(styleClass);
        return button;
    }

    /**
    *
    * @param parent  The root pane of the scene
    * @param styleSheet  Optional styling using css
    * @return The scene
    */
    public Scene newEmptyScene(Parent parent, String styleSheet){
        Scene scene = new Scene(parent);
        if(styleSheet != null) scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource(styleSheet)).toExternalForm());
        return scene;
    }

    /**
     *
     * @param parent The root pane of the scene
     * @param width The width of the scene
     * @param height The height of the scene
     * @param styleSheet Optional styling using css
     * @return The scene
     */
    public Scene newEmptyScene(Parent parent, double width, double height, String styleSheet){
        Scene scene = new Scene(parent, width, height);
        if(styleSheet != null) scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource(styleSheet)).toExternalForm());
        return scene;
    }

    /**
     *
     * @param txt The text for the label to display
     * @param color The color for the text
     * @param font The font for the text
     * @param styleClass Optional styling using css
     * @return The label
     */
    public Label newLabel(String txt, Paint color, Font font, String styleClass){
        Label label = new Label(txt);
        label.setTextFill(color);
        label.setFont(font);
        if(styleClass != null) label.getStyleClass().add(styleClass);
        return label;
    }

    /**
     *
     * @param path The pathname of the image inside the {@code src} folder
     * @param width The width of the image view
     * @param height The height of the image view
     * @param preserveRatio Preserves the ratio of the image
     * @return The image view
     */
    public ImageView newImageView(String path, double width, double height, boolean preserveRatio){
        Image image = imageLoader.loadImage(path);
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);
        imageView.setPreserveRatio(preserveRatio);
        return imageView;
    }

    /**
     *
     * @param image The image to be displayed
     * @param width The width of the image view
     * @param height The height of the image view
     * @param preserveRatio Preserves the ratio of the image
     * @return The image view
     */
    public ImageView newImageView(Image image, double width, double height, boolean preserveRatio){
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);
        imageView.setPreserveRatio(preserveRatio);
        return imageView;
    }

    /**
     *
     * @param path The pathname of the image outside the {@code src} folder
     * @param width The width of the image view
     * @param height The height of the image view
     * @param preserveRatio Preserves the ratio of the image
     * @return The image view
     */
    public ImageView newImageViewExternal(String path, double width, double height, boolean preserveRatio){
        Image image = imageLoader.loadExternalImage(path);
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);
        imageView.setPreserveRatio(preserveRatio);
        return imageView;
    }

    /**
     *
     * @param values The values that will be listed in the combo box
     * @param defaultValue The default value that will be selected and displayed
     * @param styleClass Optional styling using css
     * @return The combo box
     * @param <T> The variable type of the values
     */
    public <T> ComboBox<T> newComboBox(ObservableList<T> values, T defaultValue, String styleClass){
        ComboBox<T> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(values);
        if(styleClass != null) comboBox.getStyleClass().add(styleClass);
        if(defaultValue != null) comboBox.setValue(defaultValue);
        return comboBox;
    }

    /**
     *
     * @param values The values that will be listed in the combo box
     * @param defaultValue The default value that will be selected and displayed
     * @param width The preferred width of the combo box (Set it to 0 for default)
     * @param height The preferred height of the combo box (Set it to 0 for default)
     * @param styleClass Optional styling using css
     * @return The combo box
     * @param <T> The variable type of the values
     */
    public <T> ComboBox<T> newComboBox(ObservableList<T> values, T defaultValue, double width, double height, String styleClass){
        ComboBox<T> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(values);
        if(width != 0) comboBox.setPrefWidth(width);
        if(height != 0) comboBox.setPrefHeight(height);
        if(styleClass != null) comboBox.getStyleClass().add(styleClass);
        if(defaultValue != null) comboBox.setValue(defaultValue);
        return comboBox;
    }
}
