package client.drawing.strategy;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: hanmoi
 * Date: 15/09/12
 * Time: 6:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class NwbRoundedRectangleStrategy extends NwbDrawingStrategy {

    public static final int ARC_WIDTH = 15;
    public static final int ARC_HEIGHT = 15;

    @Override
    public void drawShape(Graphics2D g2D) {
        beforeDrawing(g2D);

        if(drawingInfo != null
            && drawingInfo.getStartPoint() != null
            && drawingInfo.getEndPoint() != null){
            int x = (drawingInfo.getStartPoint().x > drawingInfo.getEndPoint().x)
                    ?drawingInfo.getEndPoint().x
                    :drawingInfo.getStartPoint().x;
            int y = (drawingInfo.getStartPoint().y > drawingInfo.getEndPoint().y)
                    ?drawingInfo.getEndPoint().y
                    :drawingInfo.getStartPoint().y;
            int width = Math.abs((drawingInfo.getStartPoint().x - drawingInfo.getEndPoint().x));
            int height = Math.abs((drawingInfo.getStartPoint().y - drawingInfo.getEndPoint().y));
            g2D.drawRoundRect(x,
                    y,
                    width,
                    height,
                    ARC_WIDTH,
                    ARC_HEIGHT);

        }

        afterDrawing(g2D);
    }
}
