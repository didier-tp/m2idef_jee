package com.m2i.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

/*
 EJB piloté par message asynchrone (Message Driven Bean en anglais)
 qui arrivera dans la file queue/devise (à configurer dans standalone-full.xml)
 */

@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", 
				propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", 
				propertyValue = "queue/devise") })
public class DeviseMDB implements MessageListener {

	@Override
	public void onMessage(Message message) {
		System.out.println("message recu:"+message);
		
	}

}
