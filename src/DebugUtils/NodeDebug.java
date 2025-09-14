package DebugUtils;

import javafx.geometry.Insets;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;


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
}
