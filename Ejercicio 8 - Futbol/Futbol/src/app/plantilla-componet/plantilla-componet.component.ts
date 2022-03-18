import { Component, OnInit } from '@angular/core';
import { Historial } from 'Typescript/Historial';
import { Jugador } from 'Typescript/Jugador';
import { Equipo } from 'Typescript/Equipo';

@Component({
  selector: 'app-plantilla-componet',
  templateUrl: './plantilla-componet.component.html',
  styleUrls: ['./plantilla-componet.component.css'],
})
export class PlantillaComponetComponent implements OnInit {
  equipo: Equipo;
  equipoTitular:Equipo;
  POR : Jugador;
  LI : Jugador;
  DFCI : Jugador;
  DFCD : Jugador;
  LD : Jugador;
  MCD : Jugador;
  MC1 : Jugador;
  MC2 : Jugador;
  EI : Jugador;
  ED: Jugador;
  DC : Jugador;
  nombre = ""
  gol=0
  amarillas= 0
  rojas= 0
  foto=""
  pais=""
  edad=0

  constructor() {
    var historial1 = new Historial('1', 0, 1, 1);
    var historial2 = new Historial('2', 2, 26, 8);
    var historial3 = new Historial('3', 3, 7, 2);
    var historial4 = new Historial('4', 4, 17, 1);
    var historial5 = new Historial('5', 3, 9, 0);
    var historial6 = new Historial('6', 4, 18, 5);
    var historial7 = new Historial('7', 8, 13, 1);
    var historial8 = new Historial('8', 9, 8, 2);
    var historial9 = new Historial('9', 14, 5, 0);
    var historial10 = new Historial('10', 16, 4, 1);
    var historial11 = new Historial('12', 36, 1, 0);
    var historial12 = new Historial('12', 2, 1, 0);
    var historial13 = new Historial('13', 2, 5, 1);
    var historial14 = new Historial('14', 4, 3, 1);

    var POR_1 = new Jugador(
      '1',
      'Thibaut Courtois',
      29,
      'Belgica',
      historial1,
      'https://www.realmadrid.com/img/vertical_380px/courtois_380x501_20210826062816.jpg',
      true
    );
    var DFC_3 = new Jugador(
      '3',
      'Eder Militao',
      24,
      'Brasil',
      historial2,
      'https://www.realmadrid.com/img/vertical_380px/militao_380x501_20210826062825.jpg',
      true
    );
    var DFC_4 = new Jugador(
      '4',
      'David Alaba',
      29,
      'Austria',
      historial3,
      'https://www.realmadrid.com/img/vertical_380px/alaba_380x501_20210826062826.jpg',
      true
    );
    var LI_23 = new Jugador(
      '23',
      'Ferlan Mendy',
      26,
      'Francia',
      historial4,
      'https://www.realmadrid.com/img/vertical_380px/mendy_he19491_380x501_20210910082744.jpg',
      true
    );
    var LD_2 = new Jugador(
      '2',
      'Dani Carvajal',
      30,
      'España',
      historial5,
      'https://www.realmadrid.com/img/vertical_380px/carvajal_380x501_20210826062807.jpg',
      true
    );
    var MCD_14 = new Jugador(
      '14',
      'Carlos Enrique Casemiro',
      30,
      'Brasil',
      historial6,
      'https://www.realmadrid.com/img/vertical_380px/casemiro_380x501_20210826062810.jpg',
      true
    );
    var MC_8 = new Jugador(
      '8',
      'Toni Kross',
      32,
      'Alemania',
      historial7,
      'https://www.realmadrid.com/img/vertical_380px/kroos_380x501_20210826062809.jpg',
      true
    );
    var MC_10 = new Jugador(
      '10',
      'Luca Modric',
      36,
      'Croacia',
      historial8,
      'https://www.realmadrid.com/img/vertical_380px/modric_380x501_20210826062810.jpg',
      true
    );
    var EI_20 = new Jugador(
      '20',
      'Vinicius Jr.',
      21,
      'Brasil',
      historial9,
      'https://www.realmadrid.com/img/vertical_380px/vinijr_380x501_20210826062815.jpg',
      true
    );
    var ED_11 = new Jugador(
      '11',
      'Marco Asensio',
      26,
      'España',
      historial10,
      'https://www.realmadrid.com/img/vertical_380px/asensio_he19417_380x501_20210910082737.jpg',
      true
    );
    var DC_9 = new Jugador(
      '9',
      'Karim Benzema',
      34,
      'Francia',
      historial11,
      'https://www.realmadrid.com/img/vertical_380px/benzema_380x501_20210826062812.jpg',
      true
    );
    var ED_7 = new Jugador(
      '7',
      'Eden Hazard',
      30,
      'Belgica',
      historial12,
      'https://www.realmadrid.com/img/vertical_380px/hazard_380x501_20210826062817.jpg',
      false
    );
    var MC_25 = new Jugador(
      '25',
      'Eduardo Camavinga',
      19,
      'Francia',
      historial13,
      'https://www.realmadrid.com/img/vertical_380px/camavinga_he19458_380x501_20210910082744.jpg',
      false
    );
    
    var MC_22 = new Jugador(
      '22',
      'Francisco Román Alarcón Suárez',
      28,
      'España',
      historial14,
      'https://www.realmadrid.com/img/vertical_380px/isco_380x501_20210826062811.jpg',
      false
    );

    var jugadores = [
      POR_1,
      DFC_3,
      DFC_4,
      LI_23,
      LD_2,
      MCD_14,
      MC_8,
      MC_10,
      EI_20,
      ED_11,
      DC_9,
      ED_7,
      MC_25,
      MC_22
    ];
    var jugadoresTitulares = [
      POR_1,
      DFC_3,
      DFC_4,
      LI_23,
      LD_2,
      MCD_14,
      MC_8,
      MC_10,
      EI_20,
      ED_11,
      DC_9,
      ED_7,
      MC_25,
    ];
    this.equipo = new Equipo(
      '1',
      'Real Madrid',
      '6 de marzo de 1902',
      jugadores
    );
    this.equipoTitular = new Equipo(
      '1',
      'Real Madrid',
      '6 de marzo de 1902',
      jugadoresTitulares
    );
    this.POR= this.equipo.jugadores[0];
    this.LD= this.equipo.jugadores[4];
    this.DFCI= this.equipo.jugadores[1];
    this.DFCD= this.equipo.jugadores[2];
    this.LI= this.equipo.jugadores[3];
    this.MCD= this.equipo.jugadores[5];
    this.MC1= this.equipo.jugadores[6];
    this.MC2= this.equipo.jugadores[7];
    this.EI= this.equipo.jugadores[8];
    this.ED= this.equipo.jugadores[9];
    this.DC= this.equipo.jugadores[10];
    this.foto = ""

  }

