package address.view3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteAddrEty {
	DBConnectionMgr dbMgr = new DBConnectionMgr();
	Connection con = null;
	PreparedStatement pstmt = null;

	public AddressVO delete(AddressVO vo) {
		System.out.println("DeleteAddrEty delete 호출 성공");
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM mkaddrtb WHERE id=?");
		int id = vo.getId();
		int result = 0; // 결과값 초기화
		AddressVO raVO = new AddressVO();
		try {
			con = dbMgr.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, id);
			result = pstmt.executeUpdate(); // 삭제 처리 후에 담을 수 있도록.
			raVO.setResult(result); // vo에 결과를 set을 함
		} catch (SQLException se) {
			System.out.println("[[query]]"+sql.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbMgr.freeConnection(pstmt, con);
		}
		return raVO; // 결과값을 반환.
	}

}
