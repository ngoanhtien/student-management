package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MonHocDao;
import Model.MonHoc;

/**
 * Servlet implementation class TimMHController
 */
@WebServlet("/searchSubject")
public class TimMHController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TimMHController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String txtSearchMonHoc = new String(request.getParameter("txtTenMonHoc").getBytes( "ISO-8859-1"),"UTF-8"); 
		MonHocDao s = new MonHocDao();
		List<MonHoc> li = s.searchByTK(txtSearchMonHoc);
		
//		Phải trùng tên thuộc tính với thuộc tính ở trong subjectshowController vì trang hiện thị chỉ dùng thuộc tính "listS" để chạy vòng lặp
//		hiện thị thông tin
		request.setAttribute("listS", li);
		request.getRequestDispatcher("TrangChuongTrinhDaoTao.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
