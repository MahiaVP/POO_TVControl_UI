package Control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control_UI {
    private JPanel mainPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel vol_text;
    private JLabel chan_text;
    private JLabel inputS;
    private JComboBox<Input>comboBoxInput;

    public int vol = 0;
    public int chan = 0;


    public Control_UI() {

        comboBoxInput.setModel(new DefaultComboBoxModel<>(Input.values()));
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (vol>0){
                    vol = vol - 1;
                    vol_text.setText(String.valueOf(vol));
                }else{
                    vol_text.setText(String.valueOf(vol));
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(vol<10) {
                    vol = vol + 1;
                    vol_text.setText(String.valueOf(vol));
                }else{
                    vol_text.setText(String.valueOf(vol));
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chan>0) {
                    chan = chan - 1;
                    chan_text.setText(String.valueOf(chan));
                }else{
                    chan_text.setText(String.valueOf(chan));
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chan<10) {
                    chan = chan + 1;
                    chan_text.setText(String.valueOf(chan));
                }else{
                    chan_text.setText(String.valueOf(chan));
                }
            }
        });
        comboBoxInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Input selected = (Input)comboBoxInput.getSelectedItem();
                inputS.setText(selected.name());

                switch (selected){
                    case AV -> inputS.setForeground(Color.BLACK);
                    case HBO -> inputS.setForeground(Color.BLUE);
                    case Netflix -> inputS.setForeground(Color.CYAN);
                    case Youtube -> inputS.setForeground(Color.GREEN);
                    case RTVC -> inputS.setForeground(Color.DARK_GRAY);
                    case HDMI -> inputS.setForeground(Color.MAGENTA);
                    case WIFI -> inputS.setForeground(Color.ORANGE);
                }

            }
        });
    }
        public JPanel getMainPanel()
        {
            return mainPanel;
        }
    }



