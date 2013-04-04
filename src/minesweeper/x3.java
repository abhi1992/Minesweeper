

package minesweeper;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek Banerjee
 */
public class x3 extends javax.swing.JFrame {

    public x3() {
        initComponents();
                              String h=jTextField187.getText();
        if(h.equals("EASY")){b=20;}
        else if(h.equals("MEDIUM")){b=30;} else if(h.equals("HARD")){b=50;} else if(h.equals("DIABOLICAL")){b=70;}
        m.intro(b);cls();
        for(int u=1;u<=160;u++){
            q[u]=m.aa[u];}
        jTextField183.setText(""+b);
        jTextField181.setText(""+sc);jTextField185.setText(""+bdd);
     myt.schedule(tm, 0,10);
ab=b;
    }

        // <editor-fold defaultstate="collapsed" desc="variables initialization">
    String a;
String rs[]=new String[181],q[]=new String[181];
int sc=50;
mine3 m=new mine3();
int b=6,bdd=5;
boolean abh[]={true,true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,};
boolean bd[]={true,true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,
                        true,true,true,true,true,true,true,true,true,true,};
int ab=10;
int y=0;
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="a2()-a3()">

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
          jTextField81.setBackground(new Color(xxx,yyy,kkk));break;
        case 82:
          jTextField82.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 83:
          jTextField83.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 84:
          jTextField84.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 85:
          jTextField85.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 86:
          jTextField86.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 87:
          jTextField87.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 88:
          jTextField88.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 89:
          jTextField89.setBackground(new Color(xxx,yyy,kkk));
        break;
         case 90:
          jTextField90.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 91:
          jTextField91.setBackground(new Color(xxx,yyy,kkk));break;
        case 92:
          jTextField92.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 93:
          jTextField93.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 94:
          jTextField94.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 95:
          jTextField95.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 96:
          jTextField96.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 97:
          jTextField97.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 98:
          jTextField98.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 99:
          jTextField99.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 100:
          jTextField100.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 101:
          jTextField101.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 102:
          jTextField102.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 103:
          jTextField103.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 104:
          jTextField104.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 105:
          jTextField105.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 106:
          jTextField106.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 107:
          jTextField107.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 108:
          jTextField108.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 109:
          jTextField109.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 110:
          jTextField110.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 111:
          jTextField111.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 112:
          jTextField112.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 113:
          jTextField113.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 114:
          jTextField114.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 115:
          jTextField115.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 116:
          jTextField116.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 117:
          jTextField117.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 118:
          jTextField118.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 119:
          jTextField119.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 120:
          jTextField120.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 121:
          jTextField121.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 122:
          jTextField122.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 123:
          jTextField123.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 124:
          jTextField124.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 125:
          jTextField125.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 126:
          jTextField126.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 127:
          jTextField127.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 128:
          jTextField128.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 129:
          jTextField129.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 130:
          jTextField130.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 131:
          jTextField131.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 132:
          jTextField132.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 133:
          jTextField133.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 134:
          jTextField134.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 135:
          jTextField135.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 136:
          jTextField136.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 137:
          jTextField137.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 138:
          jTextField138.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 139:
          jTextField139.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 140:
          jTextField140.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 141:
          jTextField141.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 142:
          jTextField142.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 143:
          jTextField143.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 144:
          jTextField144.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 145:
          jTextField145.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 146:
          jTextField146.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 147:
          jTextField147.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 148:
          jTextField148.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 149:
          jTextField149.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 150:
          jTextField150.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 151:
          jTextField151.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 152:
          jTextField152.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 153:
          jTextField153.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 154:
          jTextField154.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 155:
          jTextField155.setBackground(new Color(xxx,yyy,kkk));
        break;
            case 156:
          jTextField156.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 157:
          jTextField157.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 158:
          jTextField158.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 159:
          jTextField159.setBackground(new Color(xxx,yyy,kkk));
        break;
        case 160:
          jTextField160.setBackground(new Color(xxx,yyy,kkk));
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
        case 83:
          jTextField83.setText(""+fat);
        break;
        case 84:
          jTextField84.setText(""+fat);
        break;
        case 85:
          jTextField85.setText(""+fat);
        break;
        case 86:
          jTextField86.setText(""+fat);
        break;
        case 87:
          jTextField87.setText(""+fat);
        break;
            case 88:
          jTextField88.setText(""+fat);
        break;
        case 89:
          jTextField89.setText(""+fat);
        break;
        case 90:
          jTextField90.setText(""+fat);
        break;
        case 91:
          jTextField91.setText(""+fat);
        break;
         case 92:
          jTextField92.setText(""+fat);
        break;
        case 93:
          jTextField93.setText(""+fat);
        break;
        case 94:
          jTextField94.setText(""+fat);
        break;
         case 95:
          jTextField95.setText(""+fat);
        break;
        case 96:
          jTextField96.setText(""+fat);
        break;
        case 97:
          jTextField97.setText(""+fat);
        break;
         case 98:
          jTextField98.setText(""+fat);
        break;
        case 99:
          jTextField99.setText(""+fat);
        break;
        case 100:
          jTextField100.setText(""+fat);
        break;
            case 101:
          jTextField101.setText(""+fat);
        break;
        case 102:
          jTextField102.setText(""+fat);
        break;
        case 103:
          jTextField103.setText(""+fat);
        break;
        case 104:
          jTextField104.setText(""+fat);
        break;
        case 105:
          jTextField105.setText(""+fat);
        break;
            case 106:
          jTextField106.setText(""+fat);
        break;
        case 107:
          jTextField107.setText(""+fat);
        break;
        case 108:
          jTextField108.setText(""+fat);
        break;
        case 109:
          jTextField109.setText(""+fat);
        break;
            case 110:
          jTextField110.setText(""+fat);
        break;
        case 111:
          jTextField111.setText(""+fat);
        break;
        case 112:
          jTextField112.setText(""+fat);
        break;
        case 113:
          jTextField113.setText(""+fat);
        break;
        case 114:
          jTextField114.setText(""+fat);
        break;
        case 115:
          jTextField115.setText(""+fat);
        break;
            case 116:
          jTextField116.setText(""+fat);
        break;
        case 117:
          jTextField117.setText(""+fat);
        break;
        case 118:
          jTextField118.setText(""+fat);
        break;
        case 119:
          jTextField119.setText(""+fat);
        break;
         case 120:
          jTextField120.setText(""+fat);
        break;
            case 121:
          jTextField121.setText(""+fat);
        break;
        case 122:
          jTextField122.setText(""+fat);
        break;
        case 123:
          jTextField123.setText(""+fat);
        break;
        case 124:
          jTextField124.setText(""+fat);
        break;
        case 125:
          jTextField125.setText(""+fat);
        break;
            case 126:
          jTextField126.setText(""+fat);
        break;
        case 127:
          jTextField127.setText(""+fat);
        break;
        case 128:
          jTextField128.setText(""+fat);
        break;
        case 129:
          jTextField129.setText(""+fat);
        break;
        case 130:
          jTextField130.setText(""+fat);
        break;
            case 131:
          jTextField131.setText(""+fat);
        break;
        case 132:
          jTextField132.setText(""+fat);
        break;
        case 133:
          jTextField133.setText(""+fat);
        break;
        case 134:
          jTextField134.setText(""+fat);
        break;
        case 135:
          jTextField135.setText(""+fat);
        break;
            case 136:
          jTextField136.setText(""+fat);
        break;
        case 137:
          jTextField137.setText(""+fat);
        break;
        case 138:
          jTextField138.setText(""+fat);
        break;
        case 139:
          jTextField139.setText(""+fat);
        break;
        case 140:
          jTextField140.setText(""+fat);
        break;
            case 141:
          jTextField141.setText(""+fat);
        break;
        case 142:
          jTextField142.setText(""+fat);
        break;
        case 143:
          jTextField143.setText(""+fat);
        break;
        case 144:
          jTextField144.setText(""+fat);
        break;
        case 145:
          jTextField145.setText(""+fat);
        break;
            case 146:
          jTextField146.setText(""+fat);
        break;
        case 147:
          jTextField147.setText(""+fat);
        break;
        case 148:
          jTextField148.setText(""+fat);
        break;
        case 149:
          jTextField149.setText(""+fat);
        break;
        case 150:
          jTextField150.setText(""+fat);
        break;
         case 151:
          jTextField151.setText(""+fat);
        break;
        case 152:
          jTextField152.setText(""+fat);
        break;
        case 153:
          jTextField153.setText(""+fat);
        break;
        case 154:
          jTextField154.setText(""+fat);
        break;
        case 155:
          jTextField155.setText(""+fat);
        break;
            case 156:
          jTextField156.setText(""+fat);
        break;
        case 157:
          jTextField157.setText(""+fat);
        break;
        case 158:
          jTextField158.setText(""+fat);
        break;
        case 159:
          jTextField159.setText(""+fat);
        break;
        case 160:
          jTextField160.setText(""+fat);
        break;
    default :
        break;
}
}
//</editor-fold>
public void cls(){
    for(int ratt=0;ratt<161;ratt++){
    q[ratt]="";rs[ratt]="";
    }
}
public void check(){
if(sc>=500){sc=sc-500;
for(int ii=1;ii<=50;ii++){

if(!bd[ii]){String h=q[ii];
if(!h.equals("X")){
 a2(ii,3,79,117);abh[ii]=true; b++; bd[ii]=true;rs[ii]="";
}
}}}else{ JOptionPane.showMessageDialog(this, "NOT ENOUGH MONEY!!\nRequired: 500 points\nYou have: "+sc+" only");}
jTextField181.setText(""+sc);
}
public void loo(){  a1=0;a2=0;a3=0; ti=false;b1=false;
JOptionPane.showMessageDialog(this, "You loose!!!\n Your score: "+sc+"\nTotal Time: "+jTextField179.getText()
        +"\nBombs Detected: "+y+"\nCompleted: "+(y*100)/ab+" %");  reset();  }

public void reset(){ bdd=5;y=0;for(int yy=1;yy<=160;yy++){ abh[yy]=true; bd[yy]=true;  rs[yy]="";  q[yy]=""; m.aa[yy]="";}
for(int ria=1;ria<161;ria++){
a2(ria,3,79,117);a3(ria,"");}
String h=jTextField187.getText();
if(h.equals("EASY")){b=20;}
else if(h.equals("MEDIUM")){b=30;}
else if(h.equals("HARD")){b=50;}
else if(h.equals("DIABOLICAL")){b=70;}
 m.intro(b); jTextField183.setText(""+b); jTextField181.setText(""+sc); jTextField185.setText(""+bdd);
 for(int u=1;u<=160;u++){
        q[u]=m.aa[u];}
        a1=0;a2=0;a3=0;jTextField179.setText("0"+a3+":0"+a2+":0"+a1);
        ti=true;b1=true;ab=b;}

public void s890(int kk){
    a=q[kk];
 if(a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("6")||a.equals("7")||
            a.equals("8")||a.equals("")){
     a2(kk,255,255,255);a3(kk,a);
    a=q[kk];abh[kk]=false;}
 if(a.equals("")){
int rat=0;
if(kk>16&&kk%16!=1){    rat=kk-17;
 if(abh[rat]==true&&rat>0)  s890(rat);rat=0;}
if(kk>16){    rat=kk-16;
 if(abh[rat]==true&&rat>0)  s890(rat);rat=0;}
if(kk>16&&kk%16!=0) {   rat=kk-15;
 if(abh[rat]==true&&rat>0)  s890(rat);rat=0;}
if(kk>1&&kk%16!=1){    rat=kk-1;
 if(abh[rat]==true&&rat>0)  s890(rat);rat=0;}
if(kk%16!=0){    rat=kk+1;
 if(abh[rat]==true&&rat>0)  s890(rat);rat=0;}
if(kk%16!=1&&kk<145){    rat=kk+15;
 if(abh[rat]==true&&rat>0)  s890(rat);rat=0;}
if(kk<145){    rat=kk+16;
 if(abh[rat]==true&&rat>0)  s890(rat);rat=0;}
if(kk%16!=0&&kk<145){    rat=kk+17;
 if(abh[rat]==true&&rat>0)  s890(rat);rat=0;}
}}


