package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class output extends JFrame{

    JLabel combo_op = new JLabel(main.combo_t);
    JLabel txtF_op = new JLabel(main.txtF_t);
    JLabel option_op = new JLabel(main.option_t);

    public output(){
        Container c = this.getContentPane();

        JPanel panel = new JPanel(new GridLayout(7,1,20,20));
        JButton btn = new JButton("close");

        c.add(panel);

        panel.add(combo_op);
        panel.add(txtF_op);
        panel.add(option_op);
        panel.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                main m = new main();
                m.setSize(400,400);
                m.setTitle("main windows");
                m.setVisible(true);
                setVisible(false);
            }
        });
    }
}
