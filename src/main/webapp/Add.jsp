<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Course</title>
</head>
<body>
    <h1>Add New Course</h1>
    <form action="course" method="post">
        <label>Candidate Name:</label><br>
        <input type="text" name="CName" required><br>

        <label>Course Category:</label><br>
        <input type="text" name="category" required><br>

        <label>Course Name:</label><br>
        <input type="text" name="name" required><br>

        <label>Course Duration (hours):</label><br>
        <input type="number" name="duration" required><br>

        <label>Course Price (Rs):</label><br>
        <input type="number" name="price" required><br>

        <input type="submit" value="Add Course">
    </form>
</body>
</html>
