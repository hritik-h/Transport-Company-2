<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="dto.BookingDto"%>
<%@ page import="service.BookingService"%>
<%@ page import="java.util.*"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</head>
<body>
<%
	//UserBean user = new UserBean();
	BookingService dao = new BookingService();
	List<BookingDto> bookingList = dao.showAllBookins();
	//Iterator<UserBean> itr = userList.iterator();
	for(BookingDto bookings: bookingList){
	out.println();
	}
%>
<table class="table">
	<thead>
	<tr>
		<th scope="col">User Id</th>
		<th scope="col">Vehicle Id</th>
		
		<th scope="col">Source</th>
		<th scope="col">Destination</th>
		<th scope="col">Driver Id</th>
		<th scope="col">Date</th>
	</tr>
	</thead>
	<tbody>
	<tr>
		<%
			/*while(itr.hasNext())
			 {
			 System.out.println(user.getId());*/
			for (BookingDto booking: bookingList) {
		%>
		<td><%=booking.getUser_id() %></td>
		<td><%=booking.getVehicle_id() %></td>
		<td><%=booking.getSource() %></td>
		<td><%=booking.getDestination() %></td>
		<td><%=booking.getDriverId() %></td>
		<td><%=booking.getDate() %></td>

	</tr>
	</tbody>
	<%
		}
		//}
	%>
</table>
</body>
</html>