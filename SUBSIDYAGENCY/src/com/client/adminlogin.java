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
import com.shared.AdminLog;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextBox;

public class adminlogin extends Composite {

	private static adminloginUiBinder uiBinder = GWT.create(adminloginUiBinder.class);
GreetingServiceAsync z1=GWT.create(GreetingService.class) ;

	interface adminloginUiBinder extends UiBinder<Widget, adminlogin> {
	}

	public adminlogin() {
		initWidget(uiBinder.createAndBindUi(this));
	q1.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
		RootPanel.get().clear();
		AdminLog z2=new AdminLog();
		z2.setUname(a1.getText());
		z2.setPass(a2.getText());
		
		z1.check(z2, new AsyncCallback<AdminLog>() {
			
			@Override
			public void onSuccess(AdminLog result) {
				// TODO Auto-generated method stub
				
				if(result.authenticate.equals("VERIFY ")) {
					admin a1=new admin();
					RootPanel.get().add(a1);
				}
				else
					Window.alert("WRONG ID OR PASSWORD");
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				Window.alert("WRONG");
				
			}
		});

		}
	});	
		
	}
	@UiField
	MaterialButton q1;
	
		@UiField
		MaterialTextBox a1,a2;
		
	
}
