
import javax.swing.*;

import java.awt.event.*;
import java.net.*;

//package swing;
import java.awt.*;

public class ipfinder extends JFrame implements ActionListener {
    JLabel l;
    JLabel M;
    JLabel bakgrnd;

    JTextField tf;
    JButton b;

    ipfinder() {
        super("IP Finder Tool - SAURABH");
        l = new JLabel("ENTER URL : ");
        l.setBounds(10, 20, 160, 20);
        M = new JLabel(" KINDLY REQUEST VALID IP ADDRESS");
        M.setBounds(10, 275, 400, 20);
        M.setForeground(Color.white);
        l.setForeground(Color.white);
        ImageIcon icon = new ImageIcon("E://find.png");

        //////////////////////////////////// ADD IMAGE TO THE BACKGROUND IN CONTENTPANE
        //////////////////////////////////// ////////////////////////////////////
        Container c = getContentPane();
        ImageIcon img = new ImageIcon("E://ip-address1.png");
        bakgrnd = new JLabel("", img, JLabel.CENTER);
        bakgrnd.setBounds(-40, -150, 450, 600);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        tf = new JTextField();
        tf.setBounds(10, 50, 350, 35);
        tf.setBackground(Color.DARK_GRAY);
        tf.setForeground(Color.white);
        Font me = new Font("  ", Font.BOLD, 23);
        tf.setFont(me);
        b = new JButton("FIND");
        l.setFont(me);

        b.setBounds(245, 85, 115, 35);

        Image i = icon.getImage();
        Image new_img = i.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        icon = new ImageIcon(new_img);
        JButton obj = new JButton("F", icon);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        Font m = new Font("  ", Font.BOLD, 19);
        b.setFont(m);
        b.setIcon(icon);
        b.addActionListener(this);
        M.setFont(m);
        add(M);
        add(l);
        add(tf);
        add(b);
        c.add(bakgrnd); //// contentpane me photo add k liye
        setSize(400, 340);
        setLayout(null);
        setVisible(true);
        setResizable(false);
    }

    public void actionPerformed(ActionEvent e) {
        String url = tf.getText();
        try {
            InetAddress ia = InetAddress.getByName(url);
            String ip = ia.getHostAddress();
            JOptionPane.showMessageDialog(this, ip);
        } catch (UnknownHostException e1) {
            JOptionPane.showMessageDialog(this, e1.toString());
        }
    }

    public static void main(String[] args) {
        new ipfinder();
    }
}
