package bagelhouse;
import java.awt.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class ToppingPanel extends JPanel {
    private final double CREAM_CHEESE = 0.50;
    private final double BUTTER = 0.25;
    private final double PEACH_JELLY = 0.75;
    private final double BLUEBERRY_JELLY = 0.75;
    
    private JCheckBox ccheese;
    private JCheckBox butter;
    private JCheckBox peach;
    private JCheckBox blue;
    
    public ToppingPanel() {
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        ccheese = new JCheckBox("Cream Cheese ($" + dollar.format(CREAM_CHEESE)+ ")");
        butter = new JCheckBox("Butter ($" + dollar.format(BUTTER)+ ")");
        peach = new JCheckBox("Peach Jelly ($" + dollar.format(PEACH_JELLY)+ ")");
        blue = new JCheckBox("Blueberry Jelly ($" + dollar.format(BLUEBERRY_JELLY)+ ")");

        setLayout(new GridLayout(4,1));
        
        setBorder(BorderFactory.createTitledBorder("Bagel Topping"));
        
        add(ccheese);
        add(butter);
        add(peach);
        add(blue);
    }
    
    public double getTotal(){
        double total = 0.0;
        if (ccheese.isSelected())
            total += CREAM_CHEESE;
            
        if(butter.isSelected())
            total += BUTTER;
        
        if(peach.isSelected())
            total += PEACH_JELLY;        
             
        if(blue.isSelected())
            total += BLUEBERRY_JELLY;            
        
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
