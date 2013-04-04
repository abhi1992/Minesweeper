
package minesweeper;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek Banerjee
 */
public class x2 extends javax.swing.JFrame {

    public x2() {
        initComponents();
                      String h=jTextField89.getText();
        if(h.equals("EASY")){b=10;} else if(h.equals("MEDIUM")){b=15;} else if(h.equals("HARD")){b=20;} else if(h.equals("DIABOLICAL")){b=30;}
        m.intro(b);
        for(int u=1;u<=81;u++){
            q[u]=m.aa[u];}
        jTextField85.setText(""+b);
        jTextField83.setText(""+sc);jTextField87.setText(""+bdd);
     myt.schedule(tm, 0,10);ab=b;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jTextField70 = new javax.swing.JTextField();
        jTextField71 = new javax.swing.JTextField();
        jTextField72 = new javax.swing.JTextField();
        jTextField73 = new javax.swing.JTextField();
        jTextField74 = new javax.swing.JTextField();
        jTextField75 = new javax.swing.JTextField();
        jTextField76 = new javax.swing.JTextField();
        jTextField77 = new javax.swing.JTextField();
        jTextField78 = new javax.swing.JTextField();
        jTextField79 = new javax.swing.JTextField();
        jTextField80 = new javax.swing.JTextField();
        jTextField81 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextField82 = new javax.swing.JTextField();
        jTextField83 = new javax.swing.JTextField();
        jTextField84 = new javax.swing.JTextField();
        jTextField85 = new javax.swing.JTextField();
        jTextField86 = new javax.swing.JTextField();
        jTextField87 = new javax.swing.JTextField();
        jTextField88 = new javax.swing.JTextField();
        jTextField89 = new javax.swing.JTextField();
        jTextField91 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextField90 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jTextField1.setBackground(new java.awt.Color(0, 102, 102));
        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField1.setForeground(new java.awt.Color(153, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(0, 102, 102));
        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField2.setForeground(new java.awt.Color(153, 0, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(0, 102, 102));
        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField3.setForeground(new java.awt.Color(153, 0, 0));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(0, 102, 102));
        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField4.setForeground(new java.awt.Color(153, 0, 0));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(0, 102, 102));
        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField5.setForeground(new java.awt.Color(153, 0, 0));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(0, 102, 102));
        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField6.setForeground(new java.awt.Color(153, 0, 0));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });

        jTextField7.setBackground(new java.awt.Color(0, 102, 102));
        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField7.setForeground(new java.awt.Color(153, 0, 0));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
        });

        jTextField8.setBackground(new java.awt.Color(0, 102, 102));
        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField8.setForeground(new java.awt.Color(153, 0, 0));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });

        jTextField9.setBackground(new java.awt.Color(0, 102, 102));
        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField9.setForeground(new java.awt.Color(153, 0, 0));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });

        jTextField10.setBackground(new java.awt.Color(0, 102, 102));
        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField10.setForeground(new java.awt.Color(153, 0, 0));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField10MouseClicked(evt);
            }
        });

        jTextField11.setBackground(new java.awt.Color(0, 102, 102));
        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField11.setForeground(new java.awt.Color(153, 0, 0));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField11MouseClicked(evt);
            }
        });

        jTextField12.setBackground(new java.awt.Color(0, 102, 102));
        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField12.setForeground(new java.awt.Color(153, 0, 0));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField12MouseClicked(evt);
            }
        });

        jTextField13.setBackground(new java.awt.Color(0, 102, 102));
        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField13.setForeground(new java.awt.Color(153, 0, 0));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField13MouseClicked(evt);
            }
        });

        jTextField14.setBackground(new java.awt.Color(0, 102, 102));
        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField14.setForeground(new java.awt.Color(153, 0, 0));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField14MouseClicked(evt);
            }
        });

        jTextField15.setBackground(new java.awt.Color(0, 102, 102));
        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField15.setForeground(new java.awt.Color(153, 0, 0));
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField15MouseClicked(evt);
            }
        });

        jTextField16.setBackground(new java.awt.Color(0, 102, 102));
        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField16.setForeground(new java.awt.Color(153, 0, 0));
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField16MouseClicked(evt);
            }
        });

        jTextField17.setBackground(new java.awt.Color(0, 102, 102));
        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField17.setForeground(new java.awt.Color(153, 0, 0));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField17MouseClicked(evt);
            }
        });

        jTextField18.setBackground(new java.awt.Color(0, 102, 102));
        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField18.setForeground(new java.awt.Color(153, 0, 0));
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField18MouseClicked(evt);
            }
        });

        jTextField19.setBackground(new java.awt.Color(0, 102, 102));
        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField19.setForeground(new java.awt.Color(153, 0, 0));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField19MouseClicked(evt);
            }
        });

        jTextField20.setBackground(new java.awt.Color(0, 102, 102));
        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField20.setForeground(new java.awt.Color(153, 0, 0));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField20MouseClicked(evt);
            }
        });

        jTextField21.setBackground(new java.awt.Color(0, 102, 102));
        jTextField21.setEditable(false);
        jTextField21.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField21.setForeground(new java.awt.Color(153, 0, 0));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField21MouseClicked(evt);
            }
        });

        jTextField22.setBackground(new java.awt.Color(0, 102, 102));
        jTextField22.setEditable(false);
        jTextField22.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField22.setForeground(new java.awt.Color(153, 0, 0));
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField22MouseClicked(evt);
            }
        });

        jTextField23.setBackground(new java.awt.Color(0, 102, 102));
        jTextField23.setEditable(false);
        jTextField23.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField23.setForeground(new java.awt.Color(153, 0, 0));
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField23MouseClicked(evt);
            }
        });

        jTextField24.setBackground(new java.awt.Color(0, 102, 102));
        jTextField24.setEditable(false);
        jTextField24.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField24.setForeground(new java.awt.Color(153, 0, 0));
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField24MouseClicked(evt);
            }
        });

        jTextField25.setBackground(new java.awt.Color(0, 102, 102));
        jTextField25.setEditable(false);
        jTextField25.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField25.setForeground(new java.awt.Color(153, 0, 0));
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField25MouseClicked(evt);
            }
        });

        jTextField26.setBackground(new java.awt.Color(0, 102, 102));
        jTextField26.setEditable(false);
        jTextField26.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField26.setForeground(new java.awt.Color(153, 0, 0));
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField26MouseClicked(evt);
            }
        });

        jTextField27.setBackground(new java.awt.Color(0, 102, 102));
        jTextField27.setEditable(false);
        jTextField27.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField27.setForeground(new java.awt.Color(153, 0, 0));
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField27MouseClicked(evt);
            }
        });

        jTextField28.setBackground(new java.awt.Color(0, 102, 102));
        jTextField28.setEditable(false);
        jTextField28.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField28.setForeground(new java.awt.Color(153, 0, 0));
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField28MouseClicked(evt);
            }
        });

        jTextField29.setBackground(new java.awt.Color(0, 102, 102));
        jTextField29.setEditable(false);
        jTextField29.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField29.setForeground(new java.awt.Color(153, 0, 0));
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField29MouseClicked(evt);
            }
        });

        jTextField30.setBackground(new java.awt.Color(0, 102, 102));
        jTextField30.setEditable(false);
        jTextField30.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField30.setForeground(new java.awt.Color(153, 0, 0));
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField30MouseClicked(evt);
            }
        });

        jTextField31.setBackground(new java.awt.Color(0, 102, 102));
        jTextField31.setEditable(false);
        jTextField31.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField31.setForeground(new java.awt.Color(153, 0, 0));
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField31MouseClicked(evt);
            }
        });

        jTextField32.setBackground(new java.awt.Color(0, 102, 102));
        jTextField32.setEditable(false);
        jTextField32.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField32.setForeground(new java.awt.Color(153, 0, 0));
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField32MouseClicked(evt);
            }
        });

        jTextField33.setBackground(new java.awt.Color(0, 102, 102));
        jTextField33.setEditable(false);
        jTextField33.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField33.setForeground(new java.awt.Color(153, 0, 0));
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField33MouseClicked(evt);
            }
        });

        jTextField34.setBackground(new java.awt.Color(0, 102, 102));
        jTextField34.setEditable(false);
        jTextField34.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField34.setForeground(new java.awt.Color(153, 0, 0));
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField34MouseClicked(evt);
            }
        });

        jTextField35.setBackground(new java.awt.Color(0, 102, 102));
        jTextField35.setEditable(false);
        jTextField35.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField35.setForeground(new java.awt.Color(153, 0, 0));
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField35MouseClicked(evt);
            }
        });

        jTextField36.setBackground(new java.awt.Color(0, 102, 102));
        jTextField36.setEditable(false);
        jTextField36.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField36.setForeground(new java.awt.Color(153, 0, 0));
        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField36MouseClicked(evt);
            }
        });

        jTextField37.setBackground(new java.awt.Color(0, 102, 102));
        jTextField37.setEditable(false);
        jTextField37.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField37.setForeground(new java.awt.Color(153, 0, 0));
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField37MouseClicked(evt);
            }
        });

        jTextField38.setBackground(new java.awt.Color(0, 102, 102));
        jTextField38.setEditable(false);
        jTextField38.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField38.setForeground(new java.awt.Color(153, 0, 0));
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField38MouseClicked(evt);
            }
        });

        jTextField39.setBackground(new java.awt.Color(0, 102, 102));
        jTextField39.setEditable(false);
        jTextField39.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField39.setForeground(new java.awt.Color(153, 0, 0));
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField39MouseClicked(evt);
            }
        });

        jTextField40.setBackground(new java.awt.Color(0, 102, 102));
        jTextField40.setEditable(false);
        jTextField40.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField40.setForeground(new java.awt.Color(153, 0, 0));
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField40MouseClicked(evt);
            }
        });

        jTextField41.setBackground(new java.awt.Color(0, 102, 102));
        jTextField41.setEditable(false);
        jTextField41.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField41.setForeground(new java.awt.Color(153, 0, 0));
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField41MouseClicked(evt);
            }
        });

        jTextField42.setBackground(new java.awt.Color(0, 102, 102));
        jTextField42.setEditable(false);
        jTextField42.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField42.setForeground(new java.awt.Color(153, 0, 0));
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField42MouseClicked(evt);
            }
        });

        jTextField43.setBackground(new java.awt.Color(0, 102, 102));
        jTextField43.setEditable(false);
        jTextField43.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField43.setForeground(new java.awt.Color(153, 0, 0));
        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField43MouseClicked(evt);
            }
        });

        jTextField44.setBackground(new java.awt.Color(0, 102, 102));
        jTextField44.setEditable(false);
        jTextField44.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField44.setForeground(new java.awt.Color(153, 0, 0));
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField44MouseClicked(evt);
            }
        });

        jTextField45.setBackground(new java.awt.Color(0, 102, 102));
        jTextField45.setEditable(false);
        jTextField45.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField45.setForeground(new java.awt.Color(153, 0, 0));
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField45MouseClicked(evt);
            }
        });

        jTextField46.setBackground(new java.awt.Color(0, 102, 102));
        jTextField46.setEditable(false);
        jTextField46.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField46.setForeground(new java.awt.Color(153, 0, 0));
        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField46MouseClicked(evt);
            }
        });

        jTextField47.setBackground(new java.awt.Color(0, 102, 102));
        jTextField47.setEditable(false);
        jTextField47.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField47.setForeground(new java.awt.Color(153, 0, 0));
        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField47MouseClicked(evt);
            }
        });

        jTextField48.setBackground(new java.awt.Color(0, 102, 102));
        jTextField48.setEditable(false);
        jTextField48.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField48.setForeground(new java.awt.Color(153, 0, 0));
        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField48MouseClicked(evt);
            }
        });

        jTextField49.setBackground(new java.awt.Color(0, 102, 102));
        jTextField49.setEditable(false);
        jTextField49.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField49.setForeground(new java.awt.Color(153, 0, 0));
        jTextField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField49MouseClicked(evt);
            }
        });

        jTextField50.setBackground(new java.awt.Color(0, 102, 102));
        jTextField50.setEditable(false);
        jTextField50.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField50.setForeground(new java.awt.Color(153, 0, 0));
        jTextField50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField50MouseClicked(evt);
            }
        });

        jTextField51.setBackground(new java.awt.Color(0, 102, 102));
        jTextField51.setEditable(false);
        jTextField51.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField51.setForeground(new java.awt.Color(153, 0, 0));
        jTextField51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField51.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField51MouseClicked(evt);
            }
        });

        jTextField52.setBackground(new java.awt.Color(0, 102, 102));
        jTextField52.setEditable(false);
        jTextField52.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField52.setForeground(new java.awt.Color(153, 0, 0));
        jTextField52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField52MouseClicked(evt);
            }
        });

        jTextField53.setBackground(new java.awt.Color(0, 102, 102));
        jTextField53.setEditable(false);
        jTextField53.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField53.setForeground(new java.awt.Color(153, 0, 0));
        jTextField53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField53MouseClicked(evt);
            }
        });

        jTextField54.setBackground(new java.awt.Color(0, 102, 102));
        jTextField54.setEditable(false);
        jTextField54.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField54.setForeground(new java.awt.Color(153, 0, 0));
        jTextField54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField54MouseClicked(evt);
            }
        });

        jTextField55.setBackground(new java.awt.Color(0, 102, 102));
        jTextField55.setEditable(false);
        jTextField55.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField55.setForeground(new java.awt.Color(153, 0, 0));
        jTextField55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField55MouseClicked(evt);
            }
        });

        jTextField56.setBackground(new java.awt.Color(0, 102, 102));
        jTextField56.setEditable(false);
        jTextField56.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField56.setForeground(new java.awt.Color(153, 0, 0));
        jTextField56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField56.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField56MouseClicked(evt);
            }
        });

        jTextField57.setBackground(new java.awt.Color(0, 102, 102));
        jTextField57.setEditable(false);
        jTextField57.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField57.setForeground(new java.awt.Color(153, 0, 0));
        jTextField57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField57MouseClicked(evt);
            }
        });

        jTextField58.setBackground(new java.awt.Color(0, 102, 102));
        jTextField58.setEditable(false);
        jTextField58.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField58.setForeground(new java.awt.Color(153, 0, 0));
        jTextField58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField58MouseClicked(evt);
            }
        });

        jTextField59.setBackground(new java.awt.Color(0, 102, 102));
        jTextField59.setEditable(false);
        jTextField59.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField59.setForeground(new java.awt.Color(153, 0, 0));
        jTextField59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField59.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField59MouseClicked(evt);
            }
        });

        jTextField60.setBackground(new java.awt.Color(0, 102, 102));
        jTextField60.setEditable(false);
        jTextField60.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField60.setForeground(new java.awt.Color(153, 0, 0));
        jTextField60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField60MouseClicked(evt);
            }
        });

        jTextField61.setBackground(new java.awt.Color(0, 102, 102));
        jTextField61.setEditable(false);
        jTextField61.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField61.setForeground(new java.awt.Color(153, 0, 0));
        jTextField61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField61MouseClicked(evt);
            }
        });

        jTextField62.setBackground(new java.awt.Color(0, 102, 102));
        jTextField62.setEditable(false);
        jTextField62.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField62.setForeground(new java.awt.Color(153, 0, 0));
        jTextField62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField62MouseClicked(evt);
            }
        });

        jTextField63.setBackground(new java.awt.Color(0, 102, 102));
        jTextField63.setEditable(false);
        jTextField63.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField63.setForeground(new java.awt.Color(153, 0, 0));
        jTextField63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField63MouseClicked(evt);
            }
        });

        jTextField64.setBackground(new java.awt.Color(0, 102, 102));
        jTextField64.setEditable(false);
        jTextField64.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField64.setForeground(new java.awt.Color(153, 0, 0));
        jTextField64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField64.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField64MouseClicked(evt);
            }
        });

        jTextField65.setBackground(new java.awt.Color(0, 102, 102));
        jTextField65.setEditable(false);
        jTextField65.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField65.setForeground(new java.awt.Color(153, 0, 0));
        jTextField65.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField65.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField65MouseClicked(evt);
            }
        });

        jTextField66.setBackground(new java.awt.Color(0, 102, 102));
        jTextField66.setEditable(false);
        jTextField66.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField66.setForeground(new java.awt.Color(153, 0, 0));
        jTextField66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField66.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField66MouseClicked(evt);
            }
        });

        jTextField67.setBackground(new java.awt.Color(0, 102, 102));
        jTextField67.setEditable(false);
        jTextField67.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField67.setForeground(new java.awt.Color(153, 0, 0));
        jTextField67.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField67.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField67MouseClicked(evt);
            }
        });

        jTextField68.setBackground(new java.awt.Color(0, 102, 102));
        jTextField68.setEditable(false);
        jTextField68.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField68.setForeground(new java.awt.Color(153, 0, 0));
        jTextField68.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField68.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField68MouseClicked(evt);
            }
        });

        jTextField69.setBackground(new java.awt.Color(0, 102, 102));
        jTextField69.setEditable(false);
        jTextField69.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField69.setForeground(new java.awt.Color(153, 0, 0));
        jTextField69.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField69.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField69MouseClicked(evt);
            }
        });

        jTextField70.setBackground(new java.awt.Color(0, 102, 102));
        jTextField70.setEditable(false);
        jTextField70.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField70.setForeground(new java.awt.Color(153, 0, 0));
        jTextField70.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField70.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField70MouseClicked(evt);
            }
        });

        jTextField71.setBackground(new java.awt.Color(0, 102, 102));
        jTextField71.setEditable(false);
        jTextField71.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField71.setForeground(new java.awt.Color(153, 0, 0));
        jTextField71.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField71.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField71MouseClicked(evt);
            }
        });

        jTextField72.setBackground(new java.awt.Color(0, 102, 102));
        jTextField72.setEditable(false);
        jTextField72.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField72.setForeground(new java.awt.Color(153, 0, 0));
        jTextField72.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField72.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField72MouseClicked(evt);
            }
        });

        jTextField73.setBackground(new java.awt.Color(0, 102, 102));
        jTextField73.setEditable(false);
        jTextField73.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField73.setForeground(new java.awt.Color(153, 0, 0));
        jTextField73.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField73.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField73MouseClicked(evt);
            }
        });

        jTextField74.setBackground(new java.awt.Color(0, 102, 102));
        jTextField74.setEditable(false);
        jTextField74.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField74.setForeground(new java.awt.Color(153, 0, 0));
        jTextField74.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField74.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField74MouseClicked(evt);
            }
        });

        jTextField75.setBackground(new java.awt.Color(0, 102, 102));
        jTextField75.setEditable(false);
        jTextField75.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField75.setForeground(new java.awt.Color(153, 0, 0));
        jTextField75.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField75.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField75MouseClicked(evt);
            }
        });

        jTextField76.setBackground(new java.awt.Color(0, 102, 102));
        jTextField76.setEditable(false);
        jTextField76.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField76.setForeground(new java.awt.Color(153, 0, 0));
        jTextField76.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField76.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField76MouseClicked(evt);
            }
        });

        jTextField77.setBackground(new java.awt.Color(0, 102, 102));
        jTextField77.setEditable(false);
        jTextField77.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField77.setForeground(new java.awt.Color(153, 0, 0));
        jTextField77.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField77.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField77MouseClicked(evt);
            }
        });

        jTextField78.setBackground(new java.awt.Color(0, 102, 102));
        jTextField78.setEditable(false);
        jTextField78.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField78.setForeground(new java.awt.Color(153, 0, 0));
        jTextField78.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField78.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField78MouseClicked(evt);
            }
        });

        jTextField79.setBackground(new java.awt.Color(0, 102, 102));
        jTextField79.setEditable(false);
        jTextField79.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField79.setForeground(new java.awt.Color(153, 0, 0));
        jTextField79.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField79.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField79MouseClicked(evt);
            }
        });

        jTextField80.setBackground(new java.awt.Color(0, 102, 102));
        jTextField80.setEditable(false);
        jTextField80.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField80.setForeground(new java.awt.Color(153, 0, 0));
        jTextField80.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField80.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField80MouseClicked(evt);
            }
        });

        jTextField81.setBackground(new java.awt.Color(0, 102, 102));
        jTextField81.setEditable(false);
        jTextField81.setFont(new java.awt.Font("Algerian", 0, 20));
        jTextField81.setForeground(new java.awt.Color(153, 0, 0));
        jTextField81.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField81.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField81MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jTextField82.setBackground(new java.awt.Color(0, 51, 51));
        jTextField82.setEditable(false);
        jTextField82.setFont(new java.awt.Font("Algerian", 0, 18));
        jTextField82.setForeground(new java.awt.Color(102, 255, 51));
        jTextField82.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField82.setText("SCORE:");
        jTextField82.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField83.setBackground(new java.awt.Color(0, 51, 51));
        jTextField83.setEditable(false);
        jTextField83.setFont(new java.awt.Font("Algerian", 0, 18));
        jTextField83.setForeground(new java.awt.Color(102, 255, 51));
        jTextField83.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField83.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField84.setBackground(new java.awt.Color(0, 51, 51));
        jTextField84.setEditable(false);
        jTextField84.setFont(new java.awt.Font("Algerian", 0, 18));
        jTextField84.setForeground(new java.awt.Color(102, 255, 51));
        jTextField84.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField84.setText("BOMBS LEFT:");
        jTextField84.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField85.setBackground(new java.awt.Color(0, 51, 51));
        jTextField85.setEditable(false);
        jTextField85.setFont(new java.awt.Font("Algerian", 0, 18));
        jTextField85.setForeground(new java.awt.Color(102, 255, 51));
        jTextField85.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField85.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField86.setBackground(new java.awt.Color(0, 51, 51));
        jTextField86.setEditable(false);
        jTextField86.setFont(new java.awt.Font("Algerian", 0, 18));
        jTextField86.setForeground(new java.awt.Color(102, 255, 51));
        jTextField86.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField86.setText("MAGIC LEFT:");
        jTextField86.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField87.setBackground(new java.awt.Color(0, 51, 51));
        jTextField87.setEditable(false);
        jTextField87.setFont(new java.awt.Font("Algerian", 0, 18));
        jTextField87.setForeground(new java.awt.Color(102, 255, 51));
        jTextField87.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField87.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField88.setBackground(new java.awt.Color(0, 51, 51));
        jTextField88.setEditable(false);
        jTextField88.setFont(new java.awt.Font("Algerian", 0, 18));
        jTextField88.setForeground(new java.awt.Color(102, 255, 51));
        jTextField88.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField88.setText("no magic");
        jTextField88.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField88MouseClicked(evt);
            }
        });

        jTextField89.setBackground(new java.awt.Color(0, 51, 51));
        jTextField89.setEditable(false);
        jTextField89.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jTextField89.setForeground(new java.awt.Color(102, 255, 51));
        jTextField89.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField89.setText("EASY");
        jTextField89.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField89MouseClicked(evt);
            }
        });

        jTextField91.setBackground(new java.awt.Color(0, 51, 51));
        jTextField91.setEditable(false);
        jTextField91.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jTextField91.setForeground(new java.awt.Color(102, 255, 51));
        jTextField91.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField91.setText("00:00:00");
        jTextField91.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField91.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField91MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField91, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jTextField89, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jTextField88, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jTextField87, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jTextField86, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jTextField85, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jTextField84, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jTextField83, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jTextField82, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jTextField90.setBackground(new java.awt.Color(0, 102, 102));
        jTextField90.setEditable(false);
        jTextField90.setFont(new java.awt.Font("Algerian", 0, 48));
        jTextField90.setForeground(new java.awt.Color(102, 255, 0));
        jTextField90.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField90.setText("minesweeper");
        jTextField90.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField90, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField90, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jMenu1.setForeground(new java.awt.Color(102, 255, 51));
        jMenu1.setText("MENU");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        jMenuItem6.setText("Buy Magic");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
        jMenuItem1.setText("Reset");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, 0));
        jMenuItem8.setText("Time Chase");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, 0));
        jMenuItem9.setText("Relax Play");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, 0));
        jMenuItem2.setText("win");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
        jMenuItem3.setText("check");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem7.setText("Main menu");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem4.setText("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        // <editor-fold defaultstate="collapsed" desc="variables initialization">
    String a;
String rs[]={"","","","","","","","","","","",
          "","","","","","","","","","",
          "","","","","","","","","","",
          "","","","","","","","","","",
          "","","","","","","","","","",
          "","","","","","","","","","",
          "","","","","","","","","","",
          "","","","","","","","","","",""};
int sc=50;
mine2 m=new mine2();
int b=6,bdd=5;
String q[]=
    {"","","","","","","","","","","",
          "","","","","","","","","","",
          "","","","","","","","","","",
          "","","","","","","","","","",
          "","","","","","","","","","",
          "","","","","","","","","","",
          "","","","","","","","","","",
          "","","","","","","","","","",""};

boolean abh[]={true,true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true};
boolean bd[]={true,true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true};
int ab=10;
final String[][] pos={{"0","0","0","0","0","0","0","0"},{"0","0","0","0","2","0","10","11"},{"0","0","0","1","3","10","11","12"},
{"0","0","0","2","4","11","12","13"},{"0","0","0","3","5","12","13","14"},{"0","0","0","4","6","13","14","15"},{"0","0","0","5","7","14","15","16"},
{"0","0","0","6","8","15","16","17"},{"0","0","0","7","9","16","17","18"},{"0","0","0","8","0","17","18","0"},
    {"1","2","0","11","19","20","0","0"},{"1","2","3","10","12","19","20","21"},{"2","3","4","11","13","20","21","22"},
{"3","4","5","12","14","21","22","23"},{"4","5","6","13","15","22","23","24"},{"5","6","7","14","16","23","24","25"},
{"6","7","8","15","17","24","25","26"},{"7","8","9","16","18","25","26","27"},{"0","8","9","17","0","26","27","0"},
    {"0","10","11","0","20","28","29","0"},{"10","11","12","19","21","28","29","30"},{"11","12","13","20","22","29","30","31"},
{"12","13","14","21","23","30","31","32"},{"13","14","15","22","24","31","32","33"},{"14","15","16","23","25","32","33","34"},
{"15","16","17","24","26","33","34","35"},{"16","17","18","25","27","34","35","36"},{"0","17","18","0","26","0","35","36"},
    {"0","19","20","0","29","0","37","38"},{"19","20","21","28","30","37","38","39"},{"20","21","22","29","31","38","39","40"},
{"21","22","23","30","32","39","40","41"},{"22","23","24","31","33","40","41","42"},{"23","24","25","32","34","41","42","43"},
{"24","25","26","33","35","42","43","44"},{"25","26","27","34","36","43","44","45"},{"0","26","27","0","35","0","44","45"},
    {"0","28","29","0","38","0","46","47"},{"28","29","30","37","39","46","47","48"},{"29","30","31","38","40","47","48","49"},
{"30","31","32","39","41","48","49","50"},{"31","32","33","40","42","49","50","51"},{"32","33","34","41","43","50","51","52"},
{"33","34","35","42","44","51","52","53"},{"34","35","36","43","45","52","53","54"},{"35","36","0","44","0","0","53","54"},
    {"37","38","0","47","0","55","56","0"},{"37","38","39","46","48","55","56","57"},{"38","39","40","47","49","56","57","58"},
{"39","40","41","48","50","57","58","59"},{"40","41","42","49","51","58","59","60"},{"41","42","43","50","52","59","60","61"},
{"42","43","44","51","53","60","61","62"},{"43","44","45","52","54","61","62","63"},{"44","45","0","53","0","0","62","63"},
    {"46","47","0","56","0","0","64","65"},{"46","47","48","55","57","64","65","66"},{"47","48","49","56","58","65","66","67"},
{"48","49","50","57","59","66","67","68"},{"49","50","51","58","60","67","68","69"},{"50","51","52","59","61","68","69","70"},
{"51","52","53","60","62","69","70","71"},{"52","53","54","61","63","70","71","72"},{"53","54","0","62","0","71","72","0"},
    {"55","56","0","65","0","73","74","0"},{"55","56","57","64","66","73","74","75"},{"56","57","58","65","67","74","75","76"},
{"57","58","59","66","68","75","76","77"},{"58","59","60","67","69","76","77","78"},{"59","60","61","68","70","77","78","79"},
{"60","61","62","69","71","78","79","80"},{"61","62","63","70","72","79","80","81"},{"0","62","63","71","0","80","81","0"},
    {"64","65","0","74","0","0","0","0"},{"64","65","66","73","75","0","0","0"},{"65","66","67","74","76","0","0","0"},
    {"66","67","68","75","77","0","0","0"},{"67","68","69","76","78","0","0","0"},{"68","69","70","77","79","0","0","0"},
    {"69","70","71","78","80","0","0","0"},{"70","71","72","79","81","0","0","0"},{"71","72","0","80","0","0","0","0"}};
int y=0;
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="a1()-a2()-a3()">
public void a1(int a){
    s890(a);
switch(a){

    case 1:
           jTextField1.setBackground(Color.WHITE);        jTextField1.setText(q[1]);
        break;
        case 2:
           jTextField2.setBackground(Color.WHITE);        jTextField2.setText(q[2]);
        break;
        case 3:
          jTextField3.setBackground(Color.WHITE);        jTextField3.setText(q[3]);
        break;
        case 4:
           jTextField4.setBackground(Color.WHITE);        jTextField4.setText(q[4]);
        break;
        case 5:
           jTextField5.setBackground(Color.WHITE);        jTextField5.setText(q[5]);
        break;
        case 6:
            jTextField6.setBackground(Color.WHITE);        jTextField6.setText(q[6]);
        break;
        case 7:
          jTextField7.setBackground(Color.WHITE);        jTextField7.setText(q[7]);
        break;
        case 8:
          jTextField8.setBackground(Color.WHITE);        jTextField8.setText(q[8]);
        break;
        case 9:
            jTextField9.setBackground(Color.WHITE);        jTextField9.setText(q[9]);
        break;
        case 10:
            jTextField10.setBackground(Color.WHITE);        jTextField10.setText(q[10]);
        break;
        case 11:
             jTextField11.setBackground(Color.WHITE);        jTextField11.setText(q[11]);
        break;
        case 12:
           jTextField12.setBackground(Color.WHITE);        jTextField12.setText(q[12]);
        break;
        case 13:
            jTextField13.setBackground(Color.WHITE);        jTextField13.setText(q[13]);
        break;
        case 14:
            jTextField14.setBackground(Color.WHITE);        jTextField14.setText(q[14]);
        break;
        case 15:
            jTextField15.setBackground(Color.WHITE);        jTextField15.setText(q[15]);
        break;
        case 16:
             jTextField16.setBackground(Color.WHITE);        jTextField16.setText(q[16]);
        break;
        case 17:
            jTextField17.setBackground(Color.WHITE);        jTextField17.setText(q[17]);
        break;
        case 18:
             jTextField18.setBackground(Color.WHITE);        jTextField18.setText(q[18]);
        break;
        case 19:
             jTextField19.setBackground(Color.WHITE);        jTextField19.setText(q[19]);
        break;
        case 20:
             jTextField20.setBackground(Color.WHITE);        jTextField20.setText(q[20]);
        break;
        case 21:
             jTextField21.setBackground(Color.WHITE);        jTextField21.setText(q[21]);
        break;
        case 22:
             jTextField22.setBackground(Color.WHITE);        jTextField22.setText(q[22]);
        break;
        case 23:
            jTextField23.setBackground(Color.WHITE);        jTextField23.setText(q[23]);
        break;
        case 24:
             jTextField24.setBackground(Color.WHITE);        jTextField24.setText(q[24]);
        break;
        case 25:
             jTextField25.setBackground(Color.WHITE);        jTextField25.setText(q[25]);
        break;
        case 26:
            jTextField26.setBackground(Color.WHITE);        jTextField26.setText(q[26]);
        break;
        case 27:
             jTextField27.setBackground(Color.WHITE);        jTextField27.setText(q[27]);
        break;
        case 28:
             jTextField28.setBackground(Color.WHITE);        jTextField28.setText(q[28]);
        break;
        case 29:
             jTextField29.setBackground(Color.WHITE);        jTextField29.setText(q[29]);
        break;
        case 30:
             jTextField30.setBackground(Color.WHITE);        jTextField30.setText(q[30]);
        break;
        case 31:
             jTextField31.setBackground(Color.WHITE);        jTextField31.setText(q[31]);
        break;
        case 32:
             jTextField32.setBackground(Color.WHITE);        jTextField32.setText(q[32]);
        break;
        case 33:
             jTextField33.setBackground(Color.WHITE);        jTextField33.setText(q[33]);
        break;
        case 34:
             jTextField34.setBackground(Color.WHITE);        jTextField34.setText(q[34]);
        break;
        case 35:
             jTextField35.setBackground(Color.WHITE);        jTextField35.setText(q[35]);
        break;
        case 36:
            jTextField36.setBackground(Color.WHITE);        jTextField36.setText(q[36]);
        break;
        case 37:
             jTextField37.setBackground(Color.WHITE);        jTextField37.setText(q[37]);
        break;
        case 38:
             jTextField38.setBackground(Color.WHITE);        jTextField38.setText(q[38]);
        break;
        case 39:
             jTextField39.setBackground(Color.WHITE);        jTextField39.setText(q[39]);
        break;
        case 40:
             jTextField40.setBackground(Color.WHITE);        jTextField40.setText(q[40]);
        break;
        case 41:
             jTextField41.setBackground(Color.WHITE);        jTextField41.setText(q[41]);
        break;
        case 42:
             jTextField42.setBackground(Color.WHITE);        jTextField42.setText(q[42]);
        break;
        case 43:
             jTextField43.setBackground(Color.WHITE);        jTextField43.setText(q[43]);
        break;
        case 44:
            jTextField44.setBackground(Color.WHITE);        jTextField44.setText(q[44]);
        break;
        case 45:
             jTextField45.setBackground(Color.WHITE);        jTextField45.setText(q[45]);
        break;
        case 46:
             jTextField46.setBackground(Color.WHITE);        jTextField46.setText(q[46]);
        break;
        case 47:
             jTextField47.setBackground(Color.WHITE);        jTextField47.setText(q[47]);
        break;
        case 48:
             jTextField48.setBackground(Color.WHITE);        jTextField48.setText(q[48]);
        break;
        case 49:
             jTextField49.setBackground(Color.WHITE);        jTextField49.setText(q[49]);
        break;
        case 50:
            jTextField50.setBackground(Color.WHITE);        jTextField50.setText(q[50]);
        break;
        case 51:
             jTextField51.setBackground(Color.WHITE);        jTextField51.setText(q[51]);
        break;
        case 52:
             jTextField52.setBackground(Color.WHITE);        jTextField52.setText(q[52]);
        break;
        case 53:
             jTextField53.setBackground(Color.WHITE);        jTextField53.setText(q[53]);
        break;
        case 54:
            jTextField54.setBackground(Color.WHITE);        jTextField54.setText(q[54]);
        break;
        case 55:
             jTextField55.setBackground(Color.WHITE);        jTextField55.setText(q[55]);
        break;
        case 56:
             jTextField56.setBackground(Color.WHITE);        jTextField56.setText(q[56]);
        break;
        case 57:
             jTextField57.setBackground(Color.WHITE);        jTextField57.setText(q[57]);
        break;
        case 58:
             jTextField58.setBackground(Color.WHITE);        jTextField58.setText(q[58]);
        break;
        case 59:
             jTextField59.setBackground(Color.WHITE);        jTextField59.setText(q[59]);
        break;
        case 60:
            jTextField60.setBackground(Color.WHITE);        jTextField60.setText(q[60]);
        break;
        case 61:
             jTextField61.setBackground(Color.WHITE);        jTextField61.setText(q[61]);
        break;
        case 62:
             jTextField62.setBackground(Color.WHITE);        jTextField62.setText(q[62]);
        break;
        case 63:
             jTextField63.setBackground(Color.WHITE);        jTextField63.setText(q[63]);
        break;
        case 64:
            jTextField64.setBackground(Color.WHITE);        jTextField64.setText(q[64]);
        break;
        case 65:
             jTextField65.setBackground(Color.WHITE);        jTextField65.setText(q[65]);
        break;
        case 66:
             jTextField66.setBackground(Color.WHITE);        jTextField66.setText(q[66]);
        break;
        case 67:
             jTextField67.setBackground(Color.WHITE);        jTextField67.setText(q[67]);
        break;
        case 68:
             jTextField68.setBackground(Color.WHITE);        jTextField68.setText(q[68]);
        break;
        case 69:
             jTextField69.setBackground(Color.WHITE);        jTextField69.setText(q[69]);
        break;
        case 70:
            jTextField70.setBackground(Color.WHITE);        jTextField70.setText(q[70]);
        break;
        case 71:
             jTextField71.setBackground(Color.WHITE);        jTextField71.setText(q[71]);
        break;
        case 72:
             jTextField72.setBackground(Color.WHITE);        jTextField72.setText(q[72]);
        break;
        case 73:
             jTextField73.setBackground(Color.WHITE);        jTextField73.setText(q[73]);
        break;
        case 74:
            jTextField74.setBackground(Color.WHITE);        jTextField74.setText(q[74]);
        break;
        case 75:
             jTextField75.setBackground(Color.WHITE);        jTextField75.setText(q[75]);
        break;
        case 76:
             jTextField76.setBackground(Color.WHITE);        jTextField76.setText(q[76]);
        break;
        case 77:
             jTextField77.setBackground(Color.WHITE);        jTextField77.setText(q[77]);
        break;
        case 78:
             jTextField78.setBackground(Color.WHITE);        jTextField78.setText(q[78]);
        break;
        case 79:
             jTextField79.setBackground(Color.WHITE);        jTextField79.setText(q[79]);
        break;
        case 80:
             jTextField80.setBackground(Color.WHITE);        jTextField80.setText(q[80]);
        break;
        case 81:
             jTextField81.setBackground(Color.WHITE);        jTextField81.setText(q[81]);
        break;
    default:
        break;
}

}

public void a2(int yu,int xxx,int yyy,int kkk){

switch(yu){
    case 1:
          jTextField1.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 2:
          jTextField2.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 3:
          jTextField3.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 4:
          jTextField4.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 5:
          jTextField5.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 6:
          jTextField6.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 7:
          jTextField7.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 8:
          jTextField8.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 9:
          jTextField9.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 10:
          jTextField10.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 11:
          jTextField11.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 12:
          jTextField12.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 13:
          jTextField13.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 14:
          jTextField14.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 15:
          jTextField15.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 16:
          jTextField16.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 17:
          jTextField17.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 18:
          jTextField18.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 19:
          jTextField19.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 20:
          jTextField20.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 21:
          jTextField21.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 22:
          jTextField22.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 23:
          jTextField23.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 24:
          jTextField24.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 25:
          jTextField25.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 26:
          jTextField26.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 27:
          jTextField27.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 28:
          jTextField28.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 29:
          jTextField29.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 30:
          jTextField30.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 31:
          jTextField31.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 32:
          jTextField32.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 33:
          jTextField33.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 34:
          jTextField34.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 35:
          jTextField35.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 36:
          jTextField36.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 37:
          jTextField37.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 38:
          jTextField38.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 39:
          jTextField39.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 40:
          jTextField40.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 41:
          jTextField41.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 42:
          jTextField42.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 43:
          jTextField43.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 44:
          jTextField44.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 45:
          jTextField45.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 46:
          jTextField46.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 47:
          jTextField47.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 48:
          jTextField48.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 49:
          jTextField49.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 50:
          jTextField50.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 51:
          jTextField51.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 52:
          jTextField52.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 53:
          jTextField53.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 54:
          jTextField54.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 55:
          jTextField55.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 56:
          jTextField56.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 57:
          jTextField57.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 58:
          jTextField58.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 59:
          jTextField59.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 60:
          jTextField60.setBackground(new Color(xxx,yyy,kkk));
        break;
           case 61:
          jTextField61.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 62:
          jTextField62.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 63:
          jTextField63.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 64:
          jTextField64.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 65:
          jTextField65.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 66:
          jTextField66.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 67:
          jTextField67.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 68:
          jTextField68.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 69:
          jTextField69.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 70:
          jTextField70.setBackground(new Color(xxx,yyy,kkk));
        break;
         case 71:
          jTextField71.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 72:
          jTextField72.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 73:
          jTextField73.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 74:
          jTextField74.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 75:
          jTextField75.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 76:
          jTextField76.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 77:
          jTextField77.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 78:
          jTextField78.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 79:
          jTextField79.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 80:
          jTextField80.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 81:
          jTextField81.setBackground(new Color(xxx,yyy,kkk));
        break;
    default :
        break;
}
}

public void a3(int yu,String fat){

switch(yu){
    case 1:
          jTextField1.setText(""+fat);
        break;
        case 2:
          jTextField2.setText(""+fat);
        break;
        case 3:
          jTextField3.setText(""+fat);
        break;
        case 4:
          jTextField4.setText(""+fat);
        break;
        case 5:
          jTextField5.setText(""+fat);
        break;
            case 6:
          jTextField6.setText(""+fat);
        break;
        case 7:
          jTextField7.setText(""+fat);
        break;
        case 8:
          jTextField8.setText(""+fat);
        break;
        case 9:
          jTextField9.setText(""+fat);
        break;
        case 10:
          jTextField10.setText(""+fat);
        break;
            case 11:
          jTextField11.setText(""+fat);
        break;
        case 12:
          jTextField12.setText(""+fat);
        break;
        case 13:
          jTextField13.setText(""+fat);
        break;
        case 14:
          jTextField14.setText(""+fat);
        break;
        case 15:
          jTextField15.setText(""+fat);
        break;
            case 16:
          jTextField16.setText(""+fat);
        break;
        case 17:
          jTextField17.setText(""+fat);
        break;
        case 18:
          jTextField18.setText(""+fat);
        break;
        case 19:
          jTextField19.setText(""+fat);
        break;
        case 20:
          jTextField20.setText(""+fat);
        break;
            case 21:
          jTextField21.setText(""+fat);
        break;
        case 22:
          jTextField22.setText(""+fat);
        break;
        case 23:
          jTextField23.setText(""+fat);
        break;
        case 24:
          jTextField24.setText(""+fat);
        break;
        case 25:
          jTextField25.setText(""+fat);
        break;
            case 26:
          jTextField26.setText(""+fat);
        break;
        case 27:
          jTextField27.setText(""+fat);
        break;
        case 28:
          jTextField28.setText(""+fat);
        break;
        case 29:
          jTextField29.setText(""+fat);
        break;
        case 30:
          jTextField30.setText(""+fat);
        break;
            case 31:
          jTextField31.setText(""+fat);
        break;
        case 32:
          jTextField32.setText(""+fat);
        break;
        case 33:
          jTextField33.setText(""+fat);
        break;
        case 34:
          jTextField34.setText(""+fat);
        break;
        case 35:
          jTextField35.setText(""+fat);
        break;
            case 36:
          jTextField36.setText(""+fat);
        break;
        case 37:
          jTextField37.setText(""+fat);
        break;
        case 38:
          jTextField38.setText(""+fat);
        break;
        case 39:
          jTextField39.setText(""+fat);
        break;
        case 40:
          jTextField40.setText(""+fat);
        break;
            case 41:
          jTextField41.setText(""+fat);
        break;
        case 42:
          jTextField42.setText(""+fat);
        break;
        case 43:
          jTextField43.setText(""+fat);
        break;
        case 44:
          jTextField44.setText(""+fat);
        break;
        case 45:
          jTextField45.setText(""+fat);
        break;
            case 46:
          jTextField46.setText(""+fat);
        break;
        case 47:
          jTextField47.setText(""+fat);
        break;
        case 48:
          jTextField48.setText(""+fat);
        break;
        case 49:
          jTextField49.setText(""+fat);
        break;
        case 50:
          jTextField50.setText(""+fat);
        break;
         case 51:
          jTextField51.setText(""+fat);
        break;
        case 52:
          jTextField52.setText(""+fat);
        break;
        case 53:
          jTextField53.setText(""+fat);
        break;
        case 54:
          jTextField54.setText(""+fat);
        break;
        case 55:
          jTextField55.setText(""+fat);
        break;
            case 56:
          jTextField56.setText(""+fat);
        break;
        case 57:
          jTextField57.setText(""+fat);
        break;
        case 58:
          jTextField58.setText(""+fat);
        break;
        case 59:
          jTextField59.setText(""+fat);
        break;
        case 60:
          jTextField60.setText(""+fat);
        break;
        case 61:
          jTextField61.setText(""+fat);
        break;
        case 62:
          jTextField62.setText(""+fat);
        break;
        case 63:
          jTextField63.setText(""+fat);
        break;
        case 64:
          jTextField64.setText(""+fat);
        break;
        case 65:
          jTextField65.setText(""+fat);
        break;
            case 66:
          jTextField66.setText(""+fat);
        break;
        case 67:
          jTextField67.setText(""+fat);
        break;
        case 68:
          jTextField68.setText(""+fat);
        break;
        case 69:
          jTextField69.setText(""+fat);
        break;
        case 70:
          jTextField70.setText(""+fat);
        break;
        case 71:
          jTextField71.setText(""+fat);
        break;
        case 72:
          jTextField72.setText(""+fat);
        break;
        case 73:
          jTextField73.setText(""+fat);
        break;
        case 74:
          jTextField74.setText(""+fat);
        break;
        case 75:
          jTextField75.setText(""+fat);
        break;
            case 76:
          jTextField76.setText(""+fat);
        break;
        case 77:
          jTextField77.setText(""+fat);
        break;
        case 78:
          jTextField78.setText(""+fat);
        break;
        case 79:
          jTextField79.setText(""+fat);
        break;
        case 80:
          jTextField80.setText(""+fat);
        break;
        case 81:
          jTextField81.setText(""+fat);
        break;
        case 82:
          jTextField82.setText(""+fat);
        break;
    default :
        break;
}
}
//</editor-fold>

public void check(){
if(sc>=50){sc=sc-500;
for(int ii=1;ii<=81;ii++){
if(!bd[ii]){String h=q[ii];
if(!h.equals("X")){
 a2(ii,0,102,102);abh[ii]=true; b++; bd[ii]=true;rs[ii]="";
}
}}}else{ JOptionPane.showMessageDialog(this, "NOT ENOUGH MONEY!!\nRequired: 500 points\nYou have: "+sc+" only");}
jTextField83.setText(""+sc);
}

public void loo(){  a1=0;a2=0;a3=0; ti=false;b1=false;
JOptionPane.showMessageDialog(this, "You loose!!!\n Your score: "+sc+"\nTotal Time: "+jTextField91.getText()
          +"\nBombs Detected: "+y+"\nCompleted: "+(y*100)/ab+" %");reset();  }

public void reset(){ bdd=5;y=0;for(int yy=1;yy<=81;yy++){ abh[yy]=true; bd[yy]=true;  rs[yy]="";  q[yy]=""; m.aa[yy]="";}
for(int ria=1;ria<82;ria++){
a2(ria,0,102,102);a3(ria,"");
}
String h=jTextField89.getText();
if(h.equals("EASY")){b=10;}
else if(h.equals("MEDIUM")){b=15;}
else if(h.equals("HARD")){b=20;}
else if(h.equals("DIABOLICAL")){b=30;}
 m.intro(b); jTextField85.setText(""+b); jTextField83.setText(""+sc); jTextField87.setText(""+bdd);
 for(int u=1;u<=81;u++){
        q[u]=m.aa[u];}
        a1=0;a2=0;a3=0;jTextField91.setText("0"+a3+":0"+a2+":0"+a1);
        ti=true;b1=true;ab=b;}

public void s890(int kk){
    a=q[kk];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("6")||a.equals("7")||
            a.equals("8")||a.equals("")){
     a2(kk,255,255,255);a3(kk,a);
    a=q[kk];abh[kk]=false;}
 if(a.equals("")){
     for(int ryu=0;ryu<8;ryu++){
     int rat=Integer.parseInt(pos[kk][ryu]);
     if(rat!=0){
 if(abh[rat]==true)
s890(rat);
  }}}}


