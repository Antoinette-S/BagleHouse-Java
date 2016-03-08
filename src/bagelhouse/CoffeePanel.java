package bagelhouse;
import java.awt.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class CoffeePanel extends JPanel {
    private final double REGULAR = 1.25;
    private final double DECAF = 1.25;
    private final double CAPP = 2.00;
    
    private JRadioButton regular;
    private JRadioButton decaf;
    private JRadioButton capp;
    
    private ButtonGroup bg;
    
    public CoffeePanel() {
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        regular = new JRadioButton("Regular Coffee ($" + dollar.format(REGULAR)+ ")");
        decaf = new JRadioButton("Decaf Coffee ($" + dollar.format(DECAF)+ ")");
        capp = new JRadioButton("Cappuccino ($" + dollar.format(CAPP)+ ")");
        
        bg = new ButtonGroup();
        bg.add(regular);
        bg.add(decaf);
        bg.add(capp);
        
        setLayout(new GridLayout(3,1));
        
        setBorder(BorderFactory.createTitledBorder("Coffee"));
        
        add(regular);
        add(decaf);
        add(capp);
    }
    
    public double getTotal(){
        double total = 0.0;
        if (regular.isSelected()){
            total = REGULAR;
        }
        else if(decaf.isSelected()){
            total = DECAF;
        }
        else if(capp.isSelected()){
            total = CAPP;
        }
        
        return total;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
