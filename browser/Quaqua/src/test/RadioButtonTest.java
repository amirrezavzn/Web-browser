/*
 * @(#)RadioButtonTest.java  1.0  13 February 2005
 *
 * Copyright (c) 2004 Werner Randelshofer, Switzerland.
 * You may not use, copy or modify this file, except in compliance with the
 * accompanying license terms.
 */

package test;

import ch.randelshofer.quaqua.*;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;
import javax.swing.border.*;
/**
 * RadioButtonTest.
 *
 * @author  Werner Randelshofer
 * @version 1.0  13 February 2005  Created.
 */
public class RadioButtonTest extends javax.swing.JPanel {
    
    /** Creates new form. */
    public RadioButtonTest() {
        initComponents();


        for (JComponent c:new JComponent[]{smallRadio1,smallRadio2,smallRadio3,smallLabel}) {
            c.putClientProperty("JComponent.sizeVariant","small");
        }
        for (JComponent c:new JComponent[]{miniRadio1,miniRadio2,miniRadio3,miniLabel}) {
            c.putClientProperty("JComponent.sizeVariant","mini");
        }
        
        
        // Try to get a better layout with J2SE6
        try {
            int BASELINE_LEADING = GridBagConstraints.class.getDeclaredField("BASELINE_LEADING").getInt(null);
            GridBagLayout layout = (GridBagLayout) getLayout();
            for (Component c : getComponents()) {
                GridBagConstraints gbc = layout.getConstraints(c);
                if (gbc.anchor == GridBagConstraints.WEST) {
                    gbc.anchor = BASELINE_LEADING;
                    layout.setConstraints(c, gbc);
                }
            }
        } catch (Exception ex) {
            // bail
        }
        
    }
    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(QuaquaManager.getLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFrame f = new JFrame("Quaqua RadioButton Test");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new RadioButtonTest());
        ((JComponent) f.getContentPane()).setBorder(new EmptyBorder(9,17,17,17));
        f.pack();
        f.setVisible(true);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        regularGroup = new javax.swing.ButtonGroup();
        smallGroup = new javax.swing.ButtonGroup();
        bigGroup = new javax.swing.ButtonGroup();
        miniGroup = new javax.swing.ButtonGroup();
        radio1 = new javax.swing.JRadioButton();
        enabledLabel = new javax.swing.JLabel();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        disabledLabel = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        smallRadio1 = new javax.swing.JRadioButton();
        smallLabel = new javax.swing.JLabel();
        smallRadio2 = new javax.swing.JRadioButton();
        smallRadio3 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        miniRadio1 = new javax.swing.JRadioButton();
        miniRadio2 = new javax.swing.JRadioButton();
        miniRadio3 = new javax.swing.JRadioButton();
        miniLabel = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        bigRadio = new javax.swing.JRadioButton();
        bigLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 17, 17, 17));
        setLayout(new java.awt.GridBagLayout());

        regularGroup.add(radio1);
        radio1.setText("??ngstr??m H");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(radio1, gridBagConstraints);

        enabledLabel.setText("Enabled");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(enabledLabel, gridBagConstraints);

        regularGroup.add(radio2);
        radio2.setSelected(true);
        radio2.setText("??ngstr??m H");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(radio2, gridBagConstraints);

        regularGroup.add(radio3);
        radio3.setText("??ngstr??m H");
        radio3.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(radio3, gridBagConstraints);

        disabledLabel.setText("Disabled");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(disabledLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        add(separator, gridBagConstraints);

        smallGroup.add(smallRadio1);
        smallRadio1.setSelected(true);
        smallRadio1.setText("??ngstr??m H");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(smallRadio1, gridBagConstraints);

        smallLabel.setText("Small");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(smallLabel, gridBagConstraints);

        smallGroup.add(smallRadio2);
        smallRadio2.setText("??ngstr??m H");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(smallRadio2, gridBagConstraints);

        smallGroup.add(smallRadio3);
        smallRadio3.setText("??ngstr??m H");
        smallRadio3.setEnabled(false);
        smallRadio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallRadio3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(smallRadio3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        add(jSeparator1, gridBagConstraints);

        miniGroup.add(miniRadio1);
        miniRadio1.setSelected(true);
        miniRadio1.setText("??ngstr??m H");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(miniRadio1, gridBagConstraints);

        miniGroup.add(miniRadio2);
        miniRadio2.setText("??ngstr??m H");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(miniRadio2, gridBagConstraints);

        miniGroup.add(miniRadio3);
        miniRadio3.setText("??ngstr??m H");
        miniRadio3.setEnabled(false);
        miniRadio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miniRadio3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(miniRadio3, gridBagConstraints);

        miniLabel.setText("Mini");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(miniLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        add(separator1, gridBagConstraints);

        bigGroup.add(bigRadio);
        bigRadio.setFont(new java.awt.Font("Lucida Grande", 0, 24));
        bigRadio.setText("??ngstr??m H");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(bigRadio, gridBagConstraints);

        bigLabel.setText("Large Font");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(bigLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 99;
        gridBagConstraints.weighty = 1.0;
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void smallRadio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallRadio3ActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_smallRadio3ActionPerformed

    private void miniRadio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniRadio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miniRadio3ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bigGroup;
    private javax.swing.JLabel bigLabel;
    private javax.swing.JRadioButton bigRadio;
    private javax.swing.JLabel disabledLabel;
    private javax.swing.JLabel enabledLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.ButtonGroup miniGroup;
    private javax.swing.JLabel miniLabel;
    private javax.swing.JRadioButton miniRadio1;
    private javax.swing.JRadioButton miniRadio2;
    private javax.swing.JRadioButton miniRadio3;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.ButtonGroup regularGroup;
    private javax.swing.JSeparator separator;
    private javax.swing.JSeparator separator1;
    private javax.swing.ButtonGroup smallGroup;
    private javax.swing.JLabel smallLabel;
    private javax.swing.JRadioButton smallRadio1;
    private javax.swing.JRadioButton smallRadio2;
    private javax.swing.JRadioButton smallRadio3;
    // End of variables declaration//GEN-END:variables
    
}