public void push(int ay,java.awt.event.MouseEvent evt){
String zz=jTextField88.getText();
if(zz.equals("magic")&&bdd>0&&abh[ay]==true){  bdd--;  jTextField87.setText(""+bdd);
if(q[ay].equals("X")){    a2(ay,255,0,0);  rs[ay]=q[ay]; b--; bd[ay]=false;}else {
   a1(ay);}}
else if(evt.getButton()==1&&abh[ay]&&zz.equals("no magic")){   a1(ay);
     if(q[ay].equals("X")){y=0;
         for(int muttu=1;muttu<82;muttu++){
    if(q[muttu].equals("X"))
    a1(muttu);
         if(q[muttu].equals("X")&&bd[muttu]==false){
    a2(muttu,0,255,0);y++;}}
         loo(); }}
else if(evt.getButton()==3&&abh[ay]==true&&bd[ay]){
      a2(ay,255,0,0);  b --;  bd[ay]=false; abh[ay]=false;   rs[ay]=q[ay];      }
else if(evt.getButton()==3&&bd[ay]==false){
    a2(ay,0,102,102);abh[ay]=true; b++; bd[ay]=true;rs[ay]="";}
  jTextField85.setText(""+b);check_1();}

public void check_1(){
int win=0;
for(int ii=1;ii<=81;ii++){
   if(rs[ii].equals("1")||rs[ii].equals("2")&&rs[ii].equals("3")       ||rs[ii].equals("4")||rs[ii].equals("5")||rs[ii].equals("6")
        ||rs[ii].equals("7")||rs[ii].equals("8")){win=0;ii=100;}
   else if(!bd[ii]&&rs[ii].equals("X")){win++;}}String sa;sa=jTextField85.getText();
String s;s=jTextField89.getText();if((win==10&&s.equals("EASY")||win==15&&s.equals("MEDIUM")||win==20&&s.equals("HARD")
        ||win==30&&s.equals("DIABOLICAL"))&&sa.equals("0")) {
            String h=jTextField89.getText();
        if(h.equals("EASY")){ sc=sc+50;} else if(h.equals("MEDIUM")){  sc=sc+100;} else if(h.equals("HARD")){sc=sc+150;} else if(h.equals("DIABOLICAL")){sc=sc+250;}
    b1=false;ti=false;
            JOptionPane.showMessageDialog(this, "You Win!!!\n Your score: "+sc+"\nTotal Time: "+jTextField91.getText()); reset();}}

   public void ff(){
   int lao=Integer.parseInt( jTextField83.getText());
 if(lao>=50){
int olo= JOptionPane.showConfirmDialog(this, "Magic will cost 50 points\n Continue???");
if(olo==0){
bdd=bdd+5;
sc=sc-50;
 jTextField87.setText(""+bdd);  jTextField83.setText(""+sc);} }
 else{
 JOptionPane.showMessageDialog(this, "NOT ENOUGH MONEY!!\nRequired: 50 points\nYou have: "+sc+" only");
 }
}

                 boolean b1=true,ti=true,time_chase=false;             Timer myt=new Timer();
           int a1=0,a2=0,a3=0;String h1,h2,h3;
