package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    JMenu jMenu;
    JMenuBar jMenuBar;
    JMenuItem jMenuItem;

    public Frame(Panel panel) {
        jMenu = new JMenu("1321");
        jMenuBar = new JMenuBar();
        jMenuItem = new JMenuItem("Shape");
        jMenuBar.add(jMenu);
        jMenu.add(jMenuItem);
        setJMenuBar(jMenuBar);
        jMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(panel);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
