<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="Package.ProductClass" 
    import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList dataList=(ArrayList)request.getAttribute("dataList");
%>
<h3>Product List</h3>
	<table>
		<tr>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<%for(int i=0;i<dataList.size();++i){
			ArrayList dataListTemp=new ArrayList();
			dataListTemp=(ArrayList)dataList.get(i);
			int j=0;
			%>
			<tr>
			<%
			while(j<dataListTemp.size()){
		%>
				<td><%=dataListTemp.get(j)%></td>
		
		<%
		j++;
		}
		%>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>