TimerTask tm=new TimerTask() {

        @Override
        public void run() {
            if(b1&&ti){
            if(a1<99)
    a1++;
if(a1>=99&&a2<59){
    a2++;   a1=0;}
if(a2>=59){
    a2=0;   a3++;

    }
            if(a1<=9)
             h1="0"+a1;
            else
                h1=""+a1;
            if(a2<=9)
             h2="0"+a2;
            else
                h2=""+a2;
            if(a3<=9)
             h3="0"+a3;
            else
                h3=""+a3; 
                jTextField91.setText(""+h3+":"+h2+":"+h1); 
            if(time_chase){
    String fart= jTextField89.getText();
    if(fart.equals("EASY")&&a3==1)
        loo();
    else if(fart.equals("MEDIUM")&&a3==2)
        loo();
    else if(fart.equals("HARD")&&a3==4)
        loo();
    else if(fart.equals("DIABOLICAL")&&a3==5)
        loo();
    }
            }
            else if(b1==false||ti==false){        }}};

// <editor-fold defaultstate="collapsed" desc="Button actions">
    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
push(1, evt);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
push(2, evt);
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
push(3, evt);
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
push(4, evt);
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
push(5, evt);
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
push(6, evt);
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
push(7, evt);
    }//GEN-LAST:event_jTextField7MouseClicked

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
push(8, evt);
    }//GEN-LAST:event_jTextField8MouseClicked

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
push(9, evt);
    }//GEN-LAST:event_jTextField9MouseClicked

    private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClicked
