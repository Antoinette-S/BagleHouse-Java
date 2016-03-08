package bagelhouse;
import java.awt.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class BagelPanel extends JPanel {
    private final double WHITE_BAGEL = 1.25;
    private final double WHOLE_WHEAT_BAGEL = 1.5;
    
    private JRadioButton whiteBagel;
    private JRadioButton wheatBagel;
    
    private ButtonGroup bg;
    
    public BagelPanel() {
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        whiteBagel = new JRadioButton("White Bagel ($" + dollar.format(WHITE_BAGEL)+ ")");
        wheatBagel = new JRadioButton("Whole Wheat Bagel ($" + dollar.format(WHOLE_WHEAT_BAGEL)+ ")");
        
        bg = new ButtonGroup();
        bg.add(whiteBagel);
        bg.add(wheatBagel);
        
        setLayout(new GridLayout(2,1));
        
        setBorder(BorderFactory.createTitledBorder("Bagel"));
        
        add(whiteBagel);
        add(wheatBagel);
    }
    
    public double getTotal(){
        double total = 0.0;
        if (whiteBagel.isSelected()){
            total = WHITE_BAGEL;
        }
        else if(wheatBagel.isSelected()){
            total = WHOLE_WHEAT_BAGEL;
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
