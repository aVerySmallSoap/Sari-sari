package UI.Custom.Components;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class iconButton extends JButton {

    public iconButton(String path){
        Image icon = new ImageIcon(Objects.requireNonNull(getClass().getResource(path))).getImage().getScaledInstance(48,48, Image.SCALE_SMOOTH);
        this.setIcon(new ImageIcon(icon));
        this.setFocusPainted(false);
    }
}
