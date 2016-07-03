package FormDataBase;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MenuForm extends JFrame implements ActionListener {
	JButton addApButton, addComButton;

	public MenuForm() {
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(9, 1));
		// �Ƿ�� 1
		JLabel logoLabel1 = new JLabel("�к��Ѵ��â����ž�鹰ҹ",
				SwingConstants.CENTER);
		logoLabel1.setForeground(Color.blue);
		logoLabel1.setFont(new Font("TimesRoman", Font.ITALIC | Font.BOLD, 20));
		c.add(logoLabel1);
		// ���Ƿ�� 1

		// �Ƿ�� 2
		JPanel L1 = new JPanel();
		addApButton = new JButton("�����ż����Ѥ� (APPLICANT)");
		L1.add(addApButton);
		c.add(L1);
		// ���Ƿ�� 2

		// �Ƿ�� 3
		JPanel L2 = new JPanel();
		addComButton = new JButton("�����ź���ѷ����յ��˹���ҧ (COMPANY)");
		addComButton.addActionListener(this);
		L2.add(addComButton);
		c.add(L2);
		// ���Ƿ�� 3

	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == addComButton)
		{
			FormCompany addComWindow = 
					new FormCompany();
			addComWindow.setSize(650,550);
			addComWindow.setTitle("�����ź���ѷ����յ��˹���ҧ");
			//addComWindow.setDefaultCloseOperation(3);
			addComWindow.setVisible(true);
		}
	}
}
