import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator43 extends JFrame {
    double a,b;
    int code;
    double result;
    Calculator43(String s){
        super(s);
    }
    JTextField t1;
    JButton b1; JButton b2; JButton b3; JButton b4; JButton b5; JButton b6; JButton b7; JButton b8; JButton b9; JButton b0;
    JButton badd; JButton bsub; JButton bmul; JButton bdiv; JButton bdot; JButton bclr; JButton bdel; JButton beq;

    public void component(){
        t1 = new JTextField();
        Font f = new Font("DialogInput",Font.BOLD,15);
        t1.setBounds(40, 40, 200, 50);
        t1.setBackground(Color.PINK);
        t1.setForeground(Color.BLACK);
        t1.setFont(f);
        setLayout(null);
        add(t1);

        b1 = new JButton("1"); b2 = new JButton("2"); b3 = new JButton("3"); b4 = new JButton("4"); b5 = new JButton("5"); b6 = new JButton("6"); b7 = new JButton("7");
        b8 = new JButton("8"); b9 = new JButton("9"); b0 = new JButton("0"); badd = new JButton("+"); bsub = new JButton("-"); bmul = new JButton("*");
        bdiv = new JButton("/"); bdot = new JButton("."); bclr = new JButton("Clear"); bdel = new JButton("Delete"); beq = new JButton("=");

        Cursor c1 = new Cursor(Cursor.DEFAULT_CURSOR);
        Cursor c2 = new Cursor(Cursor.CROSSHAIR_CURSOR);
        Cursor c3 = new Cursor(Cursor.TEXT_CURSOR);
        Cursor c4 = new Cursor(Cursor.WAIT_CURSOR);
        Cursor c5 = new Cursor(Cursor.SW_RESIZE_CURSOR);
        Cursor c6 = new Cursor(Cursor.SE_RESIZE_CURSOR);
        Cursor c7 = new Cursor(Cursor.NW_RESIZE_CURSOR);
        Cursor c8 = new Cursor(Cursor.NE_RESIZE_CURSOR);
        Cursor c9 = new Cursor(Cursor.N_RESIZE_CURSOR);
        Cursor c10 = new Cursor(Cursor.S_RESIZE_CURSOR);
        Cursor c11 = new Cursor(Cursor.W_RESIZE_CURSOR);
        Cursor c12= new Cursor(Cursor.E_RESIZE_CURSOR);
        Cursor c13 = new Cursor(Cursor.HAND_CURSOR);
        Cursor c14 = new Cursor(Cursor.MOVE_CURSOR);

        b1.setCursor(c1); b2.setCursor(c2); b3.setCursor(c3); b4.setCursor(c4); b5.setCursor(c5); b6.setCursor(c6); b7.setCursor(c7);
        b8.setCursor(c8); b9.setCursor(c9); b0.setCursor(c10); badd.setCursor(c11); bsub.setCursor(c12); bmul.setCursor(c13); bdiv.setCursor(c14);
        bdot.setCursor(c13); bclr.setCursor(c13); bdel.setCursor(c13); beq.setCursor(c13);

        b7.setBounds(40, 100, 50, 40);
        Font f1 = new Font("Comic Sans MS",Font.BOLD,14);
        b7.setFont(f1);
        add(b7);
        b8.setBounds(90, 100, 50, 40);
        Font f2 = new Font("Comic Sans MS",Font.BOLD,14);
        b8.setFont(f2);
        add(b8);
        b9.setBounds(140, 100, 50, 40);
        Font f3 = new Font("Comic Sans MS",Font.BOLD,14);
        b9.setFont(f3);
        add(b9);
        bdiv.setBounds(190, 100, 50, 40);
        Font f4 = new Font("Comic Sans MS",Font.BOLD,14);
        bdiv.setFont(f4);
        bdiv.setBackground(Color.CYAN);
        add(bdiv);

        b4.setBounds(40, 140, 50, 40);
        Font f5 = new Font("Comic Sans MS",Font.BOLD,14);
        b4.setFont(f5);
        add(b4);
        b5.setBounds(90, 140, 50, 40);
        Font f6 = new Font("Comic Sans MS",Font.BOLD,14);
        b5.setFont(f6);
        add(b5);
        b6.setBounds(140, 140, 50, 40);
        Font f7 = new Font("Comic Sans MS",Font.BOLD,14);
        b6.setFont(f7);
        add(b6);
        bmul.setBounds(190, 140, 50, 40);
        Font f8 = new Font("Comic Sans MS",Font.BOLD,14);
        bmul.setFont(f8);
        bmul.setBackground(Color.CYAN);
        add(bmul);

        b1.setBounds(40, 180, 50, 40);
        Font f9 = new Font("Comic Sans MS",Font.BOLD,14);
        b1.setFont(f9);
        add(b1);
        b2.setBounds(90, 180, 50, 40);
        Font f10 = new Font("Comic Sans MS",Font.BOLD,14);
        b2.setFont(f10);
        add(b2);
        b3.setBounds(140, 180, 50, 40);
        Font f11 = new Font("Comic Sans MS",Font.BOLD,14);
        b3.setFont(f11);
        add(b3);
        bsub.setBounds(190, 180, 50, 40);
        Font f12 = new Font("Comic Sans MS",Font.BOLD,14);
        bsub.setFont(f12);
        bsub.setBackground(Color.CYAN);
        add(bsub);

        bdot.setBounds(40, 220, 50, 40);
        Font f13 = new Font("Comic Sans MS",Font.BOLD,14);
        bdot.setFont(f13);
        add(bdot);
        b0.setBounds(90, 220, 50, 40);
        Font f14 = new Font("Comic Sans MS",Font.BOLD,14);
        b0.setFont(f14);
        add(b0);
        beq.setBounds(140, 220, 50, 40);
        Font f15 = new Font("Comic Sans MS",Font.BOLD,14);
        beq.setFont(f15);
        add(beq);
        badd.setBounds(190, 220, 50, 40);
        Font f16 = new Font("Comic Sans MS",Font.BOLD,14);
        badd.setFont(f16);
        badd.setBackground(Color.CYAN);
        add(badd);

        bdel.setBounds(40, 260, 100, 40);
        Font f17 = new Font("Comic Sans MS",Font.BOLD,14);
        bdel.setFont(f17);
        add(bdel);
        bclr.setBounds(140, 260, 100, 40);
        Font f18 = new Font("Comic Sans MS",Font.BOLD,14);
        bclr.setFont(f18);
        add(bclr);

        b1.addActionListener(new button());
        b2.addActionListener(new button());
        b3.addActionListener(new button());
        b4.addActionListener(new button());
        b5.addActionListener(new button());
        b6.addActionListener(new button());
        b7.addActionListener(new button());
        b8.addActionListener(new button());
        b9.addActionListener(new button());
        b0.addActionListener(new button());
        badd.addActionListener(new button());
        bsub.addActionListener(new button());
        bmul.addActionListener(new button());
        bdiv.addActionListener(new button());
        bdot.addActionListener(new button());
        bclr.addActionListener(new button());
        bdel.addActionListener(new button());
        beq.addActionListener(new button ());

    }

    public static void main(String[]args){
        Calculator43 f = new Calculator43("Calculator, Made by Preeti");
        f.setVisible(true);
        f.setDefaultCloseOperation(Calculator43.EXIT_ON_CLOSE);
        f.setBounds(50, 50, 330, 380);
        f.component();
    }


    class button implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            if (e1.getSource() == b1) {
                t1.setText(t1.getText().concat("1"));
            }
            if(e1.getSource() == b2) {
                t1.setText(t1.getText().concat("2"));
            }
            if (e1.getSource() == b3) {
                t1.setText(t1.getText().concat("3"));
            }
            if (e1.getSource() == b4) {
                t1.setText(t1.getText().concat("4"));
            }
            if (e1.getSource() == b5) {
                t1.setText(t1.getText().concat("5"));
            }
            if (e1.getSource() == b6) {
                t1.setText(t1.getText().concat("6"));
            }
            if (e1.getSource() == b7) {
                t1.setText(t1.getText().concat("7"));
            }
            if (e1.getSource() == b8) {
                t1.setText(t1.getText().concat("8"));
            }
            if (e1.getSource() == b9) {
                t1.setText(t1.getText().concat("9"));
            }
            if (e1.getSource() == b0) {
                t1.setText(t1.getText().concat("0"));
            }
            if (e1.getSource() == bdot) {
                t1.setText(t1.getText().concat("."));
            }
            if (e1.getSource() == bdel) {
                String str = t1.getText();   // jo text field me likha hai use le lo
                if (str.length() > 0) {      // agar text empty nahi hai
                    t1.setText(str.substring(0, str.length() - 1));
                    // 0 se lekar (last-1) tak ka text rakho
                }
            }
            if (e1.getSource() == bclr) {
                t1.setText("");
            }
            if (e1.getSource() == badd) {
                a = Double.parseDouble(t1.getText());
                code = 1;
                t1.setText("");
            }
            if (e1.getSource() == bmul) {
                a = Double.parseDouble(t1.getText());
                code = 2;
                t1.setText("");
            }
            if (e1.getSource() == bsub) {
                a = Double.parseDouble(t1.getText());
                code = 3;
                t1.setText("");
            }
            if (e1.getSource() == bdiv) {
                a = Double.parseDouble(t1.getText());
                code = 4;
                t1.setText("");
            }
            if (e1.getSource() == beq) {
                b = Double.parseDouble(t1.getText());
                switch(code){
                    case 1 : result = a + b; break;
                    case 2 : result = a * b; break;
                    case 3 : result = a - b; break;
                    case 4 : result = a / b; break;
                }
                t1.setText("" + result);
            }
        }
    }
}
