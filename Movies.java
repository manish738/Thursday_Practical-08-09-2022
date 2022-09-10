import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Movies {

	public static void main(String[] args)
	{
		/* Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Movie Title");
		String M_Title=sc.next();
		System.out.println("Enter the Movies genre");
		String M_genre=sc.next();
		System.out.println("Enter the Movies yearOfRelease");
		String M_yearOfRelease=sc.next();  */

	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deeptech", "root", "manishpathak1234");
			Statement s=con.createStatement();
			
			//Note 1.drop similar table
			//s.execute("drop table Movie");
			//System.out.println("drop movie table");

			//Note 2.Create Table Movies
			//s.execute("create table Movies(id int auto_increment primary key ,title varchar(225),genre varchar(225),YearOfRelease int);");
			//System.out.println("table created");
			
			
/* PreparedStatement ps=con.prepareStatement("insert into Movies(title,genre,YearofRelease) values(?,?,?);");
			ps.setString(1, M_Title);
			ps.setString(2, M_genre);
			ps.setString(3, M_yearOfRelease);
			ps.executeUpdate();
			System.out.println("values inserted");  */
			
			//Note 4. Query update selected row by using id 
		/*	PreparedStatement ps=con.prepareStatement("update Movies set title='Kahani' where id=3");
			ps.executeUpdate();
			System.out.println("updated ...");  */
			
			//Note 5. Query delete selected row by using 'WHERE' clause
			PreparedStatement ps = con.prepareStatement("delete from Movies where id=4");
			ps.executeUpdate();
			System.out.println("Delete Successfully!!!");

ResultSet rs=s.executeQuery("select id,title,genre,YearOfRelease from Movies");
			System.out.println("id \t  title \t  genre \t  YearOfRelease ");
			System.out.println("---------------------------------------------------------------------");
			while(rs.next()) 
			{
				System.out.println(" "+rs.getString(1)+" \t "+rs.getString(2)+"  \t "+rs.getString(3)+"   \t "+rs.getString(4));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
