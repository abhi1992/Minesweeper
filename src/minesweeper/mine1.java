package minesweeper;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class mine1 extends javax.swing.JFrame {
    public mine1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(5, 33, 60));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minesweeper/bleach_11_640.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(5, 33, 60));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jLabel2.setBackground(new java.awt.Color(3, 79, 117));
        jLabel2.setFont(new java.awt.Font("Kristen ITC", 2, 24));
        jLabel2.setForeground(new java.awt.Color(51, 204, 0));
        jLabel2.setText("ABOUT");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(3, 79, 117));
        jLabel6.setFont(new java.awt.Font("Kristen ITC", 2, 24));
        jLabel6.setForeground(new java.awt.Color(51, 204, 0));
        jLabel6.setText("GO TO MINE 3");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(3, 79, 117));
        jLabel5.setFont(new java.awt.Font("Kristen ITC", 2, 24));
        jLabel5.setForeground(new java.awt.Color(51, 204, 0));
        jLabel5.setText("GO TO MINE 2");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(3, 79, 117));
        jLabel3.setFont(new java.awt.Font("Kristen ITC", 2, 24));
        jLabel3.setForeground(new java.awt.Color(51, 204, 0));
        jLabel3.setText("EXIT");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(3, 79, 117));
        jLabel1.setFont(new java.awt.Font("Kristen ITC", 2, 24));
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("GO TO MINE 1");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(3, 79, 117));
        jLabel7.setFont(new java.awt.Font("Kristen ITC", 2, 24));
        jLabel7.setForeground(new java.awt.Color(51, 204, 0));
        jLabel7.setText("HELP");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(5, 33, 60));
        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jTextField1.setBackground(new java.awt.Color(3, 79, 117));
        jTextField1.setFont(new java.awt.Font("Kristen ITC", 2, 36));
        jTextField1.setForeground(new java.awt.Color(51, 204, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("MINESWEEPER");
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
this.setVisible(false);
x1 x4=new x1();
x4.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
int as=JOptionPane.showConfirmDialog(this, "Exit??");
if(as==0)
    System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
 JOptionPane.showMessageDialog(this, "Minesweeper\n Version 1.0.9_update_28\n Creator:\n Abhishek Banerjee" +
         "\n minigames.co.ltd\n email: \nabhishekbanerjee1992@gmail.com");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
this.setVisible(false);
x2 x4=new x2();
x4.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
this.setVisible(false);
x3 x4=new x3();
x4.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
 JOptionPane.showMessageDialog(this, "Minesweeper\n Version 1.0.9_update_28\n Creator:\n Abhishek Banerjee" +
         "\n Minesweeper is a simple game.In This game \"X\" represent a mine.\nRight Click to choose a mine & left click for vacant space." +
         "\nClick on no magic option to activate magic & again click it to deactivate it.\nClick on clock to stop it. Click on easy to change difficulty." +
         "\nThere are 2 game modes: Time Chase & Relax Play." +
         "\nIn time chase u 'll get limited Time & In Relax Play there is unlimited time.\nCheats:" +
         "Yes !! There are 2 diffrent types of cheats available in this game.Cheats can be bought by \nwinning games" +
         "and earning points.Magic costs 50 points and Check costs 500 points. \nThat's all the help u'l need,Thanks.\nENJOY THE GAME!!");
    }//GEN-LAST:event_jLabel7MouseClicked
int a[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
Random r=new Random();
String aa[]={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","",
"","","","","","","","","","","","","","","","","","","","","",""};
public void intro(int n){
ArrayList a1 = new ArrayList(51);
for(int ry=0;ry<51;ry++){
a1.add(""+ry);}int yu=50;
for(int i=1;i<=n;i++){
int ri=    (int) (Math.random() * yu) + 1;
a[i]=Integer.parseInt((String)a1.get(ri));
a1.remove(ri);yu--;
}
box(n);
}
public void box(int av){
for(int i=1;i<=av;i++){
aa[a[i]]="X";}
sel(av);
}
public void sd(int y){
 if(aa[y].equals("")){ aa[y]="1";}
 else if(aa[y].equals("1")){ aa[y]="2";}
 else if(aa[y].equals("2")){aa[y]="3";}
else  if(aa[y].equals("3")){aa[y]="4";}
  else if(aa[y].equals("4")){aa[y]="5";}
else if(aa[y].equals("5")){aa[y]="6";}
 else if(aa[y].equals("6")){aa[y]="7";}
 else if(aa[y].equals("7")){aa[y]="8";}
}

public void sel(int va){
for(int i=1;i<=va;i++){
switch(a[i]){
    case 1:
    sd(2);sd(11);sd(12);
    break;
    case 2:
    sd(1);sd(3);sd(11);sd(12);sd(13);
    break;
    case 3:
    sd(2);sd(4);sd(12);sd(13);sd(14);
    break;
    case 4:
    sd(3);sd(5);sd(13);sd(14);sd(15);
    break;
    case 5:
sd(4);sd(6);sd(14);sd(15);sd(16);
    break;
    case 6:
        sd(5);sd(7);sd(15);sd(16);sd(17);
    break;
    case 7:
    sd(6);sd(8);sd(16);sd(17);sd(18);
    break;
    case 8:
    sd(7);sd(9);sd(17);sd(18);sd(19);
    break;
    case 9:
    sd(8);sd(10);sd(18);sd(19);sd(20);
    break;
    case 10:
    sd(9);sd(19);sd(20);
    break;
    case 11:
    sd(1);sd(2);sd(12);sd(21);sd(22);
    break;
    case 12:
    sd(1);sd(2);sd(3);sd(11);sd(13);sd(21);sd(22);sd(23);
    break;
    case 13:
    sd(2);sd(3);sd(4);sd(12);sd(14);sd(22);sd(23);sd(24);
    break;
    case 14:
    sd(3);sd(4);sd(5);sd(13);sd(15);sd(23);sd(24);sd(25);
    break;
    case 15:
    sd(4);sd(5);sd(6);sd(14);sd(16);sd(24);sd(25);sd(26);
    break;
    case 16:
    sd(5);sd(6);sd(7);sd(15);sd(17);sd(25);sd(26);sd(27);
    break;
    case 17:
    sd(6);sd(7);sd(8);sd(16);sd(18);sd(26);sd(27);sd(28);
    break;
    case 18:
    sd(7);sd(8);sd(9);sd(17);sd(19);sd(27);sd(28);sd(29);
    break;
    case 19:
    sd(8);sd(9);sd(10);sd(18);sd(20);sd(28);sd(29);sd(30);
    break;
    case 20:
    sd(9);sd(10);sd(19);sd(29);sd(30);
    break;
    case 21:
    sd(11);sd(12);sd(22);sd(31);sd(32);
    break;
    case 22:
    sd(11);sd(12);sd(13);sd(21);sd(23);sd(31);sd(32);sd(33);
    break;
    case 23:
    sd(12);sd(13);sd(14);sd(22);sd(24);sd(32);sd(33);sd(34);
    break;
    case 24:
    sd(13);sd(14);sd(15);sd(23);sd(25);sd(33);sd(34);sd(35);
    break;
    case 25:
    sd(14);sd(15);sd(16);sd(24);sd(26);sd(34);sd(35);sd(36);
    break;
    case 26:
    sd(15);sd(16);sd(17);sd(25);sd(27);sd(35);sd(36);sd(37);
    break;
    case 27:
    sd(16);sd(17);sd(18);sd(26);sd(28);sd(36);sd(37);sd(38);
    break;
    case 28:
    sd(17);sd(18);sd(19);sd(27);sd(29);sd(37);sd(38);sd(39);
    break;
    case 29:
    sd(18);sd(19);sd(20);sd(28);sd(30);sd(38);sd(39);sd(40);
    break;
    case 30:
    sd(19);sd(20);sd(29);sd(39);sd(40);
    break;
    case 31:
    sd(21);sd(22);sd(32);sd(41);sd(42);
    break;
    case 32:
    sd(21);sd(22);sd(23);sd(31);sd(33);sd(41);sd(42);sd(43);
    break;
    case 33:
    sd(22);sd(23);sd(24);sd(32);sd(34);sd(42);sd(43);sd(44);
    break;
    case 34:
    sd(23);sd(24);sd(25);sd(33);sd(35);sd(43);sd(44);sd(45);
    break;
    case 35:
    sd(24);sd(25);sd(26);sd(34);sd(36);sd(44);sd(45);sd(46);
    break;
    case 36:
    sd(25);sd(26);sd(27);sd(35);sd(37);sd(45);sd(46);sd(47);
    break;
    case 37:
    sd(26);sd(27);sd(28);sd(36);sd(38);sd(46);sd(47);sd(48);
    break;
    case 38:
    sd(27);sd(28);sd(29);sd(37);sd(39);sd(47);sd(48);sd(49);
    break;
    case 39:
    sd(28);sd(29);sd(30);sd(38);sd(40);sd(48);sd(49);sd(50);
    break;
    case 40:
    sd(29);sd(30);sd(39);sd(49);sd(50);
    break;
    case 41:
    sd(31);sd(32);sd(42);
    break;
    case 42:
    sd(31);sd(32);sd(33);sd(41);sd(43);
    break;
    case 43:
    sd(32);sd(33);sd(34);sd(42);sd(44);
    break;
    case 44:
    sd(33);sd(34);sd(35);sd(43);sd(45);
    break;
    case 45:
    sd(34);sd(35);sd(36);sd(44);sd(46);
    break;
    case 46:
    sd(35);sd(36);sd(37);sd(45);sd(47);
    break;
    case 47:
    sd(36);sd(37);sd(38);sd(46);sd(48);
    break;
    case 48:
    sd(37);sd(38);sd(39);sd(47);sd(49);
    break;
    case 49:
    sd(38);sd(39);sd(40);sd(48);sd(50);
    break;
    case 50:
    sd(39);sd(40);sd(49);
    break;
    default:
        break;}}}
public void em(){
    for(int hh=1;hh<=50;hh++){
aa[hh]="";}
}
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mine1().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
