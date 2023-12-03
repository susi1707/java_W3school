package Jframe;

import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Simple GUI");
        jframe.setLayout(new FlowLayout());
        jframe.setSize(500,500);
        jframe.add(new JLabel("Hello world"));
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
}
