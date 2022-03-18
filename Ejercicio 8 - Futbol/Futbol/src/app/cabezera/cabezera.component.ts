import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cabezera',
  templateUrl: './cabezera.component.html',
  styleUrls: ['./cabezera.component.css']
})
export class CabezeraComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  title = 'REAL MADRID';
  equipo = "Real Madrid CF"
  anioFundacion ="6 de marzo de 1902"
  escudo="https://www.realmadrid.com/StaticFiles/RealMadridResponsive/images/RM_sticky_logo.svg"

}
