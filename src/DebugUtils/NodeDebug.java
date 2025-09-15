package DebugUtils;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import static DebugUtils.SystemPrints.*;


/**
 * <pre>
 * <font color=red>WARNING: </font> <font color="white">ONLY PLACE THESE DEBUGS AFTER INITIALIZING THE SCENE
 *           OTHERWISE IT WILL THROW A NULL_POINTER_EXCEPTION</font>
 */
public class NodeDebug {

    /**
     *
     * @param pane The pane that will be debugged
     * @param debugColor The color of the background
     * @param showBind The key bind for toggling (eg. KeyCode.W)
     */
    public static void showBG(Pane pane, Paint debugColor, KeyCode showBind){
        pane.getScene().setOnKeyPressed(keyEvent -> {
            if(keyEvent.getCode() == showBind){
                if(pane.getBackground() == null){
                    pane.setBackground(Background.fill(debugColor));
                }else{
                    pane.setBackground(null);
                }
            }
        });

    }

    /**
     *
     * @param pane The pane that will be debugged
     * @param debugColor The color of the border
     * @param thickness The thickness of the border
     * @param showBind The key bind for toggling (eg. KeyBind.W)
     */
    public static void showBorder(Pane pane, Paint debugColor, int thickness, KeyCode showBind){
        pane.getScene().setOnKeyPressed(keyEvent -> {
            if(keyEvent.getCode() == showBind){
                if(pane.getBorder() == null){
                    pane.setBorder(new Border(new BorderStroke(debugColor, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(thickness), new Insets(0,0,0,0))));
                }else{
                    pane.setBorder(null);
                }
            }
        });
    }

    /**
     * Incrementally adjusts a node with a root container based on the amount using the following binds:
     * <pre></pre>
     * {@code I} UP, {@code K} DOWN, {@code J} LEFT, {@code L} RIGHT
     *
     * @param node The node to be adjusted
     * @param amount The amount of displacement
     */
    public static void translatePos(Node node, double amount){
        node.setFocusTraversable(true);
        node.requestFocus();
        node.setOnMouseClicked(_-> node.requestFocus());
        node.setOnKeyPressed(keyEvent -> {
            switch (keyEvent.getCode()){
                case KeyCode.I -> {
                    node.setTranslateY(node.getTranslateY() - amount);
                    linePrint("PosX (ORIGIN): " + node.getTranslateX() + "\nPosY (ORIGIN): " + node.getTranslateY());

                }
                case KeyCode.K -> {
                    node.setTranslateY(node.getTranslateY() + amount);
                    linePrint("PosX (ORIGIN): " + node.getTranslateX() + "\nPosY (ORIGIN): " + node.getTranslateY());

                }
                case KeyCode.J -> {
                    node.setTranslateX(node.getTranslateX() - amount);
                    linePrint("PosX (ORIGIN): " + node.getTranslateX() + "\nPosY (ORIGIN): " + node.getTranslateY());

                }
                case KeyCode.L -> {
                    node.setTranslateX(node.getTranslateX() + amount);
                    linePrint("PosX (ORIGIN): " + node.getTranslateX() + "\nPosY (ORIGIN): " + node.getTranslateY());
                }
            }
        });
    }

    /**
     * Incrementally adjusts a node without a root container based on the amount using the following binds:
     * <pre></pre>
     * {@code I} UP, {@code K} DOWN, {@code J} LEFT, {@code L} RIGHT
     * @param node The node to be adjusted
     * @param amount The amount of displacement
     */
    public static void adjustPos(Node node, double amount){
        node.setFocusTraversable(true);
        node.requestFocus();
        node.setOnMouseClicked(_-> node.requestFocus());
        node.setOnKeyPressed(keyEvent -> {
            switch (keyEvent.getCode()){
                case KeyCode.I -> {
                    node.setLayoutY(node.getLayoutY() - amount);
                    linePrint("PosX (ORIGIN): " + node.getLayoutX() + "\nPosY (ORIGIN): " + node.getLayoutY());

                }
                case KeyCode.K -> {
                    node.setLayoutY(node.getLayoutY() + amount);
                    linePrint("PosX (ORIGIN): " + node.getLayoutX() + "\nPosY (ORIGIN): " + node.getLayoutY());

                }
                case KeyCode.J -> {
                    node.setLayoutX(node.getLayoutX() - amount);
                    linePrint("PosX (ORIGIN): " + node.getLayoutX() + "\nPosY (ORIGIN): " + node.getLayoutY());

                }
                case KeyCode.L -> {
                    node.setLayoutX(node.getLayoutX() + amount);
                    linePrint("PosX (ORIGIN): " + node.getLayoutX() + "\nPosY (ORIGIN): " + node.getLayoutY());
                }
            }
        });
    }
}
