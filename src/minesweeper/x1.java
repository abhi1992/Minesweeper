package minesweeper;
import java.awt.Color;
import javax.swing.JOptionPane;
public class x1 extends javax.swing.JFrame {
    public x1() {
        initComponents();
                String h=jTextField61.getText();
        if(h.equals("EASY")){b=6;} else if(h.equals("MEDIUM")){b=10;} else if(h.equals("HARD")){b=12;} else if(h.equals("DIABOLICAL")){b=16;}
        m.intro(b);
        for(int u=1;u<=50;u++){
            q[0][u]=m.aa[u];}
        jTextField58.setText(""+b);
        jTextField53.setText(""+sc);jTextField55.setText(""+bdd);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jTextField56 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jTextField1.setBackground(new java.awt.Color(0, 51, 0));
        jTextField1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField1.setEnabled(false);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jTextField13.setBackground(new java.awt.Color(0, 51, 0));
        jTextField13.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField13.setForeground(new java.awt.Color(255, 0, 0));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField13.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField13.setEnabled(false);
        jTextField13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField13MouseClicked(evt);
            }
        });

        jTextField24.setBackground(new java.awt.Color(0, 51, 0));
        jTextField24.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField24.setForeground(new java.awt.Color(255, 0, 0));
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField24.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField24.setEnabled(false);
        jTextField24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField24MouseClicked(evt);
            }
        });

        jTextField11.setBackground(new java.awt.Color(0, 51, 0));
        jTextField11.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField11.setForeground(new java.awt.Color(255, 0, 0));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField11.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField11.setEnabled(false);
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField11MouseClicked(evt);
            }
        });

        jTextField9.setBackground(new java.awt.Color(0, 51, 0));
        jTextField9.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField9.setForeground(new java.awt.Color(255, 0, 0));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField9.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField9.setEnabled(false);
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });

        jTextField18.setBackground(new java.awt.Color(0, 51, 0));
        jTextField18.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField18.setForeground(new java.awt.Color(255, 0, 0));
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField18.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField18.setEnabled(false);
        jTextField18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField18MouseClicked(evt);
            }
        });

        jTextField45.setBackground(new java.awt.Color(0, 51, 0));
        jTextField45.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField45.setForeground(new java.awt.Color(255, 0, 0));
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField45.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField45.setEnabled(false);
        jTextField45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField45MouseClicked(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(0, 51, 0));
        jTextField3.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField3.setForeground(new java.awt.Color(255, 0, 0));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField3.setEnabled(false);
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });

        jTextField35.setBackground(new java.awt.Color(0, 51, 0));
        jTextField35.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField35.setForeground(new java.awt.Color(255, 0, 0));
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField35.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField35.setEnabled(false);
        jTextField35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField35MouseClicked(evt);
            }
        });

        jTextField49.setBackground(new java.awt.Color(0, 51, 0));
        jTextField49.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField49.setForeground(new java.awt.Color(255, 0, 0));
        jTextField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField49.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField49.setEnabled(false);
        jTextField49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField49MouseClicked(evt);
            }
        });

        jTextField33.setBackground(new java.awt.Color(0, 51, 0));
        jTextField33.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField33.setForeground(new java.awt.Color(255, 0, 0));
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField33.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField33.setEnabled(false);
        jTextField33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField33MouseClicked(evt);
            }
        });

        jTextField22.setBackground(new java.awt.Color(0, 51, 0));
        jTextField22.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField22.setForeground(new java.awt.Color(255, 0, 0));
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField22.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField22.setEnabled(false);
        jTextField22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField22MouseClicked(evt);
            }
        });

        jTextField7.setBackground(new java.awt.Color(0, 51, 0));
        jTextField7.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField7.setForeground(new java.awt.Color(255, 0, 0));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField7.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField7.setEnabled(false);
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
        });

        jTextField29.setBackground(new java.awt.Color(0, 51, 0));
        jTextField29.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField29.setForeground(new java.awt.Color(255, 0, 0));
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField29.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField29.setEnabled(false);
        jTextField29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField29MouseClicked(evt);
            }
        });

        jTextField12.setBackground(new java.awt.Color(0, 51, 0));
        jTextField12.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField12.setForeground(new java.awt.Color(255, 0, 0));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField12.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField12.setEnabled(false);
        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField12MouseClicked(evt);
            }
        });

        jTextField21.setBackground(new java.awt.Color(0, 51, 0));
        jTextField21.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField21.setForeground(new java.awt.Color(255, 0, 0));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField21.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField21.setEnabled(false);
        jTextField21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField21MouseClicked(evt);
            }
        });

        jTextField19.setBackground(new java.awt.Color(0, 51, 0));
        jTextField19.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField19.setForeground(new java.awt.Color(255, 0, 0));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField19.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField19.setEnabled(false);
        jTextField19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField19MouseClicked(evt);
            }
        });

        jTextField23.setBackground(new java.awt.Color(0, 51, 0));
        jTextField23.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField23.setForeground(new java.awt.Color(255, 0, 0));
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField23.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField23.setEnabled(false);
        jTextField23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField23MouseClicked(evt);
            }
        });

        jTextField20.setBackground(new java.awt.Color(0, 51, 0));
        jTextField20.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField20.setForeground(new java.awt.Color(255, 0, 0));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField20.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField20.setEnabled(false);
        jTextField20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField20MouseClicked(evt);
            }
        });

        jTextField26.setBackground(new java.awt.Color(0, 51, 0));
        jTextField26.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField26.setForeground(new java.awt.Color(255, 0, 0));
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField26.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField26.setEnabled(false);
        jTextField26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField26MouseClicked(evt);
            }
        });

        jTextField44.setBackground(new java.awt.Color(0, 51, 0));
        jTextField44.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField44.setForeground(new java.awt.Color(255, 0, 0));
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField44.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField44.setEnabled(false);
        jTextField44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField44MouseClicked(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(0, 51, 0));
        jTextField4.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField4.setForeground(new java.awt.Color(255, 0, 0));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField4.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField4.setEnabled(false);
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        jTextField36.setBackground(new java.awt.Color(0, 51, 0));
        jTextField36.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField36.setForeground(new java.awt.Color(255, 0, 0));
        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField36.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField36.setEnabled(false);
        jTextField36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField36MouseClicked(evt);
            }
        });

        jTextField16.setBackground(new java.awt.Color(0, 51, 0));
        jTextField16.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField16.setForeground(new java.awt.Color(255, 0, 0));
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField16.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField16.setEnabled(false);
        jTextField16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField16MouseClicked(evt);
            }
        });

        jTextField17.setBackground(new java.awt.Color(0, 51, 0));
        jTextField17.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField17.setForeground(new java.awt.Color(255, 0, 0));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField17.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField17.setEnabled(false);
        jTextField17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField17MouseClicked(evt);
            }
        });

        jTextField40.setBackground(new java.awt.Color(0, 51, 0));
        jTextField40.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField40.setForeground(new java.awt.Color(255, 0, 0));
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField40.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField40.setEnabled(false);
        jTextField40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField40MouseClicked(evt);
            }
        });

        jTextField28.setBackground(new java.awt.Color(0, 51, 0));
        jTextField28.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField28.setForeground(new java.awt.Color(255, 0, 0));
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField28.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField28.setEnabled(false);
        jTextField28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField28MouseClicked(evt);
            }
        });

        jTextField15.setBackground(new java.awt.Color(0, 51, 0));
        jTextField15.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField15.setForeground(new java.awt.Color(255, 0, 0));
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField15.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField15.setEnabled(false);
        jTextField15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField15MouseClicked(evt);
            }
        });

        jTextField48.setBackground(new java.awt.Color(0, 51, 0));
        jTextField48.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField48.setForeground(new java.awt.Color(255, 0, 0));
        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField48.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField48.setEnabled(false);
        jTextField48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField48MouseClicked(evt);
            }
        });

        jTextField46.setBackground(new java.awt.Color(0, 51, 0));
        jTextField46.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField46.setForeground(new java.awt.Color(255, 0, 0));
        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField46.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField46.setEnabled(false);
        jTextField46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField46MouseClicked(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(0, 51, 0));
        jTextField5.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField5.setForeground(new java.awt.Color(255, 0, 0));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField5.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField5.setEnabled(false);
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });

        jTextField43.setBackground(new java.awt.Color(0, 51, 0));
        jTextField43.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField43.setForeground(new java.awt.Color(255, 0, 0));
        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField43.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField43.setEnabled(false);
        jTextField43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField43MouseClicked(evt);
            }
        });

        jTextField47.setBackground(new java.awt.Color(0, 51, 0));
        jTextField47.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField47.setForeground(new java.awt.Color(255, 0, 0));
        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField47.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField47.setEnabled(false);
        jTextField47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField47MouseClicked(evt);
            }
        });

        jTextField31.setBackground(new java.awt.Color(0, 51, 0));
        jTextField31.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField31.setForeground(new java.awt.Color(255, 0, 0));
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField31.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField31.setEnabled(false);
        jTextField31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField31MouseClicked(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(0, 51, 0));
        jTextField6.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField6.setForeground(new java.awt.Color(255, 0, 0));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField6.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField6.setEnabled(false);
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });

        jTextField38.setBackground(new java.awt.Color(0, 51, 0));
        jTextField38.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField38.setForeground(new java.awt.Color(255, 0, 0));
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField38.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField38.setEnabled(false);
        jTextField38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField38MouseClicked(evt);
            }
        });

        jTextField27.setBackground(new java.awt.Color(0, 51, 0));
        jTextField27.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField27.setForeground(new java.awt.Color(255, 0, 0));
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField27.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField27.setEnabled(false);
        jTextField27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField27MouseClicked(evt);
            }
        });

        jTextField25.setBackground(new java.awt.Color(0, 51, 0));
        jTextField25.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField25.setForeground(new java.awt.Color(255, 0, 0));
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField25.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField25.setEnabled(false);
        jTextField25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField25MouseClicked(evt);
            }
        });

        jTextField8.setBackground(new java.awt.Color(0, 51, 0));
        jTextField8.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField8.setForeground(new java.awt.Color(255, 0, 0));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField8.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField8.setEnabled(false);
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });

        jTextField32.setBackground(new java.awt.Color(0, 51, 0));
        jTextField32.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField32.setForeground(new java.awt.Color(255, 0, 0));
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField32.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField32.setEnabled(false);
        jTextField32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField32MouseClicked(evt);
            }
        });

        jTextField50.setBackground(new java.awt.Color(0, 51, 0));
        jTextField50.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField50.setForeground(new java.awt.Color(255, 0, 0));
        jTextField50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField50.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField50.setEnabled(false);
        jTextField50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField50MouseClicked(evt);
            }
        });

        jTextField30.setBackground(new java.awt.Color(0, 51, 0));
        jTextField30.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField30.setForeground(new java.awt.Color(255, 0, 0));
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField30.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField30.setEnabled(false);
        jTextField30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField30MouseClicked(evt);
            }
        });

        jTextField41.setBackground(new java.awt.Color(0, 51, 0));
        jTextField41.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField41.setForeground(new java.awt.Color(255, 0, 0));
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField41.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField41.setEnabled(false);
        jTextField41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField41MouseClicked(evt);
            }
        });

        jTextField37.setBackground(new java.awt.Color(0, 51, 0));
        jTextField37.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField37.setForeground(new java.awt.Color(255, 0, 0));
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField37.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField37.setEnabled(false);
        jTextField37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField37MouseClicked(evt);
            }
        });

        jTextField10.setBackground(new java.awt.Color(0, 51, 0));
        jTextField10.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField10.setForeground(new java.awt.Color(255, 0, 0));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField10.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField10.setEnabled(false);
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField10MouseClicked(evt);
            }
        });

        jTextField39.setBackground(new java.awt.Color(0, 51, 0));
        jTextField39.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField39.setForeground(new java.awt.Color(255, 0, 0));
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField39.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField39.setEnabled(false);
        jTextField39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField39MouseClicked(evt);
            }
        });

        jTextField14.setBackground(new java.awt.Color(0, 51, 0));
        jTextField14.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField14.setForeground(new java.awt.Color(255, 0, 0));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField14.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField14.setEnabled(false);
        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField14MouseClicked(evt);
            }
        });

        jTextField42.setBackground(new java.awt.Color(0, 51, 0));
        jTextField42.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField42.setForeground(new java.awt.Color(255, 0, 0));
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField42.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField42.setEnabled(false);
        jTextField42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField42MouseClicked(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(0, 51, 0));
        jTextField2.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField2.setForeground(new java.awt.Color(255, 0, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField2.setEnabled(false);
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });

        jTextField34.setBackground(new java.awt.Color(0, 51, 0));
        jTextField34.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField34.setForeground(new java.awt.Color(255, 0, 0));
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField34.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextField34.setEnabled(false);
        jTextField34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField34MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField51.setBackground(new java.awt.Color(0, 102, 102));
        jTextField51.setFont(new java.awt.Font("Algerian", 0, 36));
        jTextField51.setForeground(new java.awt.Color(255, 255, 102));
        jTextField51.setText("MINESWEEPER");
        jTextField51.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jTextField51.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        jTextField51.setEnabled(false);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jTextField56.setBackground(new java.awt.Color(0, 51, 0));
        jTextField56.setFont(new java.awt.Font("Algerian", 0, 18));
        jTextField56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField56.setText("no magic");
        jTextField56.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField56.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        jTextField56.setEnabled(false);
        jTextField56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField56MouseClicked(evt);
            }
        });

        jTextField58.setBackground(new java.awt.Color(0, 51, 0));
        jTextField58.setFont(new java.awt.Font("Algerian", 0, 18));
        jTextField58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField58.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        jTextField58.setEnabled(false);

        jTextField57.setBackground(new java.awt.Color(0, 51, 0));
        jTextField57.setFont(new java.awt.Font("Algerian", 0, 18));
        jTextField57.setText("bombs left:");
        jTextField57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField57.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        jTextField57.setEnabled(false);

        jTextField54.setBackground(new java.awt.Color(0, 51, 0));
        jTextField54.setFont(new java.awt.Font("Algerian", 0, 14));
        jTextField54.setForeground(new java.awt.Color(153, 0, 51));
        jTextField54.setText("magic LEFT:");
        jTextField54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField54.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        jTextField54.setEnabled(false);

        jTextField55.setBackground(new java.awt.Color(0, 51, 0));
        jTextField55.setFont(new java.awt.Font("Algerian", 0, 18));
        jTextField55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField55.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        jTextField55.setEnabled(false);

        jTextField61.setBackground(new java.awt.Color(0, 51, 0));
        jTextField61.setFont(new java.awt.Font("Algerian", 0, 14));
        jTextField61.setForeground(new java.awt.Color(51, 153, 0));
        jTextField61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField61.setText("EASY");
        jTextField61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField61.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        jTextField61.setEnabled(false);
        jTextField61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField61MouseClicked(evt);
            }
        });

        jTextField52.setBackground(new java.awt.Color(0, 102, 102));
        jTextField52.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField52.setText("SCORE:");
        jTextField52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField52.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        jTextField52.setEnabled(false);

        jTextField53.setBackground(new java.awt.Color(0, 102, 102));
        jTextField53.setFont(new java.awt.Font("Algerian", 0, 36));
        jTextField53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField53.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        jTextField53.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField54, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField61, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jTextField57, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField52, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField53, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(jTextField56, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField53, 0, 0, Short.MAX_VALUE)
                    .addComponent(jTextField52))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jMenuBar1.setForeground(new java.awt.Color(0, 102, 0));

        jMenu1.setForeground(new java.awt.Color(255, 255, 51));
        jMenu1.setText("Menu");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
        jMenuItem1.setText("Check");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, 0));
        jMenuItem4.setText("Win");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        jMenuItem2.setText("Buy Magic");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
        jMenuItem3.setText("Reset");
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

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        jMenuItem5.setText("About");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Exit");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String a;
String rs[]={"","","","","","","","","","","","","","","","","","","","","","","","","","",
"","","","","","","","","","","","","","","","","","","","","","","","",""};
int sc=50;
mine1 m=new mine1();
int b=6,bdd=5;
String q[][]={
    {"","","","","","","","","","","","","","","","","","","","","","","","","","",
"","","","","","","","","","","","","","","","","","","","","","","","",""}};

