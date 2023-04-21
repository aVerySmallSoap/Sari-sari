package UI.Custom.Components;

import UI.Interfaces.UserInterface;

import javax.swing.*;
import java.awt.*;

public class ProductsPanel extends JPanel implements UserInterface {
    final GridBagConstraints constraints = new GridBagConstraints();

    private void initComponents() {
        JLabel products = new JLabel("Available Products:");
        JScrollPane productsScroller = new JScrollPane();
        JPanel listOfProducts = new JPanel(new GridLayout(0,3, 10,25));
        iconButton button1 = new iconButton("/UI/Misc/Images/1.png");
        iconButton button2 = new iconButton("/UI/Misc/Images/2.png");
        iconButton button3 = new iconButton("/UI/Misc/Images/3.png");
        iconButton button4 = new iconButton("/UI/Misc/Images/4.png");
        iconButton button5 = new iconButton("/UI/Misc/Images/5.png");
        iconButton button6 = new iconButton("/UI/Misc/Images/6.png");
        iconButton button7 = new iconButton("/UI/Misc/Images/7.png");
        iconButton button8 = new iconButton("/UI/Misc/Images/8.png");
        iconButton button9 = new iconButton("/UI/Misc/Images/9.png");
        iconButton button10 = new iconButton("/UI/Misc/Images/10.png");
        iconButton button11 = new iconButton("/UI/Misc/Images/11.png");
        iconButton button12 = new iconButton("/UI/Misc/Images/12.png");

        this.setLayout(new GridBagLayout());
        constraints.gridy = 1;
        constraints.insets = new Insets(-100,-310,0,0);
        products.setFont(new Font("Segoe UI Bold Italic", Font.BOLD, 14));
        this.add(products, constraints);

        constraints.gridy = 2;
        constraints.insets = new Insets(0,25,0,25);
        this.add(productsScroller, constraints);
        productsScroller.setViewportView(listOfProducts);
        productsScroller.setBorder(null);
        productsScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        productsScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        productsScroller.setPreferredSize(new Dimension(400,400));
        listOfProducts.setBackground(Color.white);
        listOfProducts.add(button1);
        listOfProducts.add(button2);
        listOfProducts.add(button3);
        listOfProducts.add(button4);
        listOfProducts.add(button5);
        listOfProducts.add(button6);
        listOfProducts.add(button7);
        listOfProducts.add(button8);
        listOfProducts.add(button9);
        listOfProducts.add(button10);
        listOfProducts.add(button11);
        listOfProducts.add(button12);
    }

    @Override
    public void Run() {
        initComponents();
    }

    public ProductsPanel(){
        Run();
    }
}