  ngOnInit() {}
  cambiarTitularidad(){
    for(var i=0;i<this.equipo.jugadores.length;i++){
      this.equipo.jugadores[i].titular=false
    }
    var x= this.equipo.jugadores.indexOf(this.POR)
    this.equipo.jugadores[x].titular=true;
    x= this.equipo.jugadores.indexOf(this.LI)
    this.equipo.jugadores[x].titular=true;
    x= this.equipo.jugadores.indexOf(this.DFCI)
    this.equipo.jugadores[x].titular=true;
    x= this.equipo.jugadores.indexOf(this.DFCD)
    this.equipo.jugadores[x].titular=true;
    x= this.equipo.jugadores.indexOf(this.LD)
    this.equipo.jugadores[x].titular=true;
    x= this.equipo.jugadores.indexOf(this.MCD)
    this.equipo.jugadores[x].titular=true;
    x= this.equipo.jugadores.indexOf(this.MC1)
    this.equipo.jugadores[x].titular=true;
    x= this.equipo.jugadores.indexOf(this.MC2)
    this.equipo.jugadores[x].titular=true;
    x= this.equipo.jugadores.indexOf(this.ED)
    this.equipo.jugadores[x].titular=true;
    x= this.equipo.jugadores.indexOf(this.EI)
    this.equipo.jugadores[x].titular=true;
    x= this.equipo.jugadores.indexOf(this.DC)
    this.equipo.jugadores[x].titular=true;

  }
  cambiarTitulares(){
    
    this.POR= this.equipoTitular.jugadores[0];
    this.LD= this.equipoTitular.jugadores[4];
    this.DFCI= this.equipoTitular.jugadores[1];
    this.DFCD= this.equipoTitular.jugadores[2];
    this.LI= this.equipoTitular.jugadores[3];
    this.MCD= this.equipoTitular.jugadores[5];
    this.MC1= this.equipoTitular.jugadores[6];
    this.MC2= this.equipoTitular.jugadores[7];
    this.EI= this.equipoTitular.jugadores[8];
    this.ED= this.equipoTitular.jugadores[9];
    this.DC= this.equipoTitular.jugadores[10];
    this.cambiarTitularidad()
  }
  borrarTexto() {

    this.nombre = "Roberto"
    this.gol = 0
    this.amarillas = 0
    this.rojas = 0
    this.foto=""
    this.pais=""
    this.edad=0
  }
cambiarJugadores(){
  this.ED= this.equipo.jugadores[11];
  this.MCD=this.equipo.jugadores[12];
  this.MC2=this.equipo.jugadores[13];
  this.cambiarTitularidad()
}
ponerJugador(jugador:string){
  if(jugador=="POR"){
    this.nombre = this.POR.nombre
    this.gol = this.POR.historial_1.goles
    this.amarillas = this.POR.historial_1.amarillas_1
    this.rojas = this.POR.historial_1.rojas_1
    this.foto=this.POR.foto
    this.pais=this.POR.pais
    this.edad=this.POR.edad
  }
 else if(jugador=="LD"){
  this.nombre = this.LD.nombre
  this.gol = this.LD.historial_1.goles
  this.amarillas = this.LD.historial_1.amarillas_1
  this.rojas = this.LD.historial_1.rojas_1
  this.foto=this.LD.foto
  this.pais=this.LD.pais
  this.edad=this.LD.edad
 }
 else if(jugador=="LI"){
  this.nombre = this.LI.nombre
  this.gol = this.LI.historial_1.goles
  this.amarillas = this.LI.historial_1.amarillas_1
  this.rojas = this.LI.historial_1.rojas_1
  this.foto=this.LI.foto
  this.pais=this.LI.pais
  this.edad=this.LI.edad
 }
 else if(jugador=="DFCI"){
  this.nombre = this.DFCI.nombre
  this.gol = this.DFCI.historial_1.goles
  this.amarillas = this.DFCI.historial_1.amarillas_1
  this.rojas = this.DFCI.historial_1.rojas_1
  this.foto=this.DFCI.foto
  this.pais=this.DFCI.pais
  this.edad=this.DFCI.edad
 }
 else if(jugador=="DFCD"){
  this.nombre = this.DFCD.nombre
  this.gol = this.DFCD.historial_1.goles
  this.amarillas = this.DFCD.historial_1.amarillas_1
  this.rojas = this.DFCD.historial_1.rojas_1
  this.foto=this.DFCD.foto
  this.pais=this.DFCD.pais
  this.edad=this.DFCD.edad
 }
 else if(jugador=="MCD"){
  this.nombre = this.MCD.nombre
  this.gol = this.MCD.historial_1.goles
  this.amarillas = this.MCD.historial_1.amarillas_1
  this.rojas = this.MCD.historial_1.rojas_1
  this.foto=this.MCD.foto
  this.pais=this.MCD.pais
  this.edad=this.MCD.edad
 }
 else if(jugador=="MC1"){
  this.nombre = this.MC1.nombre
  this.gol = this.MC1.historial_1.goles
  this.amarillas = this.MC1.historial_1.amarillas_1
  this.rojas = this.MC1.historial_1.rojas_1
  this.foto=this.MC1.foto
  this.pais=this.MC1.pais
  this.edad=this.MC1.edad
 }
 else if(jugador=="MC2"){
  this.nombre = this.MC2.nombre
  this.gol = this.MC2.historial_1.goles
  this.amarillas = this.MC2.historial_1.amarillas_1
  this.rojas = this.MC2.historial_1.rojas_1
  this.foto=this.MC2.foto
  this.pais=this.MC2.pais
  this.edad=this.MC2.edad
 }
 else if(jugador=="EI"){
  this.nombre = this.EI.nombre
  this.gol = this.EI.historial_1.goles
  this.amarillas = this.EI.historial_1.amarillas_1
  this.rojas = this.EI.historial_1.rojas_1
  this.foto=this.EI.foto
  this.pais=this.EI.pais
  this.edad=this.EI.edad
 }
 else if(jugador=="ED"){
  this.nombre = this.ED.nombre
  this.gol = this.ED.historial_1.goles
  this.amarillas = this.ED.historial_1.amarillas_1
  this.rojas = this.ED.historial_1.rojas_1
  this.foto=this.ED.foto
  this.pais=this.ED.pais
  this.edad=this.ED.edad
 }
 else if(jugador=="DC"){
  this.nombre = this.DC.nombre
  this.gol = this.DC.historial_1.goles
  this.amarillas = this.DC.historial_1.amarillas_1
  this.rojas = this.DC.historial_1.rojas_1
  this.foto=this.DC.foto
  this.pais=this.DC.pais
  this.edad=this.DC.edad
 }
 
}
}