boolean abh[]={true,true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,};
boolean bd[]={true,true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,};
int ab=10;
int y=0;

// <editor-fold defaultstate="collapsed" desc="s1()-s50()">
public void s1(){
    a=q[y][1];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
      jTextField1.setBackground(Color.WHITE);
jTextField1.setText(a);a=q[y][1];abh[1]=false;}
 if(a.equals("")){
 if(abh[2]==true)
s2();
  if(abh[11]==true){
    s11();}
    if(abh[12]==true){
    s12();}}}
public void s2(){
 a=q[y][2];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
      jTextField2.setBackground(Color.WHITE);
jTextField2.setText(a); abh[2]=false;}
if(a.equals("")){
    if(abh[1]==true){s1();}
   if(abh[3]==true){s3();}
    if(abh[11]==true){ s11();}
    if(abh[12]==true){ s12();}
    if(abh[13]==true){ s13();}}}
public void s3(){
 a=q[y][3];
 abh[3]=false;
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
jTextField3.setBackground(Color.WHITE);
jTextField3.setText(a); abh[3]=false;}
 if(a.equals("")){
    if(abh[2]==true)
s2();
    if(abh[4]==true)
    s4();
    if(abh[12]==true)
    s12();
    if(abh[13]==true)
    s13();
    if(abh[14]==true)
    s14();}}
