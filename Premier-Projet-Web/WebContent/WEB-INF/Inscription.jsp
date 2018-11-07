<%@page import="fr.afang.bean.Personne"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Ressources/CSS/Inscription.css">
<meta charset="ISO-8859-1">
<title>Inscription</title>
</head>
<body>
<%
Personne mike= (Personne)request.getAttribute("michael");

%>



<div id="div-coordonnées">
    <form name="inscription-forms" action="inscriptionOkServlet" method="post">
        <fieldset>
            <legend>Vos Coordonnées</legend>
            
            <label for="Mme">Mme</label><input type="radio" name="gender" id="Mme" value="Mme"/>
            
            <label for="Mr">Mr</label><input type="radio" name="gender" id="Mr" value="Mr" value="Mr"/><br/>


            <label for="nom">Nom: </label><input type="text" id="nom" name="nom" value="<%= mike.getNom() %>"><br>

            <label for="prenom"> Prenom :</label><input type="text" id="prenom" name="prenom" value =" <%=mike.getPrenom() %>"/><br>


            <label for="date-de-naissance">date de naissance</label><input type="date" id="date-de-naissance" name="date-de-naissance" value="<%=mike.getDateNaissance() %>"><br/>



            <label for="telephone">Numero telephone :</label><input type="text" id="telephone" name="telephone" value="<%=mike.getTelephone() %>"/><br>



            <label for="rue">N° et Rue : </label><input type="text" id="rue" name="rue" value=" <%=mike.getNumeroEtRue() %>"/><br>


            <label for="ville">Ville : </label><input type="text" id="ville" name="ville" value=" <%=mike.getVille() %>"><br>


            <label for=departement">Département</label><select id=departement" name="departement">
            <option value="00">(00) Hors France</option>
            <option value="01">(01) Ain</option>
            <option value="02">(02) Aisne</option>
            <option value="03">(03) Allier</option>
            <option value="04">(04) Alpes de Haute Provence</option>
            <option value="05">(05) Hautes Alpes</option>
            <option value="06">(06) Alpes Maritimes</option>
            <option value="07">(07) Ardèche</option>
            <option value="08">(08) Ardennes</option>
            <option value="09">(09) Ariège</option>
            <option value="10">(10) Aube</option>
            <option value="11">(11) Aude</option>
            <option value="12">(12) Aveyron</option>
            <option value="13">(13) Bouches du Rhône</option>
            <option value="14">(14) Calvados</option>
            <option value="15">(15) Cantal</option>
            <option value="16">(16) Charente</option>
            <option value="17">(17) Charente Maritime</option>
            <option value="18">(18) Cher</option>
            <option value="19">(19) Corrèze</option>
            <option value="2A">(2A) Corse du Sud</option>
            <option value="2B">(2B) Haute-Corse</option>
            <option value="21">(21) Côte d'Or</option>
            <option value="22">(22) Côtes d'Armor</option>
            <option value="23">(23) Creuse</option>
            <option value="24">(24) Dordogne</option>
            <option value="25">(25) Doubs</option>
            <option value="26">(26) Drôme</option>
            <option value="27">(27) Eure</option>
            <option value="28">(28) Eure et Loir</option>
            <option value="29">(29) Finistère</option>
            <option value="30">(30) Gard</option>
            <option value="31">(31) Haute Garonne</option>
            <option value="32">(32) Gers</option>
            <option value="33">(33) Gironde</option>
            <option value="34">(34) Hérault</option>
            <option value="35">(35) Ille et Vilaine</option>
            <option value="36">(36) Indre</option>
            <option value="37">(37) Indre et Loire</option>
            <option value="38">(38) Isère</option>
            <option value="39">(39) Jura</option>
            <option value="40">(40) Landes</option>
            <option value="41">(41) Loir et Cher</option>
            <option value="42">(42) Loire</option>
            <option value="43">(43) Haute Loire</option>
            <option value="44">(44) Loire Atlantique</option>
            <option value="45">(45) Loiret</option>
            <option value="46">(46) Lot</option>
            <option value="47">(47) Lot et Garonne</option>
            <option value="48">(48) Lozère</option>
            <option value="49">(49) Maine et Loire</option>
            <option value="50">(50) Manche</option>
            <option value="51">(51) Marne</option>
            <option value="52">(52) Haute Marne</option>
            <option value="53">(53) Mayenne</option>
            <option value="54">(54) Meurthe et Moselle</option>
            <option value="55">(55) Meuse</option>
            <option value="56">(56) Morbihan</option>
            <option value="57">(57) Moselle</option>
            <option value="58">(58) Nièvre</option>
            <option value="59">(59) Nord</option>
            <option value="60">(60) Oise</option>
            <option value="61">(61) Orne</option>
            <option value="62">(62) Pas de Calais</option>
            <option value="63">(63) Puy de Dôme</option>
            <option value="64">(64) Pyrénées Atlantiques</option>
            <option value="65">(65) Hautes Pyrénées</option>
            <option value="66">(66) Pyrénées Orientales</option>
            <option value="67">(67) Bas Rhin</option>
            <option value="68">(68) Haut Rhin</option>
            <option value="69">(69) Rhône</option>
            <option value="70">(70) Haute Saône</option>
            <option value="71">(71) Saône et Loire</option>
            <option value="72">(72) Sarthe</option>
            <option value="73">(73) Savoie</option>
            <option value="74">(74) Haute Savoie</option>
            <option value="75">(75) Paris</option>
            <option value="76">(76) Seine Maritime</option>
            <option value="77">(77) Seine et Marne</option>
            <option value="78">(78) Yvelines</option>
            <option value="79">(79) Deux Sèvres</option>
            <option value="80">(80) Somme</option>
            <option value="81">(81) Tarn</option>
            <option value="82">(82) Tarn et Garonne</option>
            <option value="83">(83) Var</option>
            <option value="84">(84) Vaucluse</option>
            <option value="85">(85) Vendée</option>
            <option value="86">(86) Vienne</option>
            <option value="87">(87) Haute Vienne</option>
            <option value="88">(88) Vosges</option>
            <option value="89">(89) Yonne</option>
            <option value="90">(90) Territoire de Belfort</option>
            <option value="91">(91) Essonne</option>
            <option value="92">(92) Hauts de Seine</option>
            <option value="93">(93) Seine Saint Denis</option>
            <option value="94">(94) Val de Marne</option>
            <option value="95">(95) Val d'Oise</option>
            <option value="971">(971) Guadeloupe</option>
            <option value="972">(972) Martinique</option>
            <option value="973">(973) Guyane</option>
            <option value="974">(974) Réunion</option>
            <option value="975">(975) Saint Pierre et Miquelon</option>
            <option value="976">(976) Mayotte</option>
        </select><br/>

            <label for="pays">Pays</Pa></label><select id="pays">
            <option value="Afghanistan">Afghanistan</option>
            <option value="Afrique_du_Sud">Afrique du Sud</option>
            <option value="Albanie">Albanie</option>
            <option value="Algerie">Algérie</option>
            <option value="Allemagne">Allemagne</option>
            <option value="Andorre">Andorre</option>
            <option value="Angola">Angola</option>
            <option value="Antigua-et-Barbuda">Antigua-et-Barbuda</option>
            <option value="Arabie_saoudite">Arabie saoudite</option>
            <option value="Argentine">Argentine</option>
            <option value="Armenie">Arménie</option>
            <option value="Australie">Australie</option>
            <option value="Autriche">Autriche</option>
            <option value="Azerbaidjan">Azerbaïdjan</option>
            <option value="Bahamas">Bahamas</option>
            <option value="Bahrein">Bahreïn</option>
            <option value="Bangladesh">Bangladesh</option>
            <option value="Barbade">Barbade</option>
            <option value="Belau">Belau</option>
            <option value="Belgique">Belgique</option>
            <option value="Belize">Belize</option>
            <option value="Benin">Bénin</option>
            <option value="Bhoutan">Bhoutan</option>
            <option value="Bielorussie">Biélorussie</option>
            <option value="Birmanie">Birmanie</option>
            <option value="Bolivie">Bolivie</option>
            <option value="Bosnie-Herzégovine">Bosnie-Herzégovine</option>
            <option value="Botswana">Botswana</option>
            <option value="Bresil">Brésil</option>
            <option value="Brunei">Brunei</option>
            <option value="Bulgarie">Bulgarie</option>
            <option value="Burkina">Burkina</option>
            <option value="Burundi">Burundi</option>
            <option value="Cambodge">Cambodge</option>
            <option value="Cameroun">Cameroun</option>
            <option value="Canada">Canada</option>
            <option value="Cap-Vert">Cap-Vert</option>
            <option value="Chili">Chili</option>
            <option value="Chine">Chine</option>
            <option value="Chypre">Chypre</option>
            <option value="Colombie">Colombie</option>
            <option value="Comores">Comores</option>
            <option value="Congo">Congo</option>
            <option value="Cook">Cook</option>
            <option value="Coree_du_Nord">Corée du Nord</option>
            <option value="Coree_du_Sud">Corée du Sud</option>
            <option value="Costa_Rica">Costa Rica</option>
            <option value="Cote_Ivoire">Côte d'Ivoire</option>
            <option value="Croatie">Croatie</option>
            <option value="Cuba">Cuba</option>
            <option value="Danemark">Danemark</option>
            <option value="Djibouti">Djibouti</option>
            <option value="Dominique">Dominique</option>
            <option value="Egypte">Égypte</option>
            <option value="Emirats_arabes_unis">Émirats arabes unis</option>
            <option value="Equateur">Équateur</option>
            <option value="Erythree">Érythrée</option>
            <option value="Espagne">Espagne</option>
            <option value="Estonie">Estonie</option>
            <option value="Etats-Unis">États-Unis</option>
            <option value="Ethiopie">Éthiopie</option>
            <option value="Fidji">Fidji</option>
            <option value="Finlande">Finlande</option>
            <option value="France">France</option>
            <option value="Gabon">Gabon</option>
            <option value="Gambie">Gambie</option>
            <option value="Georgie">Géorgie</option>
            <option value="Ghana">Ghana</option>
            <option value="Grèce">Grèce</option>
            <option value="Grenade">Grenade</option>
            <option value="Guatemala">Guatemala</option>
            <option value="Guinee">Guinée</option>
            <option value="Guinee-Bissao">Guinée-Bissao</option>
            <option value="Guinee_equatoriale">Guinée équatoriale</option>
            <option value="Guyana">Guyana</option>
            <option value="Haiti">Haïti</option>
            <option value="Honduras">Honduras</option>
            <option value="Hongrie">Hongrie</option>
            <option value="Inde">Inde</option>
            <option value="Indonesie">Indonésie</option>
            <option value="Iran">Iran</option>
            <option value="Iraq">Iraq</option>
            <option value="Irlande">Irlande</option>
            <option value="Islande">Islande</option>
            <option value="Israël">Israël</option>
            <option value="Italie">Italie</option>
            <option value="Jamaique">Jamaïque</option>
            <option value="Japon">Japon</option>
            <option value="Jordanie">Jordanie</option>
            <option value="Kazakhstan">Kazakhstan</option>
            <option value="Kenya">Kenya</option>
            <option value="Kirghizistan">Kirghizistan</option>
            <option value="Kiribati">Kiribati</option>
            <option value="Koweit">Koweït</option>
            <option value="Laos">Laos</option>
            <option value="Lesotho">Lesotho</option>
            <option value="Lettonie">Lettonie</option>
            <option value="Liban">Liban</option>
            <option value="Liberia">Liberia</option>
            <option value="Libye">Libye</option>
            <option value="Liechtenstein">Liechtenstein</option>
            <option value="Lituanie">Lituanie</option>
            <option value="Luxembourg">Luxembourg</option>
            <option value="Macedoine">Macédoine</option>
            <option value="Madagascar">Madagascar</option>
            <option value="Malaisie">Malaisie</option>
            <option value="Malawi">Malawi</option>
            <option value="Maldives">Maldives</option>
            <option value="Mali">Mali</option>
            <option value="Malte">Malte</option>
            <option value="Maroc">Maroc</option>
            <option value="Marshall">Marshall</option>
            <option value="Maurice">Maurice</option>
            <option value="Mauritanie">Mauritanie</option>
            <option value="Mexique">Mexique</option>
            <option value="Micronesie">Micronésie</option>
            <option value="Moldavie">Moldavie</option>
            <option value="Monaco">Monaco</option>
            <option value="Mongolie">Mongolie</option>
            <option value="Mozambique">Mozambique</option>
            <option value="Namibie">Namibie</option>
            <option value="Nauru">Nauru</option>
            <option value="Nepal">Népal</option>
            <option value="Nicaragua">Nicaragua</option>
            <option value="Niger">Niger</option>
            <option value="Nigeria">Nigeria</option>
            <option value="Niue">Niue</option>
            <option value="Norvège">Norvège</option>
            <option value="Nouvelle-Zelande">Nouvelle-Zélande</option>
            <option value="Oman">Oman</option>
            <option value="Ouganda">Ouganda</option>
            <option value="Ouzbekistan">Ouzbékistan</option>
            <option value="Pakistan">Pakistan</option>
            <option value="Panama">Panama</option>
            <option value="Papouasie-Nouvelle_Guinee">Papouasie - Nouvelle Guinée</option>
            <option value="Paraguay">Paraguay</option>
            <option value="Pays-Bas">Pays-Bas</option>
            <option value="Perou">Pérou</option>
            <option value="Philippines">Philippines</option>
            <option value="Pologne">Pologne</option>
            <option value="Portugal">Portugal</option>
            <option value="Qatar">Qatar</option>
            <option value="Republique_centrafricaine">République centrafricaine</option>
            <option value="Republique_dominicaine">République dominicaine</option>
            <option value="Republique_tcheque">République tchèque</option>
            <option value="Roumanie">Roumanie</option>
            <option value="Royaume-Uni">Royaume-Uni</option>
            <option value="Russie">Russie</option>
            <option value="Rwanda">Rwanda</option>
            <option value="Saint-Christophe-et-Nieves">Saint-Christophe-et-Niévès</option>
            <option value="Sainte-Lucie">Sainte-Lucie</option>
            <option value="Saint-Marin">Saint-Marin</option>
            <option value="Saint-Siège">Saint-Siège, ou leVatican</option>
            <option value="Saint-Vincent-et-les_Grenadines">Saint-Vincent-et-les Grenadines</option>
            <option value="Salomon">Salomon</option>
            <option value="Salvador">Salvador</option>
            <option value="Samoa_occidentales">Samoa occidentales</option>
            <option value="Sao_Tome-et-Principe">Sao Tomé-et-Principe</option>
            <option value="Senegal">Sénégal</option>
            <option value="Seychelles">Seychelles</option>
            <option value="Sierra_Leone">Sierra Leone</option>
            <option value="Singapour">Singapour</option>
            <option value="Slovaquie">Slovaquie</option>
            <option value="Slovenie">Slovénie</option>
            <option value="Somalie">Somalie</option>
            <option value="Soudan">Soudan</option>
            <option value="Sri_Lanka">Sri Lanka</option>
            <option value="Sued">Suède</option>
            <option value="Suisse">Suisse</option>
            <option value="Suriname">Suriname</option>
            <option value="Swaziland">Swaziland</option>
            <option value="Syrie">Syrie</option>
            <option value="Tadjikistan">Tadjikistan</option>
            <option value="Tanzanie">Tanzanie</option>
            <option value="Tchad">Tchad</option>
            <option value="Thailande">Thaïlande</option>
            <option value="Togo">Togo</option>
            <option value="Tonga">Tonga</option>
            <option value="Trinite-et-Tobago">Trinité-et-Tobago</option>
            <option value="Tunisie">Tunisie</option>
            <option value="Turkmenistan">Turkménistan</option>
            <option value="Turquie">Turquie</option>
            <option value="Tuvalu">Tuvalu</option>
            <option value="Ukraine">Ukraine</option>
            <option value="Uruguay">Uruguay</option>
            <option value="Vanuatu">Vanuatu</option>
            <option value="Venezuela">Venezuela</option>
            <option value="Viet_Nam">Viêt Nam</option>
            <option value="Yemen">Yémen</option>
            <option value="Yougoslavie">Yougoslavie</option>
            <option value="Zaire">Zaïre</option>
            <option value="Zambie">Zambie</option>
            <option value="Zimbabwe">Zimbabwe</option>
        </select><br/>


            <label for="email">Votre Email : </label><input type="text" id="email" name="email" value = " <%=mike.getEmail() %>"><br/>


            <label for="commentaires">Vos Commentaires : </label><textarea id="commentaires"></textarea>



            <div>
                <button type="button" class="bouton" onclick="validerformulaire()">Submit</button>
                <input type="reset" value="Cancel" class="bouton"/>
                <input type="submit" value="Envoyer" class="bouton"/>
            </div>
        </fieldset>
    </form>
</div>
<script type="application/javascript" src="Ressources/JS/Inscription.js"></script>


</body>
</html>