public void push(int ay,java.awt.event.MouseEvent evt){
String zz=jTextField186.getText();
if(zz.equals("magic")&&bdd>0&&abh[ay]==true){  bdd--;  jTextField185.setText(""+bdd);
if(q[ay].equals("X")){    a2(ay,255,0,0);  rs[ay]=q[ay]; b--; bd[ay]=false;}else {
   s890(ay);a2(ay,255,255,255);a3(ay,q[ay]);}}
else if(evt.getButton()==1&&abh[ay]&&zz.equals("no magic")){   s890(ay);a2(ay,255,255,255);a3(ay,q[ay]);
     if(q[ay].equals("X")){y=0;
         for(int muttu=1;muttu<161;muttu++){
    if(q[muttu].equals("X")){
    s890(muttu);a2(muttu,255,255,255);a3(muttu,q[muttu]);}
         if(q[muttu].equals("X")&&bd[muttu]==false){
    a2(muttu,0,255,0);a3(muttu,q[muttu]);y++;}}
         loo(); }}
else if(evt.getButton()==3&&abh[ay]==true&&bd[ay]){
      a2(ay,255,0,0);  b --;  bd[ay]=false; abh[ay]=false;   rs[ay]=q[ay];      }
else if(evt.getButton()==3&&bd[ay]==false){
    a2(ay,3,79,117);abh[ay]=true; b++; bd[ay]=true;rs[ay]="";}
  jTextField183.setText(""+b);check_1();}

