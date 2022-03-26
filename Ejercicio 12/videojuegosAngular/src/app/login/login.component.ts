import { Component, OnInit } from '@angular/core';
import { Usuario } from '../entidades/Usuario';
import { Videojuegos } from '../entidades/Videojuegos';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  listaUsuarios:Usuario[]=[new Usuario("Alberto" , "1234",[new Videojuegos("Call of Duty", "Activision",7,""),
                                                           new Videojuegos("Fornite", "Epic Games",6,""),
                                                           new Videojuegos("Mario Kart 8", "Nintendo",8,"")]),

                           new Usuario("Felix" , "1234",  [new Videojuegos("GTA V", "Rockstar",8,""),
                                                           new Videojuegos("Fifa 22", "EA",6,""),
                                                           new Videojuegos("Animal Crossing", "Nintendo",9,"")])]
  nombre : string = ""
  password : string = ""
  error :string=""
  mostrarError: boolean=false
  usuario : Usuario | null=null
  registrado:number=0

  constructor(private router:Router) {
   }

  ngOnInit() {
  }

  /**
   * Comprueba si el usuario y la contraseña son validos. Si no es valido, muestra el error por pantalla
   */
  public login(){
    var encontradoUsuario=false;
    var encontradaContrasena=false;
    for(var i=0;i<this.listaUsuarios.length;i++){
      if(this.nombre==this.listaUsuarios[i].nombre && !encontradoUsuario){
        encontradoUsuario=true
        if(this.password==this.listaUsuarios[i].password && !encontradaContrasena){
         encontradaContrasena=true
         this.usuario=this.listaUsuarios[i]
         console.log(this.usuario)
         this.registrado=1
         this.router.navigate([ '/bienvenida',this.nombre])
         
        }
      }
    }
    if(encontradaContrasena && encontradoUsuario){
      this.error=""
      this.mostrarError=false
    }
    else if(!encontradoUsuario){
      this.error="Usuario invalido."
      this.mostrarError=true
    }
    else if(!encontradaContrasena){
      this.error="La contraseña es incorrecta."
      this.mostrarError=true
    }
    
  }
}