push(10, evt);
    }//GEN-LAST:event_jTextField10MouseClicked

    private void jTextField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseClicked
push(11, evt);
    }//GEN-LAST:event_jTextField11MouseClicked

    private void jTextField12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MouseClicked
push(12, evt);
    }//GEN-LAST:event_jTextField12MouseClicked

    private void jTextField13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField13MouseClicked
push(13, evt);
    }//GEN-LAST:event_jTextField13MouseClicked

    private void jTextField14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseClicked
push(14, evt);
    }//GEN-LAST:event_jTextField14MouseClicked

    private void jTextField15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField15MouseClicked
push(15, evt);
    }//GEN-LAST:event_jTextField15MouseClicked

    private void jTextField16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField16MouseClicked
push(16, evt);
    }//GEN-LAST:event_jTextField16MouseClicked

    private void jTextField17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField17MouseClicked
push(17, evt);
    }//GEN-LAST:event_jTextField17MouseClicked

    private void jTextField18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField18MouseClicked
push(18, evt);
    }//GEN-LAST:event_jTextField18MouseClicked

    private void jTextField19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField19MouseClicked
push(19, evt);
    }//GEN-LAST:event_jTextField19MouseClicked

    private void jTextField20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField20MouseClicked
push(20, evt);
    }//GEN-LAST:event_jTextField20MouseClicked

    private void jTextField21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField21MouseClicked
