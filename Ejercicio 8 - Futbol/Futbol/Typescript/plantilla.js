"use strict";
exports.__esModule = true;
var Jugador_1 = require("./Jugador");
var Historial_1 = require("./Historial");
var Equipo_1 = require("./Equipo");
//Historial por cada jugador
var historial1 = new Historial_1.Historial('1', 0, 1, 1);
var historial2 = new Historial_1.Historial('2', 2, 26, 8);
var historial3 = new Historial_1.Historial('3', 3, 7, 2);
var historial4 = new Historial_1.Historial('4', 4, 17, 1);
var historial5 = new Historial_1.Historial('5', 3, 9, 0);
var historial6 = new Historial_1.Historial('6', 4, 18, 5);
var historial7 = new Historial_1.Historial('7', 8, 13, 1);
var historial8 = new Historial_1.Historial('8', 9, 8, 2);
var historial9 = new Historial_1.Historial('9', 14, 5, 0);
var historial10 = new Historial_1.Historial('10', 16, 4, 1);
var historial11 = new Historial_1.Historial('11', 32, 1, 0);
//Jugadores
var Jugador1 = new Jugador_1.Jugador('1', 'Courtois', 29, 'Belgica', historial1);
var Jugador2 = new Jugador_1.Jugador('2', 'Militao', 24, 'Brasil', historial2);
var Jugador3 = new Jugador_1.Jugador('4', 'Alaba', 29, 'Austria', historial3);
var Jugador4 = new Jugador_1.Jugador('23', 'Mendy', 26, 'Francia', historial4);
var Jugador5 = new Jugador_1.Jugador('2', 'Carvajal', 30, 'España', historial5);
var Jugador6 = new Jugador_1.Jugador('14', 'Casemiro', 30, 'Brasil', historial6);
var Jugador7 = new Jugador_1.Jugador('8', 'Kross', 32, 'Alemania', historial7);
var Jugador8 = new Jugador_1.Jugador('10', 'Modric', 36, 'Croacia', historial8);
var Jugador9 = new Jugador_1.Jugador('20', 'Vinicius', 21, 'Brasil', historial9);
var Jugador10 = new Jugador_1.Jugador('11', 'Asensio', 26, 'España', historial10);
var Jugador11 = new Jugador_1.Jugador('9', 'Benzema', 34, 'Francia', historial11);
//Equipo
var jugadores = [
    Jugador1,
    Jugador2,
    Jugador3,
    Jugador4,
    Jugador5,
    Jugador6,
    Jugador7,
    Jugador8,
    Jugador9,
    Jugador10,
    Jugador11,
];
var equipo = new Equipo_1.Equipo('1', 'Real Madrid', '6 de marzo de 1902', jugadores);
function mostrarPlantilla() {
    var plantilla = 'Plantilla del ' + equipo.nombre + ': ';
    for (var i = 0; i < equipo.jugadores.length; i++) {
        if (i == 0)
            plantilla +=
                equipo.jugadores[i].nombre + '(' + equipo.jugadores[i].id + ')';
        else if (i < equipo.jugadores.length - 1)
            plantilla +=
                ', ' + equipo.jugadores[i].nombre + '(' + equipo.jugadores[i].id + ')';
        else
            plantilla +=
                'y ' + equipo.jugadores[i].nombre + '(' + equipo.jugadores[i].id + ')';
    }
    return plantilla;
}
console.log("Este es el " + equipo.nombre + ", fundado el " + equipo.fecha + ".");
console.log("------------------------------------------------------------------");
console.log(mostrarPlantilla());
