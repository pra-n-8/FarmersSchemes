
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="./design.css">
</head>
<body>

<fieldset style=" margin-left: 400px; margin-right: 400px;">
    <legend style="text-align: center;"><h1>Login</h1></legend>
<div id="block">
<select>
  <option value="Bidder">Bidder</option>
  <option value="Farmer">Farmer</option>
  <option value="Admin">Admin</option>
</select>
</div>
<div id="block">User Id<input style="margin-left: 30px" type="text" placeholder="UserId"></div>
<div id="block">Password<input style="margin-left: 20px" type="text" placeholder="Password"></div>
<div id="block"><a href="">Forgot Password</a></div>

<button id="btn">Log In</button>

<div id="block"><p onclick="clickfunction()">New User? Register Here</p></div>

</fieldset>

<script>
  function clickfunction(){
      var input = prompt("Type 1 if you are a farmer, 2 if you are a bidder");
      if(input=='1'){
        window.location.href="./farmer.jsp"
      }
      else if(input=='2'){
        window.location.href="./bidder.jsp"
      }
      else{
        alert("Give valid input");
      }
  }
</script>

</body>

</html>