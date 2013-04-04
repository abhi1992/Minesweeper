
package minesweeper;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Abhishek Banerjee
 */
public class mine3 {
int a[]={0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,0};
Random r=new Random();
String aa[]=new String[161];
public void cls_1(){
    for(int ratt=0;ratt<161;ratt++){
    aa[ratt]="";
    }
}
public void intro(int n){cls_1();
ArrayList a1 = new ArrayList(161);
for(int ry=0;ry<161;ry++){
a1.add(""+ry);}int yu=160;
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
int rat=0;
if(a[i]>16&&a[i]%16!=1){    rat=a[i]-17;
 if(rat>0)  sd(rat);rat=0;}
if(a[i]>16){    rat=a[i]-16;
 if(rat>0)  sd(rat);rat=0;}
if(a[i]>16&&a[i]%16!=0) {   rat=a[i]-15;
 if(rat>0)  sd(rat);rat=0;}
if(a[i]>1&&a[i]%16!=1){    rat=a[i]-1;
 if(rat>0)  sd(rat);rat=0;}
if(a[i]%16!=0){    rat=a[i]+1;
 if(rat>0)  sd(rat);rat=0;}
if(a[i]<145&&a[i]%16!=1){    rat=a[i]+15;
 if(rat>0)  sd(rat);rat=0;}
if(a[i]<145){    rat=a[i]+16;
 if(rat>0)  sd(rat);rat=0;}
if(a[i]%16!=0&&a[i]<145){    rat=a[i]+17;
 if(rat>0)  sd(rat);rat=0;}
}}




}
