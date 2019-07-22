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
import gwt.material.design.client.ui.MaterialHeader;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialSlider;

public class HOME extends Composite  {

	private static HOMEUiBinder uiBinder = GWT.create(HOMEUiBinder.class);

	interface HOMEUiBinder extends UiBinder<Widget, HOME> {
	}

	public HOME() {
		initWidget(uiBinder.createAndBindUi(this));
		
		t1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				c.clear();
//				RootPanel.get().clear();
				LOGINPAGE l1=new LOGINPAGE();
				c.add(l1);
//				RootPanel.get("c").add(l1);
				
				
				
			}
		});
		
		t2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				c.clear();
				regis e1=new regis();
				c.add(e1);
			}
		});
		
		t3.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				c.clear();
				adminlogin e2=new adminlogin();
				c.add(e2);
			}
		});
		
		cc.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				RootPanel.get().clear();
				HOME h2=new HOME();
				RootPanel.get().add(h2);
			}
		});
		
		ww.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				c.clear();
				how s1=new how();
				c.add(s1);
			}
		});
		
		ll.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				c.clear();
				list s2=new list();
				c.add(s2);
			}
		});
	}

		public HOME(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	
	}
		@UiField
		MaterialLink t1;
		
		@UiField
		MaterialLink t2;
		
		@UiField
		MaterialLink t3;
		
		@UiField
		MaterialLink cc,ww,ll;
		
		@UiField
		MaterialRow tt1;
		
		@UiField
		MaterialContainer c;
		
}

