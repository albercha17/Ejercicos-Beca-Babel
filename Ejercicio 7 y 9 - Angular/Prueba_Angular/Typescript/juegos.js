let juegos = ["FIFA 2022", "GTA V", "Mario", "Uncharted 3", "Call of Duty"];
function leerArray(arrayJ) {
    var nJuegos = "";
    var prohibido = "Mario";
    for (var i = 0; i < arrayJ.length; i++) {
        if (arrayJ[i]!=prohibido) {
            if (i == 0) {
                nJuegos += arrayJ[i];
            }
            else if (i == arrayJ.length - 1) {
                nJuegos += " y " + arrayJ[i];
            }
            else {
                nJuegos += ", " + arrayJ[i];
            }
        }
    }
    return nJuegos;
}
console.log("Esta es la lista de tus juegos: " + leerArray(juegos) + ".");
