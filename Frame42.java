import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Frame42 extends JFrame {
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JButton b1;
    JButton b2;
    JButton b3;
    JTextField t1;
    JPasswordField t2;
    Frame42(String s){
        super(s);
    }
    Frame42(){

    }
    public void setComponent(){
        l1 = new JLabel("Welcome to Preeti world");
        l2 = new JLabel("UserName");
        l3 = new JLabel("Password");
        l4 = new JLabel();
        b1 = new JButton("Login");
        b2 = new JButton("Clear");
        b3 = new JButton("AutoFill");
        t1 = new JTextField();
        t2 = new JPasswordField();
        setLayout(null);
        l1.setBounds(100,100,400,40);
        l2.setBounds(100,150,200,40);
        l3.setBounds(100,200,200,40);
        l4.setBounds(100,400,200,40);
        b1.setBounds(100,300,100,40);
        b2.setBounds(200,300,100,40);
        b3.setBounds(300,300,100,40);
        t1.setBounds(250,150,200,40);
        t2.setBounds(250,200,200,40);
        add(l1); add(l2); add(l3); add(l4); add(b1); add(b2); add(b3); add(t1); add(t2);
        b1.addActionListener(new Login());
        b2.addActionListener(new Clear());
        b3.addActionListener(new autofill());

        l1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        l2.setFont(new Font("DialogInput", Font.BOLD, 14));
        l3.setFont(new Font("DialogInput", Font.BOLD, 14));
        l4.setFont(new Font("Monospaced", Font.BOLD, 15));
        b1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        b2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        b3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));

        // 🔹 Set Background Black
        getContentPane().setBackground(Color.BLACK);

        // 🔹 Labels aur buttons ka text white kar diya taaki dikhai de
        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);
        l4.setForeground(Color.WHITE);
    }

    public static void main(String[]args){
        Frame42 f1 = new Frame42("Welcome in my World");
        f1.setVisible(true);
        f1.setSize(600,600);
        f1.setDefaultCloseOperation(Frame42.EXIT_ON_CLOSE);
        f1.setComponent();
    }

    class Login implements ActionListener {
        public void actionPerformed(ActionEvent A){
            String s1 = t1.getText();
            String s2 = t2.getText();
            if(s1.equals("Preeti") && s2.equals("Khatri")){
                l4.setText("Login Successful...");
                b1.setBackground(Color.GREEN);
            }
            else{
                l4.setText("Login UnSuccessful...");
                b1.setBackground(Color.RED);
            }
        }
    }

    class Clear implements ActionListener {
        public void actionPerformed(ActionEvent A1){
            t1.setText("");
            t2.setText("");
        }
    }
    class autofill implements ActionListener {
        public void actionPerformed(ActionEvent A1){
            t1.setText("Preeti");
            t2.setText("Khatri");
        }
    }
}
