package swing.template;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableSample_1 implements ActionListener {
	// 윈도우 운영체제에서 창을 생성하기.
	JFrame jf = new JFrame();
	// 테이블의 헤더를 구성할 떄 사용할 1차 배열 선언
	String cols[] = { "HTML", "자바", "총점" };
	// 제이테이블은 테이블 양식만 제공할 뿐, 실제 데이터를 담는 클래스는 디폴트테이블모델이다.
	// 실제로 데이터를 가지고 있는 것은 2차 배열이다.
	String data[][] = new String[1][3];
	DefaultTableModel dtm = new DefaultTableModel(data, cols);
	// 나는 양식일뿐 데이터를 갖고 있지 않음.
	JTable jtb = new JTable(dtm);
	JScrollPane jsp = new JScrollPane(jtb, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//속지를 그리는데 사용된다. - 이속지에 처리버튼과 종료버튼을 추가해 보자.
	JPanel jp_north = new JPanel();
	JButton jbtn_account = new JButton("샘플 점수 추가");
	JButton jbtn_exit = new JButton("종료");

	public void initDisplay() {
		jbtn_account.addActionListener(this);

		jp_north.setBackground(Color.orange);
		jp_north.add(jbtn_account);
		
		jp_north.add(jbtn_exit);
		jf.add("North", jp_north);
		jf.add("Center", jsp);
		jf.setSize(500, 400);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		JTableSample_1 jtb = new JTableSample_1();
		jtb.initDisplay();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == jbtn_account) {
			String html = (String) dtm.getValueAt(0, 0);
			String java = (String) dtm.getValueAt(0, 1);
			int hap = Integer.parseInt(html) + Integer.parseInt(java);

			System.out.println("html 점수" + html);
			dtm.setValueAt(hap, 0, 2);
		}
	}
}
