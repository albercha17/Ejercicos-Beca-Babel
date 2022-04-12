import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AppComponent } from '../app.component';
import { LoginComponent } from '../login/login.component';

@Component({
  selector: 'app-cabezera',
  templateUrl: './cabezera.component.html',
  styleUrls: ['./cabezera.component.css']
})
export class CabezeraComponent implements OnInit {

  registrado: boolean=false
  deshabilitadoBoton :boolean =false
  usuario: string=AppComponent.user;
  constructor(route:ActivatedRoute,private router:Router) {

    console.log("El usuario es "+AppComponent.user)
  }
  ngOnInit() {
  }
  public bienvenida():void{
    console.log("Bienvenido "+AppComponent.user)
    this.router.navigate([ '/bienvenida',AppComponent.user])
  }
}
