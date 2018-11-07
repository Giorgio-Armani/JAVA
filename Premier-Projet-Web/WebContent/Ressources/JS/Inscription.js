function validerformulaire () {

    var dateDeNaissance = $("#dateDeNaissance").val();
    console.log("dateDeNaissance :" + dateDeNaissance) ;


    var prenom = $("#prenom").val();
    console.log("prenom :" + prenom);
    if (prenom == "") {
        console.log("prenom");
        document.getElementById("prenom").className = "err";
    }
    else if (prenom.trim() == "") {
        document.getElementById("prenom").className = 'err';
    }
    else {
        document.getElementById("prenom").classList.remove("err");
    }


    var nom = document.forms["inscription-forms"].elements["nom"].value;
    console.log(nom);
    if (nom == "") {
        console.log("nom");
        document.getElementById("nom").className = "err";
    } else if (nom.trim() == "") {
        document.getElementById("nom").className = 'err';
    } else
        document.getElementById("nom").classList.remove("err");


    var numeroTelephone = document.forms["inscription-forms"].elements["telephone"].value;
    console.log("telephone");
    if (numeroTelephone == "") {
        console.log("telephone");
        document.getElementById("telephone").className = "err";
    }
    else if (numeroTelephone.length < 10) {
        document.getElementById("telephone").className = "err";
    } else if (numeroTelephone.length > 10){
        document.getElementById("telephone").className = "err"
    }
    else{
        document.getElementById("telephone").classList.remove("err");
    }



    var numeroRue = document.forms["inscription-forms"].elements["rue"].value;
    console.log("n° et rue : " + numeroRue.value);
    if (numeroRue =="") {
        console.log("n° et rue");
        document.getElementById("rue").className = "err";
    } else if (numeroRue.trim()=="") {
        document.getElementById("rue").className = 'err';
    }else{
        document.getElementById("rue").classList.remove("err");
    }

}
