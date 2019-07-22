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
import com.shared.register;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextBox;

public class regis extends Composite {

	private static regisUiBinder uiBinder = GWT.create(regisUiBinder.class);
GreetingServiceAsync z1=GWT.create(GreetingService.class);
	interface regisUiBinder extends UiBinder<Widget, regis> {
	}

	public regis() {
		initWidget(uiBinder.createAndBindUi(this));
		
	w1.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			RootPanel.get().clear();
			register r1=new register();
			r1.setName(a1.getText());
			r1.setAadhaar(a2.getText());
			r1.setPan(a3.getText());
			r1.setFamily(a4.getText());
			r1.setUname(a5.getText());
			r1.setPass(a6.getText());
			
			z1.check(r1,new AsyncCallback<register>() {

				@Override
				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
					Window.alert("noo");
				}

				@Override
				public void onSuccess(register result) {
					// TODO Auto-generated method stub
					if(result.authenticate.equals("VERIFY ")) {
						Window.alert("registered");
						HOME h2=new HOME();
						RootPanel.get().add(h2);
					}
					else
						Window.alert("not");
				}
			});
		}
	});
	


	}
	@UiField
	MaterialButton w1;
	
	@UiField
	MaterialTextBox a1,a2,a3,a4,a5,a6;
}