public void s4(){
 a=q[y][4];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField4.setBackground(Color.WHITE);
jTextField4.setText(a); abh[4]=false;}
if(a.equals("")){
    if(abh[3]==true)
s3();
    if(abh[5]==true)
    s5();
    if(abh[13]==true)
    s13();
    if(abh[14]==true)
    s14();
    if(abh[15]==true)
    s15();}}
public void s5(){
 a=q[y][5];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
         jTextField5.setBackground(Color.WHITE);
jTextField5.setText(a); abh[5]=false;
}
if(a.equals("")){
    if(abh[4]==true)
s4();
    if(abh[6]==true)
    s6();
    if(abh[14]==true)
    s14();
    if(abh[15]==true)
    s15();
    if(abh[16]==true)
    s16();}}
public void s6(){
 a=q[y][6];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField6.setBackground(Color.WHITE);
jTextField6.setText(a); abh[6]=false;}
if(a.equals("")){
 if(abh[5]==true)
s5();
    if(abh[7]==true)
    s7();
    if(abh[15]==true)
    s15();
    if(abh[16]==true)
    s16();
    if(abh[17]==true)
    s17();}}
public void s7(){
 a=q[y][7];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField7.setBackground(Color.WHITE);
jTextField7.setText(a); abh[7]=false;}
if(a.equals("")){
 if(abh[6]==true)
s6();
    if(abh[8]==true)
    s8();
    if(abh[16]==true)
    s16();
    if(abh[17]==true)
    s17();
    if(abh[18]==true)
    s18();}}
public void s8(){
 a=q[y][8];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField8.setBackground(Color.WHITE);
jTextField8.setText(a);
 abh[8]=false;}
if(a.equals("")){
if(abh[7]==true)
s7();
    if(abh[9]==true)
    s9();
    if(abh[17]==true)
    s17();
    if(abh[18]==true)
    s18();
    if(abh[19]==true)
    s19();}}
public void s9(){
 a=q[y][9];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField9.setBackground(Color.WHITE);
jTextField9.setText(a);abh[9]=false;}
if(a.equals("")){
if(abh[8]==true)
s8();
    if(abh[10]==true)
    s10();
    if(abh[18]==true)
    s18();
    if(abh[19]==true)
    s19();
    if(abh[20]==true)
    s20();}}
public void s10(){
 a=q[y][10];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField10.setBackground(Color.WHITE);
jTextField10.setText(a);abh[10]=false;}
if(a.equals("")){
if(abh[9]==true)
s9();
    if(abh[19]==true)
    s19();
    if(abh[20]==true)
    s20();}}
public void s11(){
 a=q[y][11];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField11.setBackground(Color.WHITE);
jTextField11.setText(a); abh[11]=false;}
if(a.equals("")){
    if(abh[1]==true)
s1();
    if(abh[2]==true)
    s2();
    if(abh[12]==true)
    s12();
    if(abh[21]==true)
    s21();
    if(abh[22]==true)
    s22();}}
public void s12(){
 a=q[y][12];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField12.setBackground(Color.WHITE);
jTextField12.setText(a); abh[12]=false;}
if(a.equals("")){
    if(abh[1]==true)
s1();
    if(abh[2]==true)
    s2();
    if(abh[3]==true)
    s3();
    if(abh[11]==true)
    s11();
    if(abh[13]==true)
    s13();
    if(abh[21]==true)
    s21();
    if(abh[22]==true)
    s22();
    if(abh[23]==true)
    s23();}}
public void s13(){
 a=q[y][13];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField13.setBackground(Color.WHITE);
jTextField13.setText(a); abh[13]=false;}
if(a.equals("")){
   if(abh[2]==true)
s2();
    if(abh[3]==true)
    s3();
    if(abh[4]==true)
    s4();
    if(abh[12]==true)
    s12();
    if(abh[14]==true)
    s14();
    if(abh[22]==true)
    s22();
    if(abh[23]==true)
    s23();
    if(abh[24]==true)
    s24();}}
public void s14(){
 a=q[y][14];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField14.setBackground(Color.WHITE);
jTextField14.setText(a);abh[14]=false;}
if(a.equals("")){
   if(abh[3]==true){s3();}
    if(abh[4]==true)
    s4();
    if(abh[5]==true)
    s5();
    if(abh[13]==true)
    s13();
    if(abh[15]==true)
    s15();
    if(abh[23]==true)
    s23();
    if(abh[24]==true)
    s24();
    if(abh[25]==true)
    s25();}}
public void s15(){
 a=q[y][15];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField15.setBackground(Color.WHITE);
jTextField15.setText(a);abh[15]=false;}
if(a.equals("")){
   if(abh[4]==true)
s1();
    if(abh[5]==true)
    s5();
    if(abh[6]==true)
    s6();
    if(abh[14]==true)
    s14();
    if(abh[16]==true)
    s16();
    if(abh[24]==true)
    s24();
    if(abh[25]==true)
    s25();
    if(abh[26]==true)
    s26();}}
