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


public class ExDetail6_10 extends javax.swing.JFrame{
	
	JButton ReApButton,ExEmpButton, closeButton;
	JLabel 	jLabel1,jLabel11,jLabel12,jLabel13,jLabel14,
			jLabel2,jLabel21,jLabel22,jLabel23,jLabel24,
			jLabel3,jLabel31,jLabel32,jLabel33,jLabel34,
			jLabel4,jLabel41,jLabel42,jLabel43,jLabel44,jLabel45,jLabel46,
			jLabel5,jLabel51,jLabel52,jLabel53,jLabel54,jLabel55,jLabel56,

			jLabel6,jLabel7;
	ReportApplicant mainMenu;
	public ExDetail6_10(ReportApplicant mainMenu) {
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(30,1));
		//JPanel centerPanel = new JPanel(new GridLayout(4,2));
		//JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel L1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel L2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel L8 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jLabel1 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		
        jLabel3 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jLabel33 = new javax.swing.JLabel();
		
		
        jLabel4 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
		jLabel42 = new javax.swing.JLabel();
		jLabel43 = new javax.swing.JLabel();
		jLabel44 = new javax.swing.JLabel();
		jLabel45 = new javax.swing.JLabel();
		jLabel46 = new javax.swing.JLabel();
		
        jLabel5 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
		jLabel52 = new javax.swing.JLabel();
		jLabel53 = new javax.swing.JLabel();
		jLabel54 = new javax.swing.JLabel();
		jLabel55 = new javax.swing.JLabel();
		jLabel56 = new javax.swing.JLabel();
		
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
		
		// create logo
				Font defaultFont = c.getFont(); // get font so can restore
				JLabel logoLabel1 = new JLabel(" ",SwingConstants.CENTER);
				logoLabel1.setForeground(Color.red);
				logoLabel1.setFont(new Font("TimesRoman", Font.ITALIC,22));
				logoLabel1.setText("��������� SQL : �ó��֡�Ҹ�áԨ���˹�ҨѴ�ҧҹ(��� 6-10)");
				c.add(logoLabel1); // add logo to the Frame
				jLabel1.setText("  6.����ʴ��Ţ���ʺ���ѷ, ���ͺ���ѷ, ���ͼ��Դ��� ��Шѧ��Ѵ������ѷ������� �ͧ����ѷ����ժ���㹵��˹觷���ͧ�繵���ѡ�� �B� ���� ����ѡ�� �S� 㹵��˹�㴡��� ���������������㹡�ا෾�");
				jLabel11.setText("    SELECT	 COMP_ID, COMP_NAME, COMP_PERSON, COMP_CHW");
				jLabel12.setText("    FROM     company");
				jLabel13.setText("    WHERE	 (COMP_NAME LIKE '_B%' OR COMP_NAME LIKE '%S%')");
				jLabel14.setText("    AND	  COMP_CHW = 'Bangkok';");
				
				jLabel2.setText("  7.����ʴ��Ԫ��͡ ��Шӹǹ�����Ѥ�������Ԫ��͡ �����§�ӴѺ����ӹǹ�����Ѥ�������Ԫ��͡�ҡ�ҡ仹���");
				jLabel21.setText("    SELECT		AP_MAJ, COUNT(AP_MAJ) As CountMajor");
				jLabel22.setText("    FROM		applicant");
				jLabel23.setText("    GROUP BY 	AP_MAJ");
				jLabel24.setText("    ORDER BY 	2 DESC;");
				
				jLabel3.setText("  8.����ʴ���ª��ͨѧ��Ѵ�������Ѥ���������� ���ʴ�੾�Шѧ��Ѵ�������Ѥ����Ȫ�� 㹡óշ��ѧ��Ѵ��ӡѹ����ʴ�����§��������");
				jLabel31.setText("    SELECT		DISTINCT  AP_CHW");
				jLabel32.setText("    FROM		applicant");
				jLabel33.setText("    WHERE		AP_SEX = 'M';");
				
				
				jLabel4.setText("  9.����ʴ��Ţ���ʵ��˹�, ���͵��˹觷���Դ�Ѻ, �Թ��͹ �������������Ҩ�ҧ������������ҵ���� 1 �բ��� ������Թ 3 ��  ����Թ��͹����� 20,000 �ҷ���������§�ӴѺ����Ţ���ʵ��˹� �ҡ������ҡ");
				jLabel41.setText("    SELECT		POS_ID, POS_NAME, POS_SALARY, POS_PERIOD");
				jLabel42.setText("    FROM		position");
				jLabel43.setText("    WHERE	    POS_PERIOD >= '1'");
				jLabel44.setText("    AND		    POS_PERIOD <= '3'");
				jLabel45.setText("    AND		    POS_SALARY >= 20000");
				jLabel46.setText("    ORDER BY 	POS_ID  ASC;;");
				
				jLabel5.setText("  10.����ʴ��Ţ���ʵ��˹���Шӹǹ�س���ѵ�੾�е��˹� ����ըӹǹ�ҡ����ش");
				jLabel51.setText("    SELECT		POS_ID, COUNT (QUAL_CODE) AS MAX_COUNT_QUAL");
				jLabel52.setText("    FROM		pos_qual");
				jLabel53.setText("    GROUP BY 	POS_ID");
				jLabel54.setText("    HAVING		COUNT (QUAL_CODE) >= ALL (SELECT COUNT (*) ");
				jLabel55.setText("    FROM pos_qual");
				jLabel56.setText("    GROUP BY POS_ID);");
				c.add(jLabel1);
				c.add(jLabel11);
				c.add(jLabel12);
				c.add(jLabel13);
				c.add(jLabel14);
				
				c.add(jLabel2);
				c.add(jLabel21);
				c.add(jLabel22);
				c.add(jLabel23);
				c.add(jLabel24);
				
				c.add(jLabel3);
				c.add(jLabel31);
				c.add(jLabel32);
				c.add(jLabel33);
				
				
				c.add(jLabel4);
				c.add(jLabel41);
				c.add(jLabel42);
				c.add(jLabel43);
				c.add(jLabel44);
				c.add(jLabel45);
				c.add(jLabel46);
				
				c.add(jLabel5);
				c.add(jLabel51);
				c.add(jLabel52);
				c.add(jLabel53);
				c.add(jLabel54);
				c.add(jLabel55);
				c.add(jLabel56);
	}
}
				
