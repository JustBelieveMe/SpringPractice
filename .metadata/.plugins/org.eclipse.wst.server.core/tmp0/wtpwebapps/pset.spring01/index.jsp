<html>
<%@ page
	import="org.springframework.web.context.WebApplicationContext"%>
<%@ page
	import="org.springframework.web.context.support.WebApplicationContextUtils"
	import="spring01.HelloWorld"
	import="spring01.Goodbye"
	import="spring01.SeeYou"%>
<%
	WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
%>
<body>
	<h2>
	<%
		HelloWorld hello = (HelloWorld)context.getBean("dataSource");
		Goodbye gb = (Goodbye)context.getBean("goodbye");
		SeeYou sy = (SeeYou)context.getBean("seeyou");
		out.println(hello.getMessage());
		out.println(gb.getMessage());
		out.println(sy.getMessage());
	%>
	</h2>
</body>
</html>
