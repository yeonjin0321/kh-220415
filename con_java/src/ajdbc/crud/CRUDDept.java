package ajdbc.crud;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import address.view2.DBConnectionMgr;
import oracle.vo.DeptVO;

public class CRUDDept extends JFrame implements ActionListener {
	// 선언부

	/// db연동 ///
	DBConnectionMgr dbMgr = new DBConnectionMgr();
	Connection con = null; // 연결통로
	PreparedStatement pstmt = null; // DML구문 전달하고 오라클에게 요청
	ResultSet rs = null; // 조회경우 커서를 조작 필요.
	/// db연동 ///

	// jframe의 디폴트 레이아웃은 BorderLayout
	JPanel jp_north = new JPanel();
	// 북쪽에 들어갈 버튼 4가지.
	JButton jbtn_sel = new JButton("조회");
	JButton jbtn_ins = new JButton("입력");
	JButton jbtn_upd = new JButton("수정");
	JButton jbtn_del = new JButton("삭제");

	String cols[] = { "부서번호", "부서명", "지역" };
	String data[][] = new String[0][3];
	DefaultTableModel dtm = new DefaultTableModel(data, cols);
	JTable jtb = new JTable(dtm);
	JScrollPane jsp = new JScrollPane(jtb);

	JPanel jp_south = new JPanel();// 디폴트레이아웃: FlowLayout
	JTextField jtf_deptno = new JTextField("", 10);
	JTextField jtf_dname = new JTextField("", 20);
	JTextField jtf_loc = new JTextField("", 20);

	// 생성자
	public CRUDDept() {
		jbtn_sel.addActionListener(this);
		jbtn_ins.addActionListener(this);
		jbtn_upd.addActionListener(this);
		jbtn_del.addActionListener(this);

		initDisplay();
	}

	/********************************************
	 * 부서 등록 구현
	 * 
	 * @param pdVO - 사용자가 입력한 부서번호, 부서명 , 지역을 받는다. - 복합데이터 클래스이다.
	 * @return - int -1: 등록성공 0: 등록 실패 INSERT INTO DEPT(DEPTNO,DNAME,LOC)
	 *         VALUES(71,'개발1팀','서귀포')
	 * 
	 *********************************************/
	public int deptinsert(DeptVO pdVO) { // 입력 기능 구현!
		System.out.println("부서 입력 호출 성공");
		int result = 0;
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO DEPT(DEPTNO,DNAME,LOC) VALUES(?,?,?)");

		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			int i = 0;
			pstmt.setInt(++i, pdVO.getDeptno());
			pstmt.setString(++i, pdVO.getDname());
			pstmt.setString(++i, pdVO.getLoc());
			result = pstmt.executeUpdate();
			if (result == 1) {

				deptSelectAll();
				setDeptno("");
				setDname("");
				setLoc(""); // 입력하고 나서 칸 비워지게 하는 기능
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionMgr.freeConnection(pstmt, con);
		}

		return result;
	}

	/********************************************
	 * 부서 수정 구현
	 * 
	 * @param pdVO - 사용자가 입력한 부서번호, 부서명 , 지역을 받는다. - 복합데이터 클래스이다.
	 * @return - int -1: 등록성공 0: 등록 실패
	 * 
	 *         update dept set dname = '개발2팀' ,loc ='거제도' where deptno =71
	 * 
	 *********************************************/
	public int deptUpdate(DeptVO pdVO) { // 업데이트 기능 구현!
		System.out.println("deptUpdate 호출 성공");
		int result = 0;

		return result;
	}