public void s16(){
 a=q[y][16];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField16.setBackground(Color.WHITE);
jTextField16.setText(a);abh[16]=false;
}
if(a.equals("")){
 if(abh[5]==true)
s5();
    if(abh[6]==true)
    s6();
    if(abh[7]==true)
    s7();
    if(abh[15]==true)
    s15();
    if(abh[17]==true)
    s17();
    if(abh[25]==true)
    s25();
    if(abh[26]==true)
    s26();
    if(abh[27]==true)
    s27();
}}
public void s17(){
 a=q[y][17];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField17.setBackground(Color.WHITE);
jTextField17.setText(a);abh[17]=false;}
if(a.equals("")){
 if(abh[6]==true)
s6();
    if(abh[7]==true)
    s7();
    if(abh[8]==true)
    s8();
    if(abh[16]==true)
    s16();
    if(abh[18]==true)
    s18();
    if(abh[26]==true)
    s26();
    if(abh[27]==true)
    s27();
    if(abh[28]==true)
    s28();}}
public void s18(){
 a=q[y][18];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField18.setBackground(Color.WHITE);
jTextField18.setText(a);abh[18]=false;}
if(a.equals("")){
if(abh[7]==true)
s7();
    if(abh[8]==true)
    s8();
    if(abh[9]==true)
    s9();
    if(abh[17]==true)
    s17();
    if(abh[19]==true)
    s19();
    if(abh[27]==true)
    s27();
    if(abh[28]==true)
    s28();
    if(abh[29]==true)
    s29();}}
public void s19(){
 a=q[y][19];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField19.setBackground(Color.WHITE);
jTextField19.setText(a);abh[19]=false;}
if(a.equals("")){
if(abh[8]==true)
s8();
    if(abh[9]==true)
    s9();
    if(abh[10]==true)
    s10();
    if(abh[18]==true)
    s18();
    if(abh[20]==true)
    s20();
    if(abh[28]==true)
    s28();
    if(abh[29]==true)
    s29();
    if(abh[30]==true)
    s30();}}
public void s20(){
 a=q[y][20];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField20.setBackground(Color.WHITE);jTextField20.setText(a);abh[20]=false;}
if(a.equals("")){
     if(abh[9]==true){s9();}
    if(abh[10]==true){s10();}
    if(abh[19]==true){s19();}
    if(abh[29]==true){ s29();}
    if(abh[30]==true){ s30();}}}
public void s21(){
 a=q[y][21];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField21.setBackground(Color.WHITE);
jTextField21.setText(a);abh[21]=false;}
if(a.equals("")){
    if(abh[11]==true){  s11();  }
     if(abh[12]==true){  s12();  }
    if(abh[22]==true){  s22();  }
     if(abh[31]==true){  s31();  }
     if(abh[32]==true){  s32();  }}}
public void s22(){
 a=q[y][22];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField22.setBackground(Color.WHITE);
jTextField22.setText(a);abh[22]=false;}
if(a.equals("")){
if(abh[11]==true)
s11();
    if(abh[12]==true)
    s12();
    if(abh[13]==true)
    s13();
    if(abh[21]==true)
    s21();
    if(abh[23]==true)
    s23();
    if(abh[31]==true)
    s31();
    if(abh[32]==true)
    s32();
    if(abh[33]==true)
    s33();}}
public void s23(){
 a=q[y][23];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField23.setBackground(Color.WHITE);
jTextField23.setText(a);abh[23]=false;}
if(a.equals("")){
    if(abh[12]==true)
    s12();
    if(abh[13]==true)
    s13();
    if(abh[14]==true)
s14();
    if(abh[22]==true)
    s22();
    if(abh[24]==true)
    s24();
    if(abh[32]==true)
    s32();
    if(abh[33]==true)
    s33();
      if(abh[34]==true)
    s34();}}
public void s24(){
 a=q[y][24];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField24.setBackground(Color.WHITE);
jTextField24.setText(a);abh[24]=false;}
if(a.equals("")){
if(abh[13]==true)
    s13();
    if(abh[14]==true)
    s14();
    if(abh[15]==true)
s15();
    if(abh[23]==true)
    s23();
    if(abh[25]==true)
    s25();
    if(abh[33]==true)
    s33();
    if(abh[34]==true)
    s34();
      if(abh[35]==true)
    s35();}}
public void s25(){
 a=q[y][25];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField25.setBackground(Color.WHITE);
jTextField25.setText(a);abh[25]=false;}
if(a.equals("")){
if(abh[14]==true)
    s14();
    if(abh[15]==true)
    s15();
    if(abh[16]==true)
s16();
    if(abh[24]==true)
    s24();
    if(abh[26]==true)
    s26();
    if(abh[34]==true)
    s34();
    if(abh[35]==true)
    s35();
      if(abh[36]==true)
    s36();}}
public void s26(){
 a=q[y][26];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField26.setBackground(Color.WHITE);
jTextField26.setText(a);abh[26]=false;}
if(a.equals("")){
if(abh[15]==true)
    s15();
    if(abh[16]==true)
    s16();
    if(abh[17]==true)
s17();
    if(abh[25]==true)
    s25();
    if(abh[27]==true)
    s27();
    if(abh[35]==true)
    s35();
    if(abh[36]==true)
    s36();
      if(abh[37]==true)
    s37();}}
public void s27(){
 a=q[y][27];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField27.setBackground(Color.WHITE);
jTextField27.setText(a);abh[27]=false;}
if(a.equals("")){
if(abh[16]==true)
    s16();
    if(abh[17]==true)
    s17();
    if(abh[18]==true)
s18();
    if(abh[26]==true)
    s26();
    if(abh[28]==true)
    s28();
    if(abh[36]==true)
    s36();
    if(abh[37]==true)
    s37();
      if(abh[38]==true)
    s38();}}
public void s28(){
 a=q[y][28];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField28.setBackground(Color.WHITE);
jTextField28.setText(a);abh[28]=false;}
if(a.equals("")){
if(abh[17]==true)
    s17();
    if(abh[18]==true)
    s18();
    if(abh[19]==true)
s19();
    if(abh[27]==true)
    s27();
    if(abh[29]==true)
    s29();
    if(abh[37]==true)
    s37();
    if(abh[38]==true)
    s38();
      if(abh[39]==true)
    s39();}}
public void s29(){
 a=q[y][29];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField29.setBackground(Color.WHITE);
jTextField29.setText(a);abh[29]=false;}
if(a.equals("")){
if(abh[18]==true)
    s18();
    if(abh[19]==true)
    s19();
    if(abh[20]==true)
s20();
    if(abh[28]==true)
    s28();
    if(abh[30]==true)
    s30();
    if(abh[38]==true)
    s38();
    if(abh[39]==true)
    s39();
      if(abh[40]==true)
    s40();}}
public void s30(){
 a=q[y][30];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField30.setBackground(Color.WHITE);jTextField30.setText(a);abh[30]=false;}
if(a.equals("")){
    if(abh[19]==true){s19();}
    if(abh[20]==true){s20();}
    if(abh[29]==true){s29();}
    if(abh[39]==true){ s39();}
    if(abh[40]==true){ s40();}}}
