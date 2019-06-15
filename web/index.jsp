<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exercicio 9</title>
</head>
<body>
    <ul id="list">

    </ul>

    <script>
        function getProducts(onSuccess, onError) { // CORS
            var ajax = new XMLHttpRequest();
            ajax.onreadystatechange = function() {
                if (ajax.readyState === 4) {
                    if (ajax.status === 200) {
                        var jsonText = ajax.responseText;
                        var jsonObject = JSON.parse(jsonText);
                        onSuccess(jsonObject);
                    } else {
                        onError(ajax.responseText);
                    }
                }
            };
            ajax.open("GET", 'http://localhost:8080/api/v1/products', true);
            ajax.send(null);
        }

        getProducts(function(products) {
            var ul = document.getElementById('list');

            for(var i = 0; i < products.length; i++) {
                var product = products[i];
                var li = document.createElement("li");
                li.innerHTML =
                    '<p>nome: ' + product['nome'] + '</p>' +
                    '<p>descrição: ' + product['descricao'] + '</p>' +
                    '<p>valor: ' + product['valor'] + '</p>' +
                    '<p>email: ' + product['email'] + '</p>';
                ul.appendChild(li);
            }
        }, function(error) {
            console.error(error);
        });
    </script>
</body>
</html>
