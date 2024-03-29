/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tums.view;

import com.tums.utils.DateUtils;
import com.yetra.turing.api.IMachine;
import com.yetra.turing.impl.Machine;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        initInternals();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        totalBackBtn = new javax.swing.JButton();
        playBtn = new javax.swing.JButton();
        pauseBtn = new javax.swing.JButton();
        stopBtn = new javax.swing.JButton();
        totalForwBtn = new javax.swing.JButton();
        timeLbl = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TuMS v.0.0.1 alpha");

        jToolBar1.setRollover(true);

        totalBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tums/res/media-skip-backward.png"))); // NOI18N
        totalBackBtn.setFocusable(false);
        totalBackBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        totalBackBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(totalBackBtn);

        playBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tums/res/media-playback-start.png"))); // NOI18N
        playBtn.setFocusable(false);
        playBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        playBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        playBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(playBtn);

        pauseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tums/res/media-playback-pause.png"))); // NOI18N
        pauseBtn.setEnabled(false);
        pauseBtn.setFocusable(false);
        pauseBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pauseBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pauseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(pauseBtn);

        stopBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tums/res/media-playback-stop.png"))); // NOI18N
        stopBtn.setEnabled(false);
        stopBtn.setFocusable(false);
        stopBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stopBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        stopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(stopBtn);

        totalForwBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tums/res/media-skip-forward.png"))); // NOI18N
        totalForwBtn.setFocusable(false);
        totalForwBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        totalForwBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(totalForwBtn);

        timeLbl.setText("--:--:--");
        jToolBar1.add(timeLbl);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 317, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void playBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBtnActionPerformed
        playBtn.setEnabled(false);
        pauseBtn.setEnabled(true);
        stopBtn.setEnabled(true);
        totalBackBtn.setEnabled(false);
        totalForwBtn.setEnabled(false);
    }//GEN-LAST:event_playBtnActionPerformed

    private void stopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBtnActionPerformed
        playBtn.setEnabled(true);
        pauseBtn.setEnabled(false);
        stopBtn.setEnabled(false);
        totalBackBtn.setEnabled(true);
        totalForwBtn.setEnabled(true);
    }//GEN-LAST:event_stopBtnActionPerformed

    private void pauseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseBtnActionPerformed
        playBtn.setEnabled(true);
        pauseBtn.setEnabled(false);
        stopBtn.setEnabled(true);
        totalBackBtn.setEnabled(false);
        totalForwBtn.setEnabled(false);
    }//GEN-LAST:event_pauseBtnActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        JOptionPane.showMessageDialog(this,
                String.format("TuMS v.0.0.1 alpha %n %n Copyright (C) 2013 by gberend"),
                "About...", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void initInternals() {
        final int periodSecs = 1;
        TimerTask task = new TimerTask() {
            private final DateFormat fmt = new SimpleDateFormat("HH:mm:ss");
            private Date date = DateUtils.getDate(0,0,0,0,0,0);

            @Override
            public void run() {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        date = DateUtils.addSeconds(date, periodSecs);
                        timeLbl.setText(fmt.format(date));
                    }
                });
            }
        };
        Timer timer = new Timer(true);
        timer.schedule(task, 1000, periodSecs * 1000);
        // Test
        String[] Q = new String[] { "q0", "q1", "q2", "qe" };
        char[] Σ = new char[] { '|' };
        char[] Γ = new char[] { '|', '0', '1', '⊔' };
        IMachine machine = new Machine(Q, Σ, Γ, "q0", '⊔');
        System.out.println(machine);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JButton pauseBtn;
    private javax.swing.JButton playBtn;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JButton stopBtn;
    private javax.swing.JLabel timeLbl;
    private javax.swing.JButton totalBackBtn;
    private javax.swing.JButton totalForwBtn;
    // End of variables declaration//GEN-END:variables
}
