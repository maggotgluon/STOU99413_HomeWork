package Main;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame {

    public JButton btn;
    public JComboBox combo;
    public JTextField txtF;
    public JRadioButton optionA, optionB;
    public String[] comboOpt = {"option1", "option2", "option3", "option4", "option5", "option6"};
    public ButtonGroup btnG = new ButtonGroup();
    public static String combo_t, txtF_t, option_t;

    public main(){
        Container c = this.getContentPane();

        JPanel panel = new JPanel(new GridLayout(7,1));
        JPanel groupPanel = new JPanel( new GridLayout(0,2));
        JLabel txtLab = new JLabel("label");

        optionA = new JRadioButton("radio optionA");
        optionB = new JRadioButton("radio optionB");
        txtF = new JTextField("");
        combo = new JComboBox(new DefaultComboBoxModel(comboOpt));
        btn = new JButton("button");

        c.add(panel);

        panel.add(txtLab);
        panel.add(txtF);
        panel.add(groupPanel);
            btnG.add(optionA);
            btnG.add(optionB);
                groupPanel.add(optionA);
                groupPanel.add(optionB);
        panel.add(combo);
        panel.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputData();
            }
        });
    }

    public void outputData(){
        combo_t = combo.getSelectedItem().toString();
        txtF_t = txtF.getText();

        if(optionA.isSelected()){
            option_t = optionA.getText();
        }else{
            option_t = optionB.getText();
        }
        output op = new output();
        op.setSize(400,400);
        op.setVisible(true);
        setVisible(false);
    }

    public static void main(String[] args) {
        main m = new main();
        m.setSize(400,400);
        m.setTitle("main windows");
        m.setVisible(true);
        m.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}