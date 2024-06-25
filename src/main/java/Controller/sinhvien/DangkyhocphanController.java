package Controller.sinhvien;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LopHP_SVDao;
import Model.LopHPSV;

/**
 * Servlet implementation class DangkyhocphanController
 */
@WebServlet("/dangkyhp")
public class DangkyhocphanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LopHP_SVDao hp_sv = new LopHP_SVDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DangkyhocphanController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String malop = request.getParameter("malop");
		int masv = (int)request.getSession().getAttribute("msv");
		LopHPSV x = new LopHPSV(
					malop,
					masv,
					0.0f,
					0.0f,
					0.0f,
					0.0f,
					"",
					"",
					"Đang học"
				);
		hp_sv.update(x);
		response.sendRedirect("showDSMHSDK");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
