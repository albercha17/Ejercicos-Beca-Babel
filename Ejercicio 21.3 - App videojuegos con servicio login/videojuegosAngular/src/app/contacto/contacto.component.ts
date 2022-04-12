import { Component, OnInit } from '@angular/core';
import { LoginComponent } from '../login/login.component';

@Component({
  selector: 'app-contacto',
  templateUrl: './contacto.component.html',
  styleUrls: ['./contacto.component.css']
})
export class ContactoComponent implements OnInit {

  email:string="videojuegos@gmail.com"
  telefono:string = "635567432"
  sitio:string ="Calle del Invento Nº4"
  constructor() { }

  ngOnInit() {
  }

}
