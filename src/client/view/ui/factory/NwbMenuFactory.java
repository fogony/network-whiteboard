package client.view.ui.factory;

import client.controller.NwbMenuActionController;
import org.jdesktop.application.Application;

import javax.swing.*;

public final class NwbMenuFactory{
    private static ActionMap actionMap;

    public static void setActionMap(NwbMenuActionController controller){
        actionMap = Application.getInstance()
                .getContext()
                .getActionMap(NwbMenuActionController.class, controller);
    }

	public static JMenu createFileMenu() {

        JMenu jmFile = new JMenu("File");

		JMenuItem jmiNew = new JMenuItem("New");
        jmiNew.setAction(actionMap.get("doNew"));
		jmFile.add(jmiNew);

		JMenuItem jmiOpen = new JMenuItem("Open");
        jmiOpen.setAction(actionMap.get("doOpen"));
		jmFile.add(jmiOpen);

		JMenu jmiOpenRecent = new JMenu("Open Recent");
        jmiOpenRecent.setAction(actionMap.get("doOpenRecent"));
		jmFile.add(jmiOpenRecent);

		JSeparator sprFileFirst = new JSeparator();
		jmFile.add(sprFileFirst);

		JMenuItem jmiSave = new JMenuItem("Save");
        jmiSave.setAction(actionMap.get("doSave"));
		jmFile.add(jmiSave);

		JMenuItem jmiSaveAs = new JMenuItem("Save As");
        jmiSaveAs.setAction(actionMap.get("doSaveAs"));
		jmFile.add(jmiSaveAs);

		JSeparator sprFileSecond = new JSeparator();
		jmFile.add(sprFileSecond);

		JMenuItem jmiQuit = new JMenuItem("Quit");
        jmiQuit.setAction(actionMap.get("doQuit"));
		jmFile.add(jmiQuit);

		return jmFile;
	}

	public static JMenu createEditMenu() {
        JMenu jmEdit = new JMenu("Edit");

		JMenuItem jmiUndo = new JMenuItem("Undo");
        jmiUndo.setAction(actionMap.get("doUndo"));
//		jmiUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		jmEdit.add(jmiUndo);

		JMenuItem jmiRedo = new JMenuItem("Redo");
        jmiRedo.setAction(actionMap.get("doRedo"));
//		jmiRedo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
		jmEdit.add(jmiRedo);

		JSeparator sprEdit = new JSeparator();
		jmEdit.add(sprEdit);

		return jmEdit;
	}
}