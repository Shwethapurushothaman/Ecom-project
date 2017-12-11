<%@ page language="java" contentType="text/html"%>
<head>
  <style>
body  {
    background:"D:\womenclothing\img-9.jpg";

    background-color:brown;
    }
</style>
  </head>

	<form action="perform_login" method="post">
		<table align="center">
			<thead bgcolor="magenta">
				<th colspan="2">Login</th>
			</thead>
			<tr bgcolor="purple">
				<td>User Name</td>
				<td><input type="text" name="username" required /></td>
			</tr>
			<tr bgcolor="yellow">
				<td>Password</td>
				<td><input type="password" name="password" required /></td>
			</tr>
			</tr>
			<tr bgcolor="green">
				<td colspan="2"><center>
						<input type="submit" value="SUBMIT" />
					</center></td>
			</tr>
		</table>
	</form>


</body>
</html>