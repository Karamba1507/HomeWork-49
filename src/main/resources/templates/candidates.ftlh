<!DOCTYPE html>
<html lang="en">


<head>
    <meta charset="UTF-8">
    <title>Vote for us!</title>

    <link rel="stylesheet" href="/candidates.css">
</head>

<body>
<div class="container flex flex-col align-center">
    <h1>Vote for us</h1>
    <main class="flex flex-wrap align-evenly">

        <#list candidate as candidate>
            <div class="card">
                    <img src="${candidate.photo}">
                    <p>${candidate.id}</p>
                    <p>${candidate.name}</p>
                <p><a href="http://localhost:8080/choose?id=${candidate.id}">vote</a></p>
            </div>
        </#list>
    </main>

    <p>-------------------------------------------------------</p>

</div>
</body>
</html>