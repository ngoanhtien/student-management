package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LopHPDao;
import Model.LopHP;

/**
 * Servlet implementation class DanhSachLopHPController
 */
@WebServlet("/showDSHP")
public class DanhSachLopHPController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachLopHPController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LopHPDao LopHPD = new LopHPDao();
		List<LopHP> list = LopHPD.getALL();
//		String indexPage = request.getParameter("page");
//		int Page = Integer.parseInt(indexPage);
//		List<LopHP> li = new ArrayList<>();
//		int slpt = list.size(), slptmotpage = 10;
//		int slpage = LopHPD.soLuongPage(slpt, slptmotpage);
//		li = LopHPD.dSPTMotTrang(list, Page, slptmotpage);
//		request.setAttribute("slpage", slpage);
		request.setAttribute("LopHPs", list);
		request.getRequestDispatcher("TrangDanhSachHP.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
