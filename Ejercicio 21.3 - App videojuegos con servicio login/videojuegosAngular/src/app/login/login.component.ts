import { Component, OnInit } from '@angular/core';
import { Usuario } from '../entidades/Usuario';
import { Videojuegos } from '../entidades/Videojuegos';
import { Router } from '@angular/router';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  nombre : string = ""
  password : string = ""
  error :string=""
  mostrarError: boolean=false
  usuario : Usuario | null=null
  registrado:number=0
  nombreUsuario: string;
  constructor(private router:Router) {
   }

  ngOnInit() {
  }

  /**
   * Comprueba si el usuario y la contraseña son validos. Si no es valido, muestra el error por pantalla
   */

  async login(){
    var encontradoUsuario=false;
    var encontradaContrasena=false;

      await fetch(`http://localhost:8080/Ejercico21/usuario/password?usuario=${this.nombre}&password=${this.password}`,{mode: 'cors'})
      .then(v => v.json())
      .then(v => {
      if(JSON.parse(v.validado)){
        encontradoUsuario=true
        encontradaContrasena=true
         console.log(this.usuario)
         this.registrado=1
         AppComponent.user= this.nombre;
         this.router.navigate([ '/bienvenida',this.nombre])
         console.log("El usuario es "+AppComponent.user)
      }else {
        this.error="Usuario invalido."
        this.mostrarError=true
      };
    })
    
  }

  
}
