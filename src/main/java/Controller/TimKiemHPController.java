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
 * Servlet implementation class TimKiemHPController
 */
@WebServlet("/searchHP")
public class TimKiemHPController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TimKiemHPController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String search = new String(request.getParameter("txt").getBytes( "ISO-8859-1"),"UTF-8"); 
		LopHPDao x = new LopHPDao();
		List<LopHP> li = x.getALLByTK(search);
		if(li.size()==0)
		{
			response.sendRedirect("showDSHP");
		}
		else
		{
			request.setAttribute("LopHPs", li);
			request.getRequestDispatcher("TrangDanhSachHP.jsp").forward(request, response);
		}
	}

}
