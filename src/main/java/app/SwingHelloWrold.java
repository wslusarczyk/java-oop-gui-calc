package app;

import javax.swing.*;
import java.awt.*;

public class SwingHelloWrold {

    public static void main(String[] args) {
        JFrame frame = new JFrame("FrameDemo");
        frame.setMinimumSize(new Dimension(800, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel myLabel = new JLabel("Hello World !!!", SwingConstants.CENTER);
        myLabel.setFont(new Font("Serif", Font.BOLD, 22));
        myLabel.setBackground(Color.blue);
        myLabel.setOpaque(true);
        myLabel.setPreferredSize(new Dimension(100, 80));

        frame.getContentPane().add(myLabel, BorderLayout.NORTH);
        frame.setVisible(true);
//        frame.dispose();


        JOptionPane.showMessageDialog(frame, "Eggs are not supposed to be green.");

    }
}
