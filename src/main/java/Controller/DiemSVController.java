package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LopHP_SVDao;
import Model.LopHPSV;

/**
 * Servlet implementation class DiemSVController
 */
@WebServlet("/showDSDiemHP")
public class DiemSVController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiemSVController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String malop = request.getParameter("malop");
//		int Page = Integer.parseInt(request.getParameter("page"));
		LopHP_SVDao lopHPSV = new LopHP_SVDao();
		List<LopHPSV> list = lopHPSV.getALL(malop);
//		List<LopHPSV> li = new ArrayList<>();
//		int slpt = list.size(), slptmotpage = 10;
//		int slpage = lopHPSV.soLuongPage(slpt, slptmotpage);
//		li = lopHPSV.dSPTMotTrang(list, Page, slptmotpage);
//		request.setAttribute("slpage", slpage);
		request.setAttribute("ListHPSV", list);
		request.getRequestDispatcher("TrangLop.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
