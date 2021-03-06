package client.view.ui.comp;

import client.view.ui.controller.NwbUIMediator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created with IntelliJ IDEA.
 * User: hanmoi
 * Date: 17/09/12
 * Time: 12:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class NwbJToggleButton extends JToggleButton implements NwbUIMediatee {

    private ImageIcon hoverIcon;
    private ImageIcon icon;
    private NwbUIMediator mediator;

    public NwbJToggleButton() {
        super();
    }

    @Override
    public void setMediator(NwbUIMediator mediator) {
        this.mediator = mediator;
        this.mediator.register(this);
    }

    public NwbJToggleButton(String title) {
        super(title);
//        addMouseListener();
    }

    public void setHoverIcon(ImageIcon hoverIcon) {
        this.hoverIcon = hoverIcon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    @Override
    public void notifyToMediator() {
        this.mediator.buttonClicked(this);
    }

    private void addMouseListener() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                NwbJToggleButton button = (NwbJToggleButton) e.getSource();
                if (!button.isSelected())
                    button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                NwbJToggleButton button = (NwbJToggleButton) e.getSource();
                if (!button.isSelected())
                    button.setBorder(BorderFactory.createEmptyBorder());
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                NwbJToggleButton button = (NwbJToggleButton) e.getSource();
                button.setBorder(BorderFactory.createEmptyBorder());
            }
        });
    }

    @Override
    public void updateUI() {
        super.updateUI();
    }
}
