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

        Color c;

        Graphics2D g2d=(Graphics2D)g;
        g2d.setPaint(new GradientPaint(0, 0, new Color(221,137,90), 0, 720,Color.WHITE));
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


