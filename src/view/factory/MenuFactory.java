package view.factory;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;

public final class MenuFactory {
	/**
	 * @wbp.factory
	 * @wbp.parser.entryPoint
	 */
	public static JMenu createFileMenu() {
		JMenu jmFile = new JMenu("File");

		JMenuItem jmiNew = new JMenuItem("New");
		jmiNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		jmFile.add(jmiNew);

		JMenuItem jmiOpen = new JMenuItem("Open");
		jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		jmFile.add(jmiOpen);

		JMenu jmiOpenRecent = new JMenu("Open Recent");
		jmFile.add(jmiOpenRecent);

		JSeparator sprFileFirst = new JSeparator();
		jmFile.add(sprFileFirst);

		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		jmFile.add(mntmSave);

		JMenuItem mntmSaveAs = new JMenuItem("Save As");
		mntmSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		jmFile.add(mntmSaveAs);

		JSeparator sprFileSecond = new JSeparator();
		jmFile.add(sprFileSecond);

		JMenuItem jmiQuit = new JMenuItem("Quit");
		jmiQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
		jmFile.add(jmiQuit);

		return jmFile;
	}

	public static JMenu createEditMenu() {
		JMenu jmEdit = new JMenu("Edit");

		JMenuItem jmiUndo = new JMenuItem("Undo");
		jmiUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		jmEdit.add(jmiUndo);

		JMenuItem jmiRedo = new JMenuItem("Redo");
		jmiRedo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_MASK));
		jmEdit.add(jmiRedo);

		JSeparator sprEdit = new JSeparator();
		jmEdit.add(sprEdit);

		return jmEdit;
	}
}