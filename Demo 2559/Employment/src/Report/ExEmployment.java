package Report;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class ExEmployment extends javax.swing.JFrame{
	
	JButton ReApButton,ExEmpButton, closeButton;
	JLabel jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7;
	public ExEmployment(MenuReport menuReport) {
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(9,1));
		//JPanel centerPanel = new JPanel(new GridLayout(4,2));
		//JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel L1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel L2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel L8 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
		
		// create logo
				Font defaultFont = c.getFont(); // get font so can restore
				JLabel logoLabel1 = new JLabel(" ",SwingConstants.CENTER);
				logoLabel1.setForeground(Color.red);
				logoLabel1.setFont(new Font("TimesRoman", Font.ITALIC,22));
				logoLabel1.setText("��������� SQL : �ó��֡�Ҹ�áԨ���˹�ҨѴ�ҧҹ");
				c.add(logoLabel1); // add logo to the Frame
				jLabel1.setText("  1.����ʴ������ŷ������ͧ����ѷ����յ��˹���ҧ�ء��¡��  �����§�ӴѺ����Ţ���ʢͧ����ѷ �ҡ �ҡ仹���");
				jLabel2.setText("  2.����ʴ��Ţ���ʵ��˹�, ���͵��˹觷���Դ�Ѻ, �Թ��͹, �ӹǹ�ѵ����ҧ����Դ�Ѻ �������������Ҩ�ҧ �����§�ӴѺ����Թ��͹�ҡ�ҡ仹���");
				jLabel3.setText("  3.����ʴ��Ţ����, ����-ʡ��, �� ����Ԫ��͡�ͧ�����Ѥ� �����ͼ����Ѥâ�鹵鹴��µ���ѡ�� � A � ���� �յ���ѡ�� � y � ��ҡ�㹪��ͼ����Ѥ�㹵��˹�㴡���");
				jLabel4.setText("  4.����ʴ����ͨѧ��Ѵ������ѷ�������, �Ţ���ʺ���ѷ ��Ъ��ͺ���ѷ �����������������͡��ا෾� �����§�ӴѺ������ͺ���ѷ �ҡ A-Z");
				jLabel5.setText("  5.����ʴ�����Թ��͹�٧�ش, ����Թ��͹����ش,����Թ��͹����� ��Шӹǹ�ͧ���͵��˹觷���Դ�Ѻ������");
				c.add(jLabel1);
				c.add(jLabel2);
				c.add(jLabel3);
				c.add(jLabel4);
				c.add(jLabel5);
	}
}
				