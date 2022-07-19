package address.view4;

public class AddressCtrl {

	private AddressVO returnVO = new AddressVO();
	private AddressVO inVO = new AddressVO();

	private static String _DEL = "delete";
	private static String _INS = "insert";
	private static String _MOD = "update";
	private static String _SEL = "select";
	private static String _ALL = "selectall";
	
	

	public AddressCtrl() {
	}
	
	public AddressCtrl(AddressVO vo) {
		this.inVO = vo;
	}

	public AddressVO send(AddressVO vo) throws Exception {
		String command = vo.getCommand();

		if (command.equals(_DEL)) {
			DeleteAddrEty delEty = new DeleteAddrEty();
			returnVO = delEty.delete(vo);
		} else if (command.equals(_INS)) {
			RegisterAddrEty insEty = new RegisterAddrEty();
			returnVO = insEty.register(vo);
			//insEty.insertAddress(vo);
		} else if (command.equals(_MOD)) {
			ModifyAddrEty modEty = new ModifyAddrEty();
			returnVO = modEty.modify(vo);
		} else if (command.equals(_SEL)) {
			RetrieveAddrEty selEty = new RetrieveAddrEty();
			returnVO = selEty.retrieve(vo);
		} else
			throw new Exception("잘못된 Command명(" + command + ")입니다.");

		return returnVO;
	}

	public AddressVO[] send() {
		
		System.out.println("AddressCtrl send 호출 성공");
		
		String command = inVO.getCommand();
		System.out.println("command ===> " + command);
		AddressVO[] returnVOs = null;
		if (command.equals(_ALL)) {
			RetrieveAddrEty retEty = new RetrieveAddrEty();
			returnVOs = retEty.retrieve();			
		}
		return returnVOs;
	}

	public AddressVO getReturnVO() {
		return returnVO;
	}

	public void setReturnVO(AddressVO returnVO) {
		this.returnVO = returnVO;
	}

	public AddressVO getInVO() {
		return inVO;
	}

	public void setInVO(AddressVO inVO) {
		this.inVO = inVO;
	}

	public static String get_DEL() {
		return _DEL;
	}

	public static void set_DEL(String _DEL) {
		AddressCtrl._DEL = _DEL;
	}

	public static String get_INS() {
		return _INS;
	}

	public static void set_INS(String _INS) {
		AddressCtrl._INS = _INS;
	}

	public static String get_MOD() {
		return _MOD;
	}

	public static void set_MOD(String _MOD) {
		AddressCtrl._MOD = _MOD;
	}

	public static String get_SEL() {
		return _SEL;
	}

	public static void set_SEL(String _SEL) {
		AddressCtrl._SEL = _SEL;
	}

	public static String get_ALL() {
		return _ALL;
	}

	public static void set_ALL(String _ALL) {
		AddressCtrl._ALL = _ALL;
	}
	
}
	
