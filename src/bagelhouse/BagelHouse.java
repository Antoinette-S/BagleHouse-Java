package bagelhouse;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class BagelHouse extends JFrame{
    private CoffeePanel coffee;
    private ToppingPanel topping;
    private GreetingPanel greeting;
    private BagelPanel bagel;
    private JPanel buttonPanel;
    private JButton calcButton;
    private JButton exitButton;

    public BagelHouse() {
        super("Order Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        coffee = new CoffeePanel();
        topping = new ToppingPanel();
        bagel = new BagelPanel();
        greeting = new GreetingPanel();
        buildButtonPanel();
        add(greeting, BorderLayout.NORTH);
        add(bagel, BorderLayout.WEST);
        add(topping, BorderLayout.CENTER);
        add(coffee, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
        setVisible(true);   
    }

    private void buildButtonPanel(){
        calcButton = new JButton("Calculate Order");
        calcButton.addActionListener(new CalcButtonListener());
        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ExitButtonListener());
        
        buttonPanel = new JPanel();
        buttonPanel.add(calcButton);
        buttonPanel.add(exitButton);
    }
    
    private class CalcButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double subTotal;
            double salesTax;
            double totalOrderCharge;
            DecimalFormat dollar = new DecimalFormat("#,##0.00");
            subTotal = topping.getTotal() + bagel.getTotal() + coffee.getTotal();
            salesTax = subTotal * 0.06;
            totalOrderCharge = salesTax + subTotal;
            
            JOptionPane.showMessageDialog(null, "Subtotal: $" + dollar.format(subTotal)+ "\nSales Tax: $" + dollar.format(salesTax) + "\nOrder Total: $" + dollar.format(totalOrderCharge));
        }
    }
    
    private class ExitButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }

   
    public static void main(String[] args) {
        BagelHouse bagel = new BagelHouse();
    }
    
}
