package WebFilter;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class KiemTraDangNhap
 */
@WebFilter("/*")
public class KiemTraDangNhap extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public KiemTraDangNhap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		HttpSession session = httpRequest.getSession(false);
		String requestURI = httpRequest.getRequestURI();
		
		// xử lý khi ở trang đăng nhập
		if(requestURI.endsWith("TrangDangNhap.jsp"))
		{
			chain.doFilter(request, response);
			return;
		}
		
		
		// xử lý khi đăng nhập thông tin
		if(requestURI.endsWith("login"))
		{
			chain.doFilter(request, response);
			return;
		}
		
		
		// kiểm tra người dùng đã đăng nhập hay chưa
		if(!(session != null && (session.getAttribute("msv") != null || session.getAttribute("tenDN") != null)))
		{
			if(requestURI.contains("BTL_QSLV_JavaNangCao/sinhvien/"))
			{
				httpResponse.sendRedirect("../TrangDangNhap.jsp");
				return;
			}
			else
			{
				httpResponse.sendRedirect("TrangDangNhap.jsp");
				return;
			}
			
		}
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
