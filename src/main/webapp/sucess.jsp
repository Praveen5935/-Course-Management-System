<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Course Added</title>
</head>
<body>
    <h1>Course Added Successfully!</h1>
    <p>Candidate Name: ${course.candidateName}</p>
    <p>Course Category: ${course.category}</p>
    <p>Course Name: ${course.courseName}</p>
    <p>Course Duration: ${course.duration} hours</p>
    <p>Course Price: Rs. ${course.price}</p>
    <a href="home.jsp">Back to Home</a>
</body>
</html>
