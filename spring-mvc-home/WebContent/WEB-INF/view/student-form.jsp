<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		<br><br>
		
		<form:select path="country">
			<!-- <form:options items="${student.countryOptions}"/> -->
			<form:options items="${theCountryOptions}"/>
		</form:select>
		
		<br><br>
		
		Favorite Language:
		
		<!--  Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C++ <form:radiobutton path="favoriteLanguage" value="C++" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />  -->
		
		<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"  />
		
		<br><br>
		
		Operating Systems: 
		
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Windows <form:checkbox path="operatingSystems" value="Windows" />
		Mac <form:checkbox path="operatingSystems" value="Mac" />
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>












