<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="model.Vehicle"%>
<%@ page import="service.VehicleService"%>
<%@ page import="java.util.*"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</head>
<body>
<%
	//UserBean user = new UserBean();
	VehicleService dao = new VehicleService();
	List<Vehicle> vehicleList = dao.getAllRecords();
	//Iterator<UserBean> itr = userList.iterator();
	for(Vehicle user: vehicleList){
	out.println();
	}
%>
<table class="table">
	<thead>
	<tr>
		<th scope="col">Vehicle Id</th>
		<th scope="col">Vehicle Number</th>
		<th scope="col">Vehicle Type</th>
		<th scope="col">Vehicle Description</th>
	</tr>
	</thead>
	<tbody>
	<tr>
		<%
			/*while(itr.hasNext())
			 {
			 System.out.println(user.getId());*/
			for (Vehicle vehicle: vehicleList) {
		%>
		<td><%=vehicle.getVehicle_id() %></td>
		<td><%=vehicle.getVehicle_number() %></td>
		<td><%=vehicle.getVehicle_type()%></td>
		<td><%=vehicle.getVehicle_desription() %></td>

	</tr>
	</tbody>
	<%
		}
		//}
	%>
</table>
</body>
</html>