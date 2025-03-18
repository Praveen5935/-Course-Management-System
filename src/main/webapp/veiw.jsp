<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Courses</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        .container {
            max-width: 900px;
            margin: auto;
            background: white;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #007BFF;
            color: white;
        }
        .button {
            background-color: #007BFF;
            color: white;
            border: none;
            padding: 10px 15px;
            cursor: pointer;
            font-size: 16px;
            border-radius: 5px;
            text-decoration: none;
        }
        .button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>List of Courses</h1>

    <table>
        <thead>
            <tr>
                <th>Candidate Name</th>
                <th>Course Category</th>
                <th>Course Name</th>
                <th>Course Duration (hours)</th>
                <th>Course Price (Rs)</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="course" items="${courses}">
                <tr>
                    <td>${course.candidateName}</td>
                    <td>${course.category}</td>
                    <td>${course.courseName}</td>
                    <td>${course.duration}</td>
                    <td>${course.price}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <a href="home.jsp" class="button">Back to Home</a>
</div>

</body>
</html>
