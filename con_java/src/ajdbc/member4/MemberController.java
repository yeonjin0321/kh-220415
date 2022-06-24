package ajdbc.member4;

import com.method.MemberVO;

import ajdbc.member4.LoginDao;
import ajdbc.member4.Member4VO;



public class MemberController {
	public final String _LOGIN 		= "login";
	public final String _SIGNUP 	= "membership";
	public final String _IDCHECK 	= "idcheck";
	Member4VO mVO = null;
	public MemberController(){
	}
	public MemberController(Member4VO mVO){
		this.mVO = mVO;
	}
	public void action() {
		String command = mVO.getCommand();
		//LoginDao 생성하기
		if(_LOGIN.equals(command)) {
			LoginDao loginDao = new LoginDao();
			String mem_name = null;
			mem_name = loginDao.login("사용자가 입력한 아이디","사용자가 입력한 비번");
		}else if(_SIGNUP.equals(command)) {
			System.out.println("MemberController - 회원가입 호출 성공");
			MemberDao memDao = new MemberDao();
			int result = 0;
			result = memDao.memberInsert(mVO);
		}else if(_IDCHECK.equals(command)) {
			LoginDao loginDao = new LoginDao();
			boolean isOk = loginDao.isCheck("사용자가 입력한 아이디값");
		}
	}
}