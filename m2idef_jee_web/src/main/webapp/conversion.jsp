<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://xmlns.jcp.org/jsf/core"%>
<%@ taglib prefix="h" uri="http://xmlns.jcp.org/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>conversion</title>
</head>
<body>
	<f:view>
		<h:form>  
		    montant:<h:inputText value="#{deviseMBean.montant}" /><br />
			codeMonnaieSource: <h:inputText value="#{deviseMBean.codeMonnaieSource}" /><br />
			codeMonnaieCible: <h:inputText value="#{deviseMBean.codeMonnaieCible}" /><br />
			<h:commandButton value="convertir" action="#{deviseMBean.convertir}" />
		</h:form>
		<hr/>
		resultat = <h:outputText value="#{deviseMBean.resultat}" />
	</f:view>
</body>
</html>