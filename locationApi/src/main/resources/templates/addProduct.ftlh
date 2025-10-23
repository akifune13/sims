<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Product</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f9f9f9;
            padding: 40px;
            text-align: center;
        }
        form {
            display: inline-block;
            background-color: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.1);
        }
        input {
            width: 250px;
            padding: 8px;
            margin: 10px;
        }
        button {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px 20px;
            cursor: pointer;
            border-radius: 5px;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<h1>Add Product</h1>
<form action="/add-product" method="post">
    <input type="text" name="name" placeholder="Product Name" required><br>
    <input type="text" name="brand" placeholder="Brand" required><br>
    <input type="number" name="price" placeholder="Price" step="0.01" required><br>
    <input type="number" name="quantity" placeholder="Quantity" required><br>
    <button type="submit">Save</button>
</form>
<br><br>
<a href="/products">Back to Products</a>
</body>
</html>
