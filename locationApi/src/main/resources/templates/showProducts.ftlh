<!DOCTYPE html>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h2>Inventory List</h2>
<a href="/">Back</a>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Quantity</th>
        <th>Price</th>
    </tr>

    <#list products as product>
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.quantity}</td>
            <td>${product.price}</td>
        </tr>
    </#list>
</table>
</body>
</html>
