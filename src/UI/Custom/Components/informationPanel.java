package UI.Custom.Components;

import UI.Interfaces.UserInterface;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("SpellCheckingInspection")
public class informationPanel extends JPanel implements UserInterface {
    final GridBagConstraints constraints = new GridBagConstraints();
    @SuppressWarnings("CanBeFinal")
    String[] Columns = {"First Name","Middle Initial","Last Name", "Set"};
    @SuppressWarnings("CanBeFinal")
    Object[][] fersons = {
            {"Lirys Nhoj Roben", "S.", "Belleza", "BSIT-1G"},
            {"Romel", "C.", "Cadungon", "BSIT-1G"},
            {"Fernil", "M.", "Baba", "BSIT-1G"},
            {"Khenjhie", "A.", "Apostol", "BSIT-1G"}
    };

    private void initComponents() {
        JLabel selectedProd = new JLabel("Selected Products:");
        JTable productsView = new JTable(fersons,Columns);
        JScrollPane tableScroller = new JScrollPane(productsView);
        JLabel totalLabel = new JLabel("Total:");
        JTextField amount = new JTextField();
        JButton button1 = new JButton("Pay");
        JButton button2 = new JButton("Clear");

        this.setLayout(new GridBagLayout());
        constraints.gridy = 0;
        constraints.insets = new Insets(-20,-40,-35,-125);
        selectedProd.setFont(new Font("Segoe UI Bold Italic", Font.BOLD, 14));
        this.add(selectedProd, constraints);
        constraints.gridy = 1;
        constraints.gridx = 2;
        constraints.insets = new Insets(35,0,0,0);
        this.add(tableScroller, constraints);

        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.VERTICAL;
        constraints.insets = new Insets(10,-418,0,0);
        totalLabel.setFont(new Font("Segoe UI Bold Italic", Font.BOLD, 14));
        this.add(totalLabel, constraints);
        constraints.insets = new Insets(10,-240,0,0);
        amount.setPreferredSize(new Dimension(110,50));
        this.add(amount, constraints);
        constraints.insets = new Insets(10,0,0,-225);
        this.add(button1, constraints);
        constraints.insets = new Insets(10,0,0,-380);
        this.add(button2, constraints);
    }

    @Override
    public void Run() {
        initComponents();
    }

    public informationPanel(){
        Run();
    }
}
