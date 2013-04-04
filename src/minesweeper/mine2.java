
package minesweeper;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Abhishek Banerjee
 */
public class mine2 {
int a[]={0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0};
Random r=new Random();
String aa[]=    {   "","","","","","","","","","",
                         "","","","","","","","","","",
                         "","","","","","","","","","",
                         "","","","","","","","","","",
                         "","","","","","","","","","",
                         "","","","","","","","","","",
                         "","","","","","","","","","",
                          "","","","","","","","","","",
                         "",""};
public void intro(int n){
ArrayList a1 = new ArrayList(82);
for(int ry=0;ry<82;ry++){
a1.add(""+ry);}int yu=81;
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
    sd(2);sd(10);sd(11);
    break;
    case 2:
    sd(1);sd(3);sd(11);sd(12);sd(10);
    break;
    case 3:
    sd(2);sd(4);sd(12);sd(13);sd(11);
    break;
    case 4:
    sd(3);sd(5);sd(13);sd(14);sd(12);
    break;
    case 5:
sd(4);sd(6);sd(14);sd(15);sd(13);
    break;
    case 6:
        sd(5);sd(7);sd(15);sd(16);sd(14);
    break;
    case 7:
    sd(6);sd(8);sd(16);sd(17);sd(15);
    break;
    case 8:
    sd(7);sd(9);sd(17);sd(18);sd(16);
    break;
    case 9:
    sd(8);sd(18);sd(17);
    break;
    case 10:
    sd(1);sd(2);sd(11);sd(19);sd(20);
    break;
    case 11:
    sd(1);sd(2);sd(3);sd(10);sd(12);sd(21);sd(19);sd(20);
    break;
    case 12:
    sd(4);sd(2);sd(3);sd(11);sd(13);sd(21);sd(22);sd(20);
    break;
    case 13:
    sd(5);sd(3);sd(4);sd(12);sd(14);sd(22);sd(23);sd(21);
    break;
    case 14:
    sd(6);sd(4);sd(5);sd(13);sd(15);sd(23);sd(24);sd(22);
    break;
    case 15:
    sd(7);sd(5);sd(6);sd(14);sd(16);sd(24);sd(25);sd(23);
    break;
    case 16:
    sd(8);sd(6);sd(7);sd(15);sd(17);sd(25);sd(26);sd(24);
    break;
    case 17:
    sd(9);sd(7);sd(8);sd(16);sd(18);sd(26);sd(27);sd(25);
    break;
    case 18:
    sd(8);sd(9);sd(17);sd(27);sd(26);
    break;
    case 19:
    sd(10);sd(11);sd(20);sd(28);sd(29);
    break;
    case 20:
    sd(11);sd(10);sd(12);sd(19);sd(21);sd(28);sd(29);sd(30);
    break;
    case 21:
    sd(11);sd(13);sd(12);sd(20);sd(22);sd(29);sd(30);sd(31);
    break;
    case 22:
    sd(14);sd(12);sd(13);sd(21);sd(23);sd(30);sd(31);sd(32);
    break;
    case 23:
    sd(15);sd(13);sd(14);sd(22);sd(24);sd(31);sd(32);sd(33);
    break;
    case 24:
    sd(16);sd(14);sd(15);sd(23);sd(25);sd(32);sd(33);sd(34);
    break;
    case 25:
    sd(17);sd(15);sd(16);sd(24);sd(26);sd(33);sd(34);sd(35);
    break;
    case 26:
    sd(18);sd(16);sd(17);sd(25);sd(27);sd(34);sd(35);sd(36);
    break;
    case 27:
    sd(17);sd(18);sd(26);sd(35);sd(36);
    break;
    case 28:
    sd(19);sd(20);sd(29);sd(37);sd(38);
    break;
    case 29:
   sd(19);sd(20);sd(21);sd(28);sd(30);sd(38);sd(39);sd(37);
    break;
    case 30:
    sd(21);sd(22);sd(20);sd(29);sd(31);sd(38);sd(39);sd(40);
    break;
    case 31:
    sd(21);sd(22);sd(23);sd(30);sd(32);sd(41);sd(39);sd(40);
    break;
    case 32:
    sd(24);sd(22);sd(23);sd(31);sd(33);sd(41);sd(42);sd(40);
    break;
    case 33:
    sd(25);sd(23);sd(24);sd(32);sd(34);sd(42);sd(43);sd(41);
    break;
    case 34:
    sd(26);sd(24);sd(25);sd(33);sd(35);sd(43);sd(44);sd(42);
    break;
    case 35:
    sd(27);sd(25);sd(26);sd(34);sd(36);sd(44);sd(45);sd(43);
    break;
    case 36:
    sd(26);sd(27);sd(35);sd(44);sd(45);
    break;
    case 37:
    sd(28);sd(29);sd(38);sd(46);sd(47);
    break;
    case 38:
    sd(28);sd(29);sd(30);sd(37);sd(39);sd(46);sd(47);sd(48);
    break;
    case 39:
    sd(31);sd(29);sd(30);sd(38);sd(40);sd(48);sd(49);sd(47);
    break;
    case 40:
    sd(31);sd(32);sd(30);sd(39);sd(41);sd(48);sd(49);sd(50);
    break;
    case 41:
    sd(31);sd(32);sd(33);sd(40);sd(42);sd(51);sd(49);sd(50);
    break;
    case 42:
    sd(34);sd(32);sd(33);sd(41);sd(43);sd(51);sd(52);sd(50);
    break;
    case 43:
    sd(35);sd(33);sd(34);sd(42);sd(44);sd(51);sd(52);sd(53);
    break;
    case 44:
    sd(36);sd(34);sd(35);sd(43);sd(45);sd(52);sd(53);sd(54);
    break;
    case 45:
    sd(35);sd(36);sd(44);sd(53);sd(54);
    break;
    case 46:
    sd(37);sd(38);sd(47);sd(55);sd(56);
    break;
    case 47:
    sd(37);sd(38);sd(39);sd(46);sd(48);sd(55);sd(56);sd(57);
    break;
    case 48:
    sd(40);sd(38);sd(39);sd(47);sd(49);sd(56);sd(57);sd(58);
    break;
    case 49:
    sd(41);sd(39);sd(40);sd(48);sd(50);sd(57);sd(58);sd(59);
    break;
    case 50:
    sd(41);sd(42);sd(40);sd(49);sd(51);sd(60);sd(58);sd(59);
    break;
    case 51:
    sd(41);sd(42);sd(43);sd(50);sd(52);sd(60);sd(61);sd(59);
    break;
    case 52:
    sd(42);sd(43);sd(44);sd(53);sd(51);sd(60);sd(61);sd(62);
    break;
    case 53:
    sd(43);sd(44);sd(45);sd(52);sd(54);sd(61);sd(62);sd(63);
    break;
    case 54:
        sd(44);sd(45);sd(53);sd(62);sd(63);
        break;
    case 55:
        sd(46);sd(47);sd(56);sd(64);sd(65);
        break;
    case 56:
        sd(46);sd(47);sd(48);sd(55);sd(57);sd(64);sd(65);sd(66);
        break;
         case 57:
        sd(49);sd(47);sd(48);sd(56);sd(58);sd(67);sd(65);sd(66);
        break;
         case 58:
        sd(48);sd(49);sd(50);sd(57);sd(59);sd(66);sd(67);sd(68);
        break;
         case 59:
        sd(49);sd(50);sd(51);sd(58);sd(60);sd(67);sd(68);sd(69);
        break;
         case 60:
        sd(50);sd(51);sd(52);sd(59);sd(61);sd(68);sd(69);sd(70);
        break;
         case 61:
        sd(51);sd(52);sd(53);sd(60);sd(62);sd(69);sd(70);sd(71);
        break;
         case 62:
        sd(52);sd(53);sd(54);sd(61);sd(63);sd(70);sd(71);sd(72);
        break;
        case 63:
        sd(53);sd(54);sd(62);sd(71);sd(72);
        break;
        case 64:
        sd(55);sd(56);sd(65);sd(73);sd(74);
        break;
    case 65:
        sd(55);sd(56);sd(57);sd(64);sd(66);sd(73);sd(74);sd(75);
        break;
        case 66:
        sd(58);sd(56);sd(57);sd(65);sd(67);sd(76);sd(74);sd(75);
        break;
        case 67:
        sd(57);sd(58);sd(59);sd(66);sd(68);sd(75);sd(76);sd(77);
        break;
        case 68:
        sd(58);sd(59);sd(60);sd(67);sd(69);sd(76);sd(77);sd(78);
        break;
        case 69:
        sd(59);sd(60);sd(61);sd(68);sd(70);sd(77);sd(78);sd(79);
        break;
        case 70:
        sd(60);sd(61);sd(62);sd(69);sd(71);sd(78);sd(79);sd(80);
        break;
        case 71:
        sd(61);sd(62);sd(63);sd(70);sd(72);sd(79);sd(80);sd(81);
        break;
        case 72:
        sd(62);sd(63);sd(71);sd(80);sd(81);
        break;
        case 73:
        sd(64);sd(65);sd(74);
        break;
         case 74:
        sd(64);sd(65);sd(66);sd(73);sd(75);
        break;
        case 75:
        sd(67);sd(65);sd(66);sd(74);sd(76);
        break;
        case 76:
        sd(66);sd(67);sd(68);sd(75);sd(77);
        break;
        case 77:
        sd(67);sd(68);sd(69);sd(76);sd(78);
        break;
        case 78:
        sd(68);sd(69);sd(70);sd(77);sd(79);
        break;
        case 79:
        sd(69);sd(70);sd(71);sd(78);sd(80);
        break;
        case 80:
        sd(70);sd(71);sd(72);sd(79);sd(81);
        break;
        case 81:
        sd(71);sd(72);sd(80);
        break;
    default:
        break;}}}
public void em(){
    for(int hh=1;hh<=81;hh++){
aa[hh]="";}
}
}
