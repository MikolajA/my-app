<!doctype html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>mikolaj-app: detailes</title>

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

        <a href="http://localhost:8080/search"><div class="option">
            Znajdz rezerwację</div></a>

        <div style="clear: both"></div>
    </div>

    <div id="content">
        <div id="saved">
            Poniżej szczegóły Twojej rezerwacji!</div>
        <div id="contentSaveL">

        </div>
        <div id="contentSaveR">
            <#if parkingspot??>
                <ul>
                    <li> Imię: ${parkingspot.imie}</li>
                    <li> Nazwisko: ${parkingspot.nazwisko}</li>
                    <li> Marka pojazdu: ${parkingspot.marka}</li>
                    <li> Nr rejestracyjny: ${parkingspot.numer}</li>
                    <li> Nr miejsca: ${parkingspot.miejsce}</li>
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