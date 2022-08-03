package book.ch1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
// 서블릿 매핑 /dept/dept.ds -> 리다이렉트 해서 jsp로 가게해보는, 포워드도!
public class DeptServlet extends HttpServlet {
	Logger logger = Logger.getLogger(DeptServlet.class);

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) // 파라미터들 지변이다.
			throws ServletException, IOException {
		// 페이지 이동이 일어나면 해당 부분이 경유되었다는 확인을 할 수가 없다.
		// 눈에 보이지 않는 코드가 된다.
		// 그래서 불편하다.
		
		logger.info("doGet 호출 성공!");
		String s_name = "이순신"; //deptList로 보낼 이름
		req.setAttribute("s_name", s_name); //이름이 유지 요청 될 것인가? 밑에 dept는 jsp이니까.
		List<DeptVO> list = new ArrayList<>();
		DeptVO dvo = new DeptVO();
		dvo.setDeptno(10);
		dvo.setDname("개발부");
		dvo.setLoc("인천");
		list.add(dvo);
		req.setAttribute("list",list);
		
		//res.sendRedirect("./deptList.jsp"); 
		//페이지 이동이 일어날 것이다. /dept/dept.ds -> 페이지가 리다이렉트되고 deptList.jsp로 이동, null출력
		//이것은 기존의 요청이 끊어지고 새로운 요청으로 다시 페이지를 출력하는 것이다.
		//결론적으로 서버는 요청이 유지되지 않았다 라고 판정
		// 반대로 forward는 페이지를 이동요청하면 주소url은 그대로 있는데 응답페이지는 dpet/deptList.jsp가 출력되는
		//서버 입장에서 사용자의 요청이 아직 계속 유지되고 있는 것으로 판단하는 것이다.
		
		 RequestDispatcher view = req.getRequestDispatcher("./deptList.jsp"); 
		 view.forward(req, res); // req,res jsp로 넘겨주지만 deptServlet의 내용을 가져가서 deptList.jsp처럼 바뀌진 않음.
		 // 위와 똑같이 입력을 해도 도메인 페이지 이동이 일어나지 않고 jsp로 이동이 되어 deptList의 이순신 내용만 들어감. 
		 
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		logger.info("doGet 호출 성공!");
	}

}
