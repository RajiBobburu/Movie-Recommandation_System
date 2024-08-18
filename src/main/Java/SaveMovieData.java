import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/movie")
public class SaveMovieData extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException{
		String name=req.getParameter("n");
		String language=req.getParameter("l");
		String hero=req.getParameter("h");
		String type=req.getParameter("t");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_01?user=root&password=root");
			String sql="INSERT INTO moviedata(name,language,hero,type) values(? ,? ,? ,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,language);
			ps.setString(3,hero);
			ps.setString(4,type);
			ps.execute();
			con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	
}
