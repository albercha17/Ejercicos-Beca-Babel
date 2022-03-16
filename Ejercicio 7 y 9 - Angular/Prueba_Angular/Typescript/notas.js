var notasParciales = [6, 5, 8, 9, 10];
var final = 8;
var trabajo = 7;

function calcularNota(notasParciales, final, trabajo) {
    var NotaParcial=0;
    for (var i = 0; i < notasParciales.length; i++) {
        NotaParcial += notasParciales[i];
    }
    NotaParcial = (NotaParcial / notasParciales.length) * 0.55;
    var Total = NotaParcial + (final * 0.3) + (trabajo * 0.15);
    return Total;
}
console.log("Tu nota final es: " + calcularNota(notasParciales, final, trabajo));