push(21, evt);
    }//GEN-LAST:event_jTextField21MouseClicked

    private void jTextField22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField22MouseClicked
push(22, evt);
    }//GEN-LAST:event_jTextField22MouseClicked

    private void jTextField23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField23MouseClicked
push(23, evt);
    }//GEN-LAST:event_jTextField23MouseClicked

    private void jTextField24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField24MouseClicked
push(24, evt);
    }//GEN-LAST:event_jTextField24MouseClicked

    private void jTextField25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField25MouseClicked
push(25, evt);
    }//GEN-LAST:event_jTextField25MouseClicked

    private void jTextField26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField26MouseClicked
push(26, evt);
    }//GEN-LAST:event_jTextField26MouseClicked

    private void jTextField27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField27MouseClicked
push(27, evt);
    }//GEN-LAST:event_jTextField27MouseClicked

    private void jTextField28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField28MouseClicked
push(28, evt);
    }//GEN-LAST:event_jTextField28MouseClicked

    private void jTextField29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField29MouseClicked
push(29, evt);
    }//GEN-LAST:event_jTextField29MouseClicked

    private void jTextField30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField30MouseClicked
push(30, evt);
    }//GEN-LAST:event_jTextField30MouseClicked

    private void jTextField31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField31MouseClicked
