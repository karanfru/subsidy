package com.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.shared.AdminLog;
import com.shared.Emp;
import com.shared.List;
import com.shared.Req;
import com.shared.UserLogin;
import com.shared.addscheme;
import com.shared.register;


/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	AdminLog check(AdminLog n) throws IllegalArgumentException;
	UserLogin check(UserLogin m)throws IllegalArgumentException;
	register check(register p)throws IllegalArgumentException;
	addscheme check(addscheme w)throws IllegalArgumentException;
//  Emp check(Emp n) throws IllegalArgumentException;
	List showlist()throws IllegalArgumentException;
	Req check(Req b)throws IllegalArgumentException;
	
}
