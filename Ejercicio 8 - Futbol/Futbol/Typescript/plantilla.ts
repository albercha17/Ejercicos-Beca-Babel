import { Jugador } from "./Jugador"
import{ Historial } from "./Historial"
import{ Equipo } from "./Equipo"




//Historial por cada jugador
let historial1 = new Historial('1', 0, 1, 1);
let historial2 = new Historial('2', 2, 26, 8);
let historial3 = new Historial('3', 3, 7, 2);
let historial4 = new Historial('4', 4, 17, 1);
let historial5 = new Historial('5', 3, 9, 0);
let historial6 = new Historial('6', 4, 18, 5);
let historial7 = new Historial('7', 8, 13, 1);
let historial8 = new Historial('8', 9, 8, 2);
let historial9 = new Historial('9', 14, 5, 0);
let historial10 = new Historial('10', 16, 4, 1);
let historial11 = new Historial('11', 32, 1, 0);

//Jugadores
let Jugador1 = new Jugador('1', 'Courtois', 29, 'Belgica', historial1);
let Jugador2 = new Jugador('2', 'Militao', 24, 'Brasil', historial2);
let Jugador3 = new Jugador('4', 'Alaba', 29, 'Austria', historial3);
let Jugador4 = new Jugador('23', 'Mendy', 26, 'Francia', historial4);
let Jugador5 = new Jugador('2', 'Carvajal', 30, 'España', historial5);
let Jugador6 = new Jugador('14', 'Casemiro', 30, 'Brasil', historial6);
let Jugador7 = new Jugador('8', 'Kross', 32, 'Alemania', historial7);
let Jugador8 = new Jugador('10', 'Modric', 36, 'Croacia', historial8);
let Jugador9 = new Jugador('20', 'Vinicius', 21, 'Brasil', historial9);
let Jugador10 = new Jugador('11', 'Asensio', 26, 'España', historial10);
let Jugador11 = new Jugador('9', 'Benzema', 34, 'Francia', historial11);

//Equipo
let jugadores = [
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
let equipo = new Equipo('1', 'Real Madrid', '6 de marzo de 1902', jugadores);

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
console.log("Este es el "+equipo.nombre+", fundado el "+equipo.fecha+".");
console.log("------------------------------------------------------------------");
console.log(mostrarPlantilla());