public void check_1(){
int win=0;
for(int ii=1;ii<=160;ii++){
   if(rs[ii].equals("1")||rs[ii].equals("2")&&rs[ii].equals("3")       ||rs[ii].equals("4")||rs[ii].equals("5")||rs[ii].equals("6")
        ||rs[ii].equals("7")||rs[ii].equals("8")){win=0;ii=190;}
   else if(!bd[ii]&&rs[ii].equals("X")){win++;}}String sa;sa=jTextField183.getText();
String s;s=jTextField187.getText();if((win==20&&s.equals("EASY")||win==30&&s.equals("MEDIUM")||win==50&&s.equals("HARD")
        ||win==70&&s.equals("DIABOLICAL"))&&sa.equals("0")) {
            String h=jTextField187.getText();
        if(h.equals("EASY")){ sc=sc+50;} else if(h.equals("MEDIUM")){  sc=sc+100;} else if(h.equals("HARD")){sc=sc+150;} 
        else if(h.equals("DIABOLICAL"))      {sc=sc+250;}b1=false;ti=false;
    JOptionPane.showMessageDialog(this, "You Win!!!\n Your score: "+sc+"\nTotal Time: "+jTextField179.getText()); reset();}}

   public void ff(){
   int lao=Integer.parseInt( jTextField181.getText());
 if(lao>=50){
int olo= JOptionPane.showConfirmDialog(this, "Magic will cost 50 points\n Continue???");
if(olo==0){
bdd=bdd+5;
sc=sc-50;
 jTextField87.setText(""+bdd);  jTextField181.setText(""+sc);} }
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
                jTextField179.setText(""+h3+":"+h2+":"+h1);
            if(time_chase){
    String fart= jTextField187.getText();
    if(fart.equals("EASY")&&a3==1&&a2==20)
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
        jTextField82 = new javax.swing.JTextField();
        jTextField83 = new javax.swing.JTextField();
        jTextField84 = new javax.swing.JTextField();
        jTextField85 = new javax.swing.JTextField();
        jTextField86 = new javax.swing.JTextField();
        jTextField87 = new javax.swing.JTextField();
        jTextField88 = new javax.swing.JTextField();
        jTextField89 = new javax.swing.JTextField();
        jTextField90 = new javax.swing.JTextField();
        jTextField91 = new javax.swing.JTextField();
        jTextField92 = new javax.swing.JTextField();
        jTextField93 = new javax.swing.JTextField();
        jTextField94 = new javax.swing.JTextField();
        jTextField95 = new javax.swing.JTextField();
        jTextField96 = new javax.swing.JTextField();
        jTextField97 = new javax.swing.JTextField();
        jTextField98 = new javax.swing.JTextField();
        jTextField99 = new javax.swing.JTextField();
        jTextField100 = new javax.swing.JTextField();
        jTextField101 = new javax.swing.JTextField();
        jTextField102 = new javax.swing.JTextField();
        jTextField103 = new javax.swing.JTextField();
        jTextField104 = new javax.swing.JTextField();
        jTextField105 = new javax.swing.JTextField();
        jTextField106 = new javax.swing.JTextField();
        jTextField107 = new javax.swing.JTextField();
        jTextField108 = new javax.swing.JTextField();
        jTextField109 = new javax.swing.JTextField();
        jTextField110 = new javax.swing.JTextField();
        jTextField111 = new javax.swing.JTextField();
        jTextField112 = new javax.swing.JTextField();
        jTextField113 = new javax.swing.JTextField();
        jTextField114 = new javax.swing.JTextField();
        jTextField115 = new javax.swing.JTextField();
        jTextField116 = new javax.swing.JTextField();
        jTextField117 = new javax.swing.JTextField();
        jTextField118 = new javax.swing.JTextField();
        jTextField119 = new javax.swing.JTextField();
        jTextField120 = new javax.swing.JTextField();
        jTextField121 = new javax.swing.JTextField();
        jTextField122 = new javax.swing.JTextField();
        jTextField123 = new javax.swing.JTextField();
        jTextField124 = new javax.swing.JTextField();
        jTextField125 = new javax.swing.JTextField();
        jTextField126 = new javax.swing.JTextField();
        jTextField127 = new javax.swing.JTextField();
        jTextField128 = new javax.swing.JTextField();
        jTextField129 = new javax.swing.JTextField();
        jTextField130 = new javax.swing.JTextField();
        jTextField131 = new javax.swing.JTextField();
        jTextField132 = new javax.swing.JTextField();
        jTextField133 = new javax.swing.JTextField();
        jTextField134 = new javax.swing.JTextField();
        jTextField135 = new javax.swing.JTextField();
        jTextField136 = new javax.swing.JTextField();
        jTextField137 = new javax.swing.JTextField();
        jTextField138 = new javax.swing.JTextField();
        jTextField139 = new javax.swing.JTextField();
        jTextField140 = new javax.swing.JTextField();
        jTextField141 = new javax.swing.JTextField();
        jTextField142 = new javax.swing.JTextField();
        jTextField143 = new javax.swing.JTextField();
        jTextField144 = new javax.swing.JTextField();
        jTextField145 = new javax.swing.JTextField();
        jTextField146 = new javax.swing.JTextField();
        jTextField147 = new javax.swing.JTextField();
        jTextField148 = new javax.swing.JTextField();
        jTextField149 = new javax.swing.JTextField();
        jTextField150 = new javax.swing.JTextField();
        jTextField151 = new javax.swing.JTextField();
        jTextField152 = new javax.swing.JTextField();
        jTextField153 = new javax.swing.JTextField();
        jTextField154 = new javax.swing.JTextField();
        jTextField155 = new javax.swing.JTextField();
        jTextField156 = new javax.swing.JTextField();
        jTextField157 = new javax.swing.JTextField();
        jTextField158 = new javax.swing.JTextField();
        jTextField159 = new javax.swing.JTextField();
        jTextField160 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextField179 = new javax.swing.JTextField();
        jTextField180 = new javax.swing.JTextField();
        jTextField181 = new javax.swing.JTextField();
        jTextField182 = new javax.swing.JTextField();
        jTextField183 = new javax.swing.JTextField();
        jTextField184 = new javax.swing.JTextField();
        jTextField185 = new javax.swing.JTextField();
        jTextField186 = new javax.swing.JTextField();
        jTextField187 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextField177 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 1, 1));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jPanel2.setBackground(new java.awt.Color(5, 33, 60));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jTextField1.setBackground(new java.awt.Color(3, 79, 117));
        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField1.setForeground(new java.awt.Color(153, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(3, 79, 117));
        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField2.setForeground(new java.awt.Color(153, 0, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(3, 79, 117));
        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField3.setForeground(new java.awt.Color(153, 0, 0));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(3, 79, 117));
        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField4.setForeground(new java.awt.Color(153, 0, 0));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(3, 79, 117));
        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField5.setForeground(new java.awt.Color(153, 0, 0));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(3, 79, 117));
        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField6.setForeground(new java.awt.Color(153, 0, 0));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });

        jTextField7.setBackground(new java.awt.Color(3, 79, 117));
        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField7.setForeground(new java.awt.Color(153, 0, 0));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
        });

        jTextField8.setBackground(new java.awt.Color(3, 79, 117));
        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField8.setForeground(new java.awt.Color(153, 0, 0));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });

        jTextField9.setBackground(new java.awt.Color(3, 79, 117));
        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField9.setForeground(new java.awt.Color(153, 0, 0));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });

        jTextField10.setBackground(new java.awt.Color(3, 79, 117));
        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField10.setForeground(new java.awt.Color(153, 0, 0));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField10MouseClicked(evt);
            }
        });

        jTextField11.setBackground(new java.awt.Color(3, 79, 117));
        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField11.setForeground(new java.awt.Color(153, 0, 0));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField11MouseClicked(evt);
            }
        });

        jTextField12.setBackground(new java.awt.Color(3, 79, 117));
        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField12.setForeground(new java.awt.Color(153, 0, 0));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField12MouseClicked(evt);
            }
        });

        jTextField13.setBackground(new java.awt.Color(3, 79, 117));
        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField13.setForeground(new java.awt.Color(153, 0, 0));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField13MouseClicked(evt);
            }
        });

        jTextField14.setBackground(new java.awt.Color(3, 79, 117));
        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField14.setForeground(new java.awt.Color(153, 0, 0));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField14MouseClicked(evt);
            }
        });

        jTextField15.setBackground(new java.awt.Color(3, 79, 117));
        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField15.setForeground(new java.awt.Color(153, 0, 0));
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField15MouseClicked(evt);
            }
        });

        jTextField16.setBackground(new java.awt.Color(3, 79, 117));
        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField16.setForeground(new java.awt.Color(153, 0, 0));
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField16MouseClicked(evt);
            }
        });

        jTextField17.setBackground(new java.awt.Color(3, 79, 117));
        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField17.setForeground(new java.awt.Color(153, 0, 0));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField17MouseClicked(evt);
            }
        });

        jTextField18.setBackground(new java.awt.Color(3, 79, 117));
        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField18.setForeground(new java.awt.Color(153, 0, 0));
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField18MouseClicked(evt);
            }
        });

        jTextField19.setBackground(new java.awt.Color(3, 79, 117));
        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField19.setForeground(new java.awt.Color(153, 0, 0));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField19MouseClicked(evt);
            }
        });

        jTextField20.setBackground(new java.awt.Color(3, 79, 117));
        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField20.setForeground(new java.awt.Color(153, 0, 0));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField20MouseClicked(evt);
            }
        });

        jTextField21.setBackground(new java.awt.Color(3, 79, 117));
        jTextField21.setEditable(false);
        jTextField21.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField21.setForeground(new java.awt.Color(153, 0, 0));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField21MouseClicked(evt);
            }
        });

        jTextField22.setBackground(new java.awt.Color(3, 79, 117));
        jTextField22.setEditable(false);
        jTextField22.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField22.setForeground(new java.awt.Color(153, 0, 0));
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField22MouseClicked(evt);
            }
        });

        jTextField23.setBackground(new java.awt.Color(3, 79, 117));
        jTextField23.setEditable(false);
        jTextField23.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField23.setForeground(new java.awt.Color(153, 0, 0));
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField23MouseClicked(evt);
            }
        });

        jTextField24.setBackground(new java.awt.Color(3, 79, 117));
        jTextField24.setEditable(false);
        jTextField24.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField24.setForeground(new java.awt.Color(153, 0, 0));
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField24MouseClicked(evt);
            }
        });

        jTextField25.setBackground(new java.awt.Color(3, 79, 117));
        jTextField25.setEditable(false);
        jTextField25.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField25.setForeground(new java.awt.Color(153, 0, 0));
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField25MouseClicked(evt);
            }
        });

        jTextField26.setBackground(new java.awt.Color(3, 79, 117));
        jTextField26.setEditable(false);
        jTextField26.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField26.setForeground(new java.awt.Color(153, 0, 0));
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField26MouseClicked(evt);
            }
        });

        jTextField27.setBackground(new java.awt.Color(3, 79, 117));
        jTextField27.setEditable(false);
        jTextField27.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField27.setForeground(new java.awt.Color(153, 0, 0));
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField27MouseClicked(evt);
            }
        });

        jTextField28.setBackground(new java.awt.Color(3, 79, 117));
        jTextField28.setEditable(false);
        jTextField28.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField28.setForeground(new java.awt.Color(153, 0, 0));
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField28MouseClicked(evt);
            }
        });

        jTextField29.setBackground(new java.awt.Color(3, 79, 117));
        jTextField29.setEditable(false);
        jTextField29.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField29.setForeground(new java.awt.Color(153, 0, 0));
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField29MouseClicked(evt);
            }
        });

        jTextField30.setBackground(new java.awt.Color(3, 79, 117));
        jTextField30.setEditable(false);
        jTextField30.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField30.setForeground(new java.awt.Color(153, 0, 0));
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField30MouseClicked(evt);
            }
        });

        jTextField31.setBackground(new java.awt.Color(3, 79, 117));
        jTextField31.setEditable(false);
        jTextField31.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField31.setForeground(new java.awt.Color(153, 0, 0));
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField31MouseClicked(evt);
            }
        });

        jTextField32.setBackground(new java.awt.Color(3, 79, 117));
        jTextField32.setEditable(false);
        jTextField32.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField32.setForeground(new java.awt.Color(153, 0, 0));
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField32MouseClicked(evt);
            }
        });

        jTextField33.setBackground(new java.awt.Color(3, 79, 117));
        jTextField33.setEditable(false);
        jTextField33.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField33.setForeground(new java.awt.Color(153, 0, 0));
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField33MouseClicked(evt);
            }
        });

        jTextField34.setBackground(new java.awt.Color(3, 79, 117));
        jTextField34.setEditable(false);
        jTextField34.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField34.setForeground(new java.awt.Color(153, 0, 0));
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField34MouseClicked(evt);
            }
        });

        jTextField35.setBackground(new java.awt.Color(3, 79, 117));
        jTextField35.setEditable(false);
        jTextField35.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField35.setForeground(new java.awt.Color(153, 0, 0));
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField35MouseClicked(evt);
            }
        });

        jTextField36.setBackground(new java.awt.Color(3, 79, 117));
        jTextField36.setEditable(false);
        jTextField36.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField36.setForeground(new java.awt.Color(153, 0, 0));
        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField36MouseClicked(evt);
            }
        });

        jTextField37.setBackground(new java.awt.Color(3, 79, 117));
        jTextField37.setEditable(false);
        jTextField37.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField37.setForeground(new java.awt.Color(153, 0, 0));
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField37MouseClicked(evt);
            }
        });

        jTextField38.setBackground(new java.awt.Color(3, 79, 117));
        jTextField38.setEditable(false);
        jTextField38.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField38.setForeground(new java.awt.Color(153, 0, 0));
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField38MouseClicked(evt);
            }
        });

        jTextField39.setBackground(new java.awt.Color(3, 79, 117));
        jTextField39.setEditable(false);
        jTextField39.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField39.setForeground(new java.awt.Color(153, 0, 0));
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField39MouseClicked(evt);
            }
        });

        jTextField40.setBackground(new java.awt.Color(3, 79, 117));
        jTextField40.setEditable(false);
        jTextField40.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField40.setForeground(new java.awt.Color(153, 0, 0));
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField40MouseClicked(evt);
            }
        });

        jTextField41.setBackground(new java.awt.Color(3, 79, 117));
        jTextField41.setEditable(false);
        jTextField41.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField41.setForeground(new java.awt.Color(153, 0, 0));
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField41MouseClicked(evt);
            }
        });

        jTextField42.setBackground(new java.awt.Color(3, 79, 117));
        jTextField42.setEditable(false);
        jTextField42.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField42.setForeground(new java.awt.Color(153, 0, 0));
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField42MouseClicked(evt);
            }
        });

        jTextField43.setBackground(new java.awt.Color(3, 79, 117));
        jTextField43.setEditable(false);
        jTextField43.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField43.setForeground(new java.awt.Color(153, 0, 0));
        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField43MouseClicked(evt);
            }
        });

        jTextField44.setBackground(new java.awt.Color(3, 79, 117));
        jTextField44.setEditable(false);
        jTextField44.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField44.setForeground(new java.awt.Color(153, 0, 0));
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField44MouseClicked(evt);
            }
        });

        jTextField45.setBackground(new java.awt.Color(3, 79, 117));
        jTextField45.setEditable(false);
        jTextField45.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField45.setForeground(new java.awt.Color(153, 0, 0));
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField45MouseClicked(evt);
            }
        });

        jTextField46.setBackground(new java.awt.Color(3, 79, 117));
        jTextField46.setEditable(false);
        jTextField46.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField46.setForeground(new java.awt.Color(153, 0, 0));
        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField46MouseClicked(evt);
            }
        });

        jTextField47.setBackground(new java.awt.Color(3, 79, 117));
        jTextField47.setEditable(false);
        jTextField47.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField47.setForeground(new java.awt.Color(153, 0, 0));
        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField47MouseClicked(evt);
            }
        });

        jTextField48.setBackground(new java.awt.Color(3, 79, 117));
        jTextField48.setEditable(false);
        jTextField48.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField48.setForeground(new java.awt.Color(153, 0, 0));
        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField48MouseClicked(evt);
            }
        });

        jTextField49.setBackground(new java.awt.Color(3, 79, 117));
        jTextField49.setEditable(false);
        jTextField49.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField49.setForeground(new java.awt.Color(153, 0, 0));
        jTextField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField49.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField49MouseClicked(evt);
            }
        });

        jTextField50.setBackground(new java.awt.Color(3, 79, 117));
        jTextField50.setEditable(false);
        jTextField50.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField50.setForeground(new java.awt.Color(153, 0, 0));
        jTextField50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField50MouseClicked(evt);
            }
        });

        jTextField51.setBackground(new java.awt.Color(3, 79, 117));
        jTextField51.setEditable(false);
        jTextField51.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField51.setForeground(new java.awt.Color(153, 0, 0));
        jTextField51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField51.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField51MouseClicked(evt);
            }
        });

        jTextField52.setBackground(new java.awt.Color(3, 79, 117));
        jTextField52.setEditable(false);
        jTextField52.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField52.setForeground(new java.awt.Color(153, 0, 0));
        jTextField52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField52.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField52MouseClicked(evt);
            }
        });

        jTextField53.setBackground(new java.awt.Color(3, 79, 117));
        jTextField53.setEditable(false);
        jTextField53.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField53.setForeground(new java.awt.Color(153, 0, 0));
        jTextField53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField53MouseClicked(evt);
            }
        });

        jTextField54.setBackground(new java.awt.Color(3, 79, 117));
        jTextField54.setEditable(false);
        jTextField54.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField54.setForeground(new java.awt.Color(153, 0, 0));
        jTextField54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField54MouseClicked(evt);
            }
        });

        jTextField55.setBackground(new java.awt.Color(3, 79, 117));
        jTextField55.setEditable(false);
        jTextField55.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField55.setForeground(new java.awt.Color(153, 0, 0));
        jTextField55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField55MouseClicked(evt);
            }
        });

        jTextField56.setBackground(new java.awt.Color(3, 79, 117));
        jTextField56.setEditable(false);
        jTextField56.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField56.setForeground(new java.awt.Color(153, 0, 0));
        jTextField56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField56.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField56MouseClicked(evt);
            }
        });

        jTextField57.setBackground(new java.awt.Color(3, 79, 117));
        jTextField57.setEditable(false);
        jTextField57.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField57.setForeground(new java.awt.Color(153, 0, 0));
        jTextField57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField57.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField57MouseClicked(evt);
            }
        });

        jTextField58.setBackground(new java.awt.Color(3, 79, 117));
        jTextField58.setEditable(false);
        jTextField58.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField58.setForeground(new java.awt.Color(153, 0, 0));
        jTextField58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField58MouseClicked(evt);
            }
        });

        jTextField59.setBackground(new java.awt.Color(3, 79, 117));
        jTextField59.setEditable(false);
        jTextField59.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField59.setForeground(new java.awt.Color(153, 0, 0));
        jTextField59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField59.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField59MouseClicked(evt);
            }
        });

        jTextField60.setBackground(new java.awt.Color(3, 79, 117));
        jTextField60.setEditable(false);
        jTextField60.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField60.setForeground(new java.awt.Color(153, 0, 0));
        jTextField60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField60MouseClicked(evt);
            }
        });

        jTextField61.setBackground(new java.awt.Color(3, 79, 117));
        jTextField61.setEditable(false);
        jTextField61.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField61.setForeground(new java.awt.Color(153, 0, 0));
        jTextField61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField61MouseClicked(evt);
            }
        });

        jTextField62.setBackground(new java.awt.Color(3, 79, 117));
        jTextField62.setEditable(false);
        jTextField62.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField62.setForeground(new java.awt.Color(153, 0, 0));
        jTextField62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField62MouseClicked(evt);
            }
        });

        jTextField63.setBackground(new java.awt.Color(3, 79, 117));
        jTextField63.setEditable(false);
        jTextField63.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField63.setForeground(new java.awt.Color(153, 0, 0));
        jTextField63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField63MouseClicked(evt);
            }
        });

        jTextField64.setBackground(new java.awt.Color(3, 79, 117));
        jTextField64.setEditable(false);
        jTextField64.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField64.setForeground(new java.awt.Color(153, 0, 0));
        jTextField64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField64.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField64MouseClicked(evt);
            }
        });

        jTextField65.setBackground(new java.awt.Color(3, 79, 117));
        jTextField65.setEditable(false);
        jTextField65.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField65.setForeground(new java.awt.Color(153, 0, 0));
        jTextField65.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField65.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField65MouseClicked(evt);
            }
        });

        jTextField66.setBackground(new java.awt.Color(3, 79, 117));
        jTextField66.setEditable(false);
        jTextField66.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField66.setForeground(new java.awt.Color(153, 0, 0));
        jTextField66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField66.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField66MouseClicked(evt);
            }
        });

        jTextField67.setBackground(new java.awt.Color(3, 79, 117));
        jTextField67.setEditable(false);
        jTextField67.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField67.setForeground(new java.awt.Color(153, 0, 0));
        jTextField67.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField67.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField67MouseClicked(evt);
            }
        });

        jTextField68.setBackground(new java.awt.Color(3, 79, 117));
        jTextField68.setEditable(false);
        jTextField68.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField68.setForeground(new java.awt.Color(153, 0, 0));
        jTextField68.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField68.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField68MouseClicked(evt);
            }
        });

        jTextField69.setBackground(new java.awt.Color(3, 79, 117));
        jTextField69.setEditable(false);
        jTextField69.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField69.setForeground(new java.awt.Color(153, 0, 0));
        jTextField69.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField69.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField69MouseClicked(evt);
            }
        });

        jTextField70.setBackground(new java.awt.Color(3, 79, 117));
        jTextField70.setEditable(false);
        jTextField70.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField70.setForeground(new java.awt.Color(153, 0, 0));
        jTextField70.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField70.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField70MouseClicked(evt);
            }
        });

        jTextField71.setBackground(new java.awt.Color(3, 79, 117));
        jTextField71.setEditable(false);
        jTextField71.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField71.setForeground(new java.awt.Color(153, 0, 0));
        jTextField71.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField71.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField71MouseClicked(evt);
            }
        });

        jTextField72.setBackground(new java.awt.Color(3, 79, 117));
        jTextField72.setEditable(false);
        jTextField72.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField72.setForeground(new java.awt.Color(153, 0, 0));
        jTextField72.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField72.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField72MouseClicked(evt);
            }
        });

        jTextField73.setBackground(new java.awt.Color(3, 79, 117));
        jTextField73.setEditable(false);
        jTextField73.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField73.setForeground(new java.awt.Color(153, 0, 0));
        jTextField73.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField73.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField73MouseClicked(evt);
            }
        });

        jTextField74.setBackground(new java.awt.Color(3, 79, 117));
        jTextField74.setEditable(false);
        jTextField74.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField74.setForeground(new java.awt.Color(153, 0, 0));
        jTextField74.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField74.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField74MouseClicked(evt);
            }
        });

        jTextField75.setBackground(new java.awt.Color(3, 79, 117));
        jTextField75.setEditable(false);
        jTextField75.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField75.setForeground(new java.awt.Color(153, 0, 0));
        jTextField75.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField75.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField75MouseClicked(evt);
            }
        });

        jTextField76.setBackground(new java.awt.Color(3, 79, 117));
        jTextField76.setEditable(false);
        jTextField76.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField76.setForeground(new java.awt.Color(153, 0, 0));
        jTextField76.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField76.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField76MouseClicked(evt);
            }
        });

        jTextField77.setBackground(new java.awt.Color(3, 79, 117));
        jTextField77.setEditable(false);
        jTextField77.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField77.setForeground(new java.awt.Color(153, 0, 0));
        jTextField77.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField77.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField77MouseClicked(evt);
            }
        });

        jTextField78.setBackground(new java.awt.Color(3, 79, 117));
        jTextField78.setEditable(false);
        jTextField78.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField78.setForeground(new java.awt.Color(153, 0, 0));
        jTextField78.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField78.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField78MouseClicked(evt);
            }
        });

        jTextField79.setBackground(new java.awt.Color(3, 79, 117));
        jTextField79.setEditable(false);
        jTextField79.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField79.setForeground(new java.awt.Color(153, 0, 0));
        jTextField79.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField79.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField79MouseClicked(evt);
            }
        });

        jTextField80.setBackground(new java.awt.Color(3, 79, 117));
        jTextField80.setEditable(false);
        jTextField80.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField80.setForeground(new java.awt.Color(153, 0, 0));
        jTextField80.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField80.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField80MouseClicked(evt);
            }
        });

        jTextField81.setBackground(new java.awt.Color(3, 79, 117));
        jTextField81.setEditable(false);
        jTextField81.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField81.setForeground(new java.awt.Color(153, 0, 0));
        jTextField81.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField81.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField81MouseClicked(evt);
            }
        });

        jTextField82.setBackground(new java.awt.Color(3, 79, 117));
        jTextField82.setEditable(false);
        jTextField82.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField82.setForeground(new java.awt.Color(153, 0, 0));
        jTextField82.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField82.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField82MouseClicked(evt);
            }
        });

        jTextField83.setBackground(new java.awt.Color(3, 79, 117));
        jTextField83.setEditable(false);
        jTextField83.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField83.setForeground(new java.awt.Color(153, 0, 0));
        jTextField83.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField83.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField83MouseClicked(evt);
            }
        });

        jTextField84.setBackground(new java.awt.Color(3, 79, 117));
        jTextField84.setEditable(false);
        jTextField84.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField84.setForeground(new java.awt.Color(153, 0, 0));
        jTextField84.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField84.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField84MouseClicked(evt);
            }
        });

        jTextField85.setBackground(new java.awt.Color(3, 79, 117));
        jTextField85.setEditable(false);
        jTextField85.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField85.setForeground(new java.awt.Color(153, 0, 0));
        jTextField85.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField85.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField85MouseClicked(evt);
            }
        });

        jTextField86.setBackground(new java.awt.Color(3, 79, 117));
        jTextField86.setEditable(false);
        jTextField86.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField86.setForeground(new java.awt.Color(153, 0, 0));
        jTextField86.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField86.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField86MouseClicked(evt);
            }
        });

        jTextField87.setBackground(new java.awt.Color(3, 79, 117));
        jTextField87.setEditable(false);
        jTextField87.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField87.setForeground(new java.awt.Color(153, 0, 0));
        jTextField87.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField87.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField87MouseClicked(evt);
            }
        });

        jTextField88.setBackground(new java.awt.Color(3, 79, 117));
        jTextField88.setEditable(false);
        jTextField88.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField88.setForeground(new java.awt.Color(153, 0, 0));
        jTextField88.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField88.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField88MouseClicked(evt);
            }
        });

        jTextField89.setBackground(new java.awt.Color(3, 79, 117));
        jTextField89.setEditable(false);
        jTextField89.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField89.setForeground(new java.awt.Color(153, 0, 0));
        jTextField89.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField89.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField89MouseClicked(evt);
            }
        });

        jTextField90.setBackground(new java.awt.Color(3, 79, 117));
        jTextField90.setEditable(false);
        jTextField90.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField90.setForeground(new java.awt.Color(153, 0, 0));
        jTextField90.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField90.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField90MouseClicked(evt);
            }
        });

        jTextField91.setBackground(new java.awt.Color(3, 79, 117));
        jTextField91.setEditable(false);
        jTextField91.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField91.setForeground(new java.awt.Color(153, 0, 0));
        jTextField91.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField91.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField91.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField91MouseClicked(evt);
            }
        });

        jTextField92.setBackground(new java.awt.Color(3, 79, 117));
        jTextField92.setEditable(false);
        jTextField92.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField92.setForeground(new java.awt.Color(153, 0, 0));
        jTextField92.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField92.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField92MouseClicked(evt);
            }
        });

        jTextField93.setBackground(new java.awt.Color(3, 79, 117));
        jTextField93.setEditable(false);
        jTextField93.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField93.setForeground(new java.awt.Color(153, 0, 0));
        jTextField93.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField93.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField93MouseClicked(evt);
            }
        });

        jTextField94.setBackground(new java.awt.Color(3, 79, 117));
        jTextField94.setEditable(false);
        jTextField94.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField94.setForeground(new java.awt.Color(153, 0, 0));
        jTextField94.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField94.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField94MouseClicked(evt);
            }
        });

        jTextField95.setBackground(new java.awt.Color(3, 79, 117));
        jTextField95.setEditable(false);
        jTextField95.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField95.setForeground(new java.awt.Color(153, 0, 0));
        jTextField95.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField95.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField95.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField95MouseClicked(evt);
            }
        });

        jTextField96.setBackground(new java.awt.Color(3, 79, 117));
        jTextField96.setEditable(false);
        jTextField96.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField96.setForeground(new java.awt.Color(153, 0, 0));
        jTextField96.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField96.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField96.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField96MouseClicked(evt);
            }
        });

        jTextField97.setBackground(new java.awt.Color(3, 79, 117));
        jTextField97.setEditable(false);
        jTextField97.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField97.setForeground(new java.awt.Color(153, 0, 0));
        jTextField97.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField97.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField97.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField97MouseClicked(evt);
            }
        });

        jTextField98.setBackground(new java.awt.Color(3, 79, 117));
        jTextField98.setEditable(false);
        jTextField98.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField98.setForeground(new java.awt.Color(153, 0, 0));
        jTextField98.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField98.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField98MouseClicked(evt);
            }
        });

        jTextField99.setBackground(new java.awt.Color(3, 79, 117));
        jTextField99.setEditable(false);
        jTextField99.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField99.setForeground(new java.awt.Color(153, 0, 0));
        jTextField99.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField99.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField99.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField99MouseClicked(evt);
            }
        });

        jTextField100.setBackground(new java.awt.Color(3, 79, 117));
        jTextField100.setEditable(false);
        jTextField100.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField100.setForeground(new java.awt.Color(153, 0, 0));
        jTextField100.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField100.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField100MouseClicked(evt);
            }
        });

        jTextField101.setBackground(new java.awt.Color(3, 79, 117));
        jTextField101.setEditable(false);
        jTextField101.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField101.setForeground(new java.awt.Color(153, 0, 0));
        jTextField101.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField101.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField101MouseClicked(evt);
            }
        });

        jTextField102.setBackground(new java.awt.Color(3, 79, 117));
        jTextField102.setEditable(false);
        jTextField102.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField102.setForeground(new java.awt.Color(153, 0, 0));
        jTextField102.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField102.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField102.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField102MouseClicked(evt);
            }
        });

        jTextField103.setBackground(new java.awt.Color(3, 79, 117));
        jTextField103.setEditable(false);
        jTextField103.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField103.setForeground(new java.awt.Color(153, 0, 0));
        jTextField103.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField103.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField103.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField103MouseClicked(evt);
            }
        });

        jTextField104.setBackground(new java.awt.Color(3, 79, 117));
        jTextField104.setEditable(false);
        jTextField104.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField104.setForeground(new java.awt.Color(153, 0, 0));
        jTextField104.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField104.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField104.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField104MouseClicked(evt);
            }
        });

        jTextField105.setBackground(new java.awt.Color(3, 79, 117));
        jTextField105.setEditable(false);
        jTextField105.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField105.setForeground(new java.awt.Color(153, 0, 0));
        jTextField105.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField105.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField105.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField105MouseClicked(evt);
            }
        });

        jTextField106.setBackground(new java.awt.Color(3, 79, 117));
        jTextField106.setEditable(false);
        jTextField106.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField106.setForeground(new java.awt.Color(153, 0, 0));
        jTextField106.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField106.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField106.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField106MouseClicked(evt);
            }
        });

        jTextField107.setBackground(new java.awt.Color(3, 79, 117));
        jTextField107.setEditable(false);
        jTextField107.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField107.setForeground(new java.awt.Color(153, 0, 0));
        jTextField107.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField107.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField107.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField107MouseClicked(evt);
            }
        });

        jTextField108.setBackground(new java.awt.Color(3, 79, 117));
        jTextField108.setEditable(false);
        jTextField108.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField108.setForeground(new java.awt.Color(153, 0, 0));
        jTextField108.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField108.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField108.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField108MouseClicked(evt);
            }
        });

        jTextField109.setBackground(new java.awt.Color(3, 79, 117));
        jTextField109.setEditable(false);
        jTextField109.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField109.setForeground(new java.awt.Color(153, 0, 0));
        jTextField109.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField109.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField109.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField109MouseClicked(evt);
            }
        });

        jTextField110.setBackground(new java.awt.Color(3, 79, 117));
        jTextField110.setEditable(false);
        jTextField110.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField110.setForeground(new java.awt.Color(153, 0, 0));
        jTextField110.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField110.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField110.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField110MouseClicked(evt);
            }
        });

        jTextField111.setBackground(new java.awt.Color(3, 79, 117));
        jTextField111.setEditable(false);
        jTextField111.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField111.setForeground(new java.awt.Color(153, 0, 0));
        jTextField111.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField111.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField111.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField111MouseClicked(evt);
            }
        });

        jTextField112.setBackground(new java.awt.Color(3, 79, 117));
        jTextField112.setEditable(false);
        jTextField112.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField112.setForeground(new java.awt.Color(153, 0, 0));
        jTextField112.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField112.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField112.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField112MouseClicked(evt);
            }
        });

        jTextField113.setBackground(new java.awt.Color(3, 79, 117));
        jTextField113.setEditable(false);
        jTextField113.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField113.setForeground(new java.awt.Color(153, 0, 0));
        jTextField113.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField113.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField113.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField113MouseClicked(evt);
            }
        });

        jTextField114.setBackground(new java.awt.Color(3, 79, 117));
        jTextField114.setEditable(false);
        jTextField114.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField114.setForeground(new java.awt.Color(153, 0, 0));
        jTextField114.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField114.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField114.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField114MouseClicked(evt);
            }
        });

        jTextField115.setBackground(new java.awt.Color(3, 79, 117));
        jTextField115.setEditable(false);
        jTextField115.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField115.setForeground(new java.awt.Color(153, 0, 0));
        jTextField115.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField115.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField115.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField115MouseClicked(evt);
            }
        });

        jTextField116.setBackground(new java.awt.Color(3, 79, 117));
        jTextField116.setEditable(false);
        jTextField116.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField116.setForeground(new java.awt.Color(153, 0, 0));
        jTextField116.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField116.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField116.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField116MouseClicked(evt);
            }
        });

        jTextField117.setBackground(new java.awt.Color(3, 79, 117));
        jTextField117.setEditable(false);
        jTextField117.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField117.setForeground(new java.awt.Color(153, 0, 0));
        jTextField117.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField117.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField117.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField117MouseClicked(evt);
            }
        });

        jTextField118.setBackground(new java.awt.Color(3, 79, 117));
        jTextField118.setEditable(false);
        jTextField118.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField118.setForeground(new java.awt.Color(153, 0, 0));
        jTextField118.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField118.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField118.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField118MouseClicked(evt);
            }
        });

        jTextField119.setBackground(new java.awt.Color(3, 79, 117));
        jTextField119.setEditable(false);
        jTextField119.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField119.setForeground(new java.awt.Color(153, 0, 0));
        jTextField119.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField119.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField119.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField119MouseClicked(evt);
            }
        });

        jTextField120.setBackground(new java.awt.Color(3, 79, 117));
        jTextField120.setEditable(false);
        jTextField120.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField120.setForeground(new java.awt.Color(153, 0, 0));
        jTextField120.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField120.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField120.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField120MouseClicked(evt);
            }
        });

        jTextField121.setBackground(new java.awt.Color(3, 79, 117));
        jTextField121.setEditable(false);
        jTextField121.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField121.setForeground(new java.awt.Color(153, 0, 0));
        jTextField121.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField121.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField121.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField121MouseClicked(evt);
            }
        });

        jTextField122.setBackground(new java.awt.Color(3, 79, 117));
        jTextField122.setEditable(false);
        jTextField122.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField122.setForeground(new java.awt.Color(153, 0, 0));
        jTextField122.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField122.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField122.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField122MouseClicked(evt);
            }
        });

        jTextField123.setBackground(new java.awt.Color(3, 79, 117));
        jTextField123.setEditable(false);
        jTextField123.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField123.setForeground(new java.awt.Color(153, 0, 0));
        jTextField123.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField123.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField123.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField123MouseClicked(evt);
            }
        });

        jTextField124.setBackground(new java.awt.Color(3, 79, 117));
        jTextField124.setEditable(false);
        jTextField124.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField124.setForeground(new java.awt.Color(153, 0, 0));
        jTextField124.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField124.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField124.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField124MouseClicked(evt);
            }
        });

        jTextField125.setBackground(new java.awt.Color(3, 79, 117));
        jTextField125.setEditable(false);
        jTextField125.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField125.setForeground(new java.awt.Color(153, 0, 0));
        jTextField125.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField125.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField125.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField125MouseClicked(evt);
            }
        });

        jTextField126.setBackground(new java.awt.Color(3, 79, 117));
        jTextField126.setEditable(false);
        jTextField126.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField126.setForeground(new java.awt.Color(153, 0, 0));
        jTextField126.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField126.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField126.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField126MouseClicked(evt);
            }
        });

        jTextField127.setBackground(new java.awt.Color(3, 79, 117));
        jTextField127.setEditable(false);
        jTextField127.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField127.setForeground(new java.awt.Color(153, 0, 0));
        jTextField127.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField127.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField127.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField127MouseClicked(evt);
            }
        });

        jTextField128.setBackground(new java.awt.Color(3, 79, 117));
        jTextField128.setEditable(false);
        jTextField128.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField128.setForeground(new java.awt.Color(153, 0, 0));
        jTextField128.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField128.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField128.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField128MouseClicked(evt);
            }
        });

        jTextField129.setBackground(new java.awt.Color(3, 79, 117));
        jTextField129.setEditable(false);
        jTextField129.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField129.setForeground(new java.awt.Color(153, 0, 0));
        jTextField129.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField129.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField129.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField129MouseClicked(evt);
            }
        });

        jTextField130.setBackground(new java.awt.Color(3, 79, 117));
        jTextField130.setEditable(false);
        jTextField130.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField130.setForeground(new java.awt.Color(153, 0, 0));
        jTextField130.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField130.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField130.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField130MouseClicked(evt);
            }
        });

        jTextField131.setBackground(new java.awt.Color(3, 79, 117));
        jTextField131.setEditable(false);
        jTextField131.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField131.setForeground(new java.awt.Color(153, 0, 0));
        jTextField131.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField131.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField131.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField131MouseClicked(evt);
            }
        });

        jTextField132.setBackground(new java.awt.Color(3, 79, 117));
        jTextField132.setEditable(false);
        jTextField132.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField132.setForeground(new java.awt.Color(153, 0, 0));
        jTextField132.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField132.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField132.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField132MouseClicked(evt);
            }
        });

        jTextField133.setBackground(new java.awt.Color(3, 79, 117));
        jTextField133.setEditable(false);
        jTextField133.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField133.setForeground(new java.awt.Color(153, 0, 0));
        jTextField133.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField133.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField133.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField133MouseClicked(evt);
            }
        });

        jTextField134.setBackground(new java.awt.Color(3, 79, 117));
        jTextField134.setEditable(false);
        jTextField134.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField134.setForeground(new java.awt.Color(153, 0, 0));
        jTextField134.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField134.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField134.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField134MouseClicked(evt);
            }
        });

        jTextField135.setBackground(new java.awt.Color(3, 79, 117));
        jTextField135.setEditable(false);
        jTextField135.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField135.setForeground(new java.awt.Color(153, 0, 0));
        jTextField135.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField135.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField135.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField135MouseClicked(evt);
            }
        });

        jTextField136.setBackground(new java.awt.Color(3, 79, 117));
        jTextField136.setEditable(false);
        jTextField136.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField136.setForeground(new java.awt.Color(153, 0, 0));
        jTextField136.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField136.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField136.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField136MouseClicked(evt);
            }
        });

        jTextField137.setBackground(new java.awt.Color(3, 79, 117));
        jTextField137.setEditable(false);
        jTextField137.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField137.setForeground(new java.awt.Color(153, 0, 0));
        jTextField137.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField137.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField137.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField137MouseClicked(evt);
            }
        });

        jTextField138.setBackground(new java.awt.Color(3, 79, 117));
        jTextField138.setEditable(false);
        jTextField138.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField138.setForeground(new java.awt.Color(153, 0, 0));
        jTextField138.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField138.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField138.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField138MouseClicked(evt);
            }
        });

        jTextField139.setBackground(new java.awt.Color(3, 79, 117));
        jTextField139.setEditable(false);
        jTextField139.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField139.setForeground(new java.awt.Color(153, 0, 0));
        jTextField139.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField139.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField139.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField139MouseClicked(evt);
            }
        });

        jTextField140.setBackground(new java.awt.Color(3, 79, 117));
        jTextField140.setEditable(false);
        jTextField140.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField140.setForeground(new java.awt.Color(153, 0, 0));
        jTextField140.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField140.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField140.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField140MouseClicked(evt);
            }
        });

        jTextField141.setBackground(new java.awt.Color(3, 79, 117));
        jTextField141.setEditable(false);
        jTextField141.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField141.setForeground(new java.awt.Color(153, 0, 0));
        jTextField141.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField141.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField141.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField141MouseClicked(evt);
            }
        });

        jTextField142.setBackground(new java.awt.Color(3, 79, 117));
        jTextField142.setEditable(false);
        jTextField142.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField142.setForeground(new java.awt.Color(153, 0, 0));
        jTextField142.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField142.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField142.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField142MouseClicked(evt);
            }
        });

        jTextField143.setBackground(new java.awt.Color(3, 79, 117));
        jTextField143.setEditable(false);
        jTextField143.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField143.setForeground(new java.awt.Color(153, 0, 0));
        jTextField143.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField143.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField143.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField143MouseClicked(evt);
            }
        });

        jTextField144.setBackground(new java.awt.Color(3, 79, 117));
        jTextField144.setEditable(false);
        jTextField144.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField144.setForeground(new java.awt.Color(153, 0, 0));
        jTextField144.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField144.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField144.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField144MouseClicked(evt);
            }
        });

        jTextField145.setBackground(new java.awt.Color(3, 79, 117));
        jTextField145.setEditable(false);
        jTextField145.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField145.setForeground(new java.awt.Color(153, 0, 0));
        jTextField145.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField145.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField145.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField145MouseClicked(evt);
            }
        });

        jTextField146.setBackground(new java.awt.Color(3, 79, 117));
        jTextField146.setEditable(false);
        jTextField146.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField146.setForeground(new java.awt.Color(153, 0, 0));
        jTextField146.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField146.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField146.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField146MouseClicked(evt);
            }
        });

        jTextField147.setBackground(new java.awt.Color(3, 79, 117));
        jTextField147.setEditable(false);
        jTextField147.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField147.setForeground(new java.awt.Color(153, 0, 0));
        jTextField147.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField147.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField147.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField147MouseClicked(evt);
            }
        });

        jTextField148.setBackground(new java.awt.Color(3, 79, 117));
        jTextField148.setEditable(false);
        jTextField148.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField148.setForeground(new java.awt.Color(153, 0, 0));
        jTextField148.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField148.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField148.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField148MouseClicked(evt);
            }
        });

        jTextField149.setBackground(new java.awt.Color(3, 79, 117));
        jTextField149.setEditable(false);
        jTextField149.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField149.setForeground(new java.awt.Color(153, 0, 0));
        jTextField149.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField149.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField149.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField149MouseClicked(evt);
            }
        });

        jTextField150.setBackground(new java.awt.Color(3, 79, 117));
        jTextField150.setEditable(false);
        jTextField150.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField150.setForeground(new java.awt.Color(153, 0, 0));
        jTextField150.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField150.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField150.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField150MouseClicked(evt);
            }
        });

        jTextField151.setBackground(new java.awt.Color(3, 79, 117));
        jTextField151.setEditable(false);
        jTextField151.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField151.setForeground(new java.awt.Color(153, 0, 0));
        jTextField151.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField151.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField151.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField151MouseClicked(evt);
            }
        });

        jTextField152.setBackground(new java.awt.Color(3, 79, 117));
        jTextField152.setEditable(false);
        jTextField152.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField152.setForeground(new java.awt.Color(153, 0, 0));
        jTextField152.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField152.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField152.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField152MouseClicked(evt);
            }
        });

        jTextField153.setBackground(new java.awt.Color(3, 79, 117));
        jTextField153.setEditable(false);
        jTextField153.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField153.setForeground(new java.awt.Color(153, 0, 0));
        jTextField153.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField153.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField153.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField153MouseClicked(evt);
            }
        });

        jTextField154.setBackground(new java.awt.Color(3, 79, 117));
        jTextField154.setEditable(false);
        jTextField154.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField154.setForeground(new java.awt.Color(153, 0, 0));
        jTextField154.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField154.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField154.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField154MouseClicked(evt);
            }
        });

        jTextField155.setBackground(new java.awt.Color(3, 79, 117));
        jTextField155.setEditable(false);
        jTextField155.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField155.setForeground(new java.awt.Color(153, 0, 0));
        jTextField155.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField155.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField155.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField155MouseClicked(evt);
            }
        });

        jTextField156.setBackground(new java.awt.Color(3, 79, 117));
        jTextField156.setEditable(false);
        jTextField156.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField156.setForeground(new java.awt.Color(153, 0, 0));
        jTextField156.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField156.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField156.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField156MouseClicked(evt);
            }
        });

        jTextField157.setBackground(new java.awt.Color(3, 79, 117));
        jTextField157.setEditable(false);
        jTextField157.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField157.setForeground(new java.awt.Color(153, 0, 0));
        jTextField157.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField157.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField157.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField157MouseClicked(evt);
            }
        });

        jTextField158.setBackground(new java.awt.Color(3, 79, 117));
        jTextField158.setEditable(false);
        jTextField158.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField158.setForeground(new java.awt.Color(153, 0, 0));
        jTextField158.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField158.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField158.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField158MouseClicked(evt);
            }
        });

        jTextField159.setBackground(new java.awt.Color(3, 79, 117));
        jTextField159.setEditable(false);
        jTextField159.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField159.setForeground(new java.awt.Color(153, 0, 0));
        jTextField159.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField159.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField159.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField159MouseClicked(evt);
            }
        });

        jTextField160.setBackground(new java.awt.Color(3, 79, 117));
        jTextField160.setEditable(false);
        jTextField160.setFont(new java.awt.Font("Algerian", 0, 24));
        jTextField160.setForeground(new java.awt.Color(153, 0, 0));
        jTextField160.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField160.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField160.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField160MouseClicked(evt);
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
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
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
                .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField96, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField97, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField99, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField101, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField102, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField103, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField104, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField105, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField106, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField107, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField108, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField109, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField110, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField111, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField112, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField113, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField114, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField115, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField116, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField117, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField118, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField119, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField120, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField121, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField122, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField123, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField124, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField125, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField126, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField127, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField128, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField129, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField130, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField131, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField132, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField133, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField134, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField135, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField136, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField137, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField138, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField139, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField140, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField141, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField142, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField143, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField144, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField145, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField146, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField147, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField148, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField149, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField150, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField151, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField152, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField153, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField154, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField155, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField156, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField157, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField158, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField159, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField160, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField96, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField97, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField99, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField100, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField101, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField102, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField103, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField104, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField105, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField106, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField107, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField108, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField109, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField110, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField111, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField112, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField113, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField114, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField115, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField116, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField117, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField118, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField119, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField120, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField121, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField122, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField123, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField124, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField125, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField126, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField127, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField128, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField129, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField130, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField131, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField132, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField133, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField134, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField135, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField136, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField137, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField138, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField139, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField140, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField141, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField142, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField143, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField144, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField145, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField146, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField147, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField148, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField149, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField150, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField151, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField152, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField154, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField155, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField156, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField157, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField158, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField159, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField160, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField153, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(5, 33, 60));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jTextField179.setBackground(new java.awt.Color(3, 79, 117));
        jTextField179.setEditable(false);
        jTextField179.setFont(new java.awt.Font("Algerian", 0, 32));
        jTextField179.setForeground(new java.awt.Color(255, 255, 153));
        jTextField179.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField179.setText("00:00:00");
        jTextField179.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField179.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField179MouseClicked(evt);
            }
        });

        jTextField180.setBackground(new java.awt.Color(3, 79, 117));
        jTextField180.setEditable(false);
        jTextField180.setFont(new java.awt.Font("Algerian", 0, 32)); // NOI18N
        jTextField180.setForeground(new java.awt.Color(255, 255, 153));
        jTextField180.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField180.setText("SCORE:");
        jTextField180.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField181.setBackground(new java.awt.Color(3, 79, 117));
        jTextField181.setEditable(false);
        jTextField181.setFont(new java.awt.Font("Algerian", 0, 32));
        jTextField181.setForeground(new java.awt.Color(255, 255, 153));
        jTextField181.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField181.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField182.setBackground(new java.awt.Color(3, 79, 117));
        jTextField182.setEditable(false);
        jTextField182.setFont(new java.awt.Font("Algerian", 0, 32));
        jTextField182.setForeground(new java.awt.Color(255, 255, 153));
        jTextField182.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField182.setText("BOMBS LEFT:");
        jTextField182.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField183.setBackground(new java.awt.Color(3, 79, 117));
        jTextField183.setEditable(false);
        jTextField183.setFont(new java.awt.Font("Algerian", 0, 32));
        jTextField183.setForeground(new java.awt.Color(255, 255, 153));
        jTextField183.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField183.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField184.setBackground(new java.awt.Color(3, 79, 117));
        jTextField184.setEditable(false);
        jTextField184.setFont(new java.awt.Font("Algerian", 0, 32));
        jTextField184.setForeground(new java.awt.Color(255, 255, 153));
        jTextField184.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField184.setText("MAGIC LEFT:");
        jTextField184.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField185.setBackground(new java.awt.Color(3, 79, 117));
        jTextField185.setEditable(false);
        jTextField185.setFont(new java.awt.Font("Algerian", 0, 32));
        jTextField185.setForeground(new java.awt.Color(255, 255, 153));
        jTextField185.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField185.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField186.setBackground(new java.awt.Color(3, 79, 117));
        jTextField186.setEditable(false);
        jTextField186.setFont(new java.awt.Font("Algerian", 0, 32));
        jTextField186.setForeground(new java.awt.Color(255, 255, 153));
        jTextField186.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField186.setText("no magic");
        jTextField186.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField186.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField186MouseClicked(evt);
            }
        });

        jTextField187.setBackground(new java.awt.Color(3, 79, 117));
        jTextField187.setEditable(false);
        jTextField187.setFont(new java.awt.Font("Algerian", 0, 32));
        jTextField187.setForeground(new java.awt.Color(255, 255, 153));
        jTextField187.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField187.setText("EASY");
        jTextField187.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField187.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField187MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField187, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jTextField179, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jTextField180, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jTextField181, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jTextField182, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jTextField183, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jTextField184, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jTextField185, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(jTextField186, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField179, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField180, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField181, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField182, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField183, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField184, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField185, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField186, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField187, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel4.setBackground(new java.awt.Color(5, 33, 60));
        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jTextField177.setBackground(new java.awt.Color(3, 79, 117));
        jTextField177.setEditable(false);
        jTextField177.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jTextField177.setForeground(new java.awt.Color(255, 255, 153));
        jTextField177.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField177.setText("minesweeper");
        jTextField177.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField177, javax.swing.GroupLayout.DEFAULT_SIZE, 1141, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField177, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(5, 33, 60));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jMenu1.setForeground(new java.awt.Color(255, 255, 153));
        jMenu1.setText("Menu");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        jMenuItem6.setBackground(new java.awt.Color(5, 33, 60));
        jMenuItem6.setForeground(new java.awt.Color(255, 255, 153));
        jMenuItem6.setText("Buy Magic");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
        jMenuItem1.setBackground(new java.awt.Color(5, 33, 60));
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 153));
        jMenuItem1.setText("Reset");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, 0));
        jMenuItem8.setBackground(new java.awt.Color(5, 33, 60));
        jMenuItem8.setForeground(new java.awt.Color(255, 255, 153));
        jMenuItem8.setText("Time Chase");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, 0));
        jMenuItem9.setBackground(new java.awt.Color(5, 33, 60));
        jMenuItem9.setForeground(new java.awt.Color(255, 255, 153));
        jMenuItem9.setText("Relax Play");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, 0));
        jMenuItem2.setBackground(new java.awt.Color(5, 33, 60));
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 153));
        jMenuItem2.setText("win");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, 0));
        jMenuItem3.setBackground(new java.awt.Color(5, 33, 60));
        jMenuItem3.setForeground(new java.awt.Color(255, 255, 153));
        jMenuItem3.setText("check");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem7.setBackground(new java.awt.Color(5, 33, 60));
        jMenuItem7.setForeground(new java.awt.Color(255, 255, 153));
        jMenuItem7.setText("Main menu");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);
        jMenu1.add(jSeparator1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem4.setBackground(new java.awt.Color(5, 33, 60));
        jMenuItem4.setForeground(new java.awt.Color(255, 255, 153));
        jMenuItem4.setText("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setBackground(new java.awt.Color(5, 33, 60));
        jMenuItem5.setForeground(new java.awt.Color(255, 255, 153));
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

           // <editor-fold defaultstate="collapsed" desc="Button Actions">
    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
 push(1,evt);
}//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
 push(2,evt);
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
  push(3,evt);
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
  push(4,evt);
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
  push(5,evt);
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
  push(6,evt);
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
  push(7,evt);
    }//GEN-LAST:event_jTextField7MouseClicked

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
  push(8,evt);
    }//GEN-LAST:event_jTextField8MouseClicked

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
  push(9,evt);
    }//GEN-LAST:event_jTextField9MouseClicked

    private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClicked
  push(10,evt);
    }//GEN-LAST:event_jTextField10MouseClicked

    private void jTextField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseClicked
  push(11,evt);
    }//GEN-LAST:event_jTextField11MouseClicked

    private void jTextField12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MouseClicked
  push(12,evt);
    }//GEN-LAST:event_jTextField12MouseClicked

    private void jTextField13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField13MouseClicked
  push(13,evt);
    }//GEN-LAST:event_jTextField13MouseClicked

    private void jTextField14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseClicked
  push(14,evt);
    }//GEN-LAST:event_jTextField14MouseClicked

    private void jTextField15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField15MouseClicked
  push(15,evt);
    }//GEN-LAST:event_jTextField15MouseClicked

    private void jTextField16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField16MouseClicked
  push(16,evt);
    }//GEN-LAST:event_jTextField16MouseClicked

    private void jTextField17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField17MouseClicked
  push(17,evt);
    }//GEN-LAST:event_jTextField17MouseClicked

    private void jTextField18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField18MouseClicked
  push(18,evt);
    }//GEN-LAST:event_jTextField18MouseClicked

    private void jTextField19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField19MouseClicked
  push(19,evt);
    }//GEN-LAST:event_jTextField19MouseClicked

    private void jTextField20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField20MouseClicked
  push(20,evt);
    }//GEN-LAST:event_jTextField20MouseClicked

    private void jTextField21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField21MouseClicked
  push(21,evt);
    }//GEN-LAST:event_jTextField21MouseClicked

    private void jTextField22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField22MouseClicked
  push(22,evt);
    }//GEN-LAST:event_jTextField22MouseClicked

    private void jTextField23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField23MouseClicked
  push(23,evt);
    }//GEN-LAST:event_jTextField23MouseClicked

    private void jTextField24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField24MouseClicked
  push(24,evt);
    }//GEN-LAST:event_jTextField24MouseClicked

    private void jTextField25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField25MouseClicked
  push(25,evt);
    }//GEN-LAST:event_jTextField25MouseClicked

    private void jTextField26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField26MouseClicked
  push(26,evt);
    }//GEN-LAST:event_jTextField26MouseClicked

    private void jTextField27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField27MouseClicked
  push(27,evt);
    }//GEN-LAST:event_jTextField27MouseClicked

    private void jTextField28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField28MouseClicked
  push(28,evt);
    }//GEN-LAST:event_jTextField28MouseClicked

    private void jTextField29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField29MouseClicked
  push(29,evt);
    }//GEN-LAST:event_jTextField29MouseClicked

    private void jTextField30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField30MouseClicked
  push(30,evt);
    }//GEN-LAST:event_jTextField30MouseClicked

    private void jTextField31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField31MouseClicked
  push(31,evt);
    }//GEN-LAST:event_jTextField31MouseClicked

    private void jTextField32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField32MouseClicked
  push(32,evt);
    }//GEN-LAST:event_jTextField32MouseClicked

    private void jTextField33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField33MouseClicked
  push(33,evt);
    }//GEN-LAST:event_jTextField33MouseClicked

    private void jTextField34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField34MouseClicked
  push(34,evt);
    }//GEN-LAST:event_jTextField34MouseClicked

    private void jTextField35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField35MouseClicked
  push(35,evt);
    }//GEN-LAST:event_jTextField35MouseClicked

    private void jTextField36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField36MouseClicked
  push(36,evt);
    }//GEN-LAST:event_jTextField36MouseClicked

    private void jTextField37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField37MouseClicked
  push(37,evt);
    }//GEN-LAST:event_jTextField37MouseClicked

    private void jTextField38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField38MouseClicked
  push(38,evt);
    }//GEN-LAST:event_jTextField38MouseClicked

    private void jTextField39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField39MouseClicked
  push(39,evt);
    }//GEN-LAST:event_jTextField39MouseClicked

    private void jTextField40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField40MouseClicked
  push(40,evt);
    }//GEN-LAST:event_jTextField40MouseClicked

    private void jTextField41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField41MouseClicked
  push(41,evt);
    }//GEN-LAST:event_jTextField41MouseClicked

    private void jTextField42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField42MouseClicked
  push(42,evt);
    }//GEN-LAST:event_jTextField42MouseClicked

    private void jTextField43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField43MouseClicked
  push(43,evt);
    }//GEN-LAST:event_jTextField43MouseClicked

    private void jTextField44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField44MouseClicked
  push(44,evt);
    }//GEN-LAST:event_jTextField44MouseClicked

    private void jTextField45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField45MouseClicked
  push(45,evt);
    }//GEN-LAST:event_jTextField45MouseClicked

    private void jTextField46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField46MouseClicked
  push(46,evt);
    }//GEN-LAST:event_jTextField46MouseClicked

    private void jTextField47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField47MouseClicked
  push(47,evt);
    }//GEN-LAST:event_jTextField47MouseClicked

    private void jTextField48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField48MouseClicked
  push(48,evt);
    }//GEN-LAST:event_jTextField48MouseClicked

    private void jTextField49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField49MouseClicked
  push(49,evt);
    }//GEN-LAST:event_jTextField49MouseClicked

    private void jTextField50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField50MouseClicked
  push(50,evt);
    }//GEN-LAST:event_jTextField50MouseClicked

    private void jTextField51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField51MouseClicked
  push(51,evt);
    }//GEN-LAST:event_jTextField51MouseClicked

    private void jTextField52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField52MouseClicked
  push(52,evt);
    }//GEN-LAST:event_jTextField52MouseClicked

    private void jTextField53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField53MouseClicked
  push(53,evt);
    }//GEN-LAST:event_jTextField53MouseClicked

    private void jTextField54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField54MouseClicked
  push(54,evt);
    }//GEN-LAST:event_jTextField54MouseClicked

    private void jTextField55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField55MouseClicked
  push(55,evt);
    }//GEN-LAST:event_jTextField55MouseClicked

    private void jTextField56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField56MouseClicked
  push(56,evt);
    }//GEN-LAST:event_jTextField56MouseClicked

    private void jTextField57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField57MouseClicked
  push(57,evt);
    }//GEN-LAST:event_jTextField57MouseClicked

    private void jTextField58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField58MouseClicked
  push(58,evt);
    }//GEN-LAST:event_jTextField58MouseClicked

    private void jTextField59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField59MouseClicked
  push(59,evt);
    }//GEN-LAST:event_jTextField59MouseClicked

    private void jTextField60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField60MouseClicked
  push(60,evt);
    }//GEN-LAST:event_jTextField60MouseClicked

    private void jTextField61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField61MouseClicked
  push(61,evt);
    }//GEN-LAST:event_jTextField61MouseClicked

    private void jTextField62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField62MouseClicked
  push(62,evt);
    }//GEN-LAST:event_jTextField62MouseClicked

    private void jTextField63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField63MouseClicked
  push(63,evt);
    }//GEN-LAST:event_jTextField63MouseClicked

    private void jTextField64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField64MouseClicked
  push(64,evt);
    }//GEN-LAST:event_jTextField64MouseClicked

    private void jTextField65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField65MouseClicked
  push(65,evt);
    }//GEN-LAST:event_jTextField65MouseClicked

    private void jTextField66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField66MouseClicked
  push(66,evt);
    }//GEN-LAST:event_jTextField66MouseClicked

    private void jTextField67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField67MouseClicked
  push(67,evt);
    }//GEN-LAST:event_jTextField67MouseClicked

    private void jTextField68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField68MouseClicked
  push(68,evt);
    }//GEN-LAST:event_jTextField68MouseClicked

    private void jTextField69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField69MouseClicked
  push(69,evt);
    }//GEN-LAST:event_jTextField69MouseClicked

    private void jTextField70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField70MouseClicked
  push(70,evt);
    }//GEN-LAST:event_jTextField70MouseClicked

    private void jTextField71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField71MouseClicked
  push(71,evt);
    }//GEN-LAST:event_jTextField71MouseClicked

    private void jTextField72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField72MouseClicked
  push(72,evt);
    }//GEN-LAST:event_jTextField72MouseClicked

    private void jTextField73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField73MouseClicked
  push(73,evt);
    }//GEN-LAST:event_jTextField73MouseClicked

    private void jTextField74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField74MouseClicked
  push(74,evt);
    }//GEN-LAST:event_jTextField74MouseClicked

    private void jTextField75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField75MouseClicked
  push(75,evt);
    }//GEN-LAST:event_jTextField75MouseClicked

    private void jTextField76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField76MouseClicked
  push(76,evt);
    }//GEN-LAST:event_jTextField76MouseClicked

    private void jTextField77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField77MouseClicked
  push(77,evt);
    }//GEN-LAST:event_jTextField77MouseClicked

    private void jTextField78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField78MouseClicked
  push(78,evt);
    }//GEN-LAST:event_jTextField78MouseClicked

    private void jTextField79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField79MouseClicked
  push(79,evt);
    }//GEN-LAST:event_jTextField79MouseClicked

    private void jTextField80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField80MouseClicked
  push(80,evt);
    }//GEN-LAST:event_jTextField80MouseClicked

    private void jTextField81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField81MouseClicked
  push(81,evt);
    }//GEN-LAST:event_jTextField81MouseClicked

    private void jTextField82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField82MouseClicked
  push(82,evt);
    }//GEN-LAST:event_jTextField82MouseClicked

    private void jTextField83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField83MouseClicked
  push(83,evt);
    }//GEN-LAST:event_jTextField83MouseClicked

    private void jTextField84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField84MouseClicked
  push(84,evt);
    }//GEN-LAST:event_jTextField84MouseClicked

    private void jTextField85MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField85MouseClicked
  push(85,evt);
    }//GEN-LAST:event_jTextField85MouseClicked

    private void jTextField86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField86MouseClicked
  push(86,evt);
    }//GEN-LAST:event_jTextField86MouseClicked

    private void jTextField87MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField87MouseClicked
  push(87,evt);
    }//GEN-LAST:event_jTextField87MouseClicked

    private void jTextField88MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField88MouseClicked
  push(88,evt);
    }//GEN-LAST:event_jTextField88MouseClicked

    private void jTextField89MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField89MouseClicked
  push(89,evt);
    }//GEN-LAST:event_jTextField89MouseClicked

    private void jTextField90MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField90MouseClicked
  push(90,evt);
    }//GEN-LAST:event_jTextField90MouseClicked

    private void jTextField91MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField91MouseClicked
  push(91,evt);
    }//GEN-LAST:event_jTextField91MouseClicked

    private void jTextField92MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField92MouseClicked
  push(92,evt);
    }//GEN-LAST:event_jTextField92MouseClicked

    private void jTextField93MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField93MouseClicked
  push(93,evt);
    }//GEN-LAST:event_jTextField93MouseClicked

    private void jTextField94MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField94MouseClicked
  push(94,evt);
    }//GEN-LAST:event_jTextField94MouseClicked

    private void jTextField95MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField95MouseClicked
  push(95,evt);
    }//GEN-LAST:event_jTextField95MouseClicked

    private void jTextField96MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField96MouseClicked
  push(96,evt);
    }//GEN-LAST:event_jTextField96MouseClicked

    private void jTextField97MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField97MouseClicked
  push(97,evt);
    }//GEN-LAST:event_jTextField97MouseClicked

    private void jTextField98MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField98MouseClicked
  push(98,evt);
    }//GEN-LAST:event_jTextField98MouseClicked

    private void jTextField99MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField99MouseClicked
  push(99,evt);
    }//GEN-LAST:event_jTextField99MouseClicked

    private void jTextField100MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField100MouseClicked
  push(100,evt);
    }//GEN-LAST:event_jTextField100MouseClicked

    private void jTextField101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField101MouseClicked
  push(101,evt);
    }//GEN-LAST:event_jTextField101MouseClicked

    private void jTextField102MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField102MouseClicked
  push(102,evt);
    }//GEN-LAST:event_jTextField102MouseClicked

    private void jTextField103MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField103MouseClicked
  push(103,evt);
    }//GEN-LAST:event_jTextField103MouseClicked

    private void jTextField104MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField104MouseClicked
  push(104,evt);
    }//GEN-LAST:event_jTextField104MouseClicked

    private void jTextField105MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField105MouseClicked
  push(105,evt);
    }//GEN-LAST:event_jTextField105MouseClicked

    private void jTextField106MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField106MouseClicked
  push(106,evt);
    }//GEN-LAST:event_jTextField106MouseClicked

    private void jTextField107MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField107MouseClicked
  push(107,evt);
    }//GEN-LAST:event_jTextField107MouseClicked

    private void jTextField108MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField108MouseClicked
  push(108,evt);
    }//GEN-LAST:event_jTextField108MouseClicked

    private void jTextField109MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField109MouseClicked
  push(109,evt);
    }//GEN-LAST:event_jTextField109MouseClicked

    private void jTextField110MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField110MouseClicked
  push(110,evt);
    }//GEN-LAST:event_jTextField110MouseClicked

    private void jTextField111MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField111MouseClicked
  push(111,evt);
    }//GEN-LAST:event_jTextField111MouseClicked

    private void jTextField112MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField112MouseClicked
  push(112,evt);
    }//GEN-LAST:event_jTextField112MouseClicked

    private void jTextField113MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField113MouseClicked
  push(113,evt);
    }//GEN-LAST:event_jTextField113MouseClicked

    private void jTextField114MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField114MouseClicked
  push(114,evt);
    }//GEN-LAST:event_jTextField114MouseClicked

    private void jTextField115MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField115MouseClicked
  push(115,evt);
    }//GEN-LAST:event_jTextField115MouseClicked

    private void jTextField116MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField116MouseClicked
  push(116,evt);
    }//GEN-LAST:event_jTextField116MouseClicked

    private void jTextField117MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField117MouseClicked
  push(117,evt);
    }//GEN-LAST:event_jTextField117MouseClicked

    private void jTextField118MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField118MouseClicked
  push(118,evt);
    }//GEN-LAST:event_jTextField118MouseClicked

    private void jTextField119MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField119MouseClicked
  push(119,evt);
    }//GEN-LAST:event_jTextField119MouseClicked

    private void jTextField120MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField120MouseClicked
  push(120,evt);
    }//GEN-LAST:event_jTextField120MouseClicked

    private void jTextField121MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField121MouseClicked
  push(121,evt);
    }//GEN-LAST:event_jTextField121MouseClicked

    private void jTextField122MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField122MouseClicked
  push(122,evt);
    }//GEN-LAST:event_jTextField122MouseClicked

    private void jTextField123MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField123MouseClicked
  push(123,evt);
    }//GEN-LAST:event_jTextField123MouseClicked

    private void jTextField124MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField124MouseClicked
  push(124,evt);
    }//GEN-LAST:event_jTextField124MouseClicked

    private void jTextField125MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField125MouseClicked
  push(125,evt);
    }//GEN-LAST:event_jTextField125MouseClicked

    private void jTextField126MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField126MouseClicked
  push(126,evt);
    }//GEN-LAST:event_jTextField126MouseClicked

    private void jTextField127MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField127MouseClicked
  push(127,evt);
    }//GEN-LAST:event_jTextField127MouseClicked

    private void jTextField128MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField128MouseClicked
  push(128,evt);
    }//GEN-LAST:event_jTextField128MouseClicked

    private void jTextField129MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField129MouseClicked
  push(129,evt);
    }//GEN-LAST:event_jTextField129MouseClicked

    private void jTextField130MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField130MouseClicked
  push(130,evt);
    }//GEN-LAST:event_jTextField130MouseClicked

    private void jTextField131MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField131MouseClicked
  push(131,evt);
    }//GEN-LAST:event_jTextField131MouseClicked

    private void jTextField132MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField132MouseClicked
  push(132,evt);
    }//GEN-LAST:event_jTextField132MouseClicked

    private void jTextField133MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField133MouseClicked
  push(133,evt);
    }//GEN-LAST:event_jTextField133MouseClicked

    private void jTextField134MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField134MouseClicked
  push(134,evt);
    }//GEN-LAST:event_jTextField134MouseClicked

    private void jTextField135MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField135MouseClicked
  push(135,evt);
    }//GEN-LAST:event_jTextField135MouseClicked

    private void jTextField136MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField136MouseClicked
  push(136,evt);
    }//GEN-LAST:event_jTextField136MouseClicked

    private void jTextField137MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField137MouseClicked
  push(137,evt);
    }//GEN-LAST:event_jTextField137MouseClicked

    private void jTextField138MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField138MouseClicked
  push(138,evt);
    }//GEN-LAST:event_jTextField138MouseClicked

    private void jTextField139MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField139MouseClicked
  push(139,evt);
    }//GEN-LAST:event_jTextField139MouseClicked

    private void jTextField140MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField140MouseClicked
  push(140,evt);
    }//GEN-LAST:event_jTextField140MouseClicked

    private void jTextField141MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField141MouseClicked
  push(141,evt);
    }//GEN-LAST:event_jTextField141MouseClicked

    private void jTextField142MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField142MouseClicked
  push(142,evt);
    }//GEN-LAST:event_jTextField142MouseClicked

    private void jTextField143MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField143MouseClicked
  push(143,evt);
    }//GEN-LAST:event_jTextField143MouseClicked

    private void jTextField144MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField144MouseClicked
  push(144,evt);
    }//GEN-LAST:event_jTextField144MouseClicked

    private void jTextField145MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField145MouseClicked
  push(145,evt);
    }//GEN-LAST:event_jTextField145MouseClicked

    private void jTextField146MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField146MouseClicked
  push(146,evt);
    }//GEN-LAST:event_jTextField146MouseClicked

    private void jTextField147MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField147MouseClicked
  push(147,evt);
    }//GEN-LAST:event_jTextField147MouseClicked

    private void jTextField148MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField148MouseClicked
  push(148,evt);
    }//GEN-LAST:event_jTextField148MouseClicked

    private void jTextField149MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField149MouseClicked
  push(149,evt);
    }//GEN-LAST:event_jTextField149MouseClicked

    private void jTextField150MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField150MouseClicked
  push(150,evt);
    }//GEN-LAST:event_jTextField150MouseClicked

    private void jTextField151MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField151MouseClicked
  push(151,evt);
    }//GEN-LAST:event_jTextField151MouseClicked

    private void jTextField152MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField152MouseClicked
  push(152,evt);
    }//GEN-LAST:event_jTextField152MouseClicked

    private void jTextField153MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField153MouseClicked
  push(153,evt);
    }//GEN-LAST:event_jTextField153MouseClicked

    private void jTextField154MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField154MouseClicked
  push(154,evt);
    }//GEN-LAST:event_jTextField154MouseClicked

    private void jTextField155MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField155MouseClicked
  push(155,evt);
    }//GEN-LAST:event_jTextField155MouseClicked

    private void jTextField156MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField156MouseClicked
  push(156,evt);
    }//GEN-LAST:event_jTextField156MouseClicked

    private void jTextField157MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField157MouseClicked
  push(157,evt);
    }//GEN-LAST:event_jTextField157MouseClicked

    private void jTextField158MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField158MouseClicked
  push(158,evt);
    }//GEN-LAST:event_jTextField158MouseClicked

    private void jTextField159MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField159MouseClicked
  push(159,evt);
    }//GEN-LAST:event_jTextField159MouseClicked

    private void jTextField160MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField160MouseClicked
  push(160,evt);
    }//GEN-LAST:event_jTextField160MouseClicked