public void s31(){
 a=q[y][31];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField31.setBackground(Color.WHITE);
jTextField31.setText(a);abh[31]=false;}
if(a.equals("")){
    if(abh[21]==true){  s21();  }
     if(abh[22]==true){  s22();  }
    if(abh[32]==true){  s32();  }
     if(abh[41]==true){  s41();  }
     if(abh[42]==true){  s42();  }
}}
public void s32(){
 a=q[y][32];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField32.setBackground(Color.WHITE);
jTextField32.setText(a);abh[32]=false;}
if(a.equals("")){
if(abh[21]==true)
    s21();
    if(abh[22]==true)
    s22();
    if(abh[23]==true)
s23();
    if(abh[31]==true)
    s31();
    if(abh[33]==true)
    s33();
    if(abh[41]==true)
    s41();
    if(abh[42]==true)
    s42();
      if(abh[43]==true)
    s43();}}
public void s33(){
 a=q[y][33];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){jTextField33.setBackground(Color.WHITE);jTextField33.setText(a);abh[33]=false;}
if(a.equals("")){
if(abh[22]==true)
    s22();
    if(abh[23]==true)
    s23();
    if(abh[24]==true)
s24();
    if(abh[32]==true)
    s32();
    if(abh[34]==true)
    s34();
    if(abh[42]==true)
    s42();
      if(abh[43]==true)
    s43();
 if(abh[44]==true)
    s44();}}
public void s34(){
 a=q[y][34];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField34.setBackground(Color.WHITE);jTextField34.setText(a);abh[34]=false;}
if(a.equals("")){
    if(abh[23]==true){  s23(); }
    if(abh[24]==true){  s24(); }
    if(abh[25]==true){  s25();  }
    if(abh[33]==true){  s33();  }
    if(abh[35]==true){  s35();  }
     if(abh[43]==true){ s43();  }
    if(abh[44]==true){  s44();  }
     if(abh[45]==true){  s45(); }}}
public void s35(){
 a=q[y][35];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField35.setBackground(Color.WHITE);jTextField35.setText(a);abh[35]=false;}
if(a.equals("")){
    if(abh[24]==true){  s24(); }
    if(abh[25]==true){  s25(); }
    if(abh[26]==true){  s26();  }
    if(abh[34]==true){  s34();  }
    if(abh[36]==true){  s36();  }
     if(abh[44]==true){ s44();  }
    if(abh[45]==true){  s45();  }
     if(abh[46]==true){  s46(); }}}
public void s36(){
 a=q[y][36];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField36.setBackground(Color.WHITE);jTextField36.setText(a);abh[36]=false;}
    if(a.equals("")){
    if(abh[25]==true){  s25(); }
    if(abh[26]==true){  s26();  }
    if(abh[27]==true){  s27(); }
    if(abh[35]==true){  s35();  }
    if(abh[37]==true){  s37();  }
    if(abh[45]==true){  s45();  }
     if(abh[46]==true){  s46(); }
     if(abh[47]==true){  s47();  }}}
public void s37(){
 a=q[y][37];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField37.setBackground(Color.WHITE);jTextField37.setText(a);abh[37]=false;}
if(a.equals("")){
    if(abh[26]==true){  s26();  }
    if(abh[27]==true){  s27(); }
     if(abh[28]==true){  s28(); }
    if(abh[36]==true){  s36();  }
    if(abh[38]==true){  s38();  }
     if(abh[46]==true){  s46(); }
     if(abh[47]==true){  s47();  }
     if(abh[48]==true){  s48();  }}}
public void s38(){
 a=q[y][38];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField38.setBackground(Color.WHITE);jTextField38.setText(a);abh[38]=false;}
if(a.equals("")){
    if(abh[27]==true){  s27(); }
     if(abh[28]==true){  s28(); }
     if(abh[29]==true){  s29();  }
    if(abh[37]==true){  s37();  }
    if(abh[39]==true){  s39();  }
     if(abh[47]==true){  s47();  }
     if(abh[48]==true){  s48();  }
     if(abh[49]==true){  s49(); }}}
public void s39(){
 a=q[y][39];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField39.setBackground(Color.WHITE);jTextField39.setText(a);abh[39]=false;}
if(a.equals("")){
     if(abh[28]==true){  s28(); }
     if(abh[29]==true){  s29();  }
      if(abh[30]==true){  s30(); }
    if(abh[38]==true){  s38();  }
    if(abh[40]==true){  s40();  }
     if(abh[48]==true){  s48();  }
     if(abh[49]==true){  s49(); }
     if(abh[50]==true){  s50();  }}}
public void s40(){
 a=q[y][40];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField40.setBackground(Color.WHITE);jTextField40.setText(a);abh[40]=false;}
if(a.equals("")){
    if(abh[29]==true){s29();}
    if(abh[30]==true){s30();}
    if(abh[39]==true){s39();}
if(abh[49]==true){s49();}
    if(abh[50]==true){s50();}
}}
public void s41(){
 a=q[y][41];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField41.setBackground(Color.WHITE);jTextField41.setText(a);abh[41]=false;}
if(a.equals("")){
     if(abh[31]==true){  s31();  }
     if(abh[32]==true){  s32();  }
     if(abh[42]==true){  s42();  }
}}
public void s42(){
 a=q[y][42];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField42.setBackground(Color.WHITE);jTextField42.setText(a);abh[42]=false;}
if(a.equals("")){
    if(abh[31]==true){  s31(); }
    if(abh[32]==true){  s32();  }
    if(abh[33]==true){  s33();  }
    if(abh[41]==true){  s41();  }
    if(abh[43]==true){  s43();  }
}}
public void s43(){
 a=q[y][43];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField43.setBackground(Color.WHITE);jTextField43.setText(a);abh[43]=false;}
if(a.equals("")){
    if(abh[32]==true){  s32();  }
    if(abh[33]==true){  s33();  }
     if(abh[34]==true){  s34();  }
    if(abh[42]==true){  s42();  }
    if(abh[44]==true){  s44();  }}}
public void s44(){
 a=q[y][44];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField44.setBackground(Color.WHITE);jTextField44.setText(a);abh[44]=false;}
if(a.equals("")){
     if(abh[33]==true){  s33();  }
     if(abh[34]==true){  s34();  }
     if(abh[35]==true){  s35();  }
    if(abh[43]==true){  s43();  }
    if(abh[45]==true){  s45();  }}}
public void s45(){
 a=q[y][45];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField45.setBackground(Color.WHITE);jTextField45.setText(a);abh[45]=false;}
if(a.equals("")){
     if(abh[34]==true){  s34();  }
     if(abh[35]==true){  s35();  }
      if(abh[36]==true){  s36();  }
    if(abh[44]==true){  s44();  }
    if(abh[46]==true){  s46();  }}}
public void s46(){
 a=q[y][46];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField46.setBackground(Color.WHITE);jTextField46.setText(a);abh[46]=false;}
if(a.equals("")){
     if(abh[35]==true){  s35();  }
      if(abh[36]==true){  s36();  }
      if(abh[37]==true){  s37();  }
      if(abh[45]==true){  s45();  }
      if(abh[47]==true){  s47();  }}}
public void s47(){
 a=q[y][47];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField47.setBackground(Color.WHITE);jTextField47.setText(a);abh[47]=false;}
if(a.equals("")){
      if(abh[36]==true){  s36();  }
      if(abh[37]==true){  s37();  }
       if(abh[38]==true){  s38();  }
    if(abh[46]==true){  s46();  }
    if(abh[48]==true){  s48();  }}}
public void s48(){
 a=q[y][48];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField48.setBackground(Color.WHITE);jTextField48.setText(a);abh[48]=false;}
if(a.equals("")){
     if(abh[37]==true){  s37();  }
     if(abh[38]==true){  s38();  }
     if(abh[39]==true){  s39();  }
     if(abh[47]==true){  s47();  }
     if(abh[49]==true){  s49();  }}}
public void s49(){
 a=q[y][49];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){
    jTextField49.setBackground(Color.WHITE);jTextField49.setText(a);abh[49]=false;}
