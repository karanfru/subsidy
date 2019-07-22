package com.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.shared.AdminLog;
import com.shared.Emp;
import com.shared.List;
import com.shared.Req;
import com.shared.UserLogin;
import com.shared.addscheme;
import com.shared.register;


/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void check(AdminLog n,AsyncCallback<AdminLog>callback)throws IllegalArgumentException;

	void check(UserLogin m,AsyncCallback<UserLogin>callback)throws IllegalArgumentException;

	void check(register p, AsyncCallback<register>callback)throws IllegalArgumentException;

	void check(addscheme c1, AsyncCallback<addscheme>callback)throws IllegalArgumentException;

	void showlist(AsyncCallback<List>callback)throws IllegalArgumentException;
	
	void check(Req b,AsyncCallback<Req>callback)throws IllegalArgumentException;


	

	

	
}
