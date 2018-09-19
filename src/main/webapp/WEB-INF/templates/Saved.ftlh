<!doctype html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>mikolaj-app: saved</title>

    <link href="../../css/style.css" rel="stylesheet" >

</head>
<body>

<div id="container">

    <div id="logo">
        Witaj w aplikacji mikolaj-aP<img src="http://localhost:8080/images/znak.jpeg" height="10%" width="2%">
    </div>

    <div id="menu">
        <a href="http://localhost:8080/main"><div class="option">
            Stroga główna </div></a>

        <a href="http://localhost:8080/save"><div class="option">
            Zarezerwuj miejsce </div></a>

        <a href="http://localhost:8080/find"><div class="option">
            Znajdz rezerwację</div></a>

        <div style="clear: both"></div>
    </div>

    <div id="content">
        <div id="saved">Twoje miejsce zostało dodane!</br>
            Poniżej znajdziesz szczegóły swojej rezerwacji</div>
        <div id="contentSaveL">
            Imię: </br>
            Nazwisko: </br>
            Marka samochodu: </br>
            Nr rejestracyjny pojazdu: </br>
            Nr miejsca parkingowego: </br>
        </div>
        <div id="contentSaveR">
            <#if parkingspot??>
                <ul>
                    <li>${parkingspot.imie}</li>
                    <li>${parkingspot.nazwisko}</li>
                    <li>${parkingspot.marka}</li>
                    <li>${parkingspot.numer}</li>
                    <li>${parkingspot.miejsce}</li>
                </ul>
            </#if>
        </div>
        <div id="contentRRR">
            <img src="http://localhost:8080/images/szkicparking" height="100%" width="100%">
        </div>
        <div style="clear: both;"></div>

    </div>

    <div id="footer">
        mikolaj-aPP &copy;2018
    </div>

</div>

</body>
</html>