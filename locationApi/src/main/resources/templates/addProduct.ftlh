<!DOCTYPE html>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
<h2>Add Product</h2>
<a href="/">Back</a>

<form action="/add-product" method="post">
    <label for="name">Product Name:</label><br>
    <input type="text" id="name" name="name"><br>

    <label for="quantity">Quantity:</label><br>
    <input type="number" id="quantity" name="quantity"><br>

    <label for="price">Price:</label><br>
    <input type="number" id="price" name="price" step="0.01"><br><br>

    <input type="submit" value="Submit"/>
    <input type="reset" value="Reset"/>
</form>
</body>
</html>
