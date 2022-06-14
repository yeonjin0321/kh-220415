package ajdbc.crud2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ajdbc.crud.DeptDao;
import ajdbc.crud.DeptView;
import oracle.vo.DeptVO;

public class Dept2Controller {
	DeptVO gdVO = null;
	private final String _DEL = "delete";
	private final String _INS = "insert";
	private final String _UPD = "update";
	private final String _SEL = "select";
	Dept2Dao deptDao = null;
	Dept2View deptView = null;
	public Dept2Controller() {}
	public Dept2Controller(Dept2View deptView) {
		this.deptView = deptView;
		deptDao = new Dept2Dao(deptView);
		System.out.println("Dept2Controller(DeptView deptView) 생성자 호출");
	}
	public Dept2Controller(DeptVO pdVO) {
		this.gdVO = pdVO;
		System.out.println("Dept2Controller(DeptVO pdVO) 생성자 호출");		
	}
	public DeptVO send(DeptVO pdVO) {
		DeptVO rdVO = new DeptVO();
		// delete | insert | update | select
		String command = pdVO.getCommand();
		int result = 0;
		// 너 삭제할거야?
		if(_DEL.equals(command)) {
			if(result == 1) rdVO.setResult(result);		
			System.out.println("너 삭제할거야?");
		}
		// 부서 정보 등록할거니?
		else if(_INS.equals(command)) {
			if(result == 1) rdVO.setResult(result);	
			System.out.println("부서 정보 등록할거니?");			
		}
		// 부서 정보 수정 누른거야?
		else if(_UPD.equals(command)) {
			result = deptDao.deptUpdate(pdVO);
			System.out.println("부서 정보 수정 누른거야?");			
		}
		// 부서 정보 상세보기 원해?
		else if(_SEL.equals(command)) {
			rdVO = deptDao.deptSelectDetail(pdVO.getDeptno());
			
			System.out.println("부서 정보 상세보기 원해?");			
		}
		return rdVO;
	}
	public List<Map<String,Object>> deptSelectAll(){
		System.out.println("Dept2Controller deptSelectAll() 호출 성공");			
		List<Map<String,Object>> deptList = new ArrayList<>();
		deptList = deptDao.deptSelectAll();
		
		return deptList;
	}
}