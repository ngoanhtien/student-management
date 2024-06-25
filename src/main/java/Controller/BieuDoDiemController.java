package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LopHP_SVDao;

/**
 * Servlet implementation class BieuDoDiemController
 */
@WebServlet("/bieudodiem")
public class BieuDoDiemController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BieuDoDiemController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String maLop = request.getParameter("malop");
//		List<LopHPSV> li = new LopHP_SVDao().getALL(maLop);
		List<Double> DSPTD = new LopHP_SVDao().getDSPTD(maLop);
		request.setAttribute("malop", maLop);
//		request.setAttribute("DSD", li);
		request.setAttribute("DSPTD", DSPTD);
		
		request.getRequestDispatcher("TrangBieuDoDiem.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
