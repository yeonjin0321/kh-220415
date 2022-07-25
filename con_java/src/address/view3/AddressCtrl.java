package address.view3;

import java.util.List;
import java.util.Map;

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

	public AddressVO send(AddressVO vo) {
		String command = vo.getCommand(); //커맨드에 얻어오기

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
			System.out.println("컨트롤 계층 - 상세보기 호출성공");
			RetrieveAddrEty selEty = new RetrieveAddrEty();
			returnVO = selEty.retrieve(vo);
		} 
		

		return returnVO;
	}

	public AddressVO[] send() {
		System.out.println("AddressCtrl send 호출 성공");
		AddressVO[] returnVOs = null;
		RetrieveAddrEty retEty = new RetrieveAddrEty();
		returnVOs = retEty.retrieve();			
		return returnVOs;
	}
	
	//해시맵으로 받아와야 하기 떄문에 바꿔줌. 	<select id="retrieveAll" resultType="java.util.HashMap">
	public List<Map<String,Object>> myBatissend() {
		System.out.println("AddressCtrl send 호출 성공");
		List<Map<String,Object>> addressList = null;
		RetrieveAddrEty retEty = new RetrieveAddrEty();
		addressList = retEty.myBatisRetrieve();			
		return addressList;
	}
	
	
}
	
