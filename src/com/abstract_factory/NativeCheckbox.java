package com.abstract_factory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NativeCheckbox implements Checkbox {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JCheckBox checkbox;

    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onCheck();
        panel.add(checkbox);

        frame.setSize(320, 200);
        frame.setVisible(true);
        onCheck();
    }

    @Override
    public void onCheck() {
        checkbox = new JCheckBox("Check");
        checkbox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }
}
