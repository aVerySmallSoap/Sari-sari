package UI;

import UI.Custom.Colors.Colors;
import UI.Custom.Components.ProductsPanel;
import UI.Custom.Components.informationPanel;
import UI.Custom.Fonts.FontRegistry;
import UI.Interfaces.UserInterface;
import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class mainUI implements UserInterface {
    private void preComponentInitializer(){
        FontRegistry.registerRequiredFonts();
    }

    @Override
    public void initComponents() {
        JFrame mainFrame = new JFrame();
        JPanel topWrapper = new JPanel(new BorderLayout());
        JPanel centerWrapper = new JPanel(new BorderLayout());
        JPanel headerWrapper = new JPanel();
        JLabel Header = new JLabel("Online Sari-Sari Store");
        ProductsPanel leftOnCenter = new ProductsPanel();
        informationPanel rightOnCenter = new informationPanel();

        mainFrame.setVisible(true);
        mainFrame.setSize(new Dimension(980,650));
        mainFrame.setTitle("Online Sari-Sari Store");
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.add(topWrapper, BorderLayout.NORTH);
        mainFrame.add(centerWrapper, BorderLayout.CENTER);

        //Header
        topWrapper.add(headerWrapper, BorderLayout.NORTH);
        topWrapper.setBorder(new EmptyBorder(10,0,10,0));
        headerWrapper.setBackground(Colors.PRIMARY);
        headerWrapper.add(Header);
        Header.setFont(new Font("Segoe UI Bold Italic", Font.BOLD, 24));

        //Left
        centerWrapper.add(leftOnCenter, BorderLayout.WEST);
        leftOnCenter.setBackground(Colors.SECONDARY);

        //right
        centerWrapper.add(rightOnCenter, BorderLayout.CENTER);
        rightOnCenter.setBackground(Colors.SECONDARY);
        rightOnCenter.setBorder(new MatteBorder(0,10,0,0, topWrapper.getBackground()));
    }

    @Override
    public void Run() {
        preComponentInitializer();
        initComponents();
    }
}
