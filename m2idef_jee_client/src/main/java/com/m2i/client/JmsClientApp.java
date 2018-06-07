package com.m2i.client;

import java.util.Properties;

import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

public class JmsClientApp {

	public static void main(String[] args) {
		try {
			Properties jndiProps = new Properties();
			jndiProps.put(Context.INITIAL_CONTEXT_FACTORY,
			"org.jboss.naming.remote.client.InitialContextFactory");
			jndiProps.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
			// "http-remoting://localhost:8080" pour Jboss Wildfly 9.2 ou 10
			jndiProps.put(Context.SECURITY_PRINCIPAL, "admin");
			jndiProps.put(Context.SECURITY_CREDENTIALS, "pwd");
			//avec admin = utilisateur ajouté via la commande JBOSS7_HOME/bin/add-user
			//mot de passe=pwd et rôles associés admin,guest
			//et avec "guest" = rôle configuré sur la partie "messaging" de standalone(-full).xml
			// jndiProps.put("jboss.naming.client.ejb.context", true); //si besoin @Remote en plus
			Context ic = new InitialContext(jndiProps);
			QueueConnectionFactory factory = (QueueConnectionFactory)
			ic.lookup("jms/RemoteConnectionFactory");
			//avec <entry name="java:jboss/exported/jms/RemoteConnectionFactory"/>
			//dans standalone(-full).xml
			Queue queue = (Queue) ic.lookup("jms/queue/devise");
			// avec queue/devise doit etre exporté dans standalone(-full).xml
			//<jms-queue name="devise" entries="java:jboss/exported/jms/queue/devise"/>
			QueueConnection cnn = factory.createQueueConnection(
			jndiProps.getProperty(Context.SECURITY_PRINCIPAL),
			jndiProps.getProperty(Context.SECURITY_CREDENTIALS));
			QueueSession session = cnn.createQueueSession(false,
			QueueSession.AUTO_ACKNOWLEDGE);
			TextMessage msg = session.createTextMessage();
			msg.setText("<msg>message in the bottle</msg>");
			QueueSender sender = session.createSender(queue);
			sender.send(msg);
			System.out.println("Message sent successfully to remote queue.");
			} catch (Exception e) {
			e.printStackTrace();
			}
	}

}
