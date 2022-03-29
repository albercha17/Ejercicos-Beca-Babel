import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Nombre } from '../entidades/nombre';
import { LoginComponent } from '../login/login.component';

@Component({
  selector: 'app-cabezera',
  templateUrl: './cabezera.component.html',
  styleUrls: ['./cabezera.component.css']
})
export class CabezeraComponent implements OnInit {

  registrado: boolean=false
  deshabilitadoBoton :boolean =false
  usuario: string;
  constructor(route:ActivatedRoute,private router:Router) {
    
    this.usuario=Nombre.nombre
    console.log("zzz "+ Nombre.nombre)
  }
  ngOnInit() {
  }
}
