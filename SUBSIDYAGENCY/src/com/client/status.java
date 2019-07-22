package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class status extends Composite{

	private static statusUiBinder uiBinder = GWT.create(statusUiBinder.class);

	interface statusUiBinder extends UiBinder<Widget, status> {
	}

	public status() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	

}
