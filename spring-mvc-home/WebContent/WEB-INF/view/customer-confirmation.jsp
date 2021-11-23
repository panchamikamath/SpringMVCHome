<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
	<title>Customer Form</title>
	</head>
	<body>
	Customer Name : ${customer.firstName} ${customer.lastName}
	<br><br>
	Number of passes customer has : ${customer.freePasses}
	<br><br>
	Postal Code : ${customer.postalCode}
	</body>
</html>