push(31, evt);
    }//GEN-LAST:event_jTextField31MouseClicked

    private void jTextField32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField32MouseClicked
push(32, evt);
    }//GEN-LAST:event_jTextField32MouseClicked

    private void jTextField33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField33MouseClicked
push(33, evt);
    }//GEN-LAST:event_jTextField33MouseClicked

    private void jTextField34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField34MouseClicked
push(34, evt);
    }//GEN-LAST:event_jTextField34MouseClicked

    private void jTextField35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField35MouseClicked
push(35, evt);
    }//GEN-LAST:event_jTextField35MouseClicked

    private void jTextField36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField36MouseClicked
push(36, evt);
    }//GEN-LAST:event_jTextField36MouseClicked

    private void jTextField37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField37MouseClicked
push(37, evt);
    }//GEN-LAST:event_jTextField37MouseClicked

    private void jTextField38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField38MouseClicked
push(38, evt);
    }//GEN-LAST:event_jTextField38MouseClicked

    private void jTextField39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField39MouseClicked
push(39, evt);
    }//GEN-LAST:event_jTextField39MouseClicked

    private void jTextField40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField40MouseClicked
push(40, evt);
    }//GEN-LAST:event_jTextField40MouseClicked

    private void jTextField41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField41MouseClicked
