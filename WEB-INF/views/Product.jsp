<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html>
<head>
<style>
body  {
    background:"D:\womenclothing\img-9.jpg";

    background-color:pink;
    }
</style>
</head>
<!-- Form Name -->
<div align="center">
<h1> Product</h1>
</div>
<form:form action="Product" commandName="Product" method="POST" onsubmit="return validate" enctype="multipart/form-data">
<div class="logo-fixed"></div>
<!-- Text input-->
<div align="center">
<div class="form-group">
  <label class="col-md-4 control-label" for="product Name">Product name </label>
  <div class="col-md-4">
  <form:input id="productName" name="pname" placeholder=" ProductName" path="pname" class="form-control input-md" type="text"></form:input>
    </div>
  </div>
</div>
<br>
<div align="center">

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="product prize">product prize</label>  
  <div class="col-md-4">
  <form:input id="productprize" name="pprice" placeholder="Product Prize" path="pprice" class="form-control input-md" type="number"></form:input>
    
  </div>
</div>
</div>
<br>
<div align="center">

<!-- Text input -->
<div class="form-group">
  <label class="col-md-4 control-label" for="product Description">Product description </label>
  <div class="col-md-4">
  <form:input id="productDescription" name="pdesc" placeholder=" ProductDescription" path="pdesc" class="form-control input-md" type="text"></form:input>
  </div>
</div>
</div>
<br>

<br>
<div align="center">
<!-- Text input -->
<div class="form-group">
  <label class="col-md-4 control-label" for=" Brand">Brand</label>
  <div class="col-md-4"> 
  <form:input id="PercentageDiscount" name="brand" placeholder="brand" path="brand" class="form-control input-md" type="text"></form:input>                  
    </div>
  </div>
</div>
<div align="center">
<!-- Text input -->
<div class="form-group">
  <label class="col-md-4 control-label" for="avail">avail</label>
  <div class="col-md-4"> 
  <form:input id="PercentageDiscount" name="avail" placeholder="available" path="avail" class="form-control input-md" type="text"></form:input>                  
    </div>
</div>
<div class="form-group">
  <label class="col-md-4 control-label" for="avail">Upload Image</label>
  <div class="col-md-4"> 
  <form:input id="PercentageDiscount" name="pimage" placeholder="upload image" path="pimage" class="form-control input-md" type="file"></form:input>                  
    </div>
</div>
<div class="control-group">
      <!-- Button -->
      <div class="controls">
        <button class="btn btn-success">submit</button>
      </div>
    </div>
 </form:form> 