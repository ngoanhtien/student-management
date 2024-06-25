package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LopHP_SVDao;
import Model.LopHPSV;

/**
 * Servlet implementation class SuaHP_SVController
 */
@WebServlet("/editHP_SV")
public class SuaHP_SVController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuaHP_SVController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String malop = request.getParameter("malop");
		int masv = Integer.parseInt(request.getParameter("masv"));
		LopHP_SVDao a = new LopHP_SVDao();
		LopHPSV x = a.getByKhoaChinh(malop, masv);
		request.setAttribute("hpsv", x);
		request.getRequestDispatcher("TrangChinhSuaHPSV.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String malop = request.getParameter("maLop");
		int masv = Integer.parseInt(request.getParameter("maSV"));
		float tx1 = Float.parseFloat(request.getParameter("tx1"));
		float tx2 = Float.parseFloat(request.getParameter("tx2"));
		float tx3 = Float.parseFloat(request.getParameter("tx3"));
		float diem = Float.parseFloat(request.getParameter("diem"));
		String trangthaihoc = new String(request.getParameter("trangThaiHoc").getBytes("ISO-8859-1"),"UTF-8");
		
		LopHP_SVDao x = new LopHP_SVDao();
		LopHPSV a = new LopHPSV
					(
						malop,
						masv,
						tx1,
						tx2,
						tx3,
						diem,
						"",
						"",
						trangthaihoc
					);
		x.update(a);
		request.setAttribute("malop", malop);
		request.getRequestDispatcher("list-diem-after-edit").forward(request, response);
	}

}