push(41, evt);
    }//GEN-LAST:event_jTextField41MouseClicked

    private void jTextField42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField42MouseClicked
push(42, evt);
    }//GEN-LAST:event_jTextField42MouseClicked

    private void jTextField43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField43MouseClicked
push(43, evt);
    }//GEN-LAST:event_jTextField43MouseClicked

    private void jTextField44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField44MouseClicked
push(44, evt);
    }//GEN-LAST:event_jTextField44MouseClicked

    private void jTextField45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField45MouseClicked
push(45, evt);
    }//GEN-LAST:event_jTextField45MouseClicked

    private void jTextField46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField46MouseClicked
push(46, evt);
    }//GEN-LAST:event_jTextField46MouseClicked

    private void jTextField47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField47MouseClicked
push(47, evt);
    }//GEN-LAST:event_jTextField47MouseClicked

    private void jTextField48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField48MouseClicked
push(48, evt);
    }//GEN-LAST:event_jTextField48MouseClicked

    private void jTextField49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField49MouseClicked
push(49, evt);
    }//GEN-LAST:event_jTextField49MouseClicked

    private void jTextField50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField50MouseClicked
push(50, evt);
    }//GEN-LAST:event_jTextField50MouseClicked

    private void jTextField51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField51MouseClicked
