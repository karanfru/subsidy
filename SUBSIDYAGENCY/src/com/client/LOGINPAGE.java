package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.shared.UserLogin;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextBox;

public class LOGINPAGE extends Composite {

	private static LOGINPAGEUiBinder uiBinder = GWT.create(LOGINPAGEUiBinder.class);
GreetingServiceAsync z2=GWT.create(GreetingService.class);
	interface LOGINPAGEUiBinder extends UiBinder<Widget, LOGINPAGE> {
	}

	public LOGINPAGE() {
		initWidget(uiBinder.createAndBindUi(this));

	
	b1.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
		RootPanel.get().clear();
		UserLogin z3=new UserLogin();
		z3.setUname(a1.getText());
		z3.setPass(a2.getText());
		
		z2.check(z3, new AsyncCallback<UserLogin>() {

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				Window.alert("Wrong1");
			}

			@Override
			public void onSuccess(UserLogin result) {
				// TODO Auto-generated method stub
				
				if(result.authenticate.equals("VERIFY ")) {
					
					{
					loginin l1=new loginin();
					RootPanel.get().add(l1);
				}
					}
				else
					Window.alert("wrong");
				
			
				
			}
		});
			
			

		}
	});
}
	
	
	
	@UiField
	MaterialButton b1;
	
	@UiField
	MaterialTextBox a1,a2;

	
}
