import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { LoginComponent } from '../login/login.component';

@Component({
  selector: 'app-cabezera',
  templateUrl: './cabezera.component.html',
  styleUrls: ['./cabezera.component.css']
})
export class CabezeraComponent implements OnInit {

  registrado: boolean=false
  deshabilitadoBoton :boolean =false
  @Input() usuario: string;
  constructor(route:ActivatedRoute,private router:Router) {
    console.log("Esto es "+this.usuario)

  }
  ngOnInit() {
  }
}