if(a.equals("")){
       if(abh[38]==true){  s38();  }
      if(abh[39]==true){  s39();  }
        if(abh[40]==true){  s40();  }
    if(abh[48]==true){  s48();  }
    if(abh[50]==true){  s50();  }}}
public void s50(){
 a=q[y][50];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("")){   jTextField50.setBackground(Color.WHITE);jTextField50.setText(a);abh[50]=false;}
if(a.equals("")){
      if(abh[39]==true){  s39();  }
        if(abh[40]==true){  s40();  }
       if(abh[49]==true){  s49();  }}}// </editor-fold>


public void check(){
if(sc>=500){sc=sc-500;
for(int ii=1;ii<=50;ii++){
     
if(!bd[ii]){String h=q[0][ii];
if(!h.equals("X")){
 a2(ii,0,51,0);abh[ii]=true; b++; bd[ii]=true;rs[ii]="";
}
}}}else{ JOptionPane.showMessageDialog(this, "NOT ENOUGH MONEY!!\nRequired: 500 points\nYou have: "+sc+" only");}
jTextField53.setText(""+sc);
}

public void loo(){   JOptionPane.showMessageDialog(this, "You loose!!!\n Your score: "+sc);  reset();  }

public void reset(){ bdd=5;y=0;for(int yy=1;yy<=50;yy++){ abh[yy]=true; bd[yy]=true;  rs[yy]="";  q[0][yy]=""; m.aa[yy]="";}
 jTextField1.setBackground(new Color(0,51,0));jTextField2.setBackground(new Color(0,51,0));jTextField3.setBackground(new Color(0,51,0));
 jTextField4.setBackground(new Color(0,51,0));jTextField5.setBackground(new Color(0,51,0));jTextField6.setBackground(new Color(0,51,0));
 jTextField7.setBackground(new Color(0,51,0));jTextField8.setBackground(new Color(0,51,0));jTextField9.setBackground(new Color(0,51,0));
 jTextField10.setBackground(new Color(0,51,0));jTextField11.setBackground(new Color(0,51,0));jTextField12.setBackground(new Color(0,51,0));
 jTextField13.setBackground(new Color(0,51,0));jTextField14.setBackground(new Color(0,51,0));jTextField15.setBackground(new Color(0,51,0));
 jTextField16.setBackground(new Color(0,51,0));jTextField17.setBackground(new Color(0,51,0));jTextField18.setBackground(new Color(0,51,0));
 jTextField19.setBackground(new Color(0,51,0));jTextField20.setBackground(new Color(0,51,0));jTextField21.setBackground(new Color(0,51,0));
 jTextField22.setBackground(new Color(0,51,0));jTextField23.setBackground(new Color(0,51,0));jTextField24.setBackground(new Color(0,51,0));
 jTextField25.setBackground(new Color(0,51,0));jTextField26.setBackground(new Color(0,51,0));jTextField27.setBackground(new Color(0,51,0));
 jTextField28.setBackground(new Color(0,51,0));jTextField29.setBackground(new Color(0,51,0));jTextField30.setBackground(new Color(0,51,0));
 jTextField31.setBackground(new Color(0,51,0));jTextField32.setBackground(new Color(0,51,0));jTextField33.setBackground(new Color(0,51,0));
 jTextField34.setBackground(new Color(0,51,0));jTextField35.setBackground(new Color(0,51,0));jTextField36.setBackground(new Color(0,51,0));
 jTextField37.setBackground(new Color(0,51,0));jTextField38.setBackground(new Color(0,51,0));jTextField39.setBackground(new Color(0,51,0));
 jTextField40.setBackground(new Color(0,51,0));jTextField41.setBackground(new Color(0,51,0));jTextField42.setBackground(new Color(0,51,0));
 jTextField43.setBackground(new Color(0,51,0));jTextField44.setBackground(new Color(0,51,0));jTextField45.setBackground(new Color(0,51,0));
 jTextField46.setBackground(new Color(0,51,0));jTextField47.setBackground(new Color(0,51,0));jTextField48.setBackground(new Color(0,51,0));
 jTextField49.setBackground(new Color(0,51,0));jTextField50.setBackground(new Color(0,51,0));
  jTextField1.setText("");jTextField2.setText("");jTextField3.setText(""); jTextField4.setText("");jTextField5.setText("");jTextField6.setText("");
 jTextField7.setText("");jTextField8.setText("");jTextField9.setText(""); jTextField10.setText("");jTextField11.setText("");jTextField12.setText("");
 jTextField13.setText("");jTextField14.setText("");jTextField15.setText("");jTextField16.setText("");jTextField17.setText("");jTextField18.setText("");
 jTextField19.setText("");jTextField20.setText("");jTextField21.setText(""); jTextField37.setText("");jTextField38.setText("");jTextField39.setText("");
jTextField40.setText("");jTextField41.setText("");jTextField42.setText("");jTextField43.setText("");jTextField44.setText("");jTextField45.setText("");
 jTextField46.setText("");jTextField47.setText("");jTextField48.setText(""); jTextField49.setText("");jTextField50.setText("");
 jTextField22.setText("");jTextField23.setText("");jTextField24.setText(""); jTextField25.setText("");jTextField26.setText("");jTextField27.setText("");
 jTextField28.setText("");jTextField29.setText("");jTextField30.setText("");
 jTextField31.setText("");jTextField32.setText("");jTextField33.setText("");jTextField34.setText("");jTextField35.setText("");jTextField36.setText("");
String h=jTextField61.getText();
if(h.equals("EASY")){b=6;}
else if(h.equals("MEDIUM")){b=10;}
else if(h.equals("HARD")){b=12;}
else if(h.equals("DIABOLICAL")){b=16;}
 m.intro(b); jTextField58.setText(""+b); jTextField53.setText(""+sc); jTextField55.setText(""+bdd);
 for(int u=1;u<=50;u++){
        q[0][u]=m.aa[u];}
 jPanel2.setVisible(true);  jPanel5.setVisible(true);}

