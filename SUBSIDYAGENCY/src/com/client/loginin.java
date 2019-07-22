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
import gwt.material.design.client.ui.MaterialFooter;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialRow;

public class loginin extends Composite {

	private static logininUiBinder uiBinder = GWT.create(logininUiBinder.class);

	interface logininUiBinder extends UiBinder<Widget, loginin> {
	}

	public loginin() {
		initWidget(uiBinder.createAndBindUi(this));
		
		t2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
			RootPanel.get().clear();
			HOME a1=new HOME();
			RootPanel.get().add(a1);
			}
		});
		
		cc.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
			RootPanel.get().clear();
			loginin l1=new loginin();
			RootPanel.get().add(l1);
			}
		});
		
		t1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				c.clear();
				e1.clear();
				list l2=new list();
				c.add(l2);
			}
		});
		
		t3.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				c.clear();
				e1.clear();
				eligible l=new eligible();
				c.add(l);
			}
		});
		t4.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				c.clear();
				e1.clear();
				status ll=new status();
				c.add(ll);
			}
		});
		t5.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				c.clear();
				e1.clear();
				applied l3=new applied();
				c.add(l3);
			}
		});
	
	}
	
	@UiField
	MaterialLink t2,t1,t3,t4,t5;

	@UiField
	MaterialLink cc;
	
	@UiField
	MaterialContainer c;
	@UiField
	MaterialRow e1;
	
}
