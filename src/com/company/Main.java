package com.company;

import javax.swing.*;
import java.awt.*;

class PanelGraficos extends Canvas{

    public void paint(Graphics g) {
        super.paint(g);
        int n;
        int[] x3=new int[3],y3=new int[3];
        int[] x4=new int[4],y4=new int[4];
        int[] x5=new int[5],y5=new int[5];
        int[] x6=new int[6],y6=new int[6];
        int[] x7=new int[7],y7=new int[7];
        int[] x8=new int[8],y8=new int[8];
        int[] x9=new int[9],y9=new int[9];
        int[] x12=new int[12],y12=new int[12];
        int[] x13=new int[13],y13=new int[13];
        Color c;

        Graphics2D g2d=(Graphics2D)g;
        g2d.setPaint(new GradientPaint(640, 0, new Color(217,131,74), 640, 1420,Color.WHITE));
        g2d.fillRect(0, 0, 1280, 720);

        c=new Color(243,233,224);
        x3[0]=389; y3[0]=47;
        x3[1]=467; y3[1]=144;
        x3[2]=327; y3[2]=144;
        g.setColor(c);
        g.fillPolygon(x3,y3,x3.length);

        c=new Color(243,233,224);
        x5[0]=528; y5[0]=158;
        x5[1]=465; y5[1]=143;
        x5[2]=416; y5[2]=144;
        x5[3]=416; y5[3]=223;
        x5[4]=553; y5[4]=223;
        g.setColor(c);
        g.fillPolygon(x5,y5,x5.length);

        c=new Color(243,233,224);
        x4[0]=557; y4[0]=222;
        x4[1]=577; y4[1]=260;
        x4[2]=522; y4[2]=272;
        x4[3]=498; y4[3]=222;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(255,240,233);
        x3[0]=388; y3[0]=47;
        x3[1]=349; y3[1]=105;
        x3[2]=364; y3[2]=108;
        g.setColor(c);
        g.fillPolygon(x3,y3,x3.length);

        c=new Color(197,115,101);
        x3[0]=524; y3[0]=276;
        x3[1]=407; y3[1]=127;
        x3[2]=491; y3[2]=208;
        g.setColor(c);
        g.fillPolygon(x3,y3,x3.length);

        c=new Color(207,180,215);
        x5[0]=451; y5[0]=179;
        x5[1]=491; y5[1]=229;
        x5[2]=518; y5[2]=273;
        x5[3]=511; y5[3]=277;
        x5[4]=436; y5[4]=194;
        g.setColor(c);
        g.fillPolygon(x5,y5,x5.length);

        c=new Color(246,225,220);
        x4[0]=403; y4[0]=121;
        x4[1]=450; y4[1]=178;
        x4[2]=436; y4[2]=196;
        x4[3]=402; y4[3]=166;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(255,246,237);
        x5[0]=350; y5[0]=115;
        x5[1]=403; y5[1]=120;
        x5[2]=403; y5[2]=166;
        x5[3]=380; y5[3]=150;
        x5[4]=370; y5[4]=150;
        g.setColor(c);
        g.fillPolygon(x5,y5,x5.length);

        c=new Color(203,174,220);
        x3[0]=362; y3[0]=86;
        x3[1]=347; y3[1]=115;
        x3[2]=328; y3[2]=88;
        g.setColor(c);
        g.fillPolygon(x3,y3,x3.length);

        c=new Color(248,186,165);
        x3[0]=322; y3[0]=78;
        x3[1]=319; y3[1]=110;
        x3[2]=347; y3[2]=115;
        g.setColor(c);
        g.fillPolygon(x3,y3,x3.length);

        c=new Color(250,233,179);
        x4[0]=319; y4[0]=110;
        x4[1]=349; y4[1]=114;
        x4[2]=370; y4[2]=149;
        x4[3]=317; y4[3]=145;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(253,250,243);
        x4[0]=322; y4[0]=78;
        x4[1]=317; y4[1]=145;
        x4[2]=291; y4[2]=121;
        x4[3]=294; y4[3]=109;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        x5[0]=359; y5[0]=145;
        x5[1]=352; y5[1]=220;
        x5[2]=322; y5[2]=208;
        x5[3]=310; y5[3]=216;
        x5[4]=312; y5[4]=201;
        g2d.setPaint(new GradientPaint(359,145, new Color(253,248,242), 347, 176,new Color(249,246,193)));
        g2d.fillPolygon(x5,y5,x5.length);

        x3[0]=359; y3[0]=145;
        x3[1]=380; y3[1]=182;
        x3[2]=355; y3[2]=180;
        g2d.setPaint(new GradientPaint(359,145, new Color(242,206,216), 365, 173,new Color(235,172,157)));
        g2d.fillPolygon(x3,y3,x3.length);

        c=new Color(255,180,113);
        x4[0]=360; y4[0]=146;
        x4[1]=380; y4[1]=150;
        x4[2]=394; y4[2]=160;
        x4[3]=372; y4[3]=169;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(217,143,118);
        x4[0]=372; y4[0]=169;
        x4[1]=394; y4[1]=160;
        x4[2]=433; y4[2]=193;
        x4[3]=380; y4[3]=182;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(254,240,239);
        x4[0]=354; y4[0]=178;
        x4[1]=436; y4[1]=193;
        x4[2]=434; y4[2]=231;
        x4[3]=396; y4[3]=230;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(167,113,127);
        x3[0]=436; y3[0]=193;
        x3[1]=479; y3[1]=231;
        x3[2]=509; y3[2]=276;
        g.setColor(c);
        g.fillPolygon(x3,y3,x3.length);

        x6[0]=436; y6[0]=193;
        x6[1]=509; y6[1]=276;
        x6[2]=506; y6[2]=284;
        x6[3]=474; y6[3]=332;
        x6[4]=460; y6[4]=362;
        x6[5]=429; y6[5]=382;
        g2d.setPaint(new GradientPaint(475,240, new Color(209,173,219), 451, 327,new Color(182,157,176)));
        g2d.fillPolygon(x6,y6,x6.length);

        c=new Color(255,226,192);
        x4[0]=355; y4[0]=179;
        x4[1]=396; y4[1]=230;
        x4[2]=381; y4[2]=232;
        x4[3]=351; y4[3]=220;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(254,211,195);
        x7[0]=321; y7[0]=207;
        x7[1]=382; y7[1]=231;
        x7[2]=435; y7[2]=229;
        x7[3]=433; y7[3]=274;
        x7[4]=389; y7[4]=253;
        x7[5]=349; y7[5]=255;
        x7[6]=278; y7[6]=242;
        g.setColor(c);
        g.fillPolygon(x7,y7,x7.length);

        c=new Color(229,185,220);
        x3[0]=311; y3[0]=90;
        x3[1]=297; y3[1]=89;
        x3[2]=293; y3[2]=111;
        g.setColor(c);
        g.fillPolygon(x3,y3,x3.length);

        x6[0]=297; y6[0]=89;
        x6[1]=294; y6[1]=111;
        x6[2]=287; y6[2]=135;
        x6[3]=262; y6[3]=151;
        x6[4]=263; y6[4]=173;
        x6[5]=226; y6[5]=180;
        g2d.setPaint(new GradientPaint(292,99, new Color(228,187,227), 251,162,new Color(237,167,155)));
        g2d.fillPolygon(x6,y6,x6.length);

        x7[0]=296; y7[0]=125;
        x7[1]=262; y7[1]=151;
        x7[2]=263; y7[2]=173;
        x7[3]=314; y7[3]=172;
        x7[4]=312; y7[4]=201;
        x7[5]=357; y7[5]=148;
        x7[6]=317; y7[6]=145;
        g2d.setPaint(new GradientPaint(277,141, new Color(255,217,144), 333, 173,new Color(253,185,120)));
        g2d.fillPolygon(x7,y7,x7.length);

        c=new Color(255,238,140);
        x3[0]=291; y3[0]=121;
        x3[1]=287; y3[1]=131;
        x3[2]=297; y3[2]=125;
        g.setColor(c);
        g.fillPolygon(x3,y3,x3.length);

        x3[0]=297; y3[0]=89;
        x3[1]=209; y3[1]=170;
        x3[2]=257; y3[2]=143;
        g2d.setPaint(new GradientPaint(297,89, new Color(251,240,238), 261,127,new Color(255,218,152)));
        g2d.fillPolygon(x3,y3,x3.length);

        c=new Color(248,235,218);
        x4[0]=257; y4[0]=143;
        x4[1]=207; y4[1]=169;
        x4[2]=205; y4[2]=187;
        x4[3]=225; y4[3]=181;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(253,242,186);
        x4[0]=207; y4[0]=172;
        x4[1]=207; y4[1]=191;
        x4[2]=164; y4[2]=189;
        x4[3]=158; y4[3]=175;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        x9[0]=204; y9[0]=183;
        x9[1]=226; y9[1]=180;
        x9[2]=263; y9[2]=173;
        x9[3]=314; y9[3]=172;
        x9[4]=313; y9[4]=201;
        x9[5]=250; y9[5]=207;
        x9[6]=211; y9[6]=207;
        x9[7]=193; y9[7]=199;
        x9[8]=191; y9[8]=191;
        g2d.setPaint(new GradientPaint(311,188, new Color(254,186,139), 206,195,new Color(255,198,155)));
        g2d.fillPolygon(x9,y9,x9.length);

        x13[0]=112; y13[0]=124;
        x13[1]=170; y13[1]=189;
        x13[2]=177; y13[2]=192;
        x13[3]=156; y13[3]=210;
        x13[4]=151; y13[4]=200;
        x13[5]=140; y13[5]=215;
        x13[6]=135; y13[6]=206;
        x13[7]=133; y13[7]=208;
        x13[8]=97; y13[8]=195;
        x13[9]=102; y13[9]=159;
        x13[10]=114; y13[10]=151;
        x13[11]=116; y13[11]=155;
        x13[12]=127; y13[12]=147;
        g2d.setPaint(new GradientPaint(187,162, new Color(229,151,129), 96,187,new Color(253,188,158)));
        g2d.fillPolygon(x13,y13,x13.length);

        x12[0]=112; y12[0]=124;
        x12[1]=127; y12[1]=147;
        x12[2]=116; y12[2]=155;
        x12[3]=114; y12[3]=151;
        x12[4]=102; y12[4]=159;
        x12[5]=93; y12[5]=235;
        x12[6]=80; y12[6]=230;
        x12[7]=83; y12[7]=181;
        x12[8]=79; y12[8]=175;
        x12[9]=84; y12[9]=166;
        x12[10]=82; y12[10]=163;
        x12[11]=77; y12[11]=165;
        g2d.setPaint(new GradientPaint(125,115, new Color(251,245,213), 75,239,new Color(253,237,116)));
        g2d.fillPolygon(x12,y12,x12.length);

        c=new Color(127,68,38);
        x4[0]=58; y4[0]=155;
        x4[1]=76; y4[1]=172;
        x4[2]=73; y4[2]=193;
        x4[3]=48; y4[3]=169;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(122,64,33);
        x4[0]=48; y4[0]=169;
        x4[1]=73; y4[1]=193;
        x4[2]=77; y4[2]=229;
        x4[3]=39; y4[3]=218;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(251,108,6);
        x4[0]=58; y4[0]=155;
        x4[1]=48; y4[1]=169;
        x4[2]=0; y4[2]=222;
        x4[3]=0; y4[3]=208;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(255,139,3);
        x3[0]=48; y3[0]=169;
        x3[1]=0; y3[1]=240;
        x3[2]=0;  y3[2]=222;
        g.setColor(c);
        g.fillPolygon(x3,y3,x3.length);

        c=new Color(255,129,18);
        x4[0]=48; y4[0]=169;
        x4[1]=39; y4[1]=219;
        x4[2]=0; y4[2]=278;
        x4[3]=0; y4[3]=240;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(255,151,38);
        x4[0]=39; y4[0]=219;
        x4[1]=29; y4[1]=289;
        x4[2]=0; y4[2]=333;
        x4[3]=0; y4[3]=278;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(218,85,52);
        x3[0]=39; y3[0]=218;
        x3[1]=29; y3[1]=289;
        x3[2]=98;  y3[2]=235;
        g.setColor(c);
        g.fillPolygon(x3,y3,x3.length);

        c=new Color(255,138,51);
        x6[0]=135; y6[0]=206;
        x6[1]=128; y6[1]=218;
        x6[2]=19; y6[2]=411;
        x6[3]=0; y6[3]=426;
        x6[4]=0; y6[4]=333;
        x6[5]=29; y6[5]=289;
        g.setColor(c);
        g.fillPolygon(x6,y6,x6.length);

        c=new Color(253,192,138);
        x4[0]=97; y4[0]=195;
        x4[1]=135; y4[1]=206;
        x4[2]=98; y4[2]=235;
        x4[3]=93; y4[3]=235;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(255,161,63);
        x3[0]=128; y3[0]=218;
        x3[1]=119; y3[1]=333;
        x3[2]=8;  y3[2]=475;
        g.setColor(c);
        g.fillPolygon(x3,y3,x3.length);

        c=new Color(254,143,71);
        x3[0]=128; y3[0]=218;
        x3[1]=8; y3[1]=475;
        x3[2]=19;  y3[2]=411;
        g.setColor(c);
        g.fillPolygon(x3,y3,x3.length);

        c=new Color(253,163,75);
        x4[0]=19; y4[0]=411;
        x4[1]=8; y4[1]=475;
        x4[2]=0; y4[2]=481;
        x4[3]=0; y4[3]=426;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(248,135,77);
        x3[0]=119; y3[0]=333;
        x3[1]=0; y3[1]=506;
        x3[2]=0;  y3[2]=481;
        g.setColor(c);
        g.fillPolygon(x3,y3,x3.length);

        c=new Color(252,167,76);
        x4[0]=119; y4[0]=333;
        x4[1]=110; y4[1]=421;
        x4[2]=0; y4[2]=511;
        x4[3]=0; y4[3]=506;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(247,118,78);
        x3[0]=110; y3[0]=421;
        x3[1]=0; y3[1]=527;
        x3[2]=0;  y3[2]=511;
        g.setColor(c);
        g.fillPolygon(x3,y3,x3.length);

        c=new Color(248,155,77);
        x4[0]=110; y4[0]=421;
        x4[1]=100; y4[1]=495;
        x4[2]=0; y4[2]=538;
        x4[3]=0; y4[3]=527;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(85,48,40);
        x5[0]=135; y5[0]=206;
        x5[1]=158; y5[1]=245;
        x5[2]=155; y5[2]=250;
        x5[3]=170; y5[3]=302;
        x5[4]=128; y5[4]=218;
        g.setColor(c);
        g.fillPolygon(x5,y5,x5.length);

        x6[0]=128; y6[0]=218;
        x6[1]=170; y6[1]=302;
        x6[2]=170; y6[2]=322;
        x6[3]=153; y6[3]=339;
        x6[4]=153; y6[4]=364;
        x6[5]=119; y6[5]=333;
        g2d.setPaint(new GradientPaint(167,363, new Color(96,64,75), 125,234,new Color(116,68,56)));
        g2d.fillPolygon(x6,y6,x6.length);

        x6[0]=119; y6[0]=333;
        x6[1]=172; y6[1]=381;
        x6[2]=159; y6[2]=412;
        x6[3]=157; y6[3]=430;
        x6[4]=170; y6[4]=437;
        x6[5]=110; y6[5]=421;
        g2d.setPaint(new GradientPaint(163,434, new Color(96,64,75), 124,345,new Color(116,68,56)));
        g2d.fillPolygon(x6,y6,x6.length);

        c=new Color(175,95,86);
        x8[0]=110; y8[0]=420;
        x8[1]=170; y8[1]=437;
        x8[2]=178; y8[2]=464;
        x8[3]=176; y8[3]=476;
        x8[4]=198; y8[4]=492;
        x8[5]=223; y8[5]=477;
        x8[6]=220; y8[6]=499;
        x8[7]=100; y8[7]=495;
        g.setColor(c);
        g.fillPolygon(x8,y8,x8.length);

        c=new Color(249,147,83);
        x4[0]=100; y4[0]=495;
        x4[1]=93; y4[1]=548;
        x4[2]=0;  y4[2]=553;
        x4[3]=0;  y4[3]=538;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

        c=new Color(230,112,84);
        x4[0]=100; y4[0]=495;
        x4[1]=220; y4[1]=499;
        x4[2]=217;  y4[2]=531;
        x4[3]=93;  y4[3]=548;
        g.setColor(c);
        g.fillPolygon(x4,y4,x4.length);

//        c=new Color(127,68,38);
//        x7[0]=58; y7[0]=155;
//        x7[1]=76; y7[1]=172;
//        x7[2]=73; y7[2]=193;
//        x7[3]=80; y7[3]=200;
//        x7[4]=77; y7[4]=229;
//        x7[5]=39; y7[5]=218;
//        x7[6]=48; y7[6]=169;
//        g.setColor(c);
//        g.fillPolygon(x7,y7,x7.length);
    }
}

public class Main extends JFrame {

    Graphics g;
    PanelGraficos pg;

    public Main(){
        setSize(1280,720);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pg=new PanelGraficos();
        add(pg);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}


