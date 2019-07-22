package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialContainer;
import gwt.material.design.client.ui.MaterialLink;

public class admin extends Composite {

	private static adminUiBinder uiBinder = GWT.create(adminUiBinder.class);

	interface adminUiBinder extends UiBinder<Widget, admin> {
	}

	public admin() {
		initWidget(uiBinder.createAndBindUi(this));
	t2.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
		RootPanel.get().clear();
		HOME a2=new HOME();
		RootPanel.get().add(a2);
		}
	});
	
	cc.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			RootPanel.get().clear();
			admin a1=new admin();
			RootPanel.get().add(a1);
		}
	});
	
	t1.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
		c.clear();
		editscheme e1=new editscheme();
		c.add(e1);
		}
	});
		
	}
	
	@UiField
	MaterialLink t2;
	
	@UiField
	MaterialLink cc,t1;
	
	@UiField
	MaterialContainer c;
}
