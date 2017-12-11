 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<form:form class="form-horizontal" action="register" method="POST" commandName="register">
  <head>
  <style>
body  {
    background:"D:\womenclothing\img-9.jpg";

    background-color:orange;
    }
</style>
  </head>
  
  <fieldset>
    <div id="legend">
      <legend class="">Register</legend>
    </div>
    <div class="control-group">
      <!-- Username -->
      <label class="control-label" for="username">Username</label>
      <div class="controls">
        <form:input type="text" id="username" path="username" name="username" placeholder="" class="input-xlarge"/>
        <p class="help-block">Username can contain any letters or numbers, without spaces</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- E-mail -->
      <label class="control-label" for="email">E-mail</label>
      <div class="controls">
        <form:input type="text" id="email" path="email" name="email" placeholder="" class="input-xlarge"/>
        <p class="help-block">Please provide your E-mail</p>
      </div>
    </div>
    
 
    <div class="control-group">
      <!-- Password-->
      <label class="control-label" for="password">Password</label>
      <div class="controls">
        <form:input type="password" id="password" path="password" name="password" placeholder="" class="input-xlarge"/>
        <p class="help-block">Password should be at least 4 characters</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- Password -->
      <label class="control-label"  for="password_confirm">password (Confirm)</label>
      <div class="controls">
        <form:input type="password" path="password" id="password_confirm" name="password_confirm" placeholder="" class="input-xlarge"/>
        <p class="help-block">Please confirm password</p>
      </div>
    </div>
    <div class="control-group">
      <!-- address -->
      <label class="control-label"  for="address">address</label>
      <div class="controls">
        <form:input type="address" path="address" id="address" name="address" placeholder="" class="input-xlarge"/>
        <p class="help-block">Please provide your address</p>
      </div>
    </div>
   
 
    <div class="control-group">
      <!-- Button -->
      <div class="controls">
        <button class="btn btn-success">Register</button>
      </div>
    </div>
  </fieldset>
</form:form>