package com.m2i.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import com.m2i.service.IServiceDevise;

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
	
	@EJB
	private IServiceDevise serviceDevise;

	@Override
	public void onMessage(Message message) {
		try {
			System.out.println("message recu:"+message);
			if(message instanceof TextMessage){
				TextMessage txtMsg = (TextMessage) message;
				System.out.println("texte du message recu:"+txtMsg.getText());
				//on pourrait déléguer des traitements au serviceDevise ...
			}
		} catch (JMSException e) {
				e.printStackTrace();
		}
		
	}

}
