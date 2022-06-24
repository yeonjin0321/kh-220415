package ajdbc.member2;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import address.view2.DBConnectionMgr;

public class MemberLogin extends JFrame implements ActionListener {
	/////////////////////////////////////////////////////
	/* 선언부 */
	/////////////////////////////////////////////////////
	String nickName = "";
	String imgPath = "src\\ajdbc\\dept\\";
	JLabel jlb_id = new JLabel("아이디");
	JLabel jlb_pw = new JLabel("패스워드");

	Font jl_font = new Font("휴먼매직체", Font.BOLD, 17);
	JTextField jtf_id = new JTextField("test");
	JPasswordField jpf_pw = new JPasswordField("123");
	// 로그인 버튼
	JButton jbtn_login = new JButton(new ImageIcon(imgPath + "login.png"));
	// new
	// ImageIcon("C:\\Users\\minkh\\Desktop\\practice\\dev_java\\src\\com\\Final\\image\\login.png"));
	// 회원가입 버튼
	JButton jbtn_join = new JButton(new ImageIcon(imgPath + "confirm.png"));
	// new
	// ImageIcon("C:\\Users\\minkh\\Desktop\\practice\\dev_java\\src\\com\\Final\\image\\co
	// nfirm.png"));

	// JPanel에 쓰일 이미지아이콘
	// ImageIcon ig = new
	// ImageIcon("C:\\Users\\minkh\\Desktop\\practice\\dev_java\\src\\com\\Final\\image\\main.png");
	ImageIcon ig = new ImageIcon(imgPath + "main.PNG");
	DBConnectionMgr dbMgr = new DBConnectionMgr();
	Connection con = null; // sql 폴더 밑에 살고있다. 다른거랑 연결시켜주기위해 커낵션 필요
	PreparedStatement pstmt = null; // 쿼리문 가져갈 항목임
	ResultSet rs = null; // 커서 조작시 필요하다.
	/////////////////////////////////////////////////////
	/* 생성자 */
	/////////////////////////////////////////////////////

	public MemberLogin() {
		initDisplay();
	}

	/////////////////////////////////////////////////////
	/* jpanal 오버라이드 */
	/////////////////////////////////////////////////////

	/* 배경이미지 */
	class mypanal extends JPanel {
		public void paintComponent(Graphics g) {
			g.drawImage(ig.getImage(), 0, 0, null);
			setOpaque(false);
			super.paintComponents(g);
		}
	}

	/////////////////////////////////////////////////////
	/* 화면처리 */
	/////////////////////////////////////////////////////
	public void initDisplay() {
		setContentPane(new mypanal());

		/* 버튼과 텍스트필드 구성 */
		jbtn_join.addActionListener(this);
		jbtn_login.addActionListener(this);
		this.setLayout(null);
		this.setTitle("회원관리시스템 V1.0");
		this.setSize(350, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocation(800, 250);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// id 라인
		jlb_id.setBounds(45, 200, 80, 40);
		jlb_id.setFont(jl_font);
		jtf_id.setBounds(110, 200, 185, 40);
		this.add(jlb_id);
		this.add(jtf_id);

		// pw 라인
		jlb_pw.setBounds(45, 240, 80, 40);
		jlb_pw.setFont(jl_font);
		jpf_pw.setBounds(110, 240, 185, 40);
		this.add(jlb_pw);
		this.add(jpf_pw);

		// 로그인 버튼 라인
		jbtn_login.setBounds(175, 285, 120, 40);
		this.add(jbtn_login);

		// 회원가입 버튼 라인
		jbtn_join.setBounds(45, 285, 120, 40);
		this.add(jbtn_join);
	}

	/******************************************************************************
	 * 로그인 구현
	 * 
	 * @param mem_id - 사용자가 입력한 아이디 받아오기
	 * @param mem_pw - 사용자가 입력한 비번 받아오기
	 * @return mem_name - 사용자이름 //여기 영상녹화안함 ㅠ
	 ******************************************************************************/
	public String login(String mem_id, String mem_pw) {
		String mem_name = null;
		StringBuilder sql = new StringBuilder();
		sql.append("         select                              ");
		sql.append("         mem_name                            ");
		sql.append("        from(                                   ");
		sql.append("       select                                    ");
		sql.append("       case when mem_id =:id then               ");
		sql.append("       case when mem_pw =:pw then mem_name      ");
		sql.append("           else '0'                             ");
		sql.append("       end                                       ");
		sql.append("       else '-1'                                ");
		sql.append("       end as mem_name                          ");
		sql.append("  from member                                  ");
		sql.append("  order by mem_name desc                       ");
		sql.append("  )                                            ");
		sql.append("  where rownum =1  ");

		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, mem_id);
			pstmt.setString(2, mem_pw);
			rs = pstmt.executeQuery(); // select문이라서 resultset을 반환받기위해 이거사용한다. 익스큐트
			// System.out.println(rs.next()); // 1. true - 커서가 다음으로 이동 됨
			// 조회 결과는 0이거나 1row이므로
			if (rs.next()) { // 2. false가 된다. 그래서 값이 못들어간다.
				mem_name = rs.getString("mem_name");
			}
			System.out.println("mem_name : " + mem_name);
		} catch (SQLException se) {
			System.out.println(se.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mem_name;
	}

	public static void main(String[] args) throws Exception {
		new MemberLogin();
	}

	@Override // 위치 언제 어디에서의 위치
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == jbtn_join) {
			Member2Ship ship = new Member2Ship();
			ship.initDisplay();

		} else if (obj == jbtn_login) { // 여기에 로그인이 있으므로 여기서 이벤트처리해서 확인해야한다.
			String user_id = jtf_id.getText();
			String user_pw = jpf_pw.getText(); // 줄 있는거 데프리케이트..? 향후에 지원하지 않을수도 있다는 뜻이다.
			String mem_name = null;
			mem_name = login(user_id, user_pw);
			System.out.println("로그인 요청 결과는? " + mem_name);
			if (mem_name == null) {
				JOptionPane.showMessageDialog(this, "회원가입 여부를 확인하세요");
				return;
			} else if (mem_name.length() > 2) {
				this.dispose();
				new Member2App();
			}

		}
	}
}