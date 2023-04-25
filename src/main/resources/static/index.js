$.document.get()

function kjopBillett() {
    let billett = {
        film: $("#film").val(),
        antall: $("#antall").val(),
        fornavn: $("#fornavn").val(),
        etternavn: $("#etternavn").val(),
        telefon: $("#tlf").val(),
        epostadresse: $("#epost").val()
    };
    if (billett.fornavn !== "" && billett.etternavn !== "" && billett.telefon !== "" && billett.epostadresse !== "") {
        $.post("/lagre", billett, function () {
            hentAlle();
        });
    }
    if (billett.fornavn === "") {
        $('#fornavn-feil').html("skriv inn gyldig verdi");
        $('#fornavn-feil').css("color", "red");
    } else {
        $('#fornavn-feil').html("");
    }
    if (billett.etternavn === "") {
        $('#etternavn-feil').html("skriv inn gyldig verdi");
        $('#etternavn-feil').css("color", "red");
    } else {
        $("#etternavn-feil").html("");
    }
    if (billett.telefon === "") {
        $("#tlf-feil").html("skriv inn gyldig verdi");
        $('#tlf-feil').css("color", "red");
    } else {
        $('#tlf-feil').html("");
    }
    if (billett.epostadresse === "") {
        $('#epost-feil').html("skriv inn gyldig verdi");
        $('#epost-feil').css("color", "red");
    } else {
        $('#epost-feil').html("");
    }
}

function hentAlle() {
    $.get("/hentAlleBilletter", function(billett) {
        formaterData(billett);
    })
}

function formaterData(Billetter) {
    let ut = '<table class="table"><tr><th>' + "Film" + '</th><th>' + "Antall" + '</th><th>' +"Fornavn" + '</th><th>' + "Etternavn" + '</th><th>' + "Telefon" + '</th><th>' + "E-post-adresse" + '</th></tr>';

    for (const Billett of Billetter) {
        ut += "<tr><td>" + Billett.film + "</td><td>" + Billett.antall + "</td><td>" + Billett.fornavn + "</td><td>" + Billett.etternavn + "</td><td>" + Billett.telefon + "</td><td>" + Billett.epostadresse + "</td></tr>";
    }
    ut += "</table>";
    $("#alle-billetter").html(ut);
}

function slett() {
    $("#alle-billetter").html("");
    $.get("slettAlleBilletter", function(){
        hentAlle();
    });

}