	/********************************************
	 * 부서 삭제 구현
	 * 
	 * @param deptno(int) - 사용자가 선택한 부서번호
	 * @return - int -1: 등록성공 0: 등록 실패
	 * 
	 *         delete from dept where deptno = 71(?)로 처리하기
	 * 
	 *********************************************/
	public int deptDelete(int deptno) { // 삭제 기능 구현!
		System.out.println(" deptDelete 호출 성공: " + deptno);
		int result = 0;
		StringBuilder sql = new StringBuilder();
		sql.append("delete from dept where deptno = ?");
		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, deptno);
			result = pstmt.executeUpdate();
			if (result == 1) {
				JOptionPane.showMessageDialog(this, "데이터가 삭제되었습니다", "INFO", JOptionPane.INFORMATION_MESSAGE);
				deptSelectAll();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionMgr.freeConnection(pstmt, con);
		}
		return result;
	}

	/******************************************
	 * 부서 목록 전체 조회 구현 새로고침시 재사용 위해서
	 * @return List<Map<String,Object>> select deptno,dname,loc from dept
	 * 
	 *******************************************/

	public List<Map<String, Object>> deptSelectAll() { // 부서 목록 전체 조회 구현
		System.out.println("deptSelectAll 호출 성공");
		List<Map<String, Object>> deptList = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT DEPTNO , DNAME, LOC FROM DEPT");

		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			Map<String, Object> ramp = null;

			while (rs.next()) {
				ramp = new HashMap<>();
				ramp.put("deptno", rs.getInt("deptno"));
				ramp.put("dname", rs.getString("dname"));
				ramp.put("loc", rs.getString("loc"));
				deptList.add(ramp);
			}
			// System.out.println(deptList);
			while (dtm.getRowCount() > 0) {
				dtm.removeRow(0); // 0이 가장 위에 올라오는것이므로 지워지게 하는것.
			}
			Iterator<Map<String, Object>> iter = deptList.iterator();
			Object keys[] = null;
			while (iter.hasNext()) {
				Map<String, Object> data = iter.next();
				keys = data.keySet().toArray();
				Vector<Object> oneRow = new Vector<>();
				oneRow.add(data.get(keys[2]));
				oneRow.add(data.get(keys[1]));
				oneRow.add(data.get(keys[0]));
				dtm.addRow(oneRow);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			DBConnectionMgr.freeConnection(rs, pstmt, con);
		}

		return deptList;
	}

	/******************************************
	 * 부서 목록 한건 조회 구현 (상세조회)
	 * 
	 * @param DEPT(INT)
	 * @return DeptVO select deptno,dname,loc from dept WHERE DEPTNO =?
	 *******************************************/

	public DeptVO deptSelectDetail(int deptno) { // 한건 조회 구현
		System.out.println(" deptSelectDetail 호출 성공");
		DeptVO rdVO = null;
		return rdVO;
	}

	// 화면처리부

	public void initDisplay() {

		System.out.println("initDisplay 호출 성공");

		jp_north.setLayout(new FlowLayout(FlowLayout.LEFT));
		jp_north.add(jbtn_sel);
		jp_north.add(jbtn_ins);
		jp_north.add(jbtn_upd);
		jp_north.add(jbtn_del);
		jp_south.add(jtf_deptno);
		jp_south.add(jtf_dname);
		jp_south.add(jtf_loc);
		this.add("North", jp_north);// 위치에 배치하는
		this.add("Center", jsp);// -> 다음에 화면에 뿌리는 이벤트 처리하기
		this.add("South", jp_south);
		this.setTitle("부서관리시스템");
		this.setSize(600, 400);
		this.setVisible(true);

	}

	// 메인 메소드
	public static void main(String[] args) {
		new CRUDDept();
	}

	@Override
	public void actionPerformed(ActionEvent e) { // 4개버튼 각각 처리해줌.
		Object obj = e.getSource(); // 너 조회버튼 누른거야?
		if (obj == jbtn_sel) {
			System.out.println("전체조회 호출 성공");
			deptSelectAll();

		}
		// 입력하고 싶니?
		else if (obj == jbtn_ins) {
			System.out.println("입력 호출 성공");

			String deptno = getDeptno();
			String dname = getDname();
			String loc = getLoc();
			// System.out.println(deptno+", "+dname+", "+loc);

			DeptVO pdVO = new DeptVO();
			pdVO.setDeptno(Integer.parseInt(deptno));
			pdVO.setDname(dname);
			pdVO.setLoc(loc);
			deptinsert(pdVO);
		}

		// 수정할거야?
		else if (obj == jbtn_upd) {
			System.out.println("수정 호출 성공");

		}
		// 삭제를 원해? -view-> action(delete)->action(select all)->view
		else if (obj == jbtn_del) {

			System.out.println("삭제 호출 성공");
			int index[] = jtb.getSelectedRows();
			if (index.length == 0) {
				JOptionPane.showMessageDialog(this, "삭제할 데이터를 선택하세요", "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			} else {
				Integer deptno = (Integer) dtm.getValueAt(index[0], 0);
				System.out.println("사용자가 선택한 부서 번호: " + deptno);
				deptDelete(deptno); // 이것이 있어야 삭제기능 구현
			}
		}
	}/////////////////// end of actionPerformed
		// 각컬럼에서 받아오는 게터세터 메소드

	public String getDeptno() {
		return jtf_deptno.getText();
	}

	public void setDeptno(String deptno) {
		jtf_deptno.setText(deptno);
	}

	public String getDname() {
		return jtf_dname.getText();
	}

	public void setDname(String dname) {
		jtf_dname.setText(dname);
	}

	public String getLoc() {
		return jtf_loc.getText();
	}

	public void setLoc(String loc) {
		jtf_loc.setText(loc);
	}
}