// <editor-fold defaultstate="collapsed" desc="a1()-a2()-a3()">
public void a1(int a){
switch(a){

    case 1:
         s1();    jTextField1.setBackground(Color.WHITE);        jTextField1.setText(q[y][1]);
        break;
        case 2:
         s2();    jTextField2.setBackground(Color.WHITE);        jTextField2.setText(q[y][2]);
        break;
        case 3:
         s3();    jTextField3.setBackground(Color.WHITE);        jTextField3.setText(q[y][3]);
        break;
        case 4:
         s4();    jTextField4.setBackground(Color.WHITE);        jTextField4.setText(q[y][4]);
        break;
        case 5:
         s5();    jTextField5.setBackground(Color.WHITE);        jTextField5.setText(q[y][5]);
        break;
        case 6:
         s6();    jTextField6.setBackground(Color.WHITE);        jTextField6.setText(q[y][6]);
        break;
        case 7:
         s7();    jTextField7.setBackground(Color.WHITE);        jTextField7.setText(q[y][7]);
        break;
        case 8:
         s8();    jTextField8.setBackground(Color.WHITE);        jTextField8.setText(q[y][8]);
        break;
        case 9:
         s9();    jTextField9.setBackground(Color.WHITE);        jTextField9.setText(q[y][9]);
        break;
        case 10:
         s10();    jTextField10.setBackground(Color.WHITE);        jTextField10.setText(q[y][10]);
        break;
        case 11:
         s11();    jTextField11.setBackground(Color.WHITE);        jTextField11.setText(q[y][11]);
        break;
        case 12:
         s12();    jTextField12.setBackground(Color.WHITE);        jTextField12.setText(q[y][12]);
        break;
        case 13:
         s13();    jTextField13.setBackground(Color.WHITE);        jTextField13.setText(q[y][13]);
        break;
        case 14:
         s14();    jTextField14.setBackground(Color.WHITE);        jTextField14.setText(q[y][14]);
        break;
        case 15:
         s15();    jTextField15.setBackground(Color.WHITE);        jTextField15.setText(q[y][15]);
        break;
        case 16:
         s16();    jTextField16.setBackground(Color.WHITE);        jTextField16.setText(q[y][16]);
        break;
        case 17:
         s17();    jTextField17.setBackground(Color.WHITE);        jTextField17.setText(q[y][17]);
        break;
        case 18:
         s18();    jTextField18.setBackground(Color.WHITE);        jTextField18.setText(q[y][18]);
        break;
        case 19:
         s19();    jTextField19.setBackground(Color.WHITE);        jTextField19.setText(q[y][19]);
        break;
        case 20:
         s20();    jTextField20.setBackground(Color.WHITE);        jTextField20.setText(q[y][20]);
        break;
        case 21:
         s21();    jTextField21.setBackground(Color.WHITE);        jTextField21.setText(q[y][21]);
        break;
        case 22:
         s22();    jTextField22.setBackground(Color.WHITE);        jTextField22.setText(q[y][22]);
        break;
        case 23:
         s23();    jTextField23.setBackground(Color.WHITE);        jTextField23.setText(q[y][23]);
        break;
        case 24:
         s24();    jTextField24.setBackground(Color.WHITE);        jTextField24.setText(q[y][24]);
        break;
        case 25:
         s25();    jTextField25.setBackground(Color.WHITE);        jTextField25.setText(q[y][25]);
        break;
        case 26:
         s26();    jTextField26.setBackground(Color.WHITE);        jTextField26.setText(q[y][26]);
        break;
        case 27:
         s27();    jTextField27.setBackground(Color.WHITE);        jTextField27.setText(q[y][27]);
        break;
        case 28:
         s28();    jTextField28.setBackground(Color.WHITE);        jTextField28.setText(q[y][28]);
        break;
        case 29:
         s29();    jTextField29.setBackground(Color.WHITE);        jTextField29.setText(q[y][29]);
        break;
        case 30:
         s30();    jTextField30.setBackground(Color.WHITE);        jTextField30.setText(q[y][30]);
        break;
        case 31:
         s31();    jTextField31.setBackground(Color.WHITE);        jTextField31.setText(q[y][31]);
        break;
        case 32:
         s32();    jTextField32.setBackground(Color.WHITE);        jTextField32.setText(q[y][32]);
        break;
        case 33:
         s33();    jTextField33.setBackground(Color.WHITE);        jTextField33.setText(q[y][33]);
        break;
        case 34:
         s34();    jTextField34.setBackground(Color.WHITE);        jTextField34.setText(q[y][34]);
        break;
        case 35:
         s35();    jTextField35.setBackground(Color.WHITE);        jTextField35.setText(q[y][35]);
        break;
        case 36:
         s36();    jTextField36.setBackground(Color.WHITE);        jTextField36.setText(q[y][36]);
        break;
        case 37:
         s37();    jTextField37.setBackground(Color.WHITE);        jTextField37.setText(q[y][37]);
        break;
        case 38:
         s38();    jTextField38.setBackground(Color.WHITE);        jTextField38.setText(q[y][38]);
        break;
        case 39:
         s39();    jTextField39.setBackground(Color.WHITE);        jTextField39.setText(q[y][39]);
        break;
        case 40:
         s40();    jTextField40.setBackground(Color.WHITE);        jTextField40.setText(q[y][40]);
        break;
        case 41:
         s41();    jTextField41.setBackground(Color.WHITE);        jTextField41.setText(q[y][41]);
        break;
        case 42:
         s42();    jTextField42.setBackground(Color.WHITE);        jTextField42.setText(q[y][42]);
        break;
        case 43:
         s43();    jTextField43.setBackground(Color.WHITE);        jTextField43.setText(q[y][43]);
        break;
        case 44:
         s44();    jTextField44.setBackground(Color.WHITE);        jTextField44.setText(q[y][44]);
        break;
        case 45:
         s45();    jTextField45.setBackground(Color.WHITE);        jTextField45.setText(q[y][45]);
        break;
        case 46:
         s46();    jTextField46.setBackground(Color.WHITE);        jTextField46.setText(q[y][46]);
        break;
        case 47:
         s47();    jTextField47.setBackground(Color.WHITE);        jTextField47.setText(q[y][47]);
        break;
        case 48:
         s48();    jTextField48.setBackground(Color.WHITE);        jTextField48.setText(q[y][48]);
        break;
        case 49:
         s49();    jTextField49.setBackground(Color.WHITE);        jTextField49.setText(q[y][49]);
        break;
        case 50:
         s50();    jTextField50.setBackground(Color.WHITE);        jTextField50.setText(q[y][50]);
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
    default :
        break;
}
}
//</editor-fold>


public void push(int ay,java.awt.event.MouseEvent evt){
String zz=jTextField56.getText();
if(zz.equals("magic")&&bdd>0&&abh[ay]==true){  bdd--;  jTextField55.setText(""+bdd);
if(q[y][ay].equals("X")){    a2(ay,255,0,0);  rs[ay]=q[y][ay]; b --; bd[ay]=false;}else {
   a1(ay);}}
else if(evt.getButton()==1&&abh[ay]){   a1(ay);
     if(q[y][ay].equals("X")){
         for(int muttu=1;muttu<51;muttu++){
    if(q[y][muttu].equals("X"))
    a1(muttu);
         if(q[y][muttu].equals("X")&&bd[muttu]==false)
    a2(muttu,0,255,0);}
         loo(); }}
else if(evt.getButton()==3&&abh[ay]==true&&bd[ay]){  
      a2(ay,255,0,0);  b --;  bd[ay]=false; abh[ay]=false;   rs[ay]=q[y][ay];      }
else if(evt.getButton()==3&&bd[ay]==false){
    a2(ay,0,51,0);abh[ay]=true; b++; bd[ay]=true;rs[ay]="";}
  jTextField58.setText(""+b);}

public void check_1(){
int win=0;
for(int ii=1;ii<=50;ii++){
   if(rs[ii].equals("1")||rs[ii].equals("2")&&rs[ii].equals("3")       ||rs[ii].equals("4")||rs[ii].equals("5")||rs[ii].equals("6")
        ||rs[ii].equals("7")||rs[ii].equals("8")){win=0;ii=100;}
   else if(!bd[ii]&&rs[ii].equals("X")){win++;}}String sa;sa=jTextField58.getText();
String s;s=jTextField61.getText();if((win==6&&s.equals("EASY")||win==10&&s.equals("MEDIUM")||win==12&&s.equals("HARD")
        ||win==16&&s.equals("DIABOLICAL"))&&sa.equals("0")) {
            String h=jTextField61.getText();
        if(h.equals("EASY")){ sc=sc+50;} else if(h.equals("MEDIUM")){  sc=sc+100;} else if(h.equals("HARD")){sc=sc+150;} else if(h.equals("DIABOLICAL")){sc=sc+250;}
    JOptionPane.showMessageDialog(this, "You Win!!!\n Your score: "+sc); reset();}}

  // <editor-fold defaultstate="collapsed" desc="button actions">
    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
push(1,evt);check_1();
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
push(2,evt);check_1();
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
push(3,evt);check_1();
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
push(4,evt);check_1();
    }//GEN-LAST:event_jTextField4MouseClicked
    private void jTextField56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField56MouseClicked
String zz=jTextField56.getText();
if(zz.equals("magic"))
    jTextField56.setText("no magic");
if(zz.equals("no magic"))
    jTextField56.setText("magic");
    }//GEN-LAST:event_jTextField56MouseClicked
    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
