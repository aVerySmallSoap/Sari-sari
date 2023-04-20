package UI.Custom.Components;

import javax.swing.*;
import java.awt.*;

public class iconButton extends JButton {

    public iconButton(String path){
        Image icon = new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(32,32, Image.SCALE_SMOOTH);
        this.setIcon(new ImageIcon(icon));
        this.setFocusPainted(false);
    }
}
