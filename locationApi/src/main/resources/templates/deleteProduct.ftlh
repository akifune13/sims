<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Delete Product</title>
    <style>
        body { font-family: Arial; text-align: center; padding: 40px; background: #fafafa; }
        form { display: inline-block; background: #fff; padding: 30px; border-radius: 10px; box-shadow: 0 2px 5px rgba(0,0,0,0.1); }
        select { width: 250px; padding: 8px; margin: 10px; }
        button { background: #dc3545; color: white; border: none; padding: 10px 20px; border-radius: 5px; }
        button:hover { background: #a71d2a; }
    </style>
</head>
<body>
<h1>Delete Product</h1>

<form action="/delete-product" method="post">
    <select name="id" required>
        <option value="">Select a product</option>
        <#list products as product>
            <option value="${product.id}">${product.name}</option>
        </#list>
    </select><br>
    <button type="submit">Delete</button>
</form>

<br><br>
<a href="/products">Back to Products</a>
</body>
</html>
