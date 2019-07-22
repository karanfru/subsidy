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
import com.shared.List;
import com.shared.Req;

import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTextArea;
import gwt.material.design.client.ui.MaterialTextBox;

public class list extends Composite {

	private static listUiBinder uiBinder = GWT.create(listUiBinder.class);
GreetingServiceAsync z1=GWT.create(GreetingService.class);
	interface listUiBinder extends UiBinder<Widget, list> {
	}
	
	public list() {
		initWidget(uiBinder.createAndBindUi(this));
		z1.showlist(new AsyncCallback<List>() {
			
			@Override
			public void onSuccess(List result) {
				int n;
				n=result.getN();
				Window.alert(Integer.toString(n));
				String a[][]=new String[n][2];
				a=result.getA();
				int i;
				for(i=0;i<n;i++)
				{
					
					MaterialRow r= new MaterialRow();
					MaterialColumn c1=new MaterialColumn();
					MaterialTextBox t1=new MaterialTextBox();
					t1.setText(a[i][0]);
					t1.setEnabled(false);
					MaterialColumn c2=new MaterialColumn();
					MaterialTextBox t2=new MaterialTextBox();
					t2.setText(a[i][1]);
					MaterialColumn c3=new MaterialColumn();
					Button b=new Button();
					b.setText("BUTTON");
					
					
					b.addClickHandler(new ClickHandler() {
						
						@Override
						public void onClick(ClickEvent event) {
							// TODO Auto-generated method stub
						RootPanel.get().clear();
						Req c1=new Req();
						c1.setName(t1.getText());
						c1.setContent(t2.getText());
						z1.check(c1,new AsyncCallback<Req>() {
							
							@Override
							public void onSuccess(Req result) {
								// TODO Auto-generated method stub
								if(result.Authenticate.equals("verify")) {
									Window.alert("applied");
								}
								else
									Window.alert("not applied");
									
							}
							
							@Override
							public void onFailure(Throwable caught) {
								// TODO Auto-generated method stub
								Window.alert("not");
							}
						
					});
						}
					});
						
					c1.add(t1);
					c2.add(t2);
					c3.add(b);
					r.add(c1);
					r.add(c2);
					r.add(c3);
					RootPanel.get().add(r);
				}
				
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}
		});
	}


}
