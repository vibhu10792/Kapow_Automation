
import java.sql.*; 
class Generic {
	public static CharSequence Get_OTP(){  
		
		String Fetch_OTP = null;
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://build1.apps.use1a.aws.talk.to:3306/zeusdb","root","");   
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery(" SELECT * FROM `otps` WHERE `profile_id` = '14176' and `is_used` = '0'");  
		while(rs.next())
		Fetch_OTP=rs.getString(2);
		System.out.println(Fetch_OTP);
		//System.out.println(rs.getInt(2));
		con.close();  
		}catch(Exception e){ System.out.println(e);}
		return Fetch_OTP;
		
		}


}