// </editor-fold>

    private void jTextField179MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField179MouseClicked
ti=false;b1=false;a1=0;a2=0;a3=0;jTextField179.setText("0"+a3+":0"+a2+":0"+a1);time_chase=false;
    }//GEN-LAST:event_jTextField179MouseClicked

    private void jTextField186MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField186MouseClicked
String zz=jTextField186.getText();
if(zz.equals("magic"))
    jTextField186.setText("no magic");
if(zz.equals("no magic"))
    jTextField186.setText("magic");
    }//GEN-LAST:event_jTextField186MouseClicked

    private void jTextField187MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField187MouseClicked
    String h=jTextField187.getText();
if(h.equals("EASY")){h="MEDIUM";}
    else if(h.equals("MEDIUM")){h="HARD";}
    else if(h.equals("HARD")){h="DIABOLICAL";}
    else if(h.equals("DIABOLICAL")){h="EASY";}
    jTextField187.setText(h);
    reset();
    }//GEN-LAST:event_jTextField187MouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if(jPanel2.isVisible())
            ff();
}//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        reset();
}//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        time_chase=true;ti=true;b1=true;reset();
}//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        time_chase=false;
}//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        check_1();
}//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        check();
}//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        this.setVisible(false);
        mine1 x4=new mine1();
        x4.setVisible(true);
}//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JOptionPane.showMessageDialog(this, "\t\tMinesweeper\nVersion:  1.0.9\nCreator:  Abhishek Banerjee\ne-mail:  abhishekbanerjee1992@gmail.com");
}//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        int asd=JOptionPane.showConfirmDialog(this, "Exit???");
        if(asd==0)
            System.exit(0);
}//GEN-LAST:event_jMenuItem5ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new x3().setVisible(true);
            }
        });
    }
       // <editor-fold defaultstate="collapsed" desc="variables initialization">
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField100;
    private javax.swing.JTextField jTextField101;
    private javax.swing.JTextField jTextField102;
    private javax.swing.JTextField jTextField103;
    private javax.swing.JTextField jTextField104;
    private javax.swing.JTextField jTextField105;
    private javax.swing.JTextField jTextField106;
    private javax.swing.JTextField jTextField107;
    private javax.swing.JTextField jTextField108;
    private javax.swing.JTextField jTextField109;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField110;
    private javax.swing.JTextField jTextField111;
    private javax.swing.JTextField jTextField112;
    private javax.swing.JTextField jTextField113;
    private javax.swing.JTextField jTextField114;
    private javax.swing.JTextField jTextField115;
    private javax.swing.JTextField jTextField116;
    private javax.swing.JTextField jTextField117;
    private javax.swing.JTextField jTextField118;
    private javax.swing.JTextField jTextField119;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField120;
    private javax.swing.JTextField jTextField121;
    private javax.swing.JTextField jTextField122;
    private javax.swing.JTextField jTextField123;
    private javax.swing.JTextField jTextField124;
    private javax.swing.JTextField jTextField125;
    private javax.swing.JTextField jTextField126;
    private javax.swing.JTextField jTextField127;
    private javax.swing.JTextField jTextField128;
    private javax.swing.JTextField jTextField129;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField130;
    private javax.swing.JTextField jTextField131;
    private javax.swing.JTextField jTextField132;
    private javax.swing.JTextField jTextField133;
    private javax.swing.JTextField jTextField134;
    private javax.swing.JTextField jTextField135;
    private javax.swing.JTextField jTextField136;
    private javax.swing.JTextField jTextField137;
    private javax.swing.JTextField jTextField138;
    private javax.swing.JTextField jTextField139;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField140;
    private javax.swing.JTextField jTextField141;
    private javax.swing.JTextField jTextField142;
    private javax.swing.JTextField jTextField143;
    private javax.swing.JTextField jTextField144;
    private javax.swing.JTextField jTextField145;
    private javax.swing.JTextField jTextField146;
    private javax.swing.JTextField jTextField147;
    private javax.swing.JTextField jTextField148;
    private javax.swing.JTextField jTextField149;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField150;
    private javax.swing.JTextField jTextField151;
    private javax.swing.JTextField jTextField152;
    private javax.swing.JTextField jTextField153;
    private javax.swing.JTextField jTextField154;
    private javax.swing.JTextField jTextField155;
    private javax.swing.JTextField jTextField156;
    private javax.swing.JTextField jTextField157;
    private javax.swing.JTextField jTextField158;
    private javax.swing.JTextField jTextField159;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField160;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField177;
    private javax.swing.JTextField jTextField179;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField180;
    private javax.swing.JTextField jTextField181;
    private javax.swing.JTextField jTextField182;
    private javax.swing.JTextField jTextField183;
    private javax.swing.JTextField jTextField184;
    private javax.swing.JTextField jTextField185;
    private javax.swing.JTextField jTextField186;
    private javax.swing.JTextField jTextField187;
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
    private javax.swing.JTextField jTextField92;
    private javax.swing.JTextField jTextField93;
    private javax.swing.JTextField jTextField94;
    private javax.swing.JTextField jTextField95;
    private javax.swing.JTextField jTextField96;
    private javax.swing.JTextField jTextField97;
    private javax.swing.JTextField jTextField98;
    private javax.swing.JTextField jTextField99;
    // End of variables declaration//GEN-END:variables
       // </editor-fold>
}
