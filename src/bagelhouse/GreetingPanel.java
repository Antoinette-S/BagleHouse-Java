package bagelhouse;
import java.awt.*;
import javax.swing.*;

public class GreetingPanel extends JPanel {
    private JLabel welcome;
    
    public GreetingPanel() {
        welcome = new JLabel("Welcome to Betty's Bagel House", JLabel.CENTER);
        setLayout(new GridLayout(1, 1));
              
        welcome.setHorizontalTextPosition(JLabel.CENTER);
        add(welcome);      
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