push(5,evt);check_1();
    }//GEN-LAST:event_jTextField5MouseClicked
    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
push(6,evt);check_1();
    }//GEN-LAST:event_jTextField6MouseClicked
    private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
push(7,evt);check_1();
    }//GEN-LAST:event_jTextField7MouseClicked
    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
push(8,evt);check_1();
    }//GEN-LAST:event_jTextField8MouseClicked
    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
push(9,evt);check_1();
    }//GEN-LAST:event_jTextField9MouseClicked
    private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClicked
push(10,evt);check_1();
    }//GEN-LAST:event_jTextField10MouseClicked
    private void jTextField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseClicked
push(11,evt);check_1();
    }//GEN-LAST:event_jTextField11MouseClicked
    private void jTextField12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MouseClicked
push(12,evt);check_1();
    }//GEN-LAST:event_jTextField12MouseClicked
    private void jTextField13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField13MouseClicked
push(13,evt);check_1();
    }//GEN-LAST:event_jTextField13MouseClicked
    private void jTextField14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseClicked
push(14,evt);check_1();
    }//GEN-LAST:event_jTextField14MouseClicked
    private void jTextField15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField15MouseClicked
push(15,evt);check_1();
    }//GEN-LAST:event_jTextField15MouseClicked
    private void jTextField16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField16MouseClicked
push(16,evt);check_1();
    }//GEN-LAST:event_jTextField16MouseClicked
    private void jTextField17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField17MouseClicked
push(17,evt);check_1();
    }//GEN-LAST:event_jTextField17MouseClicked
    private void jTextField18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField18MouseClicked
push(18,evt);check_1();
    }//GEN-LAST:event_jTextField18MouseClicked
    private void jTextField19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField19MouseClicked
push(19,evt);check_1();
    }//GEN-LAST:event_jTextField19MouseClicked
    private void jTextField20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField20MouseClicked
push(20,evt);check_1();
    }//GEN-LAST:event_jTextField20MouseClicked
    private void jTextField21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField21MouseClicked
push(21,evt);check_1();
    }//GEN-LAST:event_jTextField21MouseClicked

    private void jTextField22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField22MouseClicked
push(22,evt);check_1();
    }//GEN-LAST:event_jTextField22MouseClicked

    private void jTextField23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField23MouseClicked
push(23,evt);check_1();
    }//GEN-LAST:event_jTextField23MouseClicked

    private void jTextField24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField24MouseClicked
push(24,evt);check_1();
    }//GEN-LAST:event_jTextField24MouseClicked

    private void jTextField25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField25MouseClicked
push(25,evt);check_1();
    }//GEN-LAST:event_jTextField25MouseClicked

    private void jTextField26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField26MouseClicked
push(26,evt);check_1();
    }//GEN-LAST:event_jTextField26MouseClicked

    private void jTextField27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField27MouseClicked
push(27,evt);check_1();
    }//GEN-LAST:event_jTextField27MouseClicked

    private void jTextField28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField28MouseClicked
push(28,evt);check_1();
    }//GEN-LAST:event_jTextField28MouseClicked

    private void jTextField29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField29MouseClicked
push(29,evt);check_1();
    }//GEN-LAST:event_jTextField29MouseClicked

    private void jTextField30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField30MouseClicked
push(30,evt);check_1();
    }//GEN-LAST:event_jTextField30MouseClicked

    private void jTextField31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField31MouseClicked
push(31,evt);check_1();
    }//GEN-LAST:event_jTextField31MouseClicked

    private void jTextField32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField32MouseClicked
push(32,evt);check_1();
    }//GEN-LAST:event_jTextField32MouseClicked

    private void jTextField33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField33MouseClicked
push(33,evt);check_1();
    }//GEN-LAST:event_jTextField33MouseClicked

    private void jTextField34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField34MouseClicked
push(34,evt);check_1();
    }//GEN-LAST:event_jTextField34MouseClicked

    private void jTextField35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField35MouseClicked
push(35,evt);check_1();
    }//GEN-LAST:event_jTextField35MouseClicked

    private void jTextField36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField36MouseClicked
push(36,evt);check_1();
    }//GEN-LAST:event_jTextField36MouseClicked

    private void jTextField37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField37MouseClicked
push(37,evt);check_1();
    }//GEN-LAST:event_jTextField37MouseClicked

    private void jTextField38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField38MouseClicked
push(38,evt);check_1();
    }//GEN-LAST:event_jTextField38MouseClicked

    private void jTextField39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField39MouseClicked
push(39,evt);check_1();
    }//GEN-LAST:event_jTextField39MouseClicked

    private void jTextField40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField40MouseClicked
push(40,evt);check_1();
    }//GEN-LAST:event_jTextField40MouseClicked

    private void jTextField41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField41MouseClicked
push(41,evt);check_1();
    }//GEN-LAST:event_jTextField41MouseClicked

    private void jTextField42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField42MouseClicked
push(42,evt);check_1();
    }//GEN-LAST:event_jTextField42MouseClicked

    private void jTextField43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField43MouseClicked
push(43,evt);check_1();
    }//GEN-LAST:event_jTextField43MouseClicked

    private void jTextField44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField44MouseClicked
push(44,evt);check_1();
    }//GEN-LAST:event_jTextField44MouseClicked

    private void jTextField45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField45MouseClicked
push(45,evt);check_1();
    }//GEN-LAST:event_jTextField45MouseClicked

    private void jTextField46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField46MouseClicked
push(46,evt);check_1();
    }//GEN-LAST:event_jTextField46MouseClicked

    private void jTextField47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField47MouseClicked
push(47,evt);check_1();
    }//GEN-LAST:event_jTextField47MouseClicked

    private void jTextField48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField48MouseClicked
push(48,evt);check_1();
    }//GEN-LAST:event_jTextField48MouseClicked

    private void jTextField49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField49MouseClicked
push(49,evt);check_1();
    }//GEN-LAST:event_jTextField49MouseClicked

    private void jTextField50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField50MouseClicked
push(50,evt);check_1();
    }//GEN-LAST:event_jTextField50MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
  check();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
reset();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jTextField61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField61MouseClicked
    String h=jTextField61.getText();
if(h.equals("EASY")){h="MEDIUM";}
    else if(h.equals("MEDIUM")){h="HARD";}
    else if(h.equals("HARD")){h="DIABOLICAL";}
    else if(h.equals("DIABOLICAL")){h="EASY";}
    jTextField61.setText(h);
    reset();
    }//GEN-LAST:event_jTextField61MouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
if(jPanel2.isVisible())
        ff();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
check_1();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
int asd=JOptionPane.showConfirmDialog(this, "Exit???");
if(asd==0)
        System.exit(0);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
JOptionPane.showMessageDialog(this, "\t\tMinesweeper\nVersion:  1.0.9\nCreator:  Abhishek Banerjee\ne-mail:  abhishekbanerjee1992@gmail.com");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
   this.setVisible(false);
mine1 x4=new mine1();
x4.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed
//</editor-fold>

    public void ff(){
   int lao=Integer.parseInt( jTextField53.getText());
 if(lao>=50){
int olo= JOptionPane.showConfirmDialog(this, "Magic will cost 50 points\n Continue???");
if(olo==0){
bdd=bdd+5;
sc=sc-50;
 jTextField55.setText(""+bdd);  jTextField53.setText(""+sc);} }
 else{
 JOptionPane.showMessageDialog(this, "NOT ENOUGH MONEY!!\nRequired: 50 points\nYou have: "+sc+" only");
 }
}
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new x1().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
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
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
}
