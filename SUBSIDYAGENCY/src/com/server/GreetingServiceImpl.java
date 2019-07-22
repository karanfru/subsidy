package com.server;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.client.GreetingService;
import com.shared.AdminLog;
import com.shared.Emp;
import com.shared.FieldVerifier;
import com.shared.List;
import com.shared.Req;
import com.shared.UserLogin;
import com.shared.addscheme;
import com.shared.register;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
    GreetingService {
	Connection con=null;
	Statement st=null; 
	PreparedStatement pt=null;
	
	
	public void init() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sub", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			st = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public AdminLog check(AdminLog n) throws IllegalArgumentException {
		init();
		ResultSet rs = null;
		String userid = n.getUname();
		String password = n.getPass();
		n.setAuthenticate(" ");

		try {
			rs = st.executeQuery("select * from adminlogin where name='" + userid + "' and password='" + password + "'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (rs.next()) {
				n.setAuthenticate("VERIFY ");
			} else {
				n.setAuthenticate("NOT VERIFY");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return n;
	

	
}
	@Override
	public UserLogin check(UserLogin m) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet rs = null;
		String s1 = m.getUname();
		String s2 = m.getPass();
		m.setAuthenticate(" ");

		try {rs = st.executeQuery("select * from regis where uname='" + s1 + "' and pass='" + s2 + "'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (rs.next()) {
				m.setAuthenticate("VERIFY ");
			} else {
				m.setAuthenticate("NOT VERIFY");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.print(m.getAuthenticate());
		return m;
		
	}
	@Override
	public register check(register p) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet rs =null;
		int k=0;
		String a1=p.getName();
		String a2=p.getAadhaar();
		String a3=p.getPan();
		String a4=p.getFamily();
		String a5=p.getUname();
		String a6=p.getPass();
		
		try {
			 pt = con.prepareStatement("insert into regis(name,aadhaar,pan,family,uname,pass)values(?, ?, ?, ? , ?, ?)");
			 pt.setString(1,a1);
			 pt.setString(2,a2);
			 pt.setString(3,a3);
			 pt.setString(4,a4);
			 pt.setString(5,a5);
			 pt.setString(6,a6);
			 k=pt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			if (k!=0) {
			p.setAuthenticate("VERIFY ");
		} else {
			p.setAuthenticate("NOT VERIFY");
		}
		
		return p;
	}
	@Override
	public addscheme check(addscheme w) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet rs =null;
		int k=0;
		String a1=w.getName();
		String a2=w.getContent();
		
		try {
			 pt = con.prepareStatement("insert into editscheme values (?, ?)");
			 pt.setString(1,a1);
			 pt.setString(2,a2);
			 k=pt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			if (k!=0) {
			w.setAuthenticate("VERIFY ");
		} else {
			w.setAuthenticate("NOT VERIFY");
		}
		
		return w;
		
	}
	@Override
	public List showlist() throws IllegalArgumentException {
		init();
		int n,i=0;
		ResultSet rs=null;
		try
		{
			pt=con.prepareStatement("select * from editscheme");
			rs=pt.executeQuery();
			rs.last();
			n=rs.getRow();
			rs.beforeFirst();
			String a[][]=new String[n][2];
			while(rs.next())
			{
				a[i][0]=rs.getString(1);
				a[i][1]=rs.getString(2);
				i++;
			}
			List l=new List();
			l.setN(n);
			l.setA(a);
			return l;
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		return null;
	}
	@Override
	public Req check(Req b) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet rs =null;
		int k=0;
		String a1=b.getName();
		String a2=b.getContent();
		
		try {
			 pt = con.prepareStatement("insert into req values (?, ?)");
			 pt.setString(1,a1);
			 pt.setString(2,a2);
			 k=pt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			if (k!=0) {
			b.setAuthenticate("verify");
		} else {
			b.setAuthenticate("not");
		}
		
		return b;
		
	}
	
}