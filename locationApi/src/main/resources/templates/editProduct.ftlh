<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit Product</title>
    <style>
        body { font-family: Arial; text-align: center; padding: 40px; background: #fafafa; }
        form { display: inline-block; background: #fff; padding: 30px; border-radius: 10px; box-shadow: 0 2px 5px rgba(0,0,0,0.1); }
        select, input { width: 250px; padding: 8px; margin: 10px; }
        button { background: #007bff; color: white; border: none; padding: 10px 20px; border-radius: 5px; }
        button:hover { background: #0056b3; }
    </style>
</head>
<body>
<h1>Edit Product</h1>

<form action="/update-product" method="post">
    <select name="id" required>
        <option value="">Select a product</option>
        <#list products as product>
            <option value="${product.id}">${product.name}</option>
        </#list>
    </select><br>

    <input type="text" name="name" placeholder="New Name" required><br>
    <input type="text" name="brand" placeholder="New Brand" required><br>
    <input type="number" name="price" placeholder="New Price" step="0.01" required><br>
    <input type="number" name="quantity" placeholder="New Quantity" required><br>
    <button type="submit">Update</button>
</form>

<br><br>
<a href="/products">Back to Products</a>
</body>
</html>
