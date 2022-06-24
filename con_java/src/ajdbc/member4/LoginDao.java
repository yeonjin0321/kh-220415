package ajdbc.member4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import address.view2.DBConnectionMgr;

public class LoginDao {

	////// DB연동/////

	DBConnectionMgr dbMgr = new DBConnectionMgr(); // view2에 있음.
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public String login(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
	/*************************************************************************
	 * 아이디 중복체크 구현하기
	 * 
	 * @param 사용자가 입력한 아이디
	 * @return boolean 만일 boolean을 선택했다면 false이면 사용할 수 없다. true이면 사용할 수 있다. 만일
	 *         boolean을 선택했다면 false이면 사용할 수 있다. true이면 사용할 수 없다. SELECT 1 FROM dual
	 *         WHERE EXISTS (SELECT mem_name FROM member WHERE mem_id ='tomato') 질문
	 *         1: tomato가 존재하는데 false가 뜹니다. 뭐가 문제인가요? 질문 2: java.sql.SQLException:
	 *         인덱스에서 누락된 IN 또는 OUT 매개변수:: 1 일때 ?자리에 들어갈 값을 치환하지 않은 경우 질문 3: 토드에서 사용한
	 *         변수를 그대로 사용한 경우 반드시 ?로 바꾸어 쓸 것. 질문 4:
	 *         java.sql.SQLSyntaxErrorException: ORA-00911: 문자가 부적합합니다 쿼리문 뒤에 세미콜론을
	 *         붙인 경우에 발생하는 오류 입니다.
	 *************************************************************************/
	public boolean isCheck(String user_id) {
		boolean isOk = false; // 기본설정
		StringBuilder sql = new StringBuilder();
		sql.append("	SELECT 1                                  ");
		sql.append("	  FROM dual                               ");
		sql.append("	 WHERE EXISTS (SELECT mem_name            ");
		sql.append("	                 FROM member              ");
		sql.append("	                WHERE mem_id ='tomato')   ");
		try { //예외처리해주기
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(0, user_id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				isOk = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionMgr.freeConnection(rs, pstmt, con);

		}
		return isOk;
	} //end of idCheck

}
