package ajdbc.dept;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import address.view2.DBConnectionMgr;

public class EmpSumList extends JFrame implements ActionListener {
	JButton jbtn_select = new JButton("조회");
	String headers[] = { "부서명", "CLERK", "MANAGER", "ETC", "DEPT_SAL" };
	String data[][] = new String[0][5];
	DefaultTableModel dtm = new DefaultTableModel(data, headers);
	JTable jtb = new JTable(dtm);
	JScrollPane jsp = new JScrollPane(jtb);

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	DBConnectionMgr dbMgr = new DBConnectionMgr();

	public EmpSumList() {
		jbtn_select.addActionListener(this);

		initDisplay();
	}

	public List<Map<String, Object>> getEmpSumList() { //리스트와 맵 사용
		System.out.println("getEmpSumList initDisplay 호출 성공");
		List<Map<String, Object>> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		// 쿼리문 넣기

		sql.append("		    SELECT                                    ");
		sql.append("       decode(b.rno,'1',a.dname, '총계') dname         ");
		sql.append("       ,sum(cleark)clark                               ");
		sql.append("      ,sum(manager)manager                             ");
		sql.append("      ,sum(etc)etc                                     ");
		sql.append("      ,sum(dept_sal) dept_sal                          ");
		sql.append("      FROM (                                           ");
		sql.append("      SELECT dept.dname                                ");
		sql.append("     ,sum(decode(job,'CLERK',sal)) cleark              ");
		sql.append("     ,sum(decode(job,'MANAGER',sal)) manager           ");
		sql.append("     ,sum(decode(job,'CLERK',null,'MANAGER',sal)) etc  ");
		sql.append("     ,sum(sal) dept_sal                                ");
		sql.append("      FROM emp,dept                                    ");
		sql.append("      WHERE EMP.deptno = dept.deptno                   ");
		sql.append("      GROUP BY dept.dname                              ");
		sql.append("     )a,                                               ");
		sql.append("     (                                                 ");
		sql.append("            SELECT ROWNUM rno FROM dept                ");
		sql.append("            WHERE ROWNUM <3                            ");
		sql.append("     )b                                                ");
		sql.append("     GROUP BY  decode(b.rno,'1',a.dname, '총계')        ");
		sql.append("     ORDER BY  decode(b.rno,'1',a.dname, '총계')        ");

		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			Map<String, Object> ramp = null;

			while (rs.next()) {
				ramp = new HashMap<>();
				ramp.put("danme", rs.getString(1));
				ramp.put("clerk", rs.getDouble(2));
				ramp.put("manager", rs.getDouble(3));
				ramp.put("etc", rs.getDouble(4));
				ramp.put("dept_sal", rs.getDouble(5));

				list.add(ramp);

			}
			System.out.println(list);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return list;
	}

	public void initDisplay() { // ui부분
		System.out.println("initDisplay 호출 성공");
		this.add("North", jbtn_select);
		this.add("Center", jsp); // 바닥에 스크롤
		this.setSize(500, 400);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new EmpSumList(); //메인메소드 호출
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트가 감지된 컴포넌트의 주소번지
		Object obj = e.getSource();
		if (obj == jbtn_select) {
			System.out.println("조회 버튼 누른거야!");
			getEmpSumList(); // 메소드 호출

		}
	}

}
