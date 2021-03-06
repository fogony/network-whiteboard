package client;

import client.controller.NwbDrawingCanvasController;
import client.controller.NwbHorToolbarActionController;
import client.controller.NwbMenuActionController;
import client.controller.NwbVerToolbarActionController;
import client.model.NwbClientModel;
import client.view.NwbClientViewFrame;
import client.view.ui.controller.NwbCanvasUIHandler;
import client.view.ui.factory.NwbHorToolBarFactory;
import client.view.ui.factory.NwbMenuFactory;
import client.view.ui.factory.NwbVerToolBarFactory;
import org.jdesktop.application.Application;

/**
 * Created with IntelliJ IDEA.
 * User: hanmoi
 * Date: 15/09/12
 * Time: 12:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class NwbClientApplication extends Application {
    @Override
    protected void startup() {
        //Controller
        NwbDrawingCanvasController drawingCanvasController = new NwbDrawingCanvasController();
        NwbMenuActionController menuActionController = new NwbMenuActionController();
        NwbHorToolbarActionController horToolbarActionController = new NwbHorToolbarActionController();
        NwbVerToolbarActionController verToolbarActionController = new NwbVerToolbarActionController();
        NwbMenuFactory.setActionMap(menuActionController);
        NwbHorToolBarFactory.setActionMap(horToolbarActionController);
        NwbVerToolBarFactory.setActionMap(verToolbarActionController);

        //View
        NwbCanvasUIHandler mouseAdapter = new NwbCanvasUIHandler(drawingCanvasController);
        NwbClientViewFrame view = new NwbClientViewFrame(mouseAdapter);
        drawingCanvasController.setCanvasDrawble(mouseAdapter);
        menuActionController.setCanvasDrawble(mouseAdapter);
        horToolbarActionController.setCanvasDrawble(mouseAdapter);
        verToolbarActionController.setCanvasDrawble(mouseAdapter);

        //Model
        NwbClientModel model = new NwbClientModel();
        drawingCanvasController.setModel(model);
        menuActionController.setModel(model);
        horToolbarActionController.setModel(model);
        verToolbarActionController.setModel(model);

        view.showView();

    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        Application.launch(NwbClientApplication.class, args);
    }
}