push(51, evt);
    }//GEN-LAST:event_jTextField51MouseClicked

    private void jTextField52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField52MouseClicked
push(52, evt);
    }//GEN-LAST:event_jTextField52MouseClicked

    private void jTextField53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField53MouseClicked
push(53, evt);
    }//GEN-LAST:event_jTextField53MouseClicked

    private void jTextField54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField54MouseClicked
push(54, evt);
    }//GEN-LAST:event_jTextField54MouseClicked

    private void jTextField55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField55MouseClicked
push(55, evt);
    }//GEN-LAST:event_jTextField55MouseClicked

    private void jTextField56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField56MouseClicked
push(56, evt);
    }//GEN-LAST:event_jTextField56MouseClicked

    private void jTextField57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField57MouseClicked
push(57, evt);
    }//GEN-LAST:event_jTextField57MouseClicked

    private void jTextField58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField58MouseClicked
push(58, evt);
    }//GEN-LAST:event_jTextField58MouseClicked

    private void jTextField59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField59MouseClicked
push(59, evt);
    }//GEN-LAST:event_jTextField59MouseClicked

    private void jTextField60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField60MouseClicked
push(60, evt);
    }//GEN-LAST:event_jTextField60MouseClicked

    private void jTextField61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField61MouseClicked
push(61, evt);
    }//GEN-LAST:event_jTextField61MouseClicked

    private void jTextField62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField62MouseClicked
push(62, evt);
    }//GEN-LAST:event_jTextField62MouseClicked

    private void jTextField63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField63MouseClicked
push(63, evt);
    }//GEN-LAST:event_jTextField63MouseClicked

    private void jTextField64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField64MouseClicked
push(64, evt);
    }//GEN-LAST:event_jTextField64MouseClicked

    private void jTextField65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField65MouseClicked
push(65, evt);
    }//GEN-LAST:event_jTextField65MouseClicked

    private void jTextField66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField66MouseClicked
push(66, evt);
    }//GEN-LAST:event_jTextField66MouseClicked

    private void jTextField67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField67MouseClicked
push(67, evt);
    }//GEN-LAST:event_jTextField67MouseClicked

    private void jTextField68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField68MouseClicked
push(68, evt);
    }//GEN-LAST:event_jTextField68MouseClicked

    private void jTextField69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField69MouseClicked
push(69, evt);
    }//GEN-LAST:event_jTextField69MouseClicked

    private void jTextField70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField70MouseClicked
push(70, evt);
    }//GEN-LAST:event_jTextField70MouseClicked

    private void jTextField71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField71MouseClicked
push(71, evt);
    }//GEN-LAST:event_jTextField71MouseClicked

    private void jTextField72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField72MouseClicked
push(72, evt);
    }//GEN-LAST:event_jTextField72MouseClicked

    private void jTextField73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField73MouseClicked
push(73, evt);
    }//GEN-LAST:event_jTextField73MouseClicked

    private void jTextField74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField74MouseClicked
push(74, evt);
    }//GEN-LAST:event_jTextField74MouseClicked

    private void jTextField75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField75MouseClicked
push(75, evt);
    }//GEN-LAST:event_jTextField75MouseClicked

    private void jTextField76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField76MouseClicked
push(76, evt);
    }//GEN-LAST:event_jTextField76MouseClicked

    private void jTextField77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField77MouseClicked
push(77, evt);
    }//GEN-LAST:event_jTextField77MouseClicked

    private void jTextField78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField78MouseClicked
push(78, evt);
    }//GEN-LAST:event_jTextField78MouseClicked

    private void jTextField79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField79MouseClicked
push(79, evt);
    }//GEN-LAST:event_jTextField79MouseClicked

    private void jTextField80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField80MouseClicked
push(80, evt);
    }//GEN-LAST:event_jTextField80MouseClicked

    private void jTextField81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField81MouseClicked
push(81, evt);
    }//GEN-LAST:event_jTextField81MouseClicked
// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button actions 2">
    private void jTextField88MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField88MouseClicked
String zz=jTextField88.getText();
if(zz.equals("magic"))
    jTextField88.setText("no magic");
if(zz.equals("no magic"))
    jTextField88.setText("magic");
    }//GEN-LAST:event_jTextField88MouseClicked

    private void jTextField89MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField89MouseClicked
    String h=jTextField89.getText();
if(h.equals("EASY")){h="MEDIUM";}
    else if(h.equals("MEDIUM")){h="HARD";}
    else if(h.equals("HARD")){h="DIABOLICAL";}
    else if(h.equals("DIABOLICAL")){h="EASY";}
    jTextField89.setText(h);
    reset();
    }//GEN-LAST:event_jTextField89MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
reset();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
JOptionPane.showMessageDialog(this, "\t\tMinesweeper\nVersion:  1.0.9\nCreator:  Abhishek Banerjee\ne-mail:  abhishekbanerjee1992@gmail.com");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
check_1();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
check();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
if(jPanel2.isVisible())
        ff();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
int asd=JOptionPane.showConfirmDialog(this, "Exit???");
if(asd==0)
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
this.setVisible(false);
mine1 x4=new mine1();
x4.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jTextField91MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField91MouseClicked
ti=false;b1=false;a1=0;a2=0;a3=0;jTextField91.setText("0"+a3+":0"+a2+":0"+a1);time_chase=false;
    }//GEN-LAST:event_jTextField91MouseClicked

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
time_chase=true;ti=true;b1=true;reset();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
time_chase=false;
    }//GEN-LAST:event_jMenuItem9ActionPerformed
//</editor-fold>

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new x2().setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Variables Declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField82;
    private javax.swing.JTextField jTextField83;
    private javax.swing.JTextField jTextField84;
    private javax.swing.JTextField jTextField85;
    private javax.swing.JTextField jTextField86;
    private javax.swing.JTextField jTextField87;
    private javax.swing.JTextField jTextField88;
    private javax.swing.JTextField jTextField89;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextField90;
    private javax.swing.JTextField jTextField91;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
