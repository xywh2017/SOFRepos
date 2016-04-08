<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Hibernate Integration With Spring in Maven on Dream Java</title>
</head>
<body>
 
<h2>Student Records Data : Hibernate Integration With Spring in Maven on Dream Java</h2>
 
<form:form method="post" action="add" commandName="student">
 
    <table>
    <tr>
        <td><form:label path="firstName"><spring:message code="label.firstname"/></form:label></td>
        <td><form:input path="firstName" /></td>
    </tr>
    <tr>
        <td><form:label path="lastName"><spring:message code="label.lastname"/></form:label></td>
        <td><form:input path="lastName" /></td>
    </tr>
    <tr>
        <td><form:label path="email"><spring:message code="label.email"/></form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    <tr>
        <td><form:label path="mobile"><spring:message code="label.mobile"/></form:label></td>
        <td><form:input path="mobile" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.add"/>"/>
        </td>
    </tr>
</table> 
</form:form>
 
     
<h3>Students</h3>
<c:if  test="${!empty studentList}">
<table class="data">
<tr>
    <th>Name</th>
    <th>Email</th>
    <th>Mobile Number</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${studentList}" var="stud">
    <tr>
        <td>${stud.lastname}, ${stud.firstname} </td>
        <td>${stud.email}</td>
        <td>${stud.mobile}</td>
        <td><a href="delete/${stud.id}">delete</a></td>
    </tr>
</c:forEach>
</table>
</c:if>
 
</body>
</html>