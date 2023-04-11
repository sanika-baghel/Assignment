package programs;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String a, b;
		a = request.getParameter("t1");
		b = request.getParameter("t2");
		Connection cn;
		Statement st;
		ResultSet rs;
		String s;
		try {
			Class.forName("sun.jdbc.odbc.jdbcodbcdriver");
		} catch (ClassNotFoundException e) {
			out.println(e);
		}
		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
			st = cn.createStatement();
			s = "select*from login where uname='" + a + "'ans upass='" + b + "'";
			rs = st.executeQuery(s);
			if (rs.next()) {
				out.println("<h1> welcome user </h1>");
			} else {
				out.println("<h1> Invalid user </h1>");
			}
			cn.close();
			st.close();
		} catch (Exception e) {
			out.println(e);
		}
	}
}