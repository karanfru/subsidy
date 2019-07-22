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
import com.shared.addscheme;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextArea;

public class editscheme extends Composite {

	private static editschemeUiBinder uiBinder = GWT.create(editschemeUiBinder.class);
GreetingServiceAsync z1=GWT.create(GreetingService.class);
	interface editschemeUiBinder extends UiBinder<Widget, editscheme> {
	}

	public editscheme() {
		initWidget(uiBinder.createAndBindUi(this));
		
		b1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
			RootPanel.get().clear();
			addscheme c1=new addscheme();
			c1.setName(a1.getText());
			c1.setContent(a2.getText());
			z1.check(c1, new AsyncCallback<addscheme>() {

				@Override
				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
					Window.alert("Wrong1");
				}

				@Override
				public void onSuccess(addscheme result) {
					// TODO Auto-generated method stub
					if(result.authenticate.equals("VERIFY ")) {
						Window.alert("scheme is added");
						admin q1=new admin();
						RootPanel.get().add(q1);
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
MaterialTextArea a1,a2;

}
