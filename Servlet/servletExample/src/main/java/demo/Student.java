package demo;
	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;

	@WebServlet("/Student")
	public class Student extends HttpServlet {
		private static final long serialVersionUID = 1L;

		public Student() {
			super();
		}

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String sno = request.getParameter("sno");
			String sname = request.getParameter("sname");
			String marks = request.getParameter("marks");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stuentdetails", "root", "system");
				PreparedStatement ps = con.prepareStatement("insert into student values (?,?,?)");
				ps.setString(1, sno);
				ps.setString(2, sname);
				ps.setString(3, marks);
				int i = ps.executeUpdate();
				if (i > 0) {
					out.print("Sucessfully submitted");
				}
			} catch (Exception e) {
				System.out.print(e);
			}
		}